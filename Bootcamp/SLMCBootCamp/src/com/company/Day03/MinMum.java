package com.company.Day03;
/*
 Print out the minimum and maximum number in an array, int[] = {4,300,5,130,9}
 */
public class MinMum {
    public static void main(String[] args) {

            int[] x = {4,300,5,130,9};
            int temp = 0;

        for(int i=0;i<x.length;i++) {
            for (int j = i + 1; j < i; j++) {
                if (x[i] > x[j]) {
                    temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
    }
}
