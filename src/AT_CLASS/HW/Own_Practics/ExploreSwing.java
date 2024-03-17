package AT_CLASS.HW.Own_Practics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExploreSwing extends JFrame implements ActionListener {
    JButton frameLoginButton = new JButton("Login");
    JButton frameRegisterButton = new JButton("Register");

    JTextField textLog = new JTextField(20);
    JTextField textReg = new JTextField(20);
    JPasswordField passLog = new JPasswordField(20);
    JPasswordField passReg = new JPasswordField(20);

    JDialog panelLogin = new JDialog();
    JDialog panelRegister = new JDialog();

    public ExploreSwing() {
        setTitle("Explore Login and Register");
        setBounds(100, 200, 700, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new FlowLayout());
        Container c = getContentPane();
        c.add(frameLoginButton);
        c.add(frameRegisterButton);

        frameLoginButton.addActionListener(this);
        frameRegisterButton.addActionListener(this);

        panelLogin.setTitle("Login");
        panelLogin.setBounds(200, 200, 300, 150);
        panelLogin.setLayout(new FlowLayout());

        panelRegister.setTitle("Register");
        panelRegister.setBounds(200, 200, 300, 200);
        panelRegister.setLayout(new FlowLayout());

        panelLogin.add(new JLabel("Username: "));
        panelLogin.add(textLog);
        panelLogin.add(new JLabel("Password: "));
        panelLogin.add(passLog);
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        panelLogin.add(loginButton);

        panelRegister.add(new JLabel("Username: "));
        panelRegister.add(textReg);
        panelRegister.add(new JLabel("Password: "));
        panelRegister.add(passReg);
        JButton registerButton = new JButton("Register");
        registerButton.addActionListener(this);
        panelRegister.add(registerButton);
    }

    public static void main(String[] args) {
        new ExploreSwing();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frameLoginButton) {
            panelLogin.setVisible(true);
            panelRegister.setVisible(false);
        } else if (e.getSource() == frameRegisterButton) {
            panelRegister.setVisible(true);
            panelLogin.setVisible(false);
        } else if (e.getActionCommand().equals("Login")) {
            // Check login credentials here
            String username = textLog.getText();
            String password = new String(passLog.getPassword());
            // You can add login logic here
            JOptionPane.showMessageDialog(this, "Login button clicked");
        } else if (e.getActionCommand().equals("Register")) {
            // Register new user
            String username = textReg.getText();
            String password = new String(passReg.getPassword());
            // You can add registration logic here
            JOptionPane.showMessageDialog(this, "Register button clicked");
        }
    }
}
