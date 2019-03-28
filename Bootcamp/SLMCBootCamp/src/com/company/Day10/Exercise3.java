package com.company.Day10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


//Use either method to read in words10000.txt, words50000.txt and words100000.txt in to an ArrayList and
// sort the lists using the bubble-sort and selection-sort algorithms.
// Show the different running times for the 10000, 50000 and 100000 word list for both sorting algorithms.

public class Exercise3 {

    public static void main(String[] args){
        String fileName10k = "words100000.txt";
        String fileName50k = "words50000.txt";
        String fileName100k = "words100000.txt";

        long startTime = System.nanoTime();
        long endTime = System.nanoTime();

        ArrayList<String> arr = new ArrayList<>();


        //10000
        try (BufferedReader br = new BufferedReader(new FileReader(fileName10k)))
        {

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                arr.add(sCurrentLine);
            }
            //Bubble-sort
            for(int i = 0; i < arr.size()-1; i++){
                for(int j = i+1; j>0; j--){
                    if(arr.get(i).length() > arr.get(i).length()){

                        String temp = arr.get(j);
                        arr.set(j,arr.get(j+1));
                        arr.set(j+1,temp);
                        System.out.println();
                    }
                }

            }
            System.out.println("Bubble sort of 10k words Counted in, "+(endTime-startTime)/1000000 + "ms");
            //Selection-sort

            for(int i = 0; i < arr.size(); i++){
                int numIndex= i;
                for(int j = i + 1; j < arr.size(); j++){
                    if(arr.get(j).length() < arr.get(numIndex).length()){
                        String temp = arr.get(i);
                        arr.set(i, arr.get(j));
                        arr.set(j, temp);
                    }
                }
            }
            System.out.println("Selection sort of 10k words Counted in, "+(endTime-startTime)/1000000 + "ms");
            //Output Sorted Arraylist
            /*for(int x = 0;x<arr.size();x++){
                System.out.println(arr);
            }*/
        } catch (IOException e) {
            e.printStackTrace();
        }







        //50000
        try (BufferedReader br = new BufferedReader(new FileReader(fileName50k)))
        {

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                arr.add(sCurrentLine);
            }
            //Bubble-sort
            for(int i = 0; i < arr.size()-1; i++){
                for(int j = i+1; j>0; j--){
                    if(arr.get(i).length() > arr.get(i).length()){

                        String temp = arr.get(j);
                        arr.set(j,arr.get(j+1));
                        arr.set(j+1,temp);
                        System.out.println();
                    }
                }

            }
            System.out.println("Bubble sort of 50k words Counted in, "+(endTime-startTime)/1000000 + "ms");
            //Selection-sort

            for(int i = 0; i < arr.size(); i++){
                int numIndex= i;
                for(int j = i + 1; j < arr.size(); j++){
                    if(arr.get(j).length() < arr.get(numIndex).length()){
                        String temp = arr.get(i);
                        arr.set(i, arr.get(j));
                        arr.set(j, temp);
                    }
                }
            }
            System.out.println("Selection sort of 50k words Counted in, "+(endTime-startTime)/1000000 + "ms");
            //Output Sorted Arraylist
            /*for(int x = 0;x<arr.size();x++){
                System.out.println(arr);
            }*/
        } catch (IOException e) {
            e.printStackTrace();
        }




        //100000
        try (BufferedReader br = new BufferedReader(new FileReader(fileName100k)))
        {

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                arr.add(sCurrentLine);
            }
            //Bubble-sort
            for(int i = 0; i < arr.size()-1; i++){
                for(int j = i+1; j>0; j--){
                    if(arr.get(i).length() > arr.get(i).length()){

                        String temp = arr.get(j);
                        arr.set(j,arr.get(j+1));
                        arr.set(j+1,temp);
                        System.out.println();
                    }
                }

            }
            System.out.println("Bubble sort of 100k words Counted in, "+(endTime-startTime)/1000000 + "ms");
            //Selection-sort

            for(int i = 0; i < arr.size(); i++){
                int numIndex= i;
                for(int j = i + 1; j < arr.size(); j++){
                    if(arr.get(j).length() < arr.get(numIndex).length()){
                        String temp = arr.get(i);
                        arr.set(i, arr.get(j));
                        arr.set(j, temp);
                    }
                }
            }
            System.out.println("Selection sort of 100k words Counted in, "+(endTime-startTime)/1000000 + "ms");
            //Output Sorted Arraylist
            /*for(int x = 0;x<arr.size();x++){
                System.out.println(arr);
            }*/
        } catch (IOException e) {
            e.printStackTrace();
        }






    }
}
