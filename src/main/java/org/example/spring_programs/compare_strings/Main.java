package org.example.spring_programs.compare_strings;

//Java Program to compare two strings
public class Main
{
    public static void main(String []args)
    {

        String str1 = new String("Study Tonight");
        System.out.println("The entered string is: "+str1);
        String str2 = new String("Study Tonight");
        System.out.println("The entered string is: "+str2);
        System.out.println("Are the two strings equal? (using equals() method)");
        boolean result = str1.equals("Study Tonight"); // true
        System.out.println(result);
        System.out.println("Are the two strings equal? (Comparing by using == )");
        result = str2 == "Study Tonight"; // false
        System.out.println(result);
        System.out.println("Are the two strings equal? (Comparing by using == )");
        result = str1 == str2; // false
        System.out.println(result);
        System.out.println("Are the two strings equal? (Comparing Both Strings)");
        result = "Study Tonight" == "Study Tonight"; // true
        System.out.println(result);
    }
}