package com.company.Day10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReader2 {
    public static void main(String[] args)throws IOException {
        String fileName = "words100000.txt";
        FileReader fileReader = new FileReader(fileName);

        int wcounter = 0;
        long startTime = System.nanoTime();

        try(BufferedReader bufferedReader = new BufferedReader(fileReader)){
            String line;
            while((line = bufferedReader.readLine())!=null){
                wcounter++;
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Counted in, "+(endTime-startTime)/1000000 + "ms");
    }
}
