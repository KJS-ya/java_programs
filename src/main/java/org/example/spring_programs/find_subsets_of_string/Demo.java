package org.example.spring_programs.find_subsets_of_string;

import java.util.Scanner;

/**使用substr()方法
 * Program 2: Find all the Subsets of a String
 * In this program, we will use substr() method to print all the subsets of the given string. The str.substr(i,j) will print the substring of length j starting from index i in the string.
 *
 * Algorithm
 * Start
 * Declare a string.
 * Initialize it.
 * Call a method to find all the subsets of the entered string.
 * Pass the string and string length as parameters.
 * Use two for loops for the same.
 * Use the first for loop to select the starting index of the subset.
 * Use the second for loop to hold the ending index of the subset.
 * Print all the subsets.
 * Stop.
 * Below is the code for the same in Java language.
 */
public class Demo {
    static void subString(String str,int n){
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <= n; j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("输入字符串：");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("结果：");
        subString(str,str.length());
    }
}
