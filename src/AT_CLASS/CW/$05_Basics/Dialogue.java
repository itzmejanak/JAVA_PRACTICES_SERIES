package AT_CLASS.CW.$05_Basics;
import javax.swing.JOptionPane;

public class Dialogue {
    public static void main(String[] args) {
        // Get user's name using an input dialog
        String name = JOptionPane.showInputDialog("What is your name?");

        // Show a message dialog with a greeting
        JOptionPane.showMessageDialog(null, "Hello " + name);
    }
}
