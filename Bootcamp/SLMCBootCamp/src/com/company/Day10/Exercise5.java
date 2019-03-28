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
import java.time.LocalDate;

public class Exercise5 {
    public static void main(String[] args) throws FileNotFoundException {





        //int countBuffer1=0,countBuffer2=0,countLine1=0,countLine2=0;
        int countBuffer3=0,countBuffer4=0,countBuffer5=0,countLine3=0,countLine4=0,countLine5=0;
        //String lineNumber1 = "";
        //String lineNumber2 = "";
/*        String lineNumber3 = "";
        String lineNumber4 = "";
        String lineNumber5 = "";*/
        String filePath = "applog.txt";

        BufferedReader br;
        //String inputSearch1 = "Finished creating instance of bean 'MySQL'";
        //String inputSearch2 = "Loading XML bean definitions from class path resource [tmfContext.xml]\"";
        String line = "";
        LocalDate date;

       try {
            br = new BufferedReader(new FileReader(filePath));
            try {
                while((line = br.readLine()) != null)
                {
                    if(line.contains("Loading bean definitions")){
                        String temp[]= line.split(" ",0);
                        System.out.println("Loading of bean definitions found at "+temp[2]+" "+temp[3]);
                    }if(line.contains("Finished creating instance of bean 'Oracle'")){
                        String temp[] = line.split(" ",0);
                    System.out.println("Instance of bean 'Oracle' was created on "+temp[2]+" "+temp[3]);
                    }if (line.contains("Finished creating all beans at")){
                        String temp[] = line.split(" ",0);
                    System.out.println("Finished creating all bean is on "+temp[2]+" "+temp[3]);
                    }else{
                        continue;
                    }
                    System.out.println(line);

                }
                br.close();
                //System.out.println("MySQL was created at line number "+lineNumber1);
                //System.out.println("tmf context.xml was loaded at "+lineNumber2);
                /*System.out.println("Loading of bean definitions is on "+temp1);
                System.out.println("Instance of bean Oracle was created on "+temp2);
                System.out.println("Finished creating all beans was on "+temp3);// IF LOGGED*/

            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
       } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



    }
}
