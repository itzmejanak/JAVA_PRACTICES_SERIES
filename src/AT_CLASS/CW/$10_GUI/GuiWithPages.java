package AT_CLASS.CW.$10_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuiWithPages extends JFrame {
    private CardLayout cardLayout;
    private JPanel cardPanel;

    public GuiWithPages() {
        setTitle("GUI with Pages");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cardLayout = new CardLayout();
        cardPanel = new JPanel();
        cardPanel.setLayout(cardLayout);

        JPanel page1 = createPage1();
        JPanel page2 = createPage2();
        JPanel page3 = createPage3();

        cardPanel.add(page1, "Page 1");
        cardPanel.add(page2, "Page 2");
        cardPanel.add(page3, "Page 3");

        add(cardPanel, BorderLayout.CENTER);

        // Create the switch button
        JButton switchButton = new JButton("Switch Pages");
        switchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(cardPanel); // Switch to the next page
            }
        });

        // Add the switch button to the frame
        add(switchButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    private JPanel createPage1() {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setPreferredSize(new Dimension(700,500));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel idLabel = new JLabel("Teacher ID:");
        JTextField idField = new JTextField(15);

        JLabel nameLabel = new JLabel("Teacher Name:");
        JTextField nameField = new JTextField(15);

        JLabel addressLabel = new JLabel("Address:");
        JTextField addressField = new JTextField(15);

        JLabel workingTypeLabel = new JLabel("Working Type:");
        JTextField workingTypeField = new JTextField(15);

        JLabel employmentStatusLabel = new JLabel("Employment Status:");
        JTextField employmentStatusField = new JTextField(15);

        JLabel gradedScoreLabel = new JLabel("Graded Score:");
        JTextField gradedScoreField = new JTextField(15);

        JLabel experienceLabel = new JLabel("Years of Experience:");
        JTextField experienceField = new JTextField(15);

        JButton addLecturerButton = new JButton("Add Lecturer");
        addLecturerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add lecturer logic here
                String id = idField.getText();
                String name = nameField.getText();
                String address = addressField.getText();
                String workingType = workingTypeField.getText();
                String employmentStatus = employmentStatusField.getText();
                String gradedScore = gradedScoreField.getText();
                String experience = experienceField.getText();

                // Process the lecturer data
                System.out.println("Adding lecturer: " + id + ", " + name + ", " + address + ", " + workingType + ", " + employmentStatus + ", " + gradedScore + ", " + experience);
            }
        });

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(idLabel, gbc);

        gbc.gridx = 1;
        panel.add(idField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(nameLabel, gbc);

        gbc.gridx = 1;
        panel.add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(addressLabel, gbc);

        gbc.gridx = 1;
        panel.add(addressField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(workingTypeLabel, gbc);

        gbc.gridx = 1;
        panel.add(workingTypeField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(employmentStatusLabel, gbc);

        gbc.gridx = 1;
        panel.add(employmentStatusField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(gradedScoreLabel, gbc);

        gbc.gridx = 1;
        panel.add(gradedScoreField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        panel.add(experienceLabel, gbc);

        gbc.gridx = 1;
        panel.add(experienceField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(addLecturerButton, gbc);

        return panel;
    }

    private JPanel createPage2() {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel idLabel = new JLabel("Teacher ID:");
        JTextField idField = new JTextField(15);

        JLabel nameLabel = new JLabel("Teacher Name:");
        JTextField nameField = new JTextField(15);

        JLabel addressLabel = new JLabel("Address:");
        JTextField addressField = new JTextField(15);

        JLabel workingTypeLabel = new JLabel("Working Type:");
        JTextField workingTypeField = new JTextField(15);

        JLabel employmentStatusLabel = new JLabel("Employment Status:");
        JTextField employmentStatusField = new JTextField(15);

        JLabel workingHoursLabel = new JLabel("Working Hours:");
        JTextField workingHoursField = new JTextField(15);

        JLabel salaryLabel = new JLabel("Salary:");
        JTextField salaryField = new JTextField(15);

        JLabel specializationLabel = new JLabel("Specialization:");
        JTextField specializationField = new JTextField(15);

        JLabel academicQualificationsLabel = new JLabel("Academic Qualifications:");
        JTextField academicQualificationsField = new JTextField(15);

        JLabel performanceIndexLabel = new JLabel("Performance Index:");
        JTextField performanceIndexField = new JTextField(15);

        JButton addTutorButton = new JButton("Add Tutor");
        addTutorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add tutor logic here
                String id = idField.getText();
                String name = nameField.getText();
                String address = addressField.getText();
                String workingType = workingTypeField.getText();
                String employmentStatus = employmentStatusField.getText();
                String workingHours = workingHoursField.getText();
                String salary = salaryField.getText();
                String specialization = specializationField.getText();
                String academicQualifications = academicQualificationsField.getText();
                String performanceIndex = performanceIndexField.getText();

                // Process the tutor data
                System.out.println("Adding tutor: " + id + ", " + name + ", " + address + ", " + workingType + ", " + employmentStatus + ", " + workingHours + ", " + salary + ", " + specialization + ", " + academicQualifications + ", " + performanceIndex);
            }
        });

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(idLabel, gbc);

        gbc.gridx = 1;
        panel.add(idField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(nameLabel, gbc);

        gbc.gridx = 1;
        panel.add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(addressLabel, gbc);

        gbc.gridx = 1;
        panel.add(addressField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(workingTypeLabel, gbc);

        gbc.gridx = 1;
        panel.add(workingTypeField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(employmentStatusLabel, gbc);

        gbc.gridx = 1;
        panel.add(employmentStatusField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(workingHoursLabel, gbc);

        gbc.gridx = 1;
        panel.add(workingHoursField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        panel.add(salaryLabel, gbc);

        gbc.gridx = 1;
        panel.add(salaryField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        panel.add(specializationLabel, gbc);

        gbc.gridx = 1;
        panel.add(specializationField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 8;
        panel.add(academicQualificationsLabel, gbc);

        gbc.gridx = 1;
        panel.add(academicQualificationsField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 9;
        panel.add(performanceIndexLabel, gbc);

        gbc.gridx = 1;
        panel.add(performanceIndexField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 10;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(addTutorButton, gbc);

        return panel;
    }
    private JPanel createPage3() {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        // Grade the Assignments
        JLabel gradeLabel = new JLabel("Teacher ID:");
        JTextField gradeField = new JTextField(15);

        JLabel gradedScoreLabel = new JLabel("Graded Score:");
        JTextField gradedScoreField = new JTextField(15);

        JLabel departmentLabel = new JLabel("Department:");
        JTextField departmentField = new JTextField(15);

        JLabel experienceLabel = new JLabel("Years of Experience:");
        JTextField experienceField = new JTextField(15);

        JButton gradeButton = new JButton("Grade the Assignments");
        gradeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Grade assignments logic here
                String id = gradeField.getText();
                String gradedScore = gradedScoreField.getText();
                String department = departmentField.getText();
                String experience = experienceField.getText();

                // Process the grading data
                System.out.println("Grading assignments for teacher: " + id + ", Graded Score: " + gradedScore + ", Department: " + department + ", Years of Experience: " + experience);
            }
        });

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(gradeLabel, gbc);

        gbc.gridx = 1;
        panel.add(gradeField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(gradedScoreLabel, gbc);

        gbc.gridx = 1;
        panel.add(gradedScoreField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(departmentLabel, gbc);

        gbc.gridx = 1;
        panel.add(departmentField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(experienceLabel, gbc);

        gbc.gridx = 1;
        panel.add(experienceField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(gradeButton, gbc);

        // Set the Salary of Tutor
        JLabel salaryIdLabel = new JLabel("Teacher ID:");
        JTextField salaryIdField = new JTextField(15);

        JLabel newSalaryLabel = new JLabel("New Salary:");
        JTextField newSalaryField = new JTextField(15);

        JLabel newPerformanceIndexLabel = new JLabel("New Performance Index:");
        JTextField newPerformanceIndexField = new JTextField(15);

        JButton setSalaryButton = new JButton("Set the Salary of Tutor");
        setSalaryButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Set salary of tutor logic here
                String id = salaryIdField.getText();
                String newSalary = newSalaryField.getText();
                String newPerformanceIndex = newPerformanceIndexField.getText();

                // Process setting salary data
                System.out.println("Setting salary for tutor: " + id + ", New Salary: " + newSalary + ", New Performance Index: " + newPerformanceIndex);
            }
        });

        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(salaryIdLabel, gbc);

        gbc.gridx = 1;
        panel.add(salaryIdField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        panel.add(newSalaryLabel, gbc);

        gbc.gridx = 1;
        panel.add(newSalaryField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        panel.add(newPerformanceIndexLabel, gbc);

        gbc.gridx = 1;
        panel.add(newPerformanceIndexField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(setSalaryButton, gbc);

        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GuiWithPages();
            }
        });
    }
}
