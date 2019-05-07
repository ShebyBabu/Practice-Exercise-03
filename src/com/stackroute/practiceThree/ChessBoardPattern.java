package com.stackroute.practiceThree;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Scanner;

//5. Write a program to create a ChessBoard pattern with the help of multidimensional array, where
//WWrepresents white color and BB represents Black color.
//Output:
//My Chess Board
//WW|BB|WW|BB|WW|BB|WW|BB|
//BB|WW|BB|WW|BB|WW|BB|WW|
//WW|BB|WW|BB|WW|BB|WW|BB|
//BB|WW|BB|WW|BB|WW|BB|WW|
//WW|BB|WW|BB|WW|BB|WW|BB|
//BB|WW|BB|WW|BB|WW|BB|WW|
//WW|BB|WW|BB|WW|BB|WW|BB|
//BB|WW|BB|WW|BB|WW|BB|WW|
public class ChessBoardPattern {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("rows");
        int rows=s.nextInt();
        System.out.println("columns");
        int columns=s.nextInt();
        String[][] pattern=new String[rows][columns];

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                if((i+j)%2==0)
                {
                    pattern[i][j]="WW/";
                }
                else
                {
                    pattern[i][j]="BB/";
                }
            }
        }

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++) {

                System.out.print(pattern[i][j] + " ");
            }
     System.out.println(" ");
            }
    }
}
