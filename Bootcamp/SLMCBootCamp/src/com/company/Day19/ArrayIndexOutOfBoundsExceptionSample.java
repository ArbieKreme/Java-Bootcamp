package com.company.Day19;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionSample {
    public static void main(String[] args) {

        try{
            String[] names = new String[10];
            for(int i = 0; i<names.length+1;i++){
                Scanner scanner = new Scanner(System.in);
                String temp = names[i];
        }
    }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of Bounds");
        }

    }
}
