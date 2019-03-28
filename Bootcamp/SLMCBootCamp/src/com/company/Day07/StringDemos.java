package com.company.Day07;

import java.util.Scanner;

public class StringDemos {

    public static int countWords(String sentence){

        int numberOfWords = 1;

        char[] arrChar = sentence.toCharArray();

        for(int i = 0; i<sentence.length();i++){
            if(sentence.charAt(i) == ' ' && sentence.charAt(i+1)!=' '){
                numberOfWords++;
            }
        }

        return numberOfWords;
    }

    public static boolean isPalindrome(String word) {

        boolean isItPalindrome = false;

        String clean = word.replaceAll("\\s+", "").toLowerCase();

        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward)
        {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);
            if (forwardChar != backwardChar)
            {
                // return false;
                isItPalindrome = false;

            }
            else
            {
                isItPalindrome = true;

            }
        }
        return isItPalindrome;
    }


    public static void mkFullName(){

        Scanner sc = new Scanner(System.in);
        String orderedFullName = "";

        System.out.println("\nEnter first name");
        String fName = sc.nextLine().toLowerCase();
        System.out.println("Enter last name");
        String lName = sc.nextLine().toLowerCase();
        System.out.println("Enter middle initial");
        String mInitial = sc.nextLine().toLowerCase();

        String capLastname = lName.substring(0,1).toUpperCase() + lName.substring(1);
        String capFirstname = fName.substring(0,1).toUpperCase() + fName.substring(1);
        String capMi = mInitial.substring(0,1).toUpperCase();

        orderedFullName = capLastname+", "+capFirstname+" "+capMi+".";

        System.out.println(orderedFullName);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n**CountWords**");

        System.out.println("Enter a sentence : ");
        String sentence = sc.nextLine();
        System.out.println("There are "+countWords(sentence)+" words in the sentence");

        System.out.println("\n\n**Palindrome**");
        System.out.println("Enter word : ");
        String word = sc.next();
        System.out.println("Palindrome : "+isPalindrome(word));

        System.out.println("\n\n**mkFullName**");

        mkFullName();
    }
}
