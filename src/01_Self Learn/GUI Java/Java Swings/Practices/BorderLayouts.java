package src.Practices;
import javax.swing.*;
import java.awt.*;

public class BorderLayouts {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border layout Example");
        frame.setBounds(300,200,500,300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cont = frame.getContentPane();

        JButton b1 = new JButton("PAGE_START");
        JButton b2 = new JButton("PAGE_END");
        JButton b3 = new JButton("LINE_START");
        JButton b4 = new JButton("CENTER");
        JButton b5 = new JButton("LINE_END");

        cont.add(b1, BorderLayout.PAGE_START);
        cont.add(b2, BorderLayout.PAGE_END);
        cont.add(b3, BorderLayout.LINE_START);
        cont.add(b4, BorderLayout.CENTER);
        cont.add(b5, BorderLayout.LINE_END);

//        if we want to put gap between the button
        BorderLayout borderlayout = new BorderLayout();
        borderlayout.setHgap(100);
        borderlayout.setVgap(50);

    }
}

//it is responsive. but  page start and end are not only center is responsive
// we didn't make obj of border layout here because jframe have by default border layout functionality

//how we can implement obj if needed then
//        here is the solution
//        BorderLayout borderlayout = new BorderLayout();
//        cont.setLayout(BorderLayout);