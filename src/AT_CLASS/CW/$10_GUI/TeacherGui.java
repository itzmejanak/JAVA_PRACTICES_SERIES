package AT_CLASS.CW.$10_GUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TeacherGui extends JFrame implements ActionListener {
//    ArrayList<Teacher> addedLecturers = new ArrayList<>();

    // Declare JTextField variables for each input field
    JTextField lecturerIdTextField, lecturerNameTextField, lecturerAddressTextField, lecturerWorkingTypeTextField,
            lecturerEmploymentStatusTextField, lecturerDepartmentTextField, lecturerGradedScoreTextField, lecturerYearsOfExperienceTextField,
            tutorIdTextField, tutorNameTextField, tutorAddressTextField, tutorWorkingTypeTextField,
            tutorEmploymentStatusTextField, tutorWorkingHoursTextField, tutorSalaryTextField,
            tutorSpecializationTextField, tutorAcademicQualificationsTextField, tutorPerformanceIndexTextField,
            assignmentTeacherIdTextField, assignmentGradedScoreTextField, assignmentDepartmentTextField, assignmentYearsOfExperienceTextField,
            salaryTutorIdTextField, salaryTutorNewSalaryTextField, salaryTutorNewPerformanceIndexTextField;

    JButton addLecturer, addTutor, gradeAssignment, setSalaryOfTutor, removeTutor, clearButton, displayButton, next;
    JTextArea message;
    JPanel lecturerSectionPanel, TutorSectionPanel, GradeAssignmentsSectionPanel, SalaryOfTutorSectionPanel, ControlButtonsPanel, MessageBoxPanel;

    public TeacherGui() {
        setupFrame();
        addSections();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void setupFrame() {
        setTitle("Collage Management System");
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 2, 10, 10)); // 2x2 grid layout with gaps
        getContentPane().setBackground(Color.WHITE);
    }

    public void addSections() {
        addAddLecturerSection();
        addAddTutorSection();
        addGradeAssignmentsSection();
        addSetSalaryOfTutorSection();
        addControlButtons();
        addMessageBox();
    }

    public void addAddLecturerSection() {
        lecturerSectionPanel = new JPanel();
        lecturerSectionPanel.setVisible(true);
        lecturerSectionPanel.setPreferredSize(new Dimension(300, 300));
        lecturerSectionPanel.setLayout(new BoxLayout(lecturerSectionPanel, BoxLayout.Y_AXIS));
        lecturerSectionPanel.setBorder(BorderFactory.createTitledBorder("Add Lecturer"));
        lecturerSectionPanel.setBackground(Color.WHITE);

        // Add individual input fields and labels
        lecturerIdTextField = addInputField(lecturerSectionPanel, "Teacher ID:");
        lecturerNameTextField = addInputField(lecturerSectionPanel, "Teacher Name:");
        lecturerAddressTextField = addInputField(lecturerSectionPanel, "Address:");
        lecturerWorkingTypeTextField = addInputField(lecturerSectionPanel, "Working Type:");
        lecturerEmploymentStatusTextField = addInputField(lecturerSectionPanel, "Employment Status:");
        lecturerDepartmentTextField = addInputField(lecturerSectionPanel, "Department:");
        lecturerGradedScoreTextField = addInputField(lecturerSectionPanel, "Graded Score:");
        lecturerYearsOfExperienceTextField = addInputField(lecturerSectionPanel, "Years of Experience:");

        addLecturer = new JButton("Add Lecturer");
        addLecturer.addActionListener(this);
        styleButton(addLecturer);
        lecturerSectionPanel.add(addLecturer);

        add(lecturerSectionPanel);
    }

    public void addAddTutorSection() {
        TutorSectionPanel= new JPanel();
        TutorSectionPanel.setVisible(false);
        TutorSectionPanel.setPreferredSize(new Dimension(300, 300));
        TutorSectionPanel.setLayout(new BoxLayout(TutorSectionPanel, BoxLayout.Y_AXIS));
        TutorSectionPanel.setBorder(BorderFactory.createTitledBorder("Add Tutor"));
        TutorSectionPanel.setBackground(Color.WHITE);

        // Add individual input fields and labels
        tutorIdTextField = addInputField(TutorSectionPanel, "Teacher ID:");
        tutorNameTextField = addInputField(TutorSectionPanel, "Teacher Name:");
        tutorAddressTextField = addInputField(TutorSectionPanel, "Address:");
        tutorWorkingTypeTextField = addInputField(TutorSectionPanel, "Working Type:");
        tutorEmploymentStatusTextField = addInputField(TutorSectionPanel, "Employment Status:");
        tutorWorkingHoursTextField = addInputField(TutorSectionPanel, "Working Hours:");
        tutorSalaryTextField = addInputField(TutorSectionPanel, "Salary:");
        tutorSpecializationTextField = addInputField(TutorSectionPanel, "Specialization:");
        tutorAcademicQualificationsTextField = addInputField(TutorSectionPanel, "Academic Qualifications:");
        tutorPerformanceIndexTextField = addInputField(TutorSectionPanel, "Performance Index:");

        addTutor = new JButton("Add Tutor");
        addTutor.addActionListener(this);
        styleButton(addTutor);
        TutorSectionPanel.add(addTutor);

        add(TutorSectionPanel);
    }

    public void addGradeAssignmentsSection() {
        GradeAssignmentsSectionPanel = new JPanel();
        GradeAssignmentsSectionPanel.setVisible(false);
        GradeAssignmentsSectionPanel.setPreferredSize(new Dimension(300, 300));
        GradeAssignmentsSectionPanel.setLayout(new BoxLayout(GradeAssignmentsSectionPanel, BoxLayout.Y_AXIS));
        GradeAssignmentsSectionPanel.setBorder(BorderFactory.createTitledBorder("Grade Assignments"));
        GradeAssignmentsSectionPanel.setBackground(Color.WHITE);


        // Add individual input fields and labels
        assignmentTeacherIdTextField = addInputField(GradeAssignmentsSectionPanel, "Teacher ID:");
        assignmentGradedScoreTextField = addInputField(GradeAssignmentsSectionPanel, "Graded Score:");
        assignmentDepartmentTextField = addInputField(GradeAssignmentsSectionPanel, "Department:");
        assignmentYearsOfExperienceTextField = addInputField(GradeAssignmentsSectionPanel, "Years of Experience:");

        gradeAssignment = new JButton("Grade Assignments");
        gradeAssignment.addActionListener(this);
        styleButton(gradeAssignment);
        GradeAssignmentsSectionPanel.add(gradeAssignment);

        add(GradeAssignmentsSectionPanel);
    }

    public void addSetSalaryOfTutorSection() {
        SalaryOfTutorSectionPanel= new JPanel();
        SalaryOfTutorSectionPanel.setVisible(false);
        SalaryOfTutorSectionPanel.setPreferredSize(new Dimension(300, 300));
        SalaryOfTutorSectionPanel.setLayout(new BoxLayout(SalaryOfTutorSectionPanel, BoxLayout.Y_AXIS));
        SalaryOfTutorSectionPanel.setBorder(BorderFactory.createTitledBorder("Set Salary of Tutor"));
        SalaryOfTutorSectionPanel.setBackground(Color.WHITE);

        // Add individual input fields and labels
        salaryTutorIdTextField = addInputField(SalaryOfTutorSectionPanel, "Teacher ID:");
        salaryTutorNewSalaryTextField = addInputField(SalaryOfTutorSectionPanel, "New Salary:");
        salaryTutorNewPerformanceIndexTextField = addInputField(SalaryOfTutorSectionPanel, "New Performance Index:");

        setSalaryOfTutor = new JButton("Set Salary of Tutor");
        setSalaryOfTutor.addActionListener(this);
        styleButton(setSalaryOfTutor);
        SalaryOfTutorSectionPanel.add(setSalaryOfTutor);

        add(SalaryOfTutorSectionPanel);
    }

    public void addControlButtons() {
        ControlButtonsPanel = new JPanel(new BorderLayout());
        ControlButtonsPanel.setVisible(true);
        ControlButtonsPanel.setBorder(BorderFactory.createTitledBorder("Control Buttons"));
        ControlButtonsPanel.setBackground(new Color(238, 245, 255));

        // First part: "Teacher ID" label and input field along with the "Remove Tutor" button
        JPanel part1 = new JPanel(new GridBagLayout());
        part1.setPreferredSize(new Dimension(100,200));
        part1.setBackground(Color.LIGHT_GRAY);
        GridBagConstraints gbc1 = new GridBagConstraints();
        gbc1.anchor = GridBagConstraints.WEST;

        JLabel teacherIdLabel = new JLabel("Teacher ID:");
        gbc1.gridx = 0;
        gbc1.gridy = 0;
        gbc1.insets = new Insets(0, 0, 5, 10); // Adjust top, left, bottom, right insets
        part1.add(teacherIdLabel, gbc1);

        tutorIdTextField = new JTextField(20); // Adjust the width of the text field as needed
        gbc1.gridx = 1;
        gbc1.insets = new Insets(0, 0, 5, 0); // Adjust top, left, bottom, right insets
        part1.add(tutorIdTextField, gbc1);

        removeTutor= new JButton("Remove Tutor");
        removeTutor.addActionListener(this);
        styleButton(removeTutor);
        gbc1.gridy = 1;
        gbc1.insets = new Insets(0, 10, 5, 0); // Adjust top, left, bottom, right insets
        part1.add(removeTutor, gbc1);

        ControlButtonsPanel.add(part1, BorderLayout.NORTH);

        // Second part: "Clear" and "Display" buttons
        JPanel part2 = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10)); // Added gap between buttons
        part2.setPreferredSize(new Dimension(100,200));
