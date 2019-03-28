package com.company.Day08;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;

public class DateUtilsA {

    /*** 
     * @return positive integer for working days 
     * ,0 if both days are weeknds 
     * ,-1 if start date is greater than end date 
     * ***/
    public static int countWorkingDays(LocalDate start, LocalDate end){
        int numberOfWorkingDays = 0;
        if(start.getDayOfWeek().getValue() >= 6 && end.getDayOfWeek().getValue() >= 6){
            numberOfWorkingDays--;
        }else{
            LocalDate dateChecker = start;
            long dayDiff = ChronoUnit.DAYS.between(start, end);
            for (int day = 0; day <= dayDiff; day++) {
                if (dateChecker.getDayOfWeek().getValue() <= 5)
                    numberOfWorkingDays++;
                dateChecker = dateChecker.plusDays(1);
            }
        }
        return  numberOfWorkingDays;
    }

    /*** 
     * @return true if number of days is  in range of month; else false 
     * example: february have 28 or 29 days but if the setted days is 30 
     *   the return will be false 
     */
    public static boolean isDateInRange(LocalDate start,LocalDate end){
        boolean isDateInRange;
        System.out.println(YearMonth.of(start.getYear(), start.getMonthValue()).lengthOfMonth() + " " + start.getDayOfMonth());
        if(YearMonth.of(start.getYear(), start.getMonthValue()).lengthOfMonth() < start.getDayOfMonth()
                || YearMonth.of(end.getYear(), end.getMonthValue()).lengthOfMonth() < end.getDayOfMonth()){
            isDateInRange = false;
        }else{
            isDateInRange = true;
        }

        return isDateInRange;
    }

}  