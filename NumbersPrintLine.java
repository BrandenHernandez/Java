/*
 * Author: Branden Hernandez
 * Date: 5/14/23
 * Purpose: String concatenation example in Java Programming 7th ed. by Joyce Farrell
 * */
public class NumbersPrintLine {
    public static void main(String[] args){
        int billingDate = 5;
        System.out.print("Bills are sent on day ");
        System.out.print(billingDate);
        System.out.println(" of the month.");
        System.out.println("Next bill: October " + billingDate + "th");
    }
}
//Thanks for looking