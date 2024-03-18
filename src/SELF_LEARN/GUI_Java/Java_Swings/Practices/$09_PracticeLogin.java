package SELF_LEARN.GUI_Java.Java_Swings.Practices;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class $09_PracticeLogin {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        GridBagLayout bag = new GridBagLayout();
        panel.setLayout(bag);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);

        JLabel label1 = new JLabel("Username:");
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(label1, constraints);

        JLabel label2 = new JLabel("Password:");
        constraints.gridy = 1;
        panel.add(label2, constraints);

        JTextField text = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(text, constraints);

        JPasswordField pass = new JPasswordField(20);
        constraints.gridy = 1;
        panel.add(pass, constraints);

        JButton loginButton = new JButton("Login");
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        panel.add(loginButton, constraints);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = text.getText();
                String password = new String(pass.getPassword());
                System.out.println("Username: " + username + ", Password: " + password);
            }
        });

        frame.add(panel);

        frame.pack(); // Pack the components tightly
        frame.setLocationRelativeTo(null); // Center the frame on the screen
        frame.setVisible(true);
    }
}
