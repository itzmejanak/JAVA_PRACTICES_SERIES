import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BorderLayouGui extends JFrame implements ActionListener {
    JTextField lecturerIdTextField, lecturerNameTextField, lecturerAddressTextField, lecturerWorkingTypeTextField,
            lecturerEmploymentStatusTextField, lecturerDepartmentTextField, lecturerGradedScoreTextField, lecturerYearsOfExperienceTextField,
            tutorIdTextField, tutorNameTextField, tutorAddressTextField, tutorWorkingTypeTextField,
            tutorEmploymentStatusTextField, tutorWorkingHoursTextField, tutorSalaryTextField,
            tutorSpecializationTextField, tutorAcademicQualificationsTextField, tutorPerformanceIndexTextField,
            assignmentTeacherIdTextField, assignmentGradedScoreTextField, assignmentDepartmentTextField, assignmentYearsOfExperienceTextField,
            salaryTutorIdTextField, salaryTutorNewSalaryTextField, salaryTutorNewPerformanceIndexTextField;
    JPanel mainPanel;
    CardLayout cardLayout;
    JTextArea message;
    JButton addLecturer, addTutor, gradeAssignment, setSalaryOfTutor, removeTutor, clearButton, displayButton, nextButton, preButton;

    public DebugNew() {
        setupFrame();
        addSections();
        setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true); // Make the frame visible
    }

    public void setupFrame() {
        setTitle("College Management System"); // Set the title of the frame
        setSize(700, 500); // Set the size of the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Specify what happens when the frame is closed

        // Create the main panel with CardLayout for switching pages
        mainPanel = new JPanel();
        cardLayout = new CardLayout();
        mainPanel.setLayout(cardLayout); // Set CardLayout to the main panel
        getContentPane().add(mainPanel, BorderLayout.CENTER); // Add the main panel to the frame's content pane

        // Create Next button
        nextButton = new JButton("Next");
        nextButton.addActionListener(this);

        // Create Previous button
        preButton = new JButton("Previous");
        preButton.addActionListener(this);

        // Create and configure button panels
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(nextButton);

        JPanel buttonPanel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonPanel1.add(preButton);

        // Create a container panel to hold both button panels
        JPanel buttonsContainer = new JPanel(new BorderLayout());
        buttonsContainer.add(buttonPanel, BorderLayout.EAST);
        buttonsContainer.add(buttonPanel1, BorderLayout.WEST);

        // Add the container panel to the frame's content pane
        getContentPane().add(buttonsContainer, BorderLayout.SOUTH);
    }


    public void addSections() {
        // Add sections to the main panel
        mainPanel.add(createAddLecturerSection(), "addLecturer");
        mainPanel.add(createAddTutorSection(), "addTutor");
        mainPanel.add(createGradeAssignmentsSection(), "gradeAssignments");
        mainPanel.add(createSetSalaryOfTutorSection(), "setSalaryOfTutor");
    }

    public JPanel createAddLecturerSection() {
        JPanel lecturerSectionPanel = new JPanel();        // Create a new JPanel for Add Lecturer section
//        lecturerSectionPanel.setLayout(new BorderLayout()); // Set GridLayout for panel                           // if we want to show the terminal then Use this
        lecturerSectionPanel.setLayout(new GridLayout(10, 2, 10, 10));
        lecturerSectionPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Set empty border with margins
        lecturerSectionPanel.setBackground(Color.WHITE); // Set background color
        
        // Add JLabels and JTextFields for each input field
        JLabel lecturerIdLabel = new JLabel("Teacher ID:");
        lecturerIdTextField = new JTextField();
        lecturerSectionPanel.add(lecturerIdLabel);
        lecturerSectionPanel.add(lecturerIdTextField);

        JLabel lecturerNameLabel = new JLabel("Teacher Name:");
        lecturerNameTextField = new JTextField();
        lecturerSectionPanel.add(lecturerNameLabel);
        lecturerSectionPanel.add(lecturerNameTextField);

        JLabel lecturerAddressLabel = new JLabel("Address:");
        lecturerAddressTextField = new JTextField();
        lecturerSectionPanel.add(lecturerAddressLabel);
        lecturerSectionPanel.add(lecturerAddressTextField);

        JLabel lecturerWorkingTypeLabel = new JLabel("Working Type:");
        lecturerWorkingTypeTextField = new JTextField();
        lecturerSectionPanel.add(lecturerWorkingTypeLabel);
        lecturerSectionPanel.add(lecturerWorkingTypeTextField);

        JLabel lecturerEmploymentStatusLabel = new JLabel("Employment Status:");
        lecturerEmploymentStatusTextField = new JTextField();
        lecturerSectionPanel.add(lecturerEmploymentStatusLabel);
        lecturerSectionPanel.add(lecturerEmploymentStatusTextField);

        JLabel lecturerDepartmentLabel = new JLabel("Department:");
        lecturerDepartmentTextField = new JTextField();
        lecturerSectionPanel.add(lecturerDepartmentLabel);
        lecturerSectionPanel.add(lecturerDepartmentTextField);

        JLabel lecturerGradedScoreLabel = new JLabel("Graded Score:");
        lecturerGradedScoreTextField = new JTextField();
        lecturerSectionPanel.add(lecturerGradedScoreLabel);
        lecturerSectionPanel.add(lecturerGradedScoreTextField);

        JLabel lecturerYearsOfExperienceLabel = new JLabel("Years of Experience:");
        lecturerYearsOfExperienceTextField = new JTextField();
        lecturerSectionPanel.add(lecturerYearsOfExperienceLabel);
        lecturerSectionPanel.add(lecturerYearsOfExperienceTextField);

        // Add "Add Lecturer" button
        addLecturer = new JButton("Add Lecturer");
        addLecturer.addActionListener(this); // Assuming ActionListener is implemented in the class
        lecturerSectionPanel.add(addLecturer); // Add the button to the panel

        lecturerSectionPanel.add(createMessageBox(), BorderLayout.CENTER);

        return lecturerSectionPanel; // Return the panel
    }



    public JPanel createAddTutorSection() {
        JPanel tutorSectionPanel = new JPanel(); // Create a new JPanel for Add Tutor section
        tutorSectionPanel.setLayout(new GridLayout(11, 2, 10, 10)); // Set GridLayout for panel
        tutorSectionPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Set empty border with margins
        tutorSectionPanel.setBackground(Color.LIGHT_GRAY); // Set background color

        // Add JLabels and JTextFields for each input field
        JLabel tutorIdLabel = new JLabel("Teacher ID:");
        tutorIdTextField = new JTextField();
        tutorSectionPanel.add(tutorIdLabel);
        tutorSectionPanel.add(tutorIdTextField);

        JLabel tutorNameLabel = new JLabel("Teacher Name:");
        tutorNameTextField = new JTextField();
        tutorSectionPanel.add(tutorNameLabel);
        tutorSectionPanel.add(tutorNameTextField);

        JLabel tutorAddressLabel = new JLabel("Address:");
        tutorAddressTextField = new JTextField();
        tutorSectionPanel.add(tutorAddressLabel);
        tutorSectionPanel.add(tutorAddressTextField);

        JLabel tutorWorkingTypeLabel = new JLabel("Working Type:");
        tutorWorkingTypeTextField = new JTextField();
        tutorSectionPanel.add(tutorWorkingTypeLabel);
        tutorSectionPanel.add(tutorWorkingTypeTextField);

        JLabel tutorEmploymentStatusLabel = new JLabel("Employment Status:");
        tutorEmploymentStatusTextField = new JTextField();
        tutorSectionPanel.add(tutorEmploymentStatusLabel);
        tutorSectionPanel.add(tutorEmploymentStatusTextField);

        JLabel tutorWorkingHoursLabel = new JLabel("Working Hours:");
        tutorWorkingHoursTextField = new JTextField();
        tutorSectionPanel.add(tutorWorkingHoursLabel);
        tutorSectionPanel.add(tutorWorkingHoursTextField);

        JLabel tutorSalaryLabel = new JLabel("Salary:");
        tutorSalaryTextField = new JTextField();
        tutorSectionPanel.add(tutorSalaryLabel);
        tutorSectionPanel.add(tutorSalaryTextField);

        JLabel tutorSpecializationLabel = new JLabel("Specialization:");
        tutorSpecializationTextField = new JTextField();
        tutorSectionPanel.add(tutorSpecializationLabel);
        tutorSectionPanel.add(tutorSpecializationTextField);

        JLabel tutorAcademicQualificationsLabel = new JLabel("Academic Qualifications:");
        tutorAcademicQualificationsTextField = new JTextField();
        tutorSectionPanel.add(tutorAcademicQualificationsLabel);
        tutorSectionPanel.add(tutorAcademicQualificationsTextField);

        JLabel tutorPerformanceIndexLabel = new JLabel("Performance Index:");
        tutorPerformanceIndexTextField = new JTextField();
        tutorSectionPanel.add(tutorPerformanceIndexLabel);
        tutorSectionPanel.add(tutorPerformanceIndexTextField);

        // Add "Add Tutor" button
        addTutor = new JButton("Add Tutor");
        addTutor.addActionListener(this); // Assuming ActionListener is implemented in the class
        tutorSectionPanel.add(addTutor); // Add the button to the panel

        tutorSectionPanel.add(createMessageBox(), BorderLayout.CENTER);
        return tutorSectionPanel; // Return the panel
    }



    public JPanel createGradeAssignmentsSection() {
        JPanel gradeAssignmentsSectionPanel = new JPanel(); // Create a new JPanel for Grade Assignments section
        gradeAssignmentsSectionPanel.setLayout(new GridLayout(5, 2, 10, 10)); // Set GridLayout for panel
        gradeAssignmentsSectionPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Set empty border with margins
        gradeAssignmentsSectionPanel.setBackground(Color.WHITE); // Set background color

        // Add JLabels and JTextFields for each input field
        JLabel assignmentTeacherIdLabel = new JLabel("Teacher ID:");
        assignmentTeacherIdTextField = new JTextField();
        gradeAssignmentsSectionPanel.add(assignmentTeacherIdLabel);
        gradeAssignmentsSectionPanel.add(assignmentTeacherIdTextField);

        JLabel assignmentGradedScoreLabel = new JLabel("Graded Score:");
        assignmentGradedScoreTextField = new JTextField();
        gradeAssignmentsSectionPanel.add(assignmentGradedScoreLabel);
        gradeAssignmentsSectionPanel.add(assignmentGradedScoreTextField);

        JLabel assignmentDepartmentLabel = new JLabel("Department:");
        assignmentDepartmentTextField = new JTextField();
        gradeAssignmentsSectionPanel.add(assignmentDepartmentLabel);
        gradeAssignmentsSectionPanel.add(assignmentDepartmentTextField);

        JLabel assignmentYearsOfExperienceLabel = new JLabel("Years of Experience:");
        assignmentYearsOfExperienceTextField = new JTextField();
        gradeAssignmentsSectionPanel.add(assignmentYearsOfExperienceLabel);
        gradeAssignmentsSectionPanel.add(assignmentYearsOfExperienceTextField);

        // Add "Grade Assignments" button
        gradeAssignment = new JButton("Grade Assignments");
        gradeAssignment.addActionListener(this); // Assuming ActionListener is implemented in the class
        gradeAssignmentsSectionPanel.add(gradeAssignment); // Add the button to the panel

        gradeAssignmentsSectionPanel.add(createMessageBox(), BorderLayout.CENTER);
        return gradeAssignmentsSectionPanel; // Return the panel
    }


    public JPanel createSetSalaryOfTutorSection() {
        JPanel setSalaryOfTutorSectionPanel = new JPanel(); // Create a new JPanel for Set Salary of Tutor section
        setSalaryOfTutorSectionPanel.setLayout(new GridLayout(4, 2, 10, 10)); // Set GridLayout for panel
        setSalaryOfTutorSectionPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Set empty border with margins
        setSalaryOfTutorSectionPanel.setBackground(Color.LIGHT_GRAY); // Set background color

        // Add JLabels and JTextFields for each input field
        JLabel salaryTutorIdLabel = new JLabel("Teacher ID:");
        salaryTutorIdTextField = new JTextField();
        setSalaryOfTutorSectionPanel.add(salaryTutorIdLabel);
        setSalaryOfTutorSectionPanel.add(salaryTutorIdTextField);

        JLabel salaryTutorNewSalaryLabel = new JLabel("New Salary:");
        salaryTutorNewSalaryTextField = new JTextField();
        setSalaryOfTutorSectionPanel.add(salaryTutorNewSalaryLabel);
        setSalaryOfTutorSectionPanel.add(salaryTutorNewSalaryTextField);

        JLabel salaryTutorNewPerformanceIndexLabel = new JLabel("New Performance Index:");
        salaryTutorNewPerformanceIndexTextField = new JTextField();
        setSalaryOfTutorSectionPanel.add(salaryTutorNewPerformanceIndexLabel);
        setSalaryOfTutorSectionPanel.add(salaryTutorNewPerformanceIndexTextField);

        // Add "Set Salary of Tutor" button
        JButton setSalaryOfTutorButton = new JButton("Set Salary of Tutor");
        setSalaryOfTutorButton.addActionListener(this); // Assuming ActionListener is implemented in the class
        setSalaryOfTutorSectionPanel.add(setSalaryOfTutorButton); // Add the button to the panel

        setSalaryOfTutorSectionPanel.add(createMessageBox(), BorderLayout.CENTER);
        return setSalaryOfTutorSectionPanel; // Return the panel
    }

    public JScrollPane createMessageBox() {
        JTextArea messageArea = new JTextArea(20,30);
        messageArea.setBackground(new Color(31, 32, 35));
        messageArea.setForeground(new Color(245, 240, 255));
        messageArea.setText("We Show Message HereWe Show Message HereWe Show Message HereWe Show Message HereWe Show Message HereWe Show Message Here");
        messageArea.setEditable(false);
        messageArea.setFont(new Font("Noto Sans", Font.PLAIN, 15));
        messageArea.setLineWrap(true);
        messageArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(messageArea);
        return scrollPane;
    }





    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle button clicks to switch pages
        if (e.getSource() == nextButton) {
            cardLayout.next(mainPanel); // Switch to the next panel using CardLayout
        } else if (e.getSource() == preButton) {
            cardLayout.previous(mainPanel);
        }
    }

    public static void main(String[] args) {
        BorderLayouGui teacherGui = new BorderLayouGui(); // Create an instance of DebugNew class
    }
}
