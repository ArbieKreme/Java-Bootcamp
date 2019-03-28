package com.company.Day04;

import java.util.Scanner;

public class Consonants {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string\n");
        String word = sc.nextLine();
        word.toLowerCase();

        word = word.replaceAll("b","B");
        word = word.replaceAll("c","c");
        word = word.replaceAll("d","D");
        word = word.replaceAll("f","F");
        word = word.replaceAll("g","G");
        word = word.replaceAll("h","H");
        word = word.replaceAll("j","J");
        word = word.replaceAll("k","K");
        word = word.replaceAll("l","L");
        word = word.replaceAll("m","M");
        word = word.replaceAll("n","N");
        word = word.replaceAll("p","P");
        word = word.replaceAll("q","Q");
        word = word.replaceAll("r","R");
        word = word.replaceAll("s","S");
        word = word.replaceAll("t","T");
        word = word.replaceAll("v","V");
        word = word.replaceAll("w","W");
        word = word.replaceAll("x","X");
        word = word.replaceAll("y","Y");
        word = word.replaceAll("z","Z");
        System.out.print(word);





    }
}
