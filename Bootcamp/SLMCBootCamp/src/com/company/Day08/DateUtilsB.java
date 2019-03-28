package com.company.Day08;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;

public class DateUtilsB {

    /*** 
     * @return positive integer for working days 
     * ,0 if both days are weeknds 
     * ,-1 if start date is greater than end date 
     * ***/
    public static int countWorkingDays(LocalDate start, LocalDate end) {
        int dayDif = (int)ChronoUnit.DAYS.between(start,end); //number of days between start and end 
        float numWeeks = (dayDif)/7; // count of weeks 
        int weekendCount = (int)numWeeks * 2; // count of weekends 
        int workingDays = (dayDif - weekendCount); // total working days 

        if((start.getDayOfWeek().getValue() >= 6 && end.getDayOfWeek().getValue() >= 6)
                && numWeeks < 1) {//if both weekend 
            workingDays = 0;
        }else {
            //if same 
            if (dayDif == 0) {
                workingDays = 1;
            } else if (dayDif < 0) {//start > end 
                workingDays = -1;
            } else if (start.getDayOfWeek().getValue() > end.getDayOfWeek().getValue() && numWeeks < 1) {//if weekend but not a complete week 
                workingDays = dayDif;
            } else if (dayDif == 1) {
                workingDays = 2;
            }

        }

        if(workingDays > 1 && workingDays >= 15) {
            int startDayLength = YearMonth.of(start.getYear(), start.getMonthValue()).lengthOfMonth();
            int endDayLength = YearMonth.of(start.getYear(), start.getMonthValue()).lengthOfMonth();

            if ((startDayLength == 31 || endDayLength == 31)) {
                if(start.getDayOfMonth() + dayDif >= 31) {
                    workingDays--;
                }
            }
        }

        return workingDays;

    }

    /*** 
     *
     * @return true if number of days is  in range of month; else false 
     * example: february have 28 or 29 days but if the set  days is 30 
     *   the return will be false 
     */
    public static boolean isDateInRange(LocalDate start,LocalDate end){
        boolean isDateInRange;

        if(YearMonth.of(start.getYear(), start.getMonthValue()).lengthOfMonth() < start.getDayOfMonth()
                && YearMonth.of(end.getYear(), end.getMonthValue()).lengthOfMonth() < end.getDayOfMonth()){
            isDateInRange = false;
        }else{
            isDateInRange = true;
        }

        return isDateInRange;
    }

}  