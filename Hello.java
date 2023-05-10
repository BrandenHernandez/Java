/*
 * Author: Branden Hernandez
 * Date: 5/10/23
 * Purpose: First example in Java Programming 7th ed. by Joyce Farrell
 */

/**
 * In this example, the class name is 'Hello'.
 * You can use any valid name you want for a class but the name is case-sensitive
 * thus 'Hello' is a different class than 'hello' */

public class Hello
{ //Everything withing these curly braces will be the program of the class 'Hello'
    //Base practice is for each curly brace to have its own line to make the code easier to read.

    //The program needs to know where to start. This is a method called 'main'
    public static void main(String[] args)
    {
     //We will cover what 'public', 'static', and 'void' means in future lessons
     //String[] is an array of strings called 'args' - sort for arguments

     /* Next, within the main method block aka curly braces, we will add a statement that
     will type the iconic words 'Hello World' to the console. This is a typical program
     for anyone's first project in any language.*/
        System.out.println("Hello World!");
        //System accesses the computer telling it to output a print to console then a new line
        //What we print to console are the words "Hello World" with an exclamation mark.
    }
}
//Thanks for looking