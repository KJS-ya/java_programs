package org.example.spring_programs.division;


import java.util.*;

public class DivideString {
    public static void main(String[] args) {
        //Take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        //Enter the total number of parts
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int temp = 0, chars = str.length() / n;

        //Stores the array of string
        String[] newStr = new String[n];
        //Check whether a string can be divided into n equal parts
        if (str.length() % n != 0) {
            System.out.println("Invalid Input");
            System.out.println("String size is not divisible by " + n);
            System.out.println("Try Again");
        } else {
            for (int i = 0; i < str.length(); i = i + chars) {
                //Dividing string in n equal part using substring()
                String part = str.substring(i, i + chars);
                newStr[temp] = part;
                temp++;
            }
            System.out.println("On dividing the entered string into " + n + " equal parts, we have ");
            for (int i = 0; i < newStr.length; i++) {
                System.out.println(newStr[i]);
            }
        }
    }
}