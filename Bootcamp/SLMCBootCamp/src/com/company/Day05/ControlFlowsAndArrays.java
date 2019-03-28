package com.company.Day05;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

class Operations{
    
    public static Scanner sc = new Scanner(System.in);

    public static void Reverse(int arr[],int start, int end){            
           
        int temp; 
           
        while (start < end) 
        { 
            temp = arr[start];  
            arr[start] = arr[end]; 
            arr[end] = temp; 
            start++; 
            end--; 
        }  
        
    }

    public static void ReverseBubbleSort(int arr[]){
        int temp = 0;
        for(int i = 0; i<arr.length-1;i++){
            for(int j = i+1;j > 0;j--)
                if(arr[j]>arr[j-i]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j]=temp;
                }
        }
    }
    
        static void PrintArray(int arr[],  
                            int size) 
    { 
        for (int i = 0; i < size; i++) 
             System.out.print(arr[i] + " "); 
    }


    private static final String[] tensNames = {
            "",
            " Ten",
            " Twenty",
            " Thirty",
            " Forty",
            " Fifty",
            " Sixty",
            " Seventy",
            " Eighty",
            " Ninety"
    };

    private static final String[] numNames = {
            "",
            " One",
            " Two",
            " Three",
            " Four",
            " Five",
            " Six",
            " Seven",
            " Eight",
            " Nine",
            " Ten",
            " Eleven",
            " Twelve",
            " Thirteen",
            " Fourteen",
            " Fifteen",
            " Fixteen",
            " Seventeen",
            " Eighteen",
            " Nineteen"
    };

    private static String convertLessThanOneThousand(int number) {
        String soFar;

        if (number % 100 < 20){
            soFar = numNames[number % 100];
            number /= 100;
        }
        else {
            soFar = numNames[number % 10];
            number /= 10;

            soFar = tensNames[number % 10] + soFar;
            number /= 10;
        }
        if (number == 0) return soFar;
        return numNames[number] + " Hundred" + soFar;
    }


    public static String InWords(long number) {
        // 0 to 999 999 999 999
        System.out.println("\n\n**InWords**\n");
        if (number == 0) { return "Zero"; }

        String snumber = Long.toString(number);

        // pad with "0"
        String mask = "000000000000";
        DecimalFormat df = new DecimalFormat(mask);
        snumber = df.format(number);

        // XXXnnnnnnnnn
        int billions = Integer.parseInt(snumber.substring(0,3));
        // nnnXXXnnnnnn
        int millions  = Integer.parseInt(snumber.substring(3,6));
        // nnnnnnXXXnnn
        int hundredThousands = Integer.parseInt(snumber.substring(6,9));
        // nnnnnnnnnXXX
        int thousands = Integer.parseInt(snumber.substring(9,12));

        String result =  "";

        String Millions;
        switch (millions) {
            case 0:
                Millions = "";
                break;
            case 1 :
                Millions = convertLessThanOneThousand(millions)
                        + " Million ";
                break;
            default :
                Millions = convertLessThanOneThousand(millions)
                        + " Million ";
        }
        result =  result + Millions;

        String tradHundredThousands;
        switch (hundredThousands) {
            case 0:
                tradHundredThousands = "";
                break;
            case 1 :
                tradHundredThousands = "One Thousand ";
                break;
            default :
                tradHundredThousands = convertLessThanOneThousand(hundredThousands)
                        + " Thousand ";
        }
        result =  result + tradHundredThousands;

        String tradThousand;
        tradThousand = convertLessThanOneThousand(thousands);
        result =  result + tradThousand;

        // remove extra spaces!
        return result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ");
    }
    

    public void Bingo(){

        ArrayList<Integer> arrList = new ArrayList<Integer>();
        boolean valid = false;

        
        System.out.println("\n\n**Bingo**");
        int l = 5;
        int m = 5;
        int [][] bingoCard = new int[l][m];
        int min = 0;
        int max = 0;
        int temp = 0;

        String [] bingoLetters = {"B","\tI","\tN","\tG","\tO"};

        for(String a : bingoLetters){
            System.out.print(a+"  ");
        }



        System.out.println();



        for(int row=0; row < bingoCard.length; row++){
            while(!valid){
                max = 15;
                min = 1;
                temp = (int)(Math.random()* ((max - min) + 1))+min;
                if(!arrList.contains(temp)){
                    valid = true;
                    arrList.add(temp);
                }
            }
            bingoCard[row][0]= temp;
            valid = false;
        }

        for(int row=0; row < bingoCard.length; row++){
            while(!valid){
                max = 30;
                min = 16;
                temp = (int)(Math.random()* ((max - min) + 1))+min;
                if(!arrList.contains(temp)){
                    valid = true;
                    arrList.add(temp);
                }
            }
            bingoCard[row][1]= temp;
            valid = false;
        }

        for(int row=0; row < bingoCard.length; row++){
            while(!valid){
                max = 45;
                min = 31;
                temp = (int)(Math.random()* ((max - min) + 1))+min;
                if(!arrList.contains(temp)){
                    valid = true;
                    arrList.add(temp);
                }
            }
            bingoCard[row][2]= temp;
            valid = false;
        }
        bingoCard [2][2]=0;
        for(int row=0; row < bingoCard.length; row++){
            while(!valid){
                max = 60;
                min = 46;
                temp = (int)(Math.random()* ((max - min) + 1))+min;
                if(!arrList.contains(temp)){
                    valid = true;
                    arrList.add(temp);
                }
            }
            bingoCard[row][3]= temp;
            valid = false;
        }

        for(int row=0; row < bingoCard.length; row++){
            while(!valid){
                max = 75;
                min = 61;
                temp = (int)(Math.random()* ((max - min) + 1))+min;
                if(!arrList.contains(temp)){
                    valid = true;
                    arrList.add(temp);
                }
            }
            bingoCard[row][4]= temp;
            valid = false;
        }

        for(int row = 0;row<bingoCard.length;row++){
            for(int column = 0;column<bingoCard[row].length;column++){
                System.out.print(bingoCard[row][column]+"\t");
            }
            System.out.println();
        }

    }

    public static void Fibonacci(int x){
     
         int n1=0,n2=1,n3,i;
         System.out.println("\n\n**Fibonacci**\n\n");
         System.out.println("Printing fibonacci sequence up to "+x);
        System.out.print(n1+" "+n2);
    
        for(i=1;i<x-1;++i)
            {    
                n3=n1+n2;    
                System.out.print(" "+n3);    
                n1=n2;    
                n2=n3;    
    }    
  
}

