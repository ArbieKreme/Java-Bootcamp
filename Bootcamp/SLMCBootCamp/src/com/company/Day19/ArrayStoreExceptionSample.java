package com.company.Day19;

public class ArrayStoreExceptionSample {
    public static void main(String[] args) {
        try{
            Object x[] = new String[3];
            x[0] = new Integer(0);
        }catch (ArrayStoreException e) {
            System.out.println("Attempt to store wrong type of objects to an array of objects");
        }

    }
}
