## Understanding First Components :
### - Types of Components :
    - Light-Weight Components
    - Heavy-Weight Components

### Light-Weight Components :
  - The components which can be added to some other components
  - eg: JButton, JRadioButton etc..

### Heavy-Weight Components :
- The components which cannot be added to some other components
- eg: JFrame, JDialog etc..

## Understanding Next Container :
  - A container is a component, which may contain some other light weight component.
  - Example:- JLabel to JFrame and JButton To JFrame

## Understanding Now JPanel :
  - JPanel is a Light-Weight Components because we can add JPanel to JFrame.
  - JPanel is `Also` a Container.
  - So, we can add JLabel to JPanel and JButton To JPanel.
  - Interestingly we can also add `JPanel`  to `JPanel`.