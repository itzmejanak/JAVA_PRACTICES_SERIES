package SELF_LEARN.GUI_Java.Java_Swings.Practices;

import javax.swing.*;
import java.awt.*;

public class $06_CardLayout extends JFrame{
    JButton card1 = new JButton("page 1");  // auto set width according to text length
    JButton card2 = new JButton("page 2");
    JButton card3 = new JButton("page 3");
    JButton card4 = new JButton("page 4");
    JButton card5 = new JButton("page 5");

    public $06_CardLayout() {
        setTitle("GridBagLayouts example");
        setBounds(100, 200, 500, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();

        CardLayout cardlayout = new CardLayout();
        c.setLayout(cardlayout);

        c.add(card1, "card1");
        c.add(card2, "card2");
        c.add(card3, "card3");
        c.add(card4, "card4");
        c.add(card5, "card5");

        // 1. How to use Card layout Methods;
        cardlayout.next(c);  // to switch the next page
        cardlayout.previous(c);
        cardlayout.first(c);
        cardlayout.last(c);

        // 2. how to use show() method ?
        cardlayout.show(c, "card4");  // use for our control which we want to show
    }

    public static void main(String[] args) {
        new $06_CardLayout();
    }
}

// Properties :-
// it treat each components as a card
// only one card visible at a time and components act as a zindex value / stack overflow
// Card layout have some useful methods they are :-
    // 1. first()
    // 2. Last()
    // 3. next()
    // 4. previous()
    // 5. show()


//Questions
// 1. How to use Card layout Methods ?
// 2. how to use show() method ?