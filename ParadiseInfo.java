/*
 * Author: Branden Hernandez
 * Date: 5/26/23
 * Purpose: Method and calling method from another class and two classes same file example in Java Programming 7th ed. by Joyce Farrell
 * */


public class ParadiseInfo {
    public static void displayInfo(){
            System.out.println("Paradise Day Spa wants to pamper you.");
            System.out.println("We will make you look good!");
    }
}
class TestInfo{
    public static void main(String[] args){
        System.out.println("Calling a method from another class:");
        ParadiseInfo.displayInfo();
    }
}
//Thanks for looking