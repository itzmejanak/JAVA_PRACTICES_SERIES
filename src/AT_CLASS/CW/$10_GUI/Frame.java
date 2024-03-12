package AT_CLASS.CW.$10_GUI;
import javax.swing.*;

public class Frame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Hello gUYS"); // Setting the title of the JFrame
        frame.setBounds(20,20,600,600);
        frame.setVisible(true); // Making the JFrame visible

        JLabel label  = new JLabel();
        label.setText("Provide your name");
        frame.add(label);
    }
}

