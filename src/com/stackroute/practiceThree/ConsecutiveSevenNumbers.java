package com.stackroute.practiceThree;

//6. Write a program to find out if a series of 7 digits are consecutive numbers. To make this easier,
//assume the digits are a ​ string​ and use split()
//Input: 98,96,95,94,93
//Output: 98,96,95,94,93 non consecutive numbers
//Input: 54,53,52,51,50,49,48
//Output : 54,53,52,51,50,49,48 are consecutive numbers
//Input: 1,2,3,4,5,6,6
//Output: 1,2,3,4,5,6,6 non consecutive numbers

import java.util.Scanner;

public class ConsecutiveSevenNumbers {
    public static void main(String[] args) {
        int flag=1;

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the digits:   ");
        String input=s.nextLine();

        String[] inputArray=input.split(",");
        int[] inputArrayInteger=new int[4];

        for(int i=0;i<inputArray.length;i++)
        {
            inputArrayInteger[i]=Integer.parseInt(inputArray[i]);

        }

        for(int i=0;i<inputArray.length;i++)
        {
            int number=inputArrayInteger[i];
            if(inputArrayInteger[i+1]==(number+1) || inputArrayInteger[i+1]==(number-1)) {
                i++;
                flag=0;
            }
            else
            {
                break;
            }
        }

        if(flag==0)
        {
            System.out.println("consecutive");
        }
        else
        {
            System.out.println("not");
        }
    }
}
