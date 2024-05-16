package AT_CLASS.CW.$10_GUI;

import AT_CLASS.HW.Course_Works.CourseWork_2.Teacher;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PageSwitcher extends JFrame implements ActionListener {
    private JPanel addLecturerPage, addTutorPage, gradeAndSetSalaryPage;
    private JButton switchButton;
    private int currentPageIndex;
    ArrayList<Teacher> addedLecturers = new ArrayList<>();

    // Declare JTextField variables for each input field
    JTextField lecturerIdTextField, lecturerNameTextField, lecturerAddressTextField, lecturerWorkingTypeTextField,
            lecturerEmploymentStatusTextField, lecturerDepartmentTextField, lecturerGradedScoreTextField, lecturerYearsOfExperienceTextField,
            tutorIdTextField, tutorNameTextField, tutorAddressTextField, tutorWorkingTypeTextField,
            tutorEmploymentStatusTextField, tutorWorkingHoursTextField, tutorSalaryTextField,
            tutorSpecializationTextField, tutorAcademicQualificationsTextField, tutorPerformanceIndexTextField,
            assignmentTeacherIdTextField, assignmentGradedScoreTextField, assignmentDepartmentTextField, assignmentYearsOfExperienceTextField,
            salaryTutorIdTextField, salaryTutorNewSalaryTextField, salaryTutorNewPerformanceIndexTextField;

    JButton addLecturer, addTutor, gradeAssignment, setSalaryOfTutor, removeTutor, clearButton, displayButton, switchBtn;
    JTextArea message;

    public PageSwitcher() {
        setTitle("College Management System");
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        addLecturerPage = createAddLecturerPage();
        addTutorPage = createAddTutorPage();
        gradeAndSetSalaryPage = createGradeAndSetSalaryPage();

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new CardLayout());
        mainPanel.add(addLecturerPage, "Add Lecturer");
        mainPanel.add(addTutorPage, "Add Tutor");
        mainPanel.add(gradeAndSetSalaryPage, "Grade & Set Salary");

        add(mainPanel, BorderLayout.CENTER);

        switchButton = new JButton("Switch Page");
        switchButton.addActionListener(this);
        add(switchButton, BorderLayout.SOUTH);

        currentPageIndex = 0;

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private JPanel createAddLecturerPage() {
        JPanel sectionPanel = new JPanel();
        sectionPanel.setLayout(new BoxLayout(sectionPanel, BoxLayout.Y_AXIS));
        sectionPanel.setBorder(BorderFactory.createTitledBorder("Add Lecturer"));

        lecturerIdTextField = addInputField(sectionPanel, "Teacher ID:");
        lecturerNameTextField = addInputField(sectionPanel, "Teacher Name:");
        lecturerAddressTextField = addInputField(sectionPanel, "Address:");
        lecturerWorkingTypeTextField = addInputField(sectionPanel, "Working Type:");
        lecturerEmploymentStatusTextField = addInputField(sectionPanel, "Employment Status:");
        lecturerDepartmentTextField = addInputField(sectionPanel, "Department:");
        lecturerGradedScoreTextField = addInputField(sectionPanel, "Graded Score:");
        lecturerYearsOfExperienceTextField = addInputField(sectionPanel, "Years of Experience:");

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(e -> clearFields());
        styleButton(clearButton);
        buttonPanel.add(clearButton);

        sectionPanel.add(buttonPanel);
        return sectionPanel;
    }

    private JPanel createAddTutorPage() {
        JPanel sectionPanel = new JPanel();
        sectionPanel.setLayout(new BoxLayout(sectionPanel, BoxLayout.Y_AXIS));
        sectionPanel.setBorder(BorderFactory.createTitledBorder("Add Tutor"));

        tutorIdTextField = addInputField(sectionPanel, "Teacher ID:");
        tutorNameTextField = addInputField(sectionPanel, "Teacher Name:");
        tutorAddressTextField = addInputField(sectionPanel, "Address:");
        tutorWorkingTypeTextField = addInputField(sectionPanel, "Working Type:");
        tutorEmploymentStatusTextField = addInputField(sectionPanel, "Employment Status:");
        tutorWorkingHoursTextField = addInputField(sectionPanel, "Working Hours:");
        tutorSalaryTextField = addInputField(sectionPanel, "Salary:");
        tutorSpecializationTextField = addInputField(sectionPanel, "Specialization:");
        tutorAcademicQualificationsTextField = addInputField(sectionPanel, "Academic Qualifications:");
        tutorPerformanceIndexTextField = addInputField(sectionPanel, "Performance Index:");

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(e -> clearFields());
        styleButton(clearButton);
        buttonPanel.add(clearButton);

        sectionPanel.add(buttonPanel);
        return sectionPanel;
    }


    private JPanel createGradeAndSetSalaryPage() {
        JPanel sectionPanel = new JPanel();
        sectionPanel.setLayout(new BoxLayout(sectionPanel, BoxLayout.Y_AXIS));
        sectionPanel.setBorder(BorderFactory.createTitledBorder("Grade Assignments & Set Salary"));

        assignmentTeacherIdTextField = addInputField(sectionPanel, "Teacher ID:");
        assignmentGradedScoreTextField = addInputField(sectionPanel, "Graded Score:");
        assignmentDepartmentTextField = addInputField(sectionPanel, "Department:");
        assignmentYearsOfExperienceTextField = addInputField(sectionPanel, "Years of Experience:");

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(e -> clearFields());
        styleButton(clearButton);
        buttonPanel.add(clearButton);

        sectionPanel.add(buttonPanel);
        return sectionPanel;
    }

    private JTextField addInputField(JPanel panel, String label) {
        JPanel fieldPanel = new JPanel(new GridBagLayout());
        fieldPanel.setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.EAST;

        JLabel jLabel = new JLabel(label);
        jLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        fieldPanel.add(jLabel, gbc);

        JTextField jTextField = new JTextField(20);
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        fieldPanel.add(jTextField, gbc);

        panel.add(fieldPanel);
        return jTextField;
    }

    private void styleButton(JButton button) {
        button.setBackground(new Color(173, 216, 230));
        button.setForeground(Color.BLACK);
        button.setFocusPainted(false);
        button.setFont(new Font("Arial", Font.PLAIN, 14));
        button.setPreferredSize(new Dimension(100, 30));
    }
    private void clearFields() {
        lecturerIdTextField.setText("");
        lecturerNameTextField.setText("");
        lecturerAddressTextField.setText("");
        lecturerWorkingTypeTextField.setText("");
        lecturerEmploymentStatusTextField.setText("");
        lecturerDepartmentTextField.setText("");
        lecturerGradedScoreTextField.setText("");
        lecturerYearsOfExperienceTextField.setText("");
        message.setText("Fields cleared.");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        CardLayout cardLayout = (CardLayout) ((JPanel) getContentPane().getComponent(0)).getLayout();

        currentPageIndex++;
        if (currentPageIndex == 3)
            currentPageIndex = 0;

        switch (currentPageIndex) {
            case 0:
                cardLayout.show((JPanel) getContentPane().getComponent(0), "Add Lecturer");
                break;
            case 1:
                cardLayout.show((JPanel) getContentPane().getComponent(0), "Add Tutor");
                break;
            case 2:
                cardLayout.show((JPanel) getContentPane().getComponent(0), "Grade & Set Salary");
                break;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PageSwitcher::new);
    }
}
