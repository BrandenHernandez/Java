/*
 * Author: Branden Hernandez
 * Date: 5/23/23
 * Purpose: GUI example in Java Programming 7th ed. by Joyce Farrell
 * */
import javax.swing.JOptionPane;
public class HelloNameDialog {
    public static void main(String[] args) {
        String result;
        result = JOptionPane.showInputDialog(null, "What is your name?");
        JOptionPane.showMessageDialog(null, "Hello, " + result + "!");
    }
}
//Thanks for looking