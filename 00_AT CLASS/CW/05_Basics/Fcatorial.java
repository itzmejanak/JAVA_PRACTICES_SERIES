import javax.swing.JOptionPane;
public class Fcatorial
{
    public static void main(String[] args){
        System.out.println("FIND FACTORIAL OF THE NUMBER");
        System.out.println("\n");
    }
    
    static void patten2(){
     int  input = Integer.parseInt(JOptionPane.showInputDialog("\"Enter your number\""));
     int temp = 1;
    while (input >= 1) {
            temp = temp * input;
            input--;
        }
        
        JOptionPane.showMessageDialog(null, "ans: " + temp);
     }   
   
     
     
    static void patten3(){
     int i = 10;
     while( i >= 1){
        System.out.println("num is :" + i);
        i--;
        }
     }   
}

