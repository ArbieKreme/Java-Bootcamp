package com.company.Day03;
/*
 Print the digits sum of a given int. For example the digits sum of 451 is 4+5+1 = 10; 3219 is 9+1+2+3=15.
 */
import java.util.Scanner;
public class DigitSum {
    public static void main(String[] args) {
        
        int sum = 0;
        
        System.out.println("Enter a number to compute sum of each digit number.");
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sum = ((n*n)+n)/2;

    System.out.println(sum);


        
        
        
    }
}
