package com.company.Day06;

public class SelectionSort {

    public static void main(String[] args) {
        //select smallest and swap to the top
        int[] numbers = {3, 7, 10 ,4 ,2};
        System.out.println("Numbers length = " + numbers.length);
        System.out.println("Unsorted Numbers :");
        for(int x : numbers) System.out.print(x + ",");

        //selection sort
        for(int i = 0; i < numbers.length; i++){
            int numIndex= i;
            for(int j = i + 1; j < numbers.length; j++){
                if(numbers[j] < numbers[numIndex]){
                    numIndex = j;
                }
            }

            int temp = numbers[i];
            numbers[i] = numbers[numIndex];
            numbers[numIndex] = temp;
        }

        System.out.println("\n" + "Sorted numbers:");
        for(int y : numbers) System.out.print(y + ",");
    }
}