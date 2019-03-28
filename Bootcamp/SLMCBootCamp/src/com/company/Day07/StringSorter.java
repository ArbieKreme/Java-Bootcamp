package com.company.Day07;

import java.util.Scanner;

public class StringSorter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n**Stringsorter**");

        String[] names = {"James Gosling","Linus Trovalds","Tim Berners-Lee","Ted Codd"};

        for(int k = 0; k<names.length; k++){
            System.out.println(names[k]);
        }

        System.out.println("");

        for(int i = 0;i<names.length;i++){
            for(int j = 0;j<names.length - i - 1;j++){

                //Greater than
                if(names[j].compareToIgnoreCase(names[j+1]) > 0){

                    String temp = names[j];
                    names[j] = names[j+1];
                    names[j+1]=temp;

                }
            }
        }

        for(int x = 0;x<names.length;x++){
            System.out.println(names[x]);
        }
    }
}
