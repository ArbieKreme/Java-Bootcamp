package com.company.Day03;
/*
use the switch statement instead of an array to printout the number of
days in a given month. determine the exact number of days for february a given year
(eg Feb has 28 days, except when its a leap  year when there are 29 days).
•	A leap year is divisible by 4 (e.g. 2012, 2016 are leap years)
•	But not divisible by 100 (2100 is divisible by 4 but it is not a leap year)
•	Except if it is divisible by 400 (e.g. 2000 is a leap year and is divisible by 4, 100, and 400)
•	You may look at references in the web to find the rule for leap years.

 */
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
public class DaysInMonth {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month to determine days in a given month. [1-12]");
        int month = sc.nextInt();
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        
        int numberOfDays = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
        int daysInFebruary = 0;

        if(numberOfDays%4==0){
            daysInFebruary = 29;
        }else{
            daysInFebruary = 28;
        }
        
        for(int i = 0;i<50; i++){
            if(month>0&&month<=12){
            
                switch(month){
                    
                    case 1:
                        System.out.println("January\n31 Days");
                        break;
                    case 2:
                        System.out.println("February\n"+daysInFebruary+" Days");
                        break;
                    case 3:
                        System.out.println("March\n31 Days");
                        break;
                    case 4:
                        System.out.println("April\n30 Days");
                        break;
                    case 5:
                        System.out.println("May\n31 Days");
                        break;
                    case 6:
                        System.out.println("June\n30 Days");
                        break;
                    case 7:
                        System.out.println("July\n31 Days");
                        break;
                    case 8:
                        System.out.println("August\n31 Days");
                        break;
                    case 9:
                        System.out.println("September\n30 Days");
                        break;
                    case 10:
                        System.out.println("October\n31 Days");
                        break;
                    case 11:
                        System.out.println("November\n30 Days");
                        break;
                    case 12:
                        System.out.println("December\n31 Days");
                        break;
                }
                
            break;
        }else{
         System.out.println("Enter numbers 1 to 12 only.");
        }
           
        }
    }

}
