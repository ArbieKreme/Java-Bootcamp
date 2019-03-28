package com.company.Day10;

/*5.    Use either method to read in applog.txt and find the line that corresponds to:
        - When the ‘loading of bean definitions’ started; output the date and time
        - When the instance of the bean ‘Oracle’ was created; output the date and time
        - When (if any) the text: ‘finished creating all beans’ was logged

        HINT: Use LocalDate.parse  and the DateTimeFormatter class*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AppLog {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "applog.txt";
        FileReader fileReader = new FileReader(fileName);



        int countBuffer1=0,countBuffer2=0,countLine1=0,countLine2=0;
        String lineNumber1 = "";
        String lineNumber2 = "";

        BufferedReader br;
        String inputSearch1 = "Finished creating instance of bean 'MySQL'";
        String inputSearch2 = "Loading XML bean definitions from class path resource [tmfContext.xml]\"";
        String line = "";

        try {
            br = new BufferedReader(new FileReader(fileName));
            try {
                while((line = br.readLine()) != null)
                {
                    System.out.println(line);
                    countLine1++;
                    countLine2++;

                    if (line.contains(inputSearch1)) {
                        countBuffer1++;
                    }else if(line.contains(inputSearch2)){

                        countBuffer2++;
                    }

                    if(countBuffer1 > 0)
                    {
                        countBuffer1 = 0;
                        lineNumber1 += countLine1 ;

                    }else if(countBuffer2 > 0)
                    {
                        countBuffer2 = 0;
                        lineNumber2 += countLine2 ;

                    }

                }
                br.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("MySQL was created at line number "+lineNumber1);
        System.out.println("tmf context.xml was loaded at "+lineNumber2);
    }
}