//        part2.setBackground(Color.gray);
//        part2.setBackground(Color.WHITE);

        clearButton = new JButton("Clear");
        styleButton(clearButton);
        clearButton.addActionListener(this);
        part2.add(clearButton);

        displayButton = new JButton("Display");
        styleButton(displayButton);
        displayButton.addActionListener(this);
        part2.add(displayButton);

        next = new JButton("Switch Page");
        styleButton(next);
        next.addActionListener(this);
        part2.add(next);

        ControlButtonsPanel.add(part2, BorderLayout.CENTER);

        add(ControlButtonsPanel);
    }




    public void addMessageBox() {
        MessageBoxPanel = new JPanel(new BorderLayout());
        MessageBoxPanel.setVisible(true);
        MessageBoxPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        message = new JTextArea();
        message.setBackground(new Color(31, 32, 35));
        message.setForeground(new Color(245, 240, 255));

        message.setText("We Show Message Here");
        message.setEditable(false); // Make the text area read-only
        message.setFont(new Font("Noto Sans", Font.PLAIN, 15));
        message.setLineWrap(true); // Enable automatic line wrapping
        message.setWrapStyleWord(true); // Wrap at word boundaries

        JLabel heading = new JLabel("\tTerminal");
        heading.setFont(new Font("Noto Sans", Font.BOLD, 15));
        MessageBoxPanel.add(heading, BorderLayout.PAGE_START);
        MessageBoxPanel.add(new JScrollPane(message), BorderLayout.CENTER);

        message.setMargin(new Insets(5,7,5,5));
        add(MessageBoxPanel, BorderLayout.CENTER);
    }



    // Method to create individual JLabels and JTextFields for each label-input pair
    public JTextField addInputField(JPanel panel, String label) {
        JPanel fieldPanel = new JPanel(new GridBagLayout()); // Use GridBagLayout for precise control
        fieldPanel.setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.EAST; // Align components to the right

        JLabel jLabel = new JLabel(label);
        jLabel.setFont(new Font("Montserrat", Font.BOLD, 14));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 0, 2, 5); // Reduce bottom insets to 2 pixels
        fieldPanel.add(jLabel, gbc);

        JTextField jTextField = new JTextField(30); // Increase width to accommodate 30 columns
        jTextField.setPreferredSize(new Dimension(200, jTextField.getPreferredSize().height)); // Set preferred size
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL; // Fill horizontally
        gbc.weightx = 1; // Allow the text field to expand horizontally
        gbc.insets = new Insets(0, 0, 2, 0); // Reduce bottom insets to 2 pixels
        fieldPanel.add(jTextField, gbc);

        panel.add(fieldPanel);

        return jTextField;
    }


    public void styleButton(JButton button) {
        button.setBackground(new Color(173, 216, 230));
        button.setForeground(Color.BLACK);
        button.setFocusPainted(false);
    }

    public void addLecturer() {
        try {
            // Getting values from text fields
            int id = Integer.parseInt(lecturerIdTextField.getText());
            String name = lecturerNameTextField.getText();
            String address = lecturerAddressTextField.getText();
            String workingType = lecturerWorkingTypeTextField.getText();
            String employmentStatus = lecturerEmploymentStatusTextField.getText();
            String department = lecturerDepartmentTextField.getText();
            int gradedScore = (int) Double.parseDouble(lecturerGradedScoreTextField.getText());
            int yearsOfExperience = Integer.parseInt(lecturerYearsOfExperienceTextField.getText());

            // Creating a new Lecturer object
//            Lecturer newLecturer = new Lecturer(id, name, address, workingType, employmentStatus, department, yearsOfExperience);
//            newLecturer.setGradedScore(gradedScore);
//            addedLecturers.add(newLecturer);
            // Add the new lecturer to your ArrayList or any other data structure
            // teacherList.add(newLecturer);

            // Display success message
            message.setText("Lecturer added successfully!");
        } catch (NumberFormatException ex) {
            // Handle the case where a non-integer value is entered for the ID
            message.setText("Error: Please enter valid values for ID, Graded Score, and Years of Experience.");
        }
    }



    public void addTutor(){
        // Pass
        message.setText("Tutor added successfully!");
    }

    public  void gradeAssignment(){
        // Pass
        message.setText("Graded assignment successfully!");
    }

    public void setSalaryOfTutor(){
        // Pass
        message.setText("Salary updated  successfully!");
    }

    public void removeTutor(){
        // pass
        message.setText("Tutor remove successfully!");
    }

