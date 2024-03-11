package src.Practices;
import javax.swing.*;
import java.awt.Container;
public class NullLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Null layout Example");
        frame.setBounds(300,200,500,300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        Container cont = frame.getContentPane();   // we can make directly container into frame
        Container cont = new Container();  // or make container and add it into frame
        cont.setLayout(null);

        JButton b1 = new JButton("Button1");
        JButton b2 = new JButton("Button2");
        JButton b3 = new JButton("Button3");
        JButton b4 = new JButton("Button4");
        JButton b5 = new JButton("Button5");

        b1.setBounds(20,20,80,30);
        b2.setBounds(120,20,80,30);
        b3.setBounds(220,20,80,30);
        b4.setBounds(20,100,80,30);
        b5.setBounds(120,100,80,30);

        cont.add(b1);
        cont.add(b2);
        cont.add(b3);
        cont.add(b4);
        cont.add(b5);
        frame.add(cont);
    }
}
