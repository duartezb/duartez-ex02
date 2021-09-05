
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Billy Duartez
 */

/* Program prompts for an input string and displays output
that shows the input string and the number of characters the string contains. */

//imports scanner

import java.util.Scanner;

//main code
public class Solution02 {
    public static void main(String[] args) {

        //tells computer to scan in something

        Scanner input = new Scanner(System.in);

        //prompts user to enter a string
        System.out.println("What is the input string? ");

        //tells computer to store the string as the letter s
        String s = input.nextLine();

        System.out.println(s + " has " + s.length() + " characters.");



    }
}