package com.company.Day04;

import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter First Word: ");
        String firstWord = sc.nextLine();
        System.out.println("Enter Second Word");
        String secondWord = sc.nextLine();

        if (firstWord.length() > secondWord.length()) {
            if (firstWord.contains(secondWord)) {
                System.out.println("Anagram : True");
                System.out.println("Remaining characters:"
                        + firstWord.replace(secondWord, ""));
            } else {
                System.out.printf("Anagram : False");
            }
        } else {
            if (secondWord.contains(firstWord)) {
                System.out.println("Anagram : True");
                System.out.println("Remaining characters:"
                        + secondWord.replace(firstWord, ""));
            } else {
                System.out.printf("Anagram : False");
            }
        }

    }
}