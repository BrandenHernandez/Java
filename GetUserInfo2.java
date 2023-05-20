/*
 * Author: Branden Hernandez
 * Date: 5/20/23
 * Purpose: User input example in Java Programming 7th ed. by Joyce Farrell
 * */

import java.util.Scanner;
public class GetUserInfo2 {
    public static void main(String[] args){
        String name;
        int age;
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Please enter your age >> ");
        age = inputDevice.nextInt();
        inputDevice.nextLine(); //consumes the enter key that follows the number
        System.out.println("Please enter your name >> ");
        name = inputDevice.nextLine();
        System.out.println("Your name is " + name + " and you are " + age + " years old.");
    }
}
//Thanks for looking