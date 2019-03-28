package com.company.Day06;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class WorkingDays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Date stdt = new Date();

        System.out.println("Enter start date");
        String startdate = sc.nextLine();

        System.out.println("Enter end date");
        String enddate = sc.nextLine();

        //SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy"); mm = minute
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try
        {
            //Date start = sdf.parse(startdate);
            Calendar start = Calendar.getInstance();
            start.setTime(sdf.parse(startdate));
            //Date end = sdf.parse(enddate);
            Calendar end = Calendar.getInstance();
            end.setTime(sdf.parse(enddate));
            int workingDays = 0;
            while(!start.after(end))//removed ; (semi-colon)
            {
                //int day = start.getDay();
                int day = start.get(Calendar.DAY_OF_WEEK);
                //if ((day != Calendar.SATURDAY) || (day != Calendar.SUNDAY)) if it's sunday, != to Saturday is true
                if ((day != Calendar.SATURDAY) && (day != Calendar.SUNDAY))
                    workingDays++;
                //System.out.println(workingDays);//moved
                start.add(Calendar.DATE, 1);//removed comment tags
            }
            System.out.println("There are "+workingDays+" working days between "+startdate+" and "+enddate);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

}

