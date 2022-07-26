package org.example.array_programs;

import java.util.Scanner;

public class Matrix {
    //print the matrix
    public static void printMatrix(int[][] arr){
        int m = arr.length;//for rows
        int n = arr[0].length;//for columns

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    //Display the lower triangular matrix
    public static void lowerTriangularMatrix(int arr[][]){
        int m = arr.length;
        int n = arr[0].length;

        if (m!=n) {
            System.out.println("Matrix entered should be a Square Matrix");
            System.out.println("Try Again..");
            return;
        }
        else{
            //looping over the whole matrix
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (i<j) {
                        arr[i][j] = 0;
                    }
                }
            }
            System.out.println("Lower Triangular Matrix is: ");
            //printing the lower triangular matrix
            printMatrix(arr);
        }

    }

    public static void main(String[] args) {
        //take input from user
        Scanner scanner = new Scanner(System.in);
        int m,n;//Declare variable for rows and columns
        System.out.println("Enter the number of rows");
        m=scanner.nextInt();
        System.out.println("Enter the number of columns");
        n=scanner.nextInt();
        System.out.println("Enter the matrix elements: ");
        int arr[][] = new int[m][n];//Declare the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        //Print Original Matrix
        System.out.println("Original Matrix is: ");
        printMatrix(arr);

        //calling to display the lower triangular matrix
        lowerTriangularMatrix(arr);
    }
}
