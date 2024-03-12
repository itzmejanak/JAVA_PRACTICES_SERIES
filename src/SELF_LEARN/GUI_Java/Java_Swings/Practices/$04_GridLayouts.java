package SELF_LEARN.GUI_Java.Java_Swings.Practices;
import javax.swing.*;
import java.awt.*;

public class $04_GridLayouts extends JFrame{
    JButton btn1 = new JButton("Button 1");  // auto set width according to text length
    JButton btn2 = new JButton("Button 2");
    JButton btn3 = new JButton("Button 3");
    JButton btn4 = new JButton("Button 4");
    JButton btn5 = new JButton("Button 5");
    JButton btn6 = new JButton("Button 6");
    public $04_GridLayouts(){
        setTitle("Grid layout example");
        setBounds(100,200,500,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();

        // 1. How we can set rows and columns for our components ?
        GridLayout grid = new GridLayout(3,3);   // just pass the parameter (rows, columns)

        // 2. How can we give the horizentical and vertical gap to the componets ?
        grid.setHgap(10);
        grid.setVgap(20);
//        GridLayout grid = new GridLayout(3,3,10,20);   // choice (rows, columns, Hgap,Vgap)

        c.setLayout(grid);
//        c.setLayout(new GridLayout());     // choice
        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        c.add(btn5);
        // 3. How we can do indexing ?
        c.add(btn6,0);
    }

    public static void main(String[] args) {
        new $04_GridLayouts();
    }

}

//GridLayout properties
//    - grid layout also set the components left to right
//    - in grid layout all the available space is consumed by the components
//    - grid layout can be divided into row and columns
//    - in grid layout all the components have the same size


//Questions
// 1. How we can set rows and columns for our components ?
// 2. How can we give the horizentical and vertical gap to the componets ?
// 3. How we can do indexing ?