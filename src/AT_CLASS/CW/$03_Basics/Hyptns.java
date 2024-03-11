package AT_CLASS.CW.$03_Basics;
import javax.swing.JOptionPane;
public class Hyptns{
 public static void main(){
    double a;
    double x = Double.parseDouble(JOptionPane.showInputDialog("write the value of x ?"));
    double y = Double.parseDouble(JOptionPane.showInputDialog("write the value of y ?"));
    a = ((x*x) + (y*y));
    double z = Math.sqrt(a);
    JOptionPane.showMessageDialog(null, "Your ans is " + z);
    }
}