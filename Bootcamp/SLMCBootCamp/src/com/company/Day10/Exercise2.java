package com.company.Day10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//Use BufferedReader to read in words50000.txt into an ArrayList. Find the longest entry/word.
// How long did your program take?


public class Exercise2 {

    public static void main(String[] args){
        String fileName = "words50000.txt";

        long startTime = System.nanoTime();

        ArrayList<String> arr = new ArrayList<>();

        String longestEntry = "";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName)))
        {

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                arr.add(sCurrentLine);
            }

            for(int i = 0; i < arr.size(); i++)
            {
                if(arr.get(i).length() > longestEntry.length())
                {
                    longestEntry = arr.get(i);
                }
            }

            System.out.println("Largest entry : "+longestEntry);

        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.nanoTime();
        System.out.println("Counted in, "+(endTime-startTime)/1000000 + "ms");
    }

}
