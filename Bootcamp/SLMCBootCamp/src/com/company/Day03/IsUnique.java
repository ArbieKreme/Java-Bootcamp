package com.company.Day03;
/*
determines if all the elements of an array of integers are unique. For example, int[] numbers = {56, 100, 101,
56, 5, 23, -23, 100}
•	Print out ‘All elements are unique’ or ‘there are duplicates’
•	Print out the number that is duplicated and the number of times duplicated


 */
import java.util.Arrays;
import java.util.Scanner;

public class IsUnique {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total = 8;
        int a[];
        a = new int[total];

        int size = 8;


        int nbOccurences = 1;

        int arr[];
        arr = new int[size];

        System.out.println("Enter 8 numbers.");
        for(int i=0; i<size;i++){

            int number = sc.nextInt();
            arr[i] = number;
        }
        String uniqueOrNot = "";
        Arrays.sort(a);

        for (int i = 0, length = arr.length; i < length; i++) {
            if (i < length - 1) {
                if (arr[i] == arr[i + 1]) {

                    nbOccurences++;

                }
            } else {

                if(nbOccurences>1){
                    uniqueOrNot = "There are duplicate elements.";
                }else{
                    uniqueOrNot = "All elements are unique.";
                }
                System.out.println(arr[i] + " occurs " + nbOccurences
                        + " time(s)"); //end of array
                if(nbOccurences>1){
                    uniqueOrNot = "There are duplicate elements.";
                }else{
                    uniqueOrNot = "All elements are unique.";
                }
            }

            if (i < length - 1 && arr[i] != arr[i + 1]) {
                System.out.println(arr[i] + " occurs " + nbOccurences
                        + " time(s)"); //moving to new element in array
                nbOccurences = 1;
                if(nbOccurences>1){
                    uniqueOrNot = "There are duplicate elements.";
                }else{
                    uniqueOrNot = "All elements are unique.";
                }
            }


        }

        System.out.println(uniqueOrNot);



    }
}
