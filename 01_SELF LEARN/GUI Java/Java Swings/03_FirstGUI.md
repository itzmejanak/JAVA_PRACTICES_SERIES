## Adding JFrame From ?
- Jframe is the Class
- it is the container
- it is the main window in where we can add multiple JComponent

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

## Understandg JFrame and Jpanel by Analogy of HTML ?
- `JFrame` is to `html, body`.
- `JPanel` is to `div`.