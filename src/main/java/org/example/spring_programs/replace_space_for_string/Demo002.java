package org.example.spring_programs.replace_space_for_string;

//Java Program to replace the spaces of a string with a specific character
public class Demo002
{
    // Function to replace Space with -
    static String replaceStr(String str)
    {
        String s = "";
        // Iterate over each character of the string
        for (int i = 0; i < str.length(); ++i)
        {
            // If a space encounters then replace it with -
            if (str.charAt(i) == ' ')
                s += '-';
            else
                s += str.charAt(i);
        }
        // return the new string.
        return s;
    }
    //Driver Code
    public static void main(String []args)
    {
        // Initialize the String
        String str = "There are other fish in the sea";
        System.out.println("String before replacing spaces with given character: ");
        System.out.println(str);
        //Print the modified string
        System.out.println("String after replacing spaces with given character: ");
        System.out.println(replaceStr(str));
    }
}