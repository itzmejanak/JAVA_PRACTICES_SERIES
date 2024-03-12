package SELF_LEARN.GUI_Java.Java_Swings.Practices;
import javax.swing.*;
import java.awt.*;
public class $05_GridBagLayouts extends JFrame{
    JButton btn1 = new JButton("Button 1");  // auto set width according to text length
    JButton btn2 = new JButton("Button 2");
    JButton btn3 = new JButton("Button 3");
    JButton btn4 = new JButton("Button 4");
    JButton btn5 = new JButton("Button 5");
    public $05_GridBagLayouts(){
        setTitle("GridBagLayouts example");
        setBounds(100,200,500,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();

        GridBagLayout gridBag = new GridBagLayout();
        c.setLayout(gridBag);


        // 1. How we can set the position of each component ?
        GridBagConstraints gBc = new GridBagConstraints();

        // 2. How we can increase gap between the components when size of frame increase ?
        gBc.weightx = 0.5;   // ans: Just say to GridBagConstraints obj gBc for space/gap.

        // 1. ans:  After making GridBagConstraints obj.
        gBc.gridx = 0;
        gBc.gridy = 0;
        c.add(btn1, gBc);  // ans: Just pass the parameter of each one

        // 4. How we can increase the size of components According to increase of the frame size ?
//      gBc.fill = GridBagConstraints.HORIZONTAL;   // ans: Just say to gBc for size / set Constraints
        gBc.gridx = 1;
        gBc.gridy = 0;
        c.add(btn2, gBc);

        // 3. How we can reset the gap of components at specific point ?
//      gBc.weightx = 0; // ans: Just say to gBc for = 0 to reset at this point
        gBc.gridx = 2;
        gBc.gridy = 0;
        c.add(btn3, gBc);

        // 5. How we can increase the columns size for individual Components ?
        gBc.gridwidth = 3;
        gBc.gridx = 0;
        gBc.gridy = 1;
        gBc.ipady = 40;
        c.add(btn4, gBc);

        gBc.gridwidth = 0;  //resetting for this one
        gBc.gridx = 0;
        gBc.gridy = 2;
        gBc.ipady = 0;
        gBc.anchor = GridBagConstraints.PAGE_END;
        gBc.weighty = 2;
        c.add(btn5, gBc);

        pack();

    }

    public static void main(String[] args) {
        new $05_GridBagLayouts();
    }
}

// Properties
// 1. Size of components doesn't increase when size of frame increase

//Questions
// 1. How we can set the position of each component ?
// 2. How we can increase gap between the components when size of frame increase ?
// 3. How we can reset the gap of components at specific point ?
// 4. How we can increase the size of components According to increase of the frame size ?
// 5. How we can increase the columns size for individual Components ?
