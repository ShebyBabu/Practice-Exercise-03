package com.stackroute.practiceThree;


import java.util.Scanner;

//8. Write a program that will generate ​ exceptions​ of type NegativeArraySizeException,
//IndexOutOfBoundsException, NullPointerException. Record the catching of each exception by
//displaying the message stored in the exception object.
public class ExceptionClass2 {

    public static void main(String[] args) {
        try {
            int[] arr = new int[4];
            int i = arr[4];
        } catch (ArrayIndexOutOfBoundsException ex) //catch statement for array index out of bounds
        {
            System.out.println("Exception caught in Catch block");
        }

        try {
            Scanner s = new Scanner(System.in);

            int[] j = new int[-4];
            for (int k = 0; k < j.length; k++) {
                j[k] = s.nextInt();
            }

            for (int k = 0; k < j.length; k++) {
                System.out.println(j[k]);
            }
        } catch (NegativeArraySizeException ex1) { //catch statement for negative array size
            System.out.println("EXception caught");
        }

        try {

            String name = null;
            int length = name.length();

            System.out.println("Inside try block");
        } catch (NullPointerException ex) //catch statement for null pointer exception
        {
            System.out.println("Exception caught");
        }


        System.out.println("Outside try-catch clause");
    }
}
