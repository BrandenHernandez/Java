/*
 * Author: Branden Hernandez
 * Date: 5/25/23
 * Purpose: Arithmetic example in Java Programming 7th ed. by Joyce Farrell
 * */

import java.util.Scanner;
public class ArithmeticDemo {
    public static void main(String[] args){
        int firstNumber;
        int secondNumber;
        int sum;
        int difference;
        int average;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter an integer >> ");
        firstNumber = input.nextInt();
        System.out.print("Please enter second integer >> ");
        secondNumber = input.nextInt();

        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;
        average = sum / 2;

        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " = " + difference);
        System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + average);
    }
}
//Thanks for looking