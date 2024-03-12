package SELF_LEARN.GUI_Java.Java_Swings.Practices;

import javax.swing.*;
import java.awt.*;

public class $08_JPanelProblems {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("GridBagLayouts example");
        frame.setBounds(100,100,500,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = frame.getContentPane();
        container.setBackground(Color.WHITE);
        container.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0,0,300,200);
        panel.setBackground(Color.YELLOW);
        panel.setLayout(null);
        container.add(panel);

        JPanel panel2 = new JPanel();
        panel2.setBounds(0,0,200,200);
        panel2.setBackground(Color.RED);
        // now adding panel2 into panel
//        container.add(panel2);   // removing it
        panel.add(panel2);

        JButton button = new JButton("BUTTON");
        panel2.add(button);

    }
}
