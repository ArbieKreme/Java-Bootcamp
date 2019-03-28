package com.company.Day03;
/*swaps the position of adjacent int array elements. For example {1,2,3,4,5,6} becomes
{2,1,4,3,6,5}. Check that the size of the array is even; print out an error if the array size is odd

 */
import java.util.Scanner;
public class Swapper {
    public static void main(String[] args) {
    
        int temp;
        int array[];
        
        System.out.println("How many numbers you want to enter?");
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        array = new int[total];
        
        
        for(int i=0; i<total;i++){
            System.out.println("Enter element for position "+i+1);
            int number = sc.nextInt();
            array[i] = number;
        }
        
        System.out.println("Array entered : \n");
        for(int i=0;i<total;i++){
            System.out.println(array[i]);
        }
        
        for(int i = 0;i<total;i+=2){
            if(i+1 == total){
                break;
            }
            
            temp = array[i];
            array[i]=array[i+1];
            array[i+1]=temp;
        }
        System.out.println("Array after reversing:\n");
        for(int i = 0;i<total;i++){
            System.out.println(array[i]);
        }
    }
}
