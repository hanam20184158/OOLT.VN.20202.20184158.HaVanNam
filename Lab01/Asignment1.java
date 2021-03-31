package Lab01;

import javax.swing.JOptionPane;

public class Asignment1 {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "You've just entered :";

        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: "," input the first number",
                JOptionPane.INFORMATION_MESSAGE);
                double num1 = Double.parseDouble(strNum1);
        strNotification += strNum1 + " and ";

        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number :", "input the second number", 
                JOptionPane.INFORMATION_MESSAGE);
                double num2 = Double.parseDouble(strNum2);
        strNotification += strNum2;

        JOptionPane.showMessageDialog(null, strNotification, "Two number is :", JOptionPane.INFORMATION_MESSAGE);
    }
}