final static String[] BINGO = {"B","I","N","G","O"};

    {
        int [][]bingoard = new int [5][5];

        //Random rand =
    }
        
    
    

    public void Prime(int x){

        int largestPrime = 2;
        boolean isPrime = false;

        if(x>1){
            for(int number = 2; number<=x;number++){
                isPrime = true;
                for(int i = 2; i<number/2;i++){
                    if(number % i == 0)
                        isPrime = false;
                }if(isPrime){
                    if(number>largestPrime) largestPrime = number;
                }
            }
        }
        System.out.println("Closest Fibonacci : " + largestPrime);
    }
        
    

}


public class ControlFlowsAndArrays extends Operations{



    public static void main(String[] args) {

        
        Operations operation = new Operations();

        //Reverse
        /*System.out.println("**Reverse**\n\nEnter numbers to reverse:");*/

        //int[] array = new int[5];
        /*for(int i = 0; i<array.length;i++){
            array[i] = sc.nextInt();
        }*/


        //Classes

        //Reverse
        /*Reverse(array, 0, array.length-1);
        System.out.print("\nReversed order of numbers is \n");
        System.out.println();
        PrintArray(array, array.length);*/

        //Input for other classes
        //System.out.println("\n\nEnter a number");
        //int y = sc.nextInt();

        //InWord
        //System.out.println(operation.InWords(y));

        //Bingo
        operation.Bingo();

        //Fibonacci
        //operation.Fibonacci(y);

        //Prime
        //operation.Prime(y);

    }
}
