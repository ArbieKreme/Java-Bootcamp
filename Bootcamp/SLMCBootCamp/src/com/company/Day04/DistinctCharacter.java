package com.company.Day04;

import java.util.ArrayList;
import java.util.Scanner;

public class DistinctCharacter {
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a string");
        String inputString = sc.nextLine();


        StringBuilder sbi = new StringBuilder(inputString);

        String input = sbi.toString();
        String inputCopy = input.toLowerCase().replaceAll("\\s","");

        ArrayList<Character> characterList = new ArrayList<>();
        ArrayList<Integer> appearanceCounts = new ArrayList<>();

        for(int i = 0; i < inputCopy.length(); i++) {
            int appearances = 1;
            for (int j = i + 1 ; j < inputCopy.length(); j++) {
                if (inputCopy.charAt( i ) == inputCopy.charAt( j )) {
                    appearances++;
                }
            }
            if(!characterList.contains(inputCopy.charAt( i ))) {
                characterList.add(inputCopy.charAt( i ));
                appearanceCounts.add(appearances);
            }
        }



        for(int x = 0; x < characterList.size(); x++){
            for(int y = 0; y < characterList.size(); y++){
                if(characterList.get( x ) < characterList.get( y )){
                    //re-arrange alphabet
                    char temp = characterList.get( x );
                    characterList.set(x,characterList.get( y ));
                    characterList.set(y,temp);
                    //re-arrange appearance count
                    int secondTemp = appearanceCounts.get( x );
                    appearanceCounts.set(x,appearanceCounts.get( y ));
                    appearanceCounts.set(y, secondTemp);
                }
            }
        }


        System.out.println("Distinct characters in : " + input);
        for(int x = 0; x < characterList.size(); x++){
            System.out.println(characterList.get( x )+" : "+appearanceCounts.get( x ));
        }

    }
}