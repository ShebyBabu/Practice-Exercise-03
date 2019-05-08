package com.stackroute.practiceThree;
//3. Write a java program to calculate first and last date of a week.
//Output:
//First Date of Week:
//Mon 24/07/2017
//Last date of the week:
//Sun 30/07/2017

import jdk.swing.interop.SwingInterOpUtils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalculateFirstAndLastDayOfWeek {


    public static void main(String[] args) {


        Calendar c = Calendar.getInstance();  //to get the current date
        // System.out.println(c.getTime());
        // System.out.println(Calendar.DATE);
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(dateFormat.format(c.getTime()));
        c.add(Calendar.DATE, 6); //adding 6 days to the current date
        System.out.println(dateFormat.format(c.getTime()));


    }

}
