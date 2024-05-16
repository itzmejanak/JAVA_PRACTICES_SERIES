package AT_CLASS.CW.$10_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBox extends JFrame {

    String[] favFoods = {"Pizza", "Momo", "Somasa", "Burger", "Chowmin"};
    String[] favDrinks = {"Co-ca-co-la", "Pepsi", "Golden Rum", "Strong Mount"};
    JComboBox<String> boxFavFoods, boxFavDrinks;
    JPanel mainPanel;
    JLabel message;

    ComboBox() {
        setTitle("Combo box example");
        setBounds(20, 30, 400, 370);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());

        boxFavFoods = new JComboBox<>(favFoods);
        boxFavDrinks = new JComboBox<>(favDrinks);

        message = new JLabel();

        doAction();
        mainPanel.add(boxFavFoods, BorderLayout.NORTH);
        mainPanel.add(boxFavDrinks, BorderLayout.CENTER);
        mainPanel.add(message, BorderLayout.SOUTH);

        add(mainPanel);
        setVisible(true);
    }

    public void doAction() {
        boxFavFoods.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String foodItem = (String) boxFavFoods.getSelectedItem();
                String drinkItem = (String) boxFavDrinks.getSelectedItem();
                messageShow(foodItem, drinkItem);
            }
        });

        boxFavDrinks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String foodItem = (String) boxFavFoods.getSelectedItem();
                String drinkItem = (String) boxFavDrinks.getSelectedItem();
                messageShow(foodItem, drinkItem);
            }
        });
    }

    public void messageShow(String foodItem, String drinkItem) {
        String fullMessage = "Your Favorite food is: " + foodItem + " and Drink is: " + drinkItem;
        message.setText(fullMessage);
    }

    public static void main(String[] args) {
        new ComboBox();
    }
}
