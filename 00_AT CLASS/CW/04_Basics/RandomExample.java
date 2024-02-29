import javax.swing.JOptionPane;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
 
        double x = Double.parseDouble(JOptionPane.showInputDialog("Enter the upper limit for the random number:"));

        Random myRandom = new Random();
        double y = myRandom.nextDouble(10) * x;

        JOptionPane.showMessageDialog(null, "Your random number is " + y);
    }
}
