package com.stackroute.practiceThree;


import javax.naming.LimitExceededException;

//7. Create a class with a main( ) that throws an object of class Exception inside a try block.
//a. Give the constructor for Exception a ​ String​ argument.
//b. Catch the exception inside a catch clause and print the ​ String​ argument.
//c. Add a finally clause and print a message to prove you were there
public class ExceptionClass {

    private static String name="Sheby";

    public ExceptionClass(String name) {
        this.name = name;
    }

    public int getLength() throws LimitExceededException    //method to get length of the string
    {
        int length=name.length();
        return length;
    }

    public static void main(String[] args) {
        try{
            ExceptionClass ex=new ExceptionClass(name);
            int length=ex.getLength();


            if(length>2)        //if length greater than 2 throw exception
                throw new LimitExceededException(name);
            System.out.println("Inside try block");


        } catch (Exception LimitExceededException)  //catch limit exceeded exception
         {
            System.out.println(name);
            System.out.println("Exception caught");
        }
        finally
        {
            System.out.println("finally block executed");
        }
        }
    }



//
//        try
//        {
//            int i = arr[4];
//
//            // this statement will never execute
//            // as exception is raised by above statement
//            System.out.println("Inside try block");
//        }
//
//        catch(ArrayIndexOutOfBoundsException ex)
//        {
//            System.out.println("Exception caught in catch block");
//        }
//
//        finally
//        {
//            System.out.println("finally block executed");
//        }
//
//        // rest program will be executed
//        System.out.println("Outside try-catch-finally clause");
//    }
//}