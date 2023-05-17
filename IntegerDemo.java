/*
 * Author: Branden Hernandez
 * Date: 5/17/23
 * Purpose: Integer example in Java Programming 7th ed. by Joyce Farrell
 * */

public class IntegerDemo {
    public static void main(String[] args){
        //Initially
        int anInt = 12;
        byte aByte = 12;
        short aShort = 12;
        long aLong = 12;

        System.out.println("\nThe int is " + anInt);
        System.out.println("The byte is " + aByte);
        System.out.println("The short is " + aShort);
        System.out.println("The long is " + aLong);

        //Over their limit
        //int anotherInt = 12345678909;
        //byte anotherByte = 1234;
        //short anotherShort = 123456;
        //long anotherLong = 1234567890987654321;

        //System.out.println("The int is " + anotherInt); //java: integer number too large
        //System.out.println("The byte is " + anotherByte); //java: incompatible types: possible lossy conversion from int to byte
        //System.out.println("The short is " + anotherShort); //java: incompatible types: possible lossy conversion from int to short
        //System.out.println("The long is " + anotherLong); //java: integer number too large

        //Maxed out
        int anotherInt = 1234567890;
        byte anotherByte = 123;
        short anotherShort = 12345;
        long anotherLong = 1234567890987654321L; //Notice the 'L' at the end

        System.out.println("\nValues maxed out are:");
        System.out.println("The int is " + anotherInt);
        System.out.println("The byte is " + anotherByte);
        System.out.println("The short is " + anotherShort);
        System.out.println("The long is " + anotherLong);
    }
}
//Thanks for looking