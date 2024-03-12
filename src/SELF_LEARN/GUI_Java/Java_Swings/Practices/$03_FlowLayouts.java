package SELF_LEARN.GUI_Java.Java_Swings.Practices;
import java.awt.*;
import javax.swing.*;

public class $03_FlowLayouts extends JFrame {
    // by default components are set to center in flow layout
    JButton btn1 = new JButton("Button 1 Extra text");  // auto set width according to text length
    JButton btn2 = new JButton("Button 2");
    JButton btn3 = new JButton("Button 3");
    JButton btn4 = new JButton("Button 4");
    JButton btn5 = new JButton("Button 5");

    public $03_FlowLayouts() {
        setTitle("Example of Flow Layout");
        setBounds(100, 200, 500, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        // How can i set the layout position ?
//        $03_FlowLayouts flowLayout = new $03_FlowLayouts(FlowLayout.LEFT);       // Ans. just pass the parameter where you want

        // 2. How can i give the horizentical and vertical gap to the componets ?
        FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT,10,20);
        c.setLayout(flowLayout); // Always Set the layout before adding components
        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        // 3. How we can do indexing ?
        c.add(btn5,0);  // Ans: just pass the parameter of index num
    }

    public static void main(String[] args) {
        new $03_FlowLayouts();
    }
}



//note:-
//the default layout for JPanel is Flow layout
// The parameter what we pass into the new Layout() the can we done by dot . operator by using obj name


//Question for flow layout

// 1. How can we set the layout position ?
// 2. How can we give the horizentical and vertical gap to the componets ?
// 3. How we can do indexing ?
    // - means how we can set position for each one
