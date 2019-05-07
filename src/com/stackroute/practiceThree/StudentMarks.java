package com.stackroute.practiceThree;


//1. Create a class called StudentMarks, which prompts user for the number of students, reads it
//from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user for the
//grades of each of the students and saves them in an int array called stuGrades. Your program shall
//check that the grade is between 0 and 100 else has to trow an error message.

import java.io.IOException;
import java.util.Scanner;

public class StudentMarks {

    private final int lowest_score=0;
    private final int highest_score=100;

    //private Scanner in;



//method to get the number of students
    public int numberOfStudents() {
        Scanner in=new Scanner(System.in);
        int numOfStudents;
        System.out.println("Enter number of students: ");
        numOfStudents=in.nextInt();
        return numOfStudents;
    }


    //method to enter the grades of the students
    public int[] gradesOfStudents(int numOfStudents)  {
        Scanner in=new Scanner(System.in);
        int[] studentGrades= new int[numOfStudents];
//        int[] stuGrades=new int[numOfStudents];
        System.out.println("Enter the student grades: ");
        for(int i=0;i<numOfStudents;i++)
        {
            studentGrades[i]=in.nextInt();

        }
        return studentGrades;
    }


    //method to check the grades of the students and to print an error message if the grad eis lesser than 0 or greater than 100
    public void gradesChecker(int numOfStudents,int[] studentGrades) {
        for (int i = 0; i <numOfStudents; i++) {
            if (studentGrades[i] < lowest_score) {
                System.out.print("STUDENT "+i+ ": ");
                System.out.print(studentGrades[i]+" ");
                System.out.println("The score is lower than 0");
            } else if (studentGrades[i] >highest_score) {
                System.out.print("STUDENT "+i+ ": ");
                System.out.print(studentGrades[i]+" ");
                System.out.println("The score is greater than 100");
            } else {
                System.out.print("STUDENT "+i+ ": ");
                System.out.println(studentGrades[i]);
            }
        }
    }


    //main method to create instance of the class and call the methods to perform each methods
    public static void main(String[] args) throws NullPointerException {
        StudentMarks student=new StudentMarks();
       int numOfStudents=student.numberOfStudents();
        int[] studentGrade=student.gradesOfStudents(numOfStudents);
        student.gradesChecker(numOfStudents,studentGrade);
    }

}
