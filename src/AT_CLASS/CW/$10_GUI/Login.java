package AT_CLASS.CW.$10_GUI;

import javax.swing.*;
import java.awt.*;

public class Login {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("Hello gUYS");
        frame.setBounds(20, 20, 600, 600);

        // Create components
        JLabel usernameLabel = new JLabel("USERNAME");
        JTextField usernameInput = new JTextField("Enter your name here", 20);
        JLabel passwordLabel = new JLabel("Password");
        JTextField passwordInput = new JTextField("Enter your password here", 20);

        frame.add(usernameLabel);
        frame.add(usernameInput);
        frame.add(passwordLabel);
        frame.add(passwordInput);

        frame.setLayout(new FlowLayout());

        frame.setVisible(true);
    }
}

