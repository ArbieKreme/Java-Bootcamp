package com.company.Day03;

public class OddOrEven {
    public static void main(String[] args) {
        int[] numbers = {4,1,100,3,7};

        System.out.println("for-loop 1:");
        System.out.println("Array of Numbers");

        for(int i = 0; i < numbers.length;i++){
            int x = numbers[i];
            System.out.println(x);

            if (x%2 == 0){
                System.out.println(" -even");
            }else{
                System.out.println( " -odd");
            }
        }

        for(int x : numbers){
            System.out.println("x = "+x+" is "+(x%2==0?"even":"odd"));
        }
    }
}
