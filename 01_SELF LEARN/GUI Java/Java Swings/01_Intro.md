## Understanding Java Swing

Java Swing is an API used for creating GUI applications for desktop environments.

- It is a concept of Java Foundation Classes (JFC) maintained by Oracle.
- Java Swing offers a variety of GUI components for creating interactive user interfaces.

## What is JFC?

The Oracle's Java Foundation Classes (JFC) are a set of GUI components that simplify the development of desktop applications.

- Java Swing is an enhanced version of AWT (Abstract Windowing Toolkit).
- It is built on top of AWT, making AWT the parent of Java Swing.
- AWT is platform-dependent, whereas Swing is not.

## How to Add Swing Components?

Swing components are found within the `javax.swing` package.

Example:

```java
import javax.swing.*;
```

Note:
Within Swing, we have components like JButton, JTextArea, JRadioButton, JCheckBox, JMenu, and more.

## Hierarchy of Java Swing ?

<p align="center">
  <kbd>
    <img src="https://imgs.search.brave.com/Fl5R4ekt3BpZrUep-aPXXK4FV_xpevJC2h2h3MT-H3o/rs:fit:860:0:0/g:ce/aHR0cHM6Ly9zdGF0/aWMuamF2YXRwb2lu/dC5jb20vaW1hZ2Vz/L3N3aW5naGllcmFy/Y2h5LmpwZw" alt="Java Swing Hierarchy" width="500" style="border: 2px solid black;">
  </kbd>
</p>


### Understanding Swings components which behave like `CSS` and Which behave like `HTML`?
- **Swing Components as Analogous to CSS**:

  - Layout Managers:
    - Control arrangement and positioning of components.
    - Analogous to CSS Flexbox and Grid layout.
    - --
  - Styling Properties:
    - Customize appearance (colors, fonts, borders, etc.).
    - Similar to CSS styling properties.
    - --
  - Events and Event Handling:
    - Respond to user interactions.
    - Analogous to CSS event listeners and JavaScript.

---

- **Swing Components as Analogous to HTML**:
- **Component Hierarchy**:
  - The structure of Swing applications resembles HTML elements hierarchy.
  - `JFrame` serves as the main container.
  - `JPanel` acts as nested containers or sections.
  - Individual components (buttons, labels) are elements within these containers.
    - --
  - Container Components:
    - Act as containers for grouping components.
    - Analogous to HTML block-level and inline elements.
    - Swing container components like `JPanel` act as containers for grouping
    - --
  - Text and Image Display:
    - Display text and images.
    - Similar to HTML text and image elements.
    - Swing components like `JLabel` are used for displaying text and images
    - --
  - Forms and Input Elements:
    - Collect user input and interaction.
    - Similar to HTML form elements.
    - Swing provides components like `JTextField`, `JTextArea`, and `JButton`
    - --