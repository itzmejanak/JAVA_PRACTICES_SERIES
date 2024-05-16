package AT_CLASS.CW.$10_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register extends JFrame {
    public Register() {
        setTitle("Register here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelShow = new JPanel(new GridBagLayout());
        JButton btnLog = new JButton("Login");
        JButton btnReg = new JButton("Register");

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridx = 0;
        gbc.gridy = 0;
        panelShow.add(btnLog, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panelShow.add(btnReg, gbc);


        JPanel panel = new JPanel(new GridBagLayout());
        panel.setVisible(false);
        panel.setBackground(Color.blue);

        GridBagConstraints constraintslog = new GridBagConstraints();
        JPanel panellogin = new JPanel(new GridBagLayout());
        panellogin.setVisible(false);
        panellogin.setBackground(Color.green);

        JLabel labelForUsernamee = new JLabel("Email:");
        constraintslog.gridx = 0;
        constraintslog.gridy = 0;
        panellogin.add(labelForUsernamee, constraintslog);

        JTextField textForUsernamee = new JTextField(20);
        constraintslog.gridx = 1;
        constraintslog.gridy = 0;
        panellogin.add(textForUsernamee, constraintslog);

        JLabel labelForpassOnee = new JLabel("Password:");
        constraintslog.gridx = 0;
        constraintslog.gridy = 1;
        panellogin.add(labelForpassOnee, constraintslog);

        JPasswordField textForpassOnee = new JPasswordField(20);
        constraintslog.gridx = 1;
        constraintslog.gridy = 1;
        panellogin.add(textForpassOnee, constraintslog);

        JButton btn1 = new JButton("Login");
        constraintslog.gridx = 1;
        constraintslog.gridy = 4;
        panellogin.add(btn1, constraintslog);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);

        JLabel labelForUsername = new JLabel("Username:");
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(labelForUsername, constraints);

        JLabel labelForpassOne = new JLabel("Password:");
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(labelForpassOne, constraints);

        JLabel labelForPassAgain = new JLabel("Password again:");
        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(labelForPassAgain, constraints);

        JLabel labelForEmail = new JLabel("Email:");
        constraints.gridx = 0;
        constraints.gridy = 3;
        panel.add(labelForEmail, constraints);

        JTextField textForUsername = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(textForUsername, constraints);

        JPasswordField textForpassOne = new JPasswordField(20);
        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(textForpassOne, constraints);

        JPasswordField textForPassAgain = new JPasswordField(20);
        constraints.gridx = 1;
        constraints.gridy = 2;
        panel.add(textForPassAgain, constraints);

        JTextField textForEmail = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 3;
        panel.add(textForEmail, constraints);

        JButton btn = new JButton("Register");
        constraints.gridx = 1;
        constraints.gridy = 4;
        panel.add(btn, constraints);

        add(panel);
        add(panellogin);
        add(panelShow);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);


        btnLog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicked");

                panelShow.setVisible(false);
                panel.setVisible(false);
                add(panellogin);
                panellogin.setVisible(true);
            }
        });

        btnReg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicked");

                panelShow.setVisible(false);
                panellogin.setVisible(false);
                add(panel);
                panel.setVisible(true);

            }
        });
    }

    public static void main(String[] args) {
        new Register();

    }
}
