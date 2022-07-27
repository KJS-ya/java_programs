package org.example.spring_programs.find_subsets_of_string;

import java.util.Scanner;

/**
 * In this program, we will use three nested for loops to print all the subsets of a string.
 * The first for loop is used to select the starting element,
 * the second for loop is required to select the ending element,
 * and the third for loop is used to print the selected element from starting to ending elements.
 *
 * Algorithm
 * Start
 * Declare a string.
 * Ask The user to initialize the string
 * Convert it to a character array.
 * Call a method that will find all the subsets of a string.
 * Use three for loops for the same.
 * Use the first for loop to select the starting index of the subset.
 * Use the second for loop to hold the ending index of the subset.
 * Use the third for loop to print all the subsets.
 * Stop.
 * Below is the code for the same in Java language.
 */
//Java program to Find all the subsets of a string
public class Main {
    //to find all the subset of the string
    static void subString(char str[], int n){
        //to select starting point
        for (int i = 1; i <= n; i++) {
            //print character from selected
            //to select ending point
            for (int j = 0; j <= n - i; j++) {
                int t = i + j - 1;
                for (int k = j; k <= t; k++) {
                    System.out.print(str[k]);
                }
                System.out.println();
            }
        }
    }
    //Driver programs to test above function
    public static void main(String[] args) {
        //take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string is: ");
        String str1 = sc.nextLine();
        char str[] = str1.toCharArray();
        System.out.println("all the substrings of the above string are: ");
        subString(str,str.length);
    }
}
