package org.example.spring_programs;
////Java programs to find the duplicate characters in a given string
//public class FindDuplicateChar {
//    public static void main(String[] args) {
//        String str1 = "Maximum and minimum";
//        int count;
//        System.out.println("The entered string is: " + str1);
//        //convert given string to character array
//        char str[] = str1.toCharArray();
//
//        System.out.println("Duplicate character in a given string: ");
//        //count the frequency of each character present is the string
//        for (int i = 0; i < str.length; i++) {
//            count = 1;
//            for (int j = i + 1; j < str.length; j++) {
//                if (str[i] == str[j] && str[i] != ' ') {
//                    count++;
//                    //Set string[j] to 0 to avoid printing visited character
//                    str[j] = '0';
//                }
//            }
//            //A character is considered as duplicate if count is greater than 1
//            if (count > 1 && str[i] != '0')
//                System.out.println(str[i]);
//        }
//    }
//}
//Java Program to find the duplicate characters in a given string
import java.util.*;
public class FindDuplicateChar
{
    public static void main(String[] args)
    {
        //Take input from the user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string is: ");
        String str1=sc.nextLine();
        int count;
        //Converts given string into character array
        char str[] = str1.toCharArray();
        System.out.println("Duplicate characters in the given string: ");
        //Counts each character present in the string
        for(int i = 0; i <str.length; i++)
        {
            count = 1;
            for(int j = i+1; j <str.length; j++)
            {
                if(str[i] == str[j] && str[i] != ' ')
                {
                    count++;
                    //Set string[j] to 0 to avoid printing visited character
                    str[j] = '0';
                }
            }
            //A character is considered as duplicate if count is greater than 1
            if(count > 1 && str[i] != '0')
                System.out.println(str[i]);
        }
    }
}
