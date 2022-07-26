package org.example.spring_programs.replace_space_for_string;

//Java Program to replace the spaces of a string with a specific character
public class Demo001
{
    public static void main(String[] args)
    {
        String string = "Actions speak louder than words";
        char ch = '-';
        System.out.println("String before replacing spaces with given character: ");
        System.out.println(string);
//        //Replace space with specific character ch
//        string = string.replace(' ', ch);
        //Replace space with specific character ch
        string = string.replaceAll(" ", "-");
        System.out.println("String after replacing spaces with given character: ");
        System.out.println(string);
    }
}