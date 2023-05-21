/*
 * Author: Branden Hernandez
 * Date: 5/21/23
 * Purpose: Integer and string interactive example in Java Programming 7th ed. by Joyce Farrell
 * */
import java.util.Scanner;
public class IntegerDemoInteractive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int anInt;
        byte aByte;
        short aShort;
        long aLong;
        String name;

        System.out.print("Please enter your name >> ");
        name = input.nextLine();
        System.out.print("Thank you, " + name);
        System.out.print("\nPlease enter an integer >> ");
        anInt = input.nextInt();
        System.out.print("Please enter a byte integer >> ");
        aByte = input.nextByte();
        System.out.print("Please enter a short integer >> ");
        aShort = input.nextShort();
        System.out.print("Please enter a long integer >> ");
        aLong = input.nextLong();
        System.out.println("The int is " + anInt);
        System.out.println("The byte is " + aByte);
        System.out.println("The short is " + aShort);
        System.out.println("The long is " + aLong);
    }
}
//Thanks for looking