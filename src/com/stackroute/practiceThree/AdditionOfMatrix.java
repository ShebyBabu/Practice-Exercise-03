package com.stackroute.practiceThree;

//2. Write a program to compute the addition of two matrix, Read the number of rows and columns
//as input, also the values of each matrix
//Output:
//Input number of rows of matrix: 3
//Input number of columns of matrix: 2
//Input elements of first matrix: 1 2 3 4 5 6
//Input the elements of second matrix: 9 8 7 6 5 4
//Sum of the matrices:-
//10    10
//10    10
//10    10


import java.util.Arrays;
import java.util.Scanner;

public class AdditionOfMatrix {


    //function to enter the number of rows and columns
    public void inputRowsAndColums() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of rows in matrix: ");
        int rows = scanner.nextInt();
        System.out.println("Input number of columns in matrix: ");
        int columns = scanner.nextInt();

        inputMatrixElements(rows, columns);
    }

    //function to enter the matrix elements inside both matrices
    public void inputMatrixElements(int rows, int columns) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input matrix one elements: ");
        int[][] matrixOne = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrixOne[i][j] = s.nextInt();
            }
        }

        System.out.println("Input matrix two elements: ");
        int[][] matrixTwo = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrixTwo[i][j] = s.nextInt();
            }
        }

        addMatrix(rows, columns, matrixOne, matrixTwo);
    }


    //function to add both the matrices and print the output
    public void addMatrix(int rows, int columns, int[][] matrixOne, int[][] matrixTwo) {
        int[][] solution = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                solution[i][j] = matrixOne[i][j] + matrixTwo[i][j];
            }
        }

        System.out.println("Sum of the matrices : ");
        System.out.println(Arrays.deepToString(solution));



    }

    //main method to create the object of the class and call the first function
    public static void main(String[] args) {
        AdditionOfMatrix addMatrix = new AdditionOfMatrix();
        addMatrix.inputRowsAndColums();

    }
}
