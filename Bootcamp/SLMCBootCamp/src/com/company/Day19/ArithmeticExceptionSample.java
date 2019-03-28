package com.company.Day19;

public class ArithmeticExceptionSample {
    public static void main(String[] args) {
        try{
            int x = 3/0;
            System.out.println(x);
        }catch (ArithmeticException e){
            System.out.println("Number cannot be divided by zero");
        }

    }
}
