package com.company.Day04;

import java.util.Scanner;

public class Alphanumeric {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string\n");
        String word = sc.nextLine();
        word.toLowerCase();

        word = word.replaceAll("g","9");
        word = word.replaceAll("e","3");
        word = word.replaceAll("i","1");
        word = word.replaceAll("o","0");

        System.out.println(word);

    }
}
