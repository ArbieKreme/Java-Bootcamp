package com.company.Day06;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {3,7,10,4,2};
        System.out.println("Numbers.length = "+numbers.length);
        System.out.println("Unsorted numbers: ");
        for(int x : numbers){
            System.out.println(x);
        }

        for(int i = 0; i < numbers.length-1; i++){
            for(int j = i+1; j>0; j--){
                if(numbers[j] < numbers[j-1]){
                    int temp = numbers[j-1];
                    numbers[j-1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("\nSorted Numbers:");
        for(int y: numbers){
            System.out.println(y);
        }
    }
}
