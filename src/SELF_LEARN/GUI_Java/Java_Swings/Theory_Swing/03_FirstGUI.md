## Adding JFrame From ?
- Jframe is the Class
- it is the container
- it is the main window in where we can add multiple JComponent

## DIFFERENT WAYS OF CREATING `GUI` :-

## Lets Create Firsts Gui with constructor ?
```java
public class MainForm extends javax.swing.JFrame {
    public MainForm() {
        initComponents();
        setTitle("This is my first application");
    }

    public static void main(String[] args) {
        MainForm jframe = new MainForm();
        jframe.setVisible(true); // make the frame visible
    }
}
```

## Lets Create Firsts Gui without constructor ?
```java
public class MainForm extends javax.swing.JFrame {
    public static void main(String[] args) {
        MainForm jframe = new MainForm();
        jframe.setTitle("This is my first application");
        jframe.setVisible(true);
    }
}
```


## Lets Create Firsts Gui by importing ?
```java
import javax.swing.JFrame;

public class JFrameExample {
    public static void main(String[] args){
        JFrame frame= new JFrame();
        frame.setSize(600, 400);
        frame.setTitle("Welecome to Java Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
        frame.setVisible(true);
    }
}
```

## Lets Create Firsts Gui importing and `extends` each class with method ?
```java
import javax.swing.*;

public class Test extends Jframe {
    public void createFrame() {
        setTitle("this is also a title");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
            Test test = new Test();
            test.createFrame();
    }
}
```

## Lets Create Firsts Gui by importing ?
```java
import javax.swing.JFrame;

public class JFrameExample {
    public static void main(String[] args){
        JFrame frame= new JFrame();
        frame.setSize(600, 400);
        frame.setTitle("Welecome to Java Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
        frame.setVisible(true);
    }
}
```

## Understandg JFrame and Jpanel by Analogy of HTML ?
- `JFrame` is to `html, body`.
- `JPanel` is to `div`.