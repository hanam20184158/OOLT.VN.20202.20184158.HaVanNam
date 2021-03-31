package Lab02;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class ChosingOption {
    public static void main(String[] arrgs){
        int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket ?");
        JOptionPane.showMessageDialog(null, "You've chose: " + (option == JOptionPane.YES_OPTION?"Yes":"No"));
        System.exit(0);
    }
}
// Khi chọn cancel thì máy hiểu như chúng ta chọn "No"
