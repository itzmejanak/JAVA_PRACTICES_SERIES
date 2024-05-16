package AT_CLASS.CW.$10_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Calculator extends JFrame implements ActionListener {
    JLabel topLabel = new JLabel("");
    Calculator() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.BLACK);
        setSize(300, 400);

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        topPanel.setBackground(Color.pink);

        topLabel.setFont(new Font("Arial", Font.PLAIN, 24));
        topPanel.add(topLabel, BorderLayout.NORTH);

        topLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                topLabel.setText(""); // Clear the text of the JLabel
            }
        });


        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        for (String btn : buttonLabels) {
            JButton button = new JButton(btn);
            button.setFont(new Font("Arial", Font.PLAIN, 17));
            button.addActionListener(this); // Registering ActionListener
            buttonPanel.add(button);
        }

        topPanel.add(buttonPanel, BorderLayout.CENTER);
        add(topPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        String buttonText = clickedButton.getText();
        if (!buttonText.equals("=")) {
            topLabel.setText(topLabel.getText() + buttonText);
        } else {
            String expression = topLabel.getText(); // Get the expression from the label
            try {
                int result = evaluateExpression(expression); // Evaluate the expression
                topLabel.setText(Integer.toString(result)); // Display the result
            } catch (ArithmeticException ex) {
                topLabel.setText("Error: Division by zero");
            }
        }
    }

    // Method to evaluate the expression
    private int evaluateExpression(String expression) {
        String[] tokens = expression.split("(?<=[-+*/])|(?=[-+*/])");

        System.out.println(Arrays.toString(tokens));
        // Separate numbers and operators
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> operators = new ArrayList<>();
        for (String token : tokens) {
            if (!token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/")) {
                // Token is a number
                numbers.add(Integer.parseInt(token));
            } else {
                // Token is an operator
                operators.add(token);
            }
        }

        // Perform operations
        int result = numbers.get(0);
        for (int i = 0; i < operators.size(); i++) {
            String operator = operators.get(i);
            int nextNumber = numbers.get(i + 1);
            switch (operator) {
                case "+":
                    result += nextNumber;
                    break;
                case "-":
                    result -= nextNumber;
                    break;
                case "*":
                    result *= nextNumber;
                    break;
                case "/":
                    if (nextNumber == 0) {
                        throw new ArithmeticException("Division by zero");
                    }
                    result /= nextNumber;
                    break;
                // Handle other operators if needed
            }
        }

        return result;
    }

    // Method to check if a string is numeric

}
