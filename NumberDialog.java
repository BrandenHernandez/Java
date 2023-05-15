/*
 * Author: Branden Hernandez
 * Date: 5/15/23
 * Purpose: GUI example in Java Programming 7th ed. by Joyce Farrell
 * */
import javax.swing.JOptionPane;
public class NumberDialog {
    public static void main(String[] args){
        int creditDays = 30;
        JOptionPane.showMessageDialog(null, " " + creditDays);
        JOptionPane.showMessageDialog(null, "Every bill is due in " + creditDays + " days");
    }
}
//Thanks for looking