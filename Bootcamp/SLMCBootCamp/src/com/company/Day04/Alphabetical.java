package com.company.Day04;

import java.util.Arrays;
import java.util.Scanner;

public class Alphabetical {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String");
        String word = in.nextLine();

        String[] arrWord = word.split(" ");

        for (String a : arrWord) {
            char[] charWord = a. toCharArray();
            Arrays.sort(charWord);
            System.out.print(charWord);
            System.out.print(" ");
        }
    }
}