package com.company.Day08;
import java.time.LocalDate;

public class LocalDateClass {

    public static int getWorkingDays(LocalDate d1, LocalDate d2){

        if(d1.isAfter(d2)) return-1;

        int daysCount = 0;

        while(d2.isAfter(d1) || d2.isEqual(d1)){
            if(d1.getDayOfWeek().getValue()<=5){
                daysCount++;
            }
            d1 = d1.plusDays(1);
        }

        return daysCount;
    }
    public static void main(String[] args) {
        LocalDate day1 = LocalDate.of(2018,10,1);
        LocalDate day2 = LocalDate.of(2018,10,9);
        int days = getWorkingDays(day1,day2);
        System.out.println("Number of working days : "+days);

    }
}