//    public void displayInfo() {
//        try {
//            StringBuilder info = new StringBuilder();
//            for (Teacher teacher : addedLecturers) {
//                if (teacher instanceof Lecturer) {
//                    Lecturer lecturer = (Lecturer) teacher;
//                    // Append information about each lecturer to the StringBuilder
//                    info.append("Teacher ID: ").append(lecturer.getTeacherId()).append("\n");
//                    info.append("Teacher Name: ").append(lecturer.getTeacherName()).append("\n");
//                    info.append("Address: ").append(lecturer.getAddress()).append("\n");
//                    info.append("Working Type: ").append(lecturer.getWorkingType()).append("\n");
//                    info.append("Employment Status: ").append(lecturer.getEmploymentStatus()).append("\n");
//                    info.append("Department: ").append(lecturer.getDepartment()).append("\n");
//                    info.append("Graded Score: ").append(lecturer.getGradedScore()).append("\n");
//                    info.append("Years of Experience: ").append(lecturer.getYearsOfExperience()).append("\n");
//                    info.append("\n"); // Add a newline between each lecturer's information
//                }
//            }
//            // Set the complete information in the JTextArea
//            message.setText(info.toString());
//            // Display success message after setting all information
//            message.append("\nInformation Displayed Successfully");
//        } catch (Exception e) {
//            // Handle specific exceptions if necessary
//            message.setText("Something went wrong: " + e.getMessage());
//        }
//
//    }


    public void clearFields() {
        message.setText("Cleared successfully!");
        // Clear all input fields
        lecturerIdTextField.setText("");
        lecturerNameTextField.setText("");
        // Clear other fields similarly
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addLecturer) {
            addLecturer();

        } else if (e.getSource() == addTutor) {
            addTutor();

        } else if (e.getSource() == gradeAssignment) {
            gradeAssignment();

        } else if (e.getSource() == setSalaryOfTutor) {
            setSalaryOfTutor();

        } else if (e.getSource() == removeTutor) {
            removeTutor();

        } else if (e.getSource() == clearButton) {
            clearFields();
        } else if (e.getSource() == displayButton) {
            //displayInfo();
            //pass
        } else if (e.getSource() == next) {
            // Switching between panels
            if (lecturerSectionPanel.isVisible()) {
                lecturerSectionPanel.setVisible(false);
                TutorSectionPanel.setVisible(true);
            } else if (TutorSectionPanel.isVisible()) {
                TutorSectionPanel.setVisible(false);
                GradeAssignmentsSectionPanel.setVisible(true);
            } else if (GradeAssignmentsSectionPanel.isVisible()) {
                GradeAssignmentsSectionPanel.setVisible(false);
                SalaryOfTutorSectionPanel.setVisible(true);
            } else if (SalaryOfTutorSectionPanel.isVisible()) {
                SalaryOfTutorSectionPanel.setVisible(false);
                lecturerSectionPanel.setVisible(true); // Loop back to the first panel
            }
        }
    }



    public static void main(String[] args) {
        TeacherGui teacherGui =
                new TeacherGui();

    }
}
