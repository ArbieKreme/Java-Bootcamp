package com.company.Day19;

public class ClassCastExceptionSample {
    public static void main(String[] args) {
        try{
            Object x = new Integer(0);
            System.out.println((String)x);
        }catch(ClassCastException e){
            System.out.println("Attempted to cast an object to a subclass of which is not an instance");
        }

    }
}
