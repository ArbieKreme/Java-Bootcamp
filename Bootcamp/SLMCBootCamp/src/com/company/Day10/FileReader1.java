package com.company.Day10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader1 {
    public static void main(String[] args)throws FileNotFoundException {
        String fileName = "words100000.txt";
        File file = new File(fileName);

        int wcounter = 0;
        long startTime = System.nanoTime();

        try(Scanner scanner = new Scanner(file)){
            String line;
            boolean hasNextLine=false;
            while(hasNextLine = scanner.hasNextLine()){
                line = scanner.nextLine();
                wcounter++;
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Counted in, "+(endTime-startTime)/1000000+" ms");
    }
}
