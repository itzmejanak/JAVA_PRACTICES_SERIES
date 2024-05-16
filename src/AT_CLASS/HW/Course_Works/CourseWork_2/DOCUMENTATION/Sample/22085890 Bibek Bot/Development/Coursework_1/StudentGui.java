package Coursework_1;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
//create class named studentgui
public class StudentGui {
    //Arraylist of Student Class
    public ArrayList<Student> studentArrayList = new ArrayList<>();


    //Constructor of studentGui
    public StudentGui(){
        //Create frame of studentgui
        JFrame frame = new JFrame("Student Gui");
        //Declear gridbaglayout
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        //Create panel
        JPanel panel = new JPanel();
        //construct label, textfield and set font
        JLabel studentName = new JLabel("Student Name: ");
        studentName.setFont(new Font("Serif", Font.BOLD,15));
        JTextField studentNameTf = new JTextField(20);
        //create label of dateofbirth
        JLabel dateOfBirth = new JLabel("Date Of Birth: ");
        dateOfBirth.setFont(new Font("Serif", Font.BOLD,15));
        //create array of birth years, months and days
        String birthYears[] = {"Select Year","1990","1991","1992","1993","1994","1995","1996","1997","1998",
                "1999","2000","2001","2002","2003","2004","2005","2006","2007",
                "2008","2009","2010", "2011","2012","2013","2014","2015","2016","2017",
                "2018","2019","2020","2021","2022","2023"};
        String birthMonths[] = {"Select Month","January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", " December"};
        String birthDays[] = {"Select Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12",
        "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28",
        "29", "30", "31"};
        //create combo box and passing birth years, months and days array
        JComboBox birthYearsComboBox = new JComboBox<>(birthYears);
        JComboBox birthMonthsComboBox = new JComboBox(birthMonths);
        JComboBox birthDaysComboBox = new JComboBox(birthDays);
        //construct label, textfield and set font
        JLabel enrollmentId = new JLabel("Enrollment Id: ");
        enrollmentId.setFont(new Font("Serif", Font.BOLD,15));
        JTextField enrollmentIdTf = new JTextField(20);
        //construct label, textfield and set font
        JLabel courseName = new JLabel("Course Name: ");
        courseName.setFont(new Font("Serif", Font.BOLD,15));
        JTextField courseNameTf = new JTextField(20);
        //construct label, textfield and set font
        JLabel courseDuration = new JLabel("Course Duration: ");
        courseDuration.setFont(new Font("Serif", Font.BOLD,15));
        JTextField courseDurationTf = new JTextField(20);

        JLabel dateOfEnrollment = new JLabel("Date Of Enrollment: ");
        dateOfEnrollment.setFont(new Font("Serif", Font.BOLD,15));
        String enrollmentYears[] = {"Select Year","2001","2002","2003","2004","2005","2006","2007",
                "2008","2009","2010", "2011","2012","2013","2014","2015","2016","2017",
                "2018","2019","2020","2021","2022","2023"};
        String enrollmentMonths[] = {"Select Month","January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", " December"};
        String enrollmentDays[] = {"Select Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12",
                "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28",
                "29", "30", "31"};

        JComboBox enrollmentYearsComboBox = new JComboBox<>(enrollmentYears);
        JComboBox enrollmentMonthsComboBox = new JComboBox(enrollmentMonths);
        JComboBox enrollmentDaysComboBox = new JComboBox(enrollmentDays);
        //construct label, textfield and set font
        JLabel tuitionFeeLabel = new JLabel("Tuition Fee: ");
        tuitionFeeLabel.setFont(new Font("Serif", Font.BOLD,15));
        JTextField tuitionFeeTf = new JTextField(20);
        //construct label, textfield and set font
        JLabel numberOfModulesLabel = new JLabel("Number Of Modules: ");
        numberOfModulesLabel.setFont(new Font("Serif", Font.BOLD, 15));
        JTextField numberOfModulesTf = new JTextField(20);
        //construct label, textfield and set font
        JLabel numberOfCreditHoursLabel = new JLabel("Number Of Credit Hours: ");
        numberOfCreditHoursLabel.setFont(new Font("Serif", Font.BOLD,15));
        JTextField numberOfCreditHoursTf = new JTextField(20);
        //construct label, textfield and set font
        JLabel numberOfDaysPresentLabel = new JLabel("Number Of Days Present: ");
        numberOfDaysPresentLabel.setFont(new Font("Serif", Font.BOLD,15));
        JTextField numberOfDaysPresentTf = new JTextField(20);

        //construct label, textfield and set font
        JLabel numberOfRemainingModulesLabel = new JLabel("Number Of Remaining Modules: ");
        numberOfRemainingModulesLabel.setFont(new Font("Serif", Font.BOLD,15));
        JTextField numberOfRemainingModulesTf = new JTextField(20);
        //construct label, textfield and set font
        JLabel numberOfMonthsAttenedLabel = new JLabel("Number Of Months Attend: ");
        numberOfMonthsAttenedLabel.setFont(new Font("Serif", Font.BOLD,15));
        JTextField numberOfMonthsAttendedTf = new JTextField(20);

        JLabel dateOfDropout = new JLabel("Date Of Dropout: ");
        dateOfDropout.setFont(new Font("Serif", Font.BOLD,15));
        String dropoutYears[] = {"Select Year","2001","2002","2003","2004","2005","2006","2007",
                "2008","2009","2010", "2011","2012","2013","2014","2015","2016","2017",
                "2018","2019","2020","2021","2022","2023"};
        String dropoutMonths[] = {"Select Month","January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", " December"};
        String dropoutDays[] = {"Select Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12",
                "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28",
                "29", "30", "31"};

        JComboBox dropoutYearsComboBox = new JComboBox(dropoutYears);
        JComboBox dropoutMonthsComboBox = new JComboBox(dropoutMonths);
        JComboBox dropoutDaysComboBox = new JComboBox(dropoutDays);
        //construct label, textfield and set font
        JLabel remainingAmount = new JLabel("Remaining Amount: ");
        remainingAmount.setFont(new Font("Serif", Font.BOLD,15));
        JTextField remainingAmountTf = new JTextField(20);

        //construct buttons
        JButton addRegularStudentButton = new JButton("Add To Regular");
        JButton addDropoutStudentButton = new JButton("Add To Dropout");
        JButton calculatePresentPercentButton = new JButton("Calculate Present Persent");
        JButton grantCertificateButton = new JButton("Grant Certificate");
        JButton paybillsButton = new JButton("Pay Bills");
        JButton removeStudentButton = new JButton("Remove Student");
        JButton displayButton = new JButton("Display");
        JButton clearButton = new JButton("Clear");
        //set layout in panel
        panel.setLayout(layout);
        //Set grid x and y and insets to arrage textfield, label and button
        gbc.gridy = 0;
        gbc.gridx =0;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(studentName,gbc);

        gbc.gridx = 1;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(studentNameTf, gbc);

        gbc.gridy = 1;
        gbc.gridx = 0;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(dateOfBirth,gbc);

        gbc.gridx = 1;
        gbc.insets = new Insets(10,-130,0,0);
        panel.add(birthYearsComboBox,gbc);

        gbc.gridx = 2;
        panel.add(birthMonthsComboBox,gbc);

        gbc.gridx = 3;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(birthDaysComboBox,gbc);

        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(enrollmentId, gbc);

        gbc.gridx = 1;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(enrollmentIdTf, gbc);

        gbc.gridy = 3;
        gbc.gridx = 0;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(courseName, gbc);

        gbc.gridx = 1;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(courseNameTf, gbc);

        gbc.gridy = 4;
        gbc.gridx = 0;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(courseDuration, gbc);

        gbc.gridx = 1;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(courseDurationTf, gbc);

        gbc.gridy = 5;
        gbc.gridx = 0;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(dateOfEnrollment, gbc);

        gbc.gridx = 1;
        gbc.insets = new Insets(10,-130,0,0);
        panel.add(enrollmentYearsComboBox, gbc);

        gbc.gridx = 2;
        panel.add(enrollmentMonthsComboBox, gbc);

        gbc.gridx = 3;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(enrollmentDaysComboBox, gbc);

        gbc.gridy = 6;
        gbc.gridx = 0;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(tuitionFeeLabel, gbc);

        gbc.gridx = 1;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(tuitionFeeTf, gbc);

        gbc.gridy = 0;
        gbc.gridx = 8;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(numberOfModulesLabel, gbc);

        gbc.gridx = 9;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(numberOfModulesTf, gbc);

        gbc.gridy = 1;
        gbc.gridx = 8;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(numberOfCreditHoursLabel, gbc);

        gbc.gridx = 9;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(numberOfCreditHoursTf, gbc);

        gbc.gridy = 2;
        gbc.gridx = 8;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(numberOfDaysPresentLabel, gbc);

        gbc.gridx = 9;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(numberOfDaysPresentTf, gbc);

        gbc.gridy = 3;
        gbc.gridx = 8;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(numberOfRemainingModulesLabel, gbc);

        gbc.gridx = 9;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(numberOfRemainingModulesTf, gbc);

        gbc.gridy = 4;
        gbc.gridx = 8;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(numberOfMonthsAttenedLabel, gbc);

        gbc.gridx = 9;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(numberOfMonthsAttendedTf, gbc);

        gbc.gridy = 5;
        gbc.gridx = 8;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(dateOfDropout, gbc);

        gbc.gridx = 9;
        gbc.insets = new Insets(10,-130,0,0);
        panel.add(dropoutYearsComboBox, gbc);

        gbc.gridx = 10;
        panel.add(dropoutMonthsComboBox, gbc);

        gbc.gridx = 11;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(dropoutDaysComboBox, gbc);

        gbc.gridy = 6;
        gbc.gridx = 8;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(remainingAmount, gbc);

        gbc.gridx = 9;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(remainingAmountTf, gbc);

        gbc.gridy = 7;
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(addRegularStudentButton, gbc);

        gbc.gridy = 8;
        gbc.gridx = 1;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(addDropoutStudentButton, gbc);

        gbc.gridy = 9;
        gbc.gridx = 1;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(calculatePresentPercentButton, gbc);

        gbc.gridy = 10;
        gbc.gridx = 1;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(displayButton, gbc);

        gbc.gridy = 7;
        gbc.gridx = 9;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(grantCertificateButton, gbc);

        gbc.gridy = 8;
        gbc.gridx = 9;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(paybillsButton, gbc);

        gbc.gridy = 9;
        gbc.gridx = 9;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(removeStudentButton, gbc);

        gbc.gridy = 10;
        gbc.gridx = 9;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(clearButton, gbc);

        //addregular button functionality
        addRegularStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //create frame 
                JFrame frame1 = new JFrame("Regular Student");
                //Declear grid layout
                GridBagLayout layout = new GridBagLayout();
                GridBagConstraints gbc = new GridBagConstraints();

                //construct new panel
                JPanel panel = new JPanel();
                //construct label, textfield and set font
                 JLabel studentName = new JLabel("Student Name: ");
                 studentName.setFont(new Font("Serif", Font.BOLD,15));
                 JTextField studentNameTf = new JTextField(20);

                 JLabel dateOfBirth = new JLabel("Date Of Birth: ");
                 dateOfBirth.setFont(new Font("Serif", Font.BOLD,15));
                 String birthYears[] = {"Select Year","1990","1991","1992","1993","1994","1995","1996","1997","1998",
                                        "1999","2000","2001","2002","2003","2004","2005","2006","2007",
                                        "2008","2009","2010", "2011","2012","2013","2014","2015","2016","2017",
                                        "2018","2019","2020","2021","2022","2023"};
                 String birthMonths[] = {"Select Month","January", "February", "March", "April", "May", "June", "July", "August",
                         "September", "October", "November", " December"};
                 String birthDays[] = {"Select Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12",
                 "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28",
                 "29", "30", "31"};

                 JComboBox birthYearsComboBox = new JComboBox<>(birthYears);
                 JComboBox birthMonthsComboBox = new JComboBox(birthMonths);
                 JComboBox birthDaysComboBox = new JComboBox(birthDays);
                //construct label, textfield and set font
                 JLabel enrollmentId = new JLabel("Enrollment Id: ");
                 enrollmentId.setFont(new Font("Serif", Font.BOLD,15));
                 JTextField enrollmentIdTf = new JTextField(20);
                //construct label, textfield and set font
                 JLabel courseName = new JLabel("Course Name: ");
                 courseName.setFont(new Font("Serif", Font.BOLD,15));
                 JTextField courseNameTf = new JTextField(20);
                //construct label, textfield and set font
                 JLabel courseDuration = new JLabel("Course Duration: ");
                 courseDuration.setFont(new Font("Serif", Font.BOLD,15));
                 JTextField courseDurationTf = new JTextField(20);
                //Create label and set font desgin
                 JLabel dateOfEnrollment = new JLabel("Date Of Enrollment: ");
                 dateOfEnrollment.setFont(new Font("Serif", Font.BOLD,15));
                 //Create array of enrollment years, months and days
                 String enrollmentYears[] = {"Select Year","2001","2002","2003","2004","2005","2006","2007",
                         "2008","2009","2010", "2011","2012","2013","2014","2015","2016","2017",
                         "2018","2019","2020","2021","2022","2023"};
                 String enrollmentMonths[] = {"Select Month","January", "February", "March", "April", "May", "June", "July", "August",
                         "September", "October", "November", " December"};
                 String enrollmentDays[] = {"Select Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12",
                         "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28",
                         "29", "30", "31"};
                 //Create object of combo box and passing array of enrollment years, month and days
                 JComboBox enrollmentYearsComboBox = new JComboBox<>(enrollmentYears);
                 JComboBox enrollmentMonthsComboBox = new JComboBox(enrollmentMonths);
                 JComboBox enrollmentDaysComboBox = new JComboBox(enrollmentDays);
                //construct label, textfield and set font
                 JLabel tuitionFee = new JLabel("Tuition Fee: ");
                 tuitionFee.setFont(new Font("Serif", Font.BOLD,15));
                 JTextField tuitionFeeTf = new JTextField(20);
                //construct label, textfield and set font
                 JLabel numberOfModules = new JLabel("Number Of Modules: ");
                 numberOfModules.setFont(new Font("Serif", Font.BOLD, 15));
                 JTextField numberOfModulesTf = new JTextField(20);
                //construct label, textfield and set font
                 JLabel numberOfCreditHours = new JLabel("Number Of Credit Hours: ");
                 numberOfCreditHours.setFont(new Font("Serif", Font.BOLD,15));
                 JTextField numberOfCreditHoursTf = new JTextField(20);
                //construct label, textfield and set font
                 JLabel numberOfDaysPresent = new JLabel("Number Of Days Present: ");
                 numberOfDaysPresent.setFont(new Font("Serif", Font.BOLD,15));
                 JTextField numberOfDaysPresentTf = new JTextField(20);
                 //Create add button
                 JButton addButton = new JButton("Add");
                 //Create cancel button
                 JButton cancelButton = new JButton("Cancel");
                 //set layout in panel
                 panel.setLayout(layout);

                 gbc.gridy = 0;
                 gbc.gridx =0;
                 gbc.insets = new Insets(10,0,0,0);
                 panel.add(studentName,gbc);

                 gbc.gridx = 1;
                 gbc.insets = new Insets(10,0,0,0);
                 panel.add(studentNameTf, gbc);

                 gbc.gridy = 1;
                 gbc.gridx = 0;
                 gbc.insets = new Insets(10,0,0,0);
                 panel.add(dateOfBirth,gbc);

                 gbc.gridx = 1;
                 gbc.insets = new Insets(10,-130,0,0);
                 panel.add(birthYearsComboBox,gbc);

                 gbc.gridx = 2;
                 panel.add(birthMonthsComboBox,gbc);

                 gbc.gridx = 3;
                 gbc.insets = new Insets(10,0,0,0);
                 panel.add(birthDaysComboBox,gbc);

                 gbc.gridy = 2;
                 gbc.gridx = 0;
                 gbc.insets = new Insets(10,0,0,0);
                 panel.add(enrollmentId, gbc);

                 gbc.gridx = 1;
                 gbc.insets = new Insets(10,0,0,0);
                 panel.add(enrollmentIdTf, gbc);

                 gbc.gridy = 3;
                 gbc.gridx = 0;
                 gbc.insets = new Insets(10,0,0,0);
                 panel.add(courseName, gbc);

                 gbc.gridx = 1;
                 gbc.insets = new Insets(10,0,0,0);
                 panel.add(courseNameTf, gbc);

                 gbc.gridy = 4;
                 gbc.gridx = 0;
                 gbc.insets = new Insets(10,0,0,0);
                 panel.add(courseDuration, gbc);

                 gbc.gridx = 1;
                 gbc.insets = new Insets(10,0,0,0);
                 panel.add(courseDurationTf, gbc);

                 gbc.gridy = 5;
                 gbc.gridx = 0;
                 gbc.insets = new Insets(10,0,0,0);
                 panel.add(dateOfEnrollment, gbc);

                 gbc.gridx = 1;
                 gbc.insets = new Insets(10,-130,0,0);
                 panel.add(enrollmentYearsComboBox, gbc);

                 gbc.gridx = 2;
                 panel.add(enrollmentMonthsComboBox, gbc);

                 gbc.gridx = 3;
                 gbc.insets = new Insets(10,0,0,0);
                 panel.add(enrollmentDaysComboBox, gbc);

                 gbc.gridy = 6;
                 gbc.gridx = 0;
                 gbc.insets = new Insets(10,0,0,0);
                 panel.add(tuitionFee, gbc);

                 gbc.gridx = 1;
                 gbc.insets = new Insets(10,0,0,0);
                 panel.add(tuitionFeeTf, gbc);

                 gbc.gridy = 7;
                 gbc.gridx = 0;
                 gbc.insets = new Insets(10,0,0,0);
                 panel.add(numberOfModules, gbc);

                 gbc.gridx = 1;
                 gbc.insets = new Insets(10,0,0,0);
                 panel.add(numberOfModulesTf, gbc);

                 gbc.gridy = 8;
                 gbc.gridx = 0;
                 gbc.insets = new Insets(10,0,0,0);
                 panel.add(numberOfCreditHours, gbc);

                 gbc.gridx = 1;
                 gbc.insets = new Insets(10,0,0,0);
                 panel.add(numberOfCreditHoursTf, gbc);

                 gbc.gridy = 9;
                 gbc.gridx = 0;
                 gbc.insets = new Insets(10,0,0,0);
                 panel.add(numberOfDaysPresent, gbc);

                 gbc.gridx = 1;
                 gbc.insets = new Insets(10,0,0,0);
                 panel.add(numberOfDaysPresentTf, gbc);

                 gbc.gridy = 11;
                 gbc.gridx = 1;
                 gbc.fill = GridBagConstraints.HORIZONTAL;
                 gbc.insets = new Insets(10,0,0,0);
                 panel.add(addButton, gbc);

                 gbc.gridy = 13;
                 gbc.gridx = 1;
                 gbc.fill = GridBagConstraints.HORIZONTAL;
                gbc.insets = new Insets(10,0,0,0);
                 panel.add(cancelButton, gbc);

                 //add button functionality
                 addButton.addActionListener(new ActionListener() {
                     @Override
                     public void actionPerformed(ActionEvent e) {
                         //Using if else to check condition
                         if (studentNameTf.getText().equals("") || birthYearsComboBox.getSelectedIndex()==0 || birthMonthsComboBox.getSelectedIndex()==0 || birthDaysComboBox.getSelectedIndex()==0 ||
                         enrollmentIdTf.getText().equals("") || courseNameTf.getText().equals("") || courseDurationTf.getText().equals("") || enrollmentYearsComboBox.getSelectedIndex()==0 ||
                         enrollmentMonthsComboBox.getSelectedIndex()==0 || enrollmentDaysComboBox.getSelectedIndex()==0 || tuitionFeeTf.getText().equals("") || numberOfModulesTf.getText().equals("") ||
                         numberOfCreditHoursTf.getText().equals("") || numberOfDaysPresentTf.getText().equals("")){
                             JOptionPane.showMessageDialog(frame1, "Invalid");
                         }else {
                             //using try catch to show popup if user input text in field of integer and double
                             try {
                                 String studentName = studentNameTf.getText();
                                 String dateOfBirth = birthYearsComboBox.getSelectedItem() + "-" + birthMonthsComboBox.getSelectedItem() + "-" + birthDaysComboBox.getSelectedItem();
                                 int enrollmentId = Integer.parseInt(enrollmentIdTf.getText());
                                 String courseName = courseNameTf.getText();
                                 double courseDuration = Double.parseDouble(courseDurationTf.getText());
                                 String dateOfEnrollment = enrollmentYearsComboBox.getSelectedItem() + "-" + enrollmentMonthsComboBox.getSelectedItem() + "-" + enrollmentDaysComboBox.getSelectedItem();
                                 int tuitionFee = Integer.parseInt(tuitionFeeTf.getText());
                                 int numberOfModules = Integer.parseInt(numberOfModulesTf.getText());
                                 double daysPresent = Double.parseDouble(numberOfDaysPresentTf.getText());
                                 //create object of regular class
                                 Regular student = new Regular(enrollmentId, dateOfBirth, courseName, studentName, dateOfEnrollment, courseDuration, tuitionFee, numberOfModules, daysPresent);
                                 //Add in arraylist
                                 studentArrayList.add(student);
                                 //popup message
                                 JOptionPane.showMessageDialog(frame1, "Sucessfully Added");


                             } catch (Exception e1) {
                                 //popup message
                                 JOptionPane.showMessageDialog(frame1, "Please Enter Valid Information");
                             }
                         }
                     }
                 });
                 //Cancel Button
                 cancelButton.addActionListener(new ActionListener() {
                     @Override
                     public void actionPerformed(ActionEvent e) {
                          frame1.setVisible(false); //Setting frame1 invisible false
                     }
                 });
                 frame1.setVisible(true); //set frame1 visisble
                 frame1.add(panel); //add panel in frame1
                 frame1.pack(); //using pack in frame1
                 frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Default operation Dispose on close
            }
        });
        //Dropout button
        addDropoutStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Using if else to check condition
                if (studentNameTf.getText().equals("") || birthYearsComboBox.getSelectedIndex()==0 || birthMonthsComboBox.getSelectedIndex()==0 || birthDaysComboBox.getSelectedIndex()==0 ||
                        enrollmentIdTf.getText().equals("") || courseDurationTf.getText().equals("") || courseNameTf.getText().equals("") || enrollmentYearsComboBox.getSelectedIndex()==0 ||
                        enrollmentMonthsComboBox.getSelectedIndex()==0 || enrollmentDaysComboBox.getSelectedIndex()==0 || tuitionFeeTf.getText().equals("") || numberOfRemainingModulesTf.getText().equals("") ||
                        numberOfMonthsAttendedTf.getText().equals("") || dropoutYearsComboBox.getSelectedIndex()==0 || dropoutMonthsComboBox.getSelectedIndex()==0 || dropoutDaysComboBox.getSelectedIndex()==0){
                    JOptionPane.showMessageDialog(frame, "Please fill the form");

                }else {
                    //using try catch to show popup if user input text in field of integer and double
                    try{
                        //type conversion and provide appropriate data type
                        String studentName = studentNameTf.getText();
                        String dateOfBirth = birthYearsComboBox.getSelectedItem()+ "-" + birthMonthsComboBox.getSelectedItem()+ "-" + birthDaysComboBox.getSelectedItem();
                        int enrollmentId = Integer.parseInt(enrollmentIdTf.getText());
                        String courseName = courseNameTf.getText();
                        double courseDuration = Double.parseDouble(courseDurationTf.getText());
                        String dateOfEnrollment = enrollmentYearsComboBox.getSelectedItem()+ "-" + enrollmentMonthsComboBox.getSelectedItem()+ "-" +enrollmentDaysComboBox.getSelectedItem();
                        int tuitionFee = Integer.parseInt(tuitionFeeTf.getText());
                        int numberOfRemainingModules = Integer.parseInt(numberOfRemainingModulesTf.getText());
                        int numberOfMonthAttends = Integer.parseInt(numberOfMonthsAttendedTf.getText());
                        String dateOfDropout = dropoutYearsComboBox.getSelectedItem()+ "-" + dropoutMonthsComboBox.getSelectedItem()+ "-" + dropoutDaysComboBox.getSelectedItem();
                        //create object of dropout class
                        Dropout dropout = new Dropout(enrollmentId, courseName, dateOfEnrollment,  dateOfBirth, studentName, courseDuration, tuitionFee, numberOfRemainingModules, numberOfMonthAttends, dateOfDropout);
                        //Add in arraylist
                        studentArrayList.add(dropout);
                        JOptionPane.showMessageDialog(frame, "Successfully Added");

                    }catch (Exception e1){
                        //popup message
                        JOptionPane.showMessageDialog(frame, "Please Enter Valid Information");
                    }

                }

            }
        });
        //Calculate present precentage button
        calculatePresentPercentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame2 = new JFrame("Calculate Present Percentage");
                JPanel panel = new JPanel();
                GridBagLayout layout = new GridBagLayout();
                GridBagConstraints gbc = new GridBagConstraints();
                //construct label, textfield and set font
                JLabel enrollmentId = new JLabel("Enrollment Id: ");
                enrollmentId.setFont(new Font("Serif", Font.BOLD,15));
                JTextField enrollmentIdTf = new JTextField(20);
                //construct label, textfield and set font
                JLabel numberOfDaysPresent = new JLabel("Number Of Days Present: ");
                numberOfDaysPresent.setFont(new Font("Serif", Font.BOLD,15));
                JTextField numberOfDaysPresentTf = new JTextField(20);
                //creat calculate button
                JButton calculateButton = new JButton("Calculate");
                //create cancel button
                JButton cancelButton = new JButton("Cancel");


                panel.setLayout(layout);

                gbc.gridy = 0;
                gbc.gridx =0;
                gbc.insets = new Insets(10,0,0,0);
                panel.add(enrollmentId,gbc);

                gbc.gridx = 1;
                gbc.insets = new Insets(10,0,0,0);
                panel.add(enrollmentIdTf, gbc);

                gbc.gridy = 1;
                gbc.gridx = 0;
                gbc.insets = new Insets(10,0,0,0);
                panel.add(numberOfDaysPresent,gbc);

                gbc.gridx = 1;
                gbc.insets = new Insets(10,0,0,0);
                panel.add(numberOfDaysPresentTf,gbc);

                gbc.gridy = 2;
                gbc.gridx = 1;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                gbc.insets = new Insets(10,0,0,0);
                panel.add(calculateButton, gbc);

                gbc.gridy = 3;
                gbc.gridx = 1;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                gbc.insets = new Insets(10,0,0,0);
                panel.add(cancelButton, gbc);
                //calculate button functionality
                calculateButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //Usinf else to check condition
                        if (enrollmentIdTf.getText().equals("") || numberOfDaysPresentTf.getText().equals("")) {
                            JOptionPane.showMessageDialog(frame2, "Please fill the detail");
                        } else {
                            //using try catch to show popup if user input text in field of integer and double
                            try {
                                //Type conversion and provide appropriate data type
                                int enrollmentId = Integer.parseInt(enrollmentIdTf.getText());
                                double daysPresent = Integer.parseInt(numberOfDaysPresentTf.getText());


                                boolean regular = false;
                                //using for each loop
                                for (Student student : studentArrayList) {
                                     if (student instanceof Regular && student.getEnrollmentId() == enrollmentId) {
                                        Regular regularStudent = (Regular) student; //Downcasting regular class as regularstudent
                                        String grade = regularStudent.presentPercentage(daysPresent); //call the regular class present percentage method
                                        //Nested if
                                         if (!grade.isEmpty()) {
                                            JOptionPane.showMessageDialog(frame2, "Present Percentage: " + grade);
                                        } else {
                                            JOptionPane.showMessageDialog(frame2, "Invalid input");
                                        }
                                        regular = true;
                                        break;
                                    }
                                }
                                if (!regular) {
                                    JOptionPane.showMessageDialog(frame2, "Enrollment Id Doesn't Exists");
                                }
                            } catch (Exception e1) {
                                JOptionPane.showMessageDialog(frame2, "Please enter valid numbers.");
                            }

                        }
                    }
                });
                //cancel button functionality
                cancelButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame2.setVisible(false);
                    }
                });

                frame2.setVisible(true);
                frame2.add(panel);
                frame2.pack();
                frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });

        //grantCertificateButtton functionality
        grantCertificateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame3 = new JFrame("Grant Certificate");
                JPanel panel = new JPanel();
                GridBagLayout layout = new GridBagLayout();
                GridBagConstraints gbc = new GridBagConstraints();
                //construct label, textfield and set font
                JLabel enrollmentId = new JLabel("Enrollment Id: ");
                enrollmentId.setFont(new Font("Serif", Font.BOLD,15));
                JTextField enrollmentIdTf = new JTextField(20);
                //construct label, textfield and set font
                JLabel courseName = new JLabel("Course Name: ");
                courseName.setFont(new Font("Serif", Font.BOLD,15));
                JTextField courseNameTf = new JTextField(20);
                //create label and  set font of date of enrollment
                JLabel dateOfEnrollment = new JLabel("Date Of Enrollment: ");
                dateOfEnrollment.setFont(new Font("Serif", Font.BOLD,15));
                //create array of enrollment years, month and days
                String enrollmentYears[] = {"Select Year","2001","2002","2003","2004","2005","2006","2007",
                        "2008","2009","2010", "2011","2012","2013","2014","2015","2016","2017",
                        "2018","2019","2020","2021"," 2022","2023"};
                String enrollmentMonths[] = {"Select Month","January", "February", "March", "April", "May", "June", "July", "August",
                        "September", "October", "November", " December"};
                String enrollmentDays[] = {"Select Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12",
                        "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28",
                        "29", "30", "31"};
                //create conmbo box and passing enrollment years, months
                JComboBox enrollmentYearsComboBox = new JComboBox<>(enrollmentYears);
                JComboBox enrollmentMonthsComboBox = new JComboBox(enrollmentMonths);
                JComboBox enrollmentDaysComboBox = new JComboBox(enrollmentDays);
                //Create grant button
                JButton grantButton = new JButton("Grant Certificate");
                // cancel button
                JButton cancelButton = new JButton("Cancel");
                //set layout in panel
                panel.setLayout(layout);

                gbc.gridy = 0;
                gbc.gridx =0;
                gbc.insets = new Insets(10,0,0,0);
                panel.add(enrollmentId,gbc);

                gbc.gridx = 1;
                gbc.insets = new Insets(10,0,0,0);
                panel.add(enrollmentIdTf, gbc);

                gbc.gridy = 1;
                gbc.gridx = 0;
                gbc.insets = new Insets(10,0,0,0);
                panel.add(courseName,gbc);

                gbc.gridx = 1;
                gbc.insets = new Insets(10,0,0,0);
                panel.add(courseNameTf,gbc);

                gbc.gridy = 2;
                gbc.gridx = 0;
                gbc.insets = new Insets(10,0,0,0);
                panel.add(dateOfEnrollment, gbc);

                gbc.gridx = 1;
                gbc.insets = new Insets(10,-130,0,0);
                panel.add(enrollmentYearsComboBox, gbc);

                gbc.gridx = 2;
                panel.add(enrollmentMonthsComboBox, gbc);

                gbc.gridx = 3;
                gbc.insets = new Insets(10,0,0,0);
                panel.add(enrollmentDaysComboBox, gbc);

                gbc.gridy = 3;
                gbc.gridx = 1;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                gbc.insets = new Insets(10,0,0,0);
                panel.add(grantButton, gbc);

                gbc.gridy = 4;
                gbc.gridx = 1;
                gbc.insets = new Insets(10,0,0,0);
                gbc.fill = GridBagConstraints.HORIZONTAL;
                panel.add(cancelButton, gbc);

                //grantButtonn function
                grantButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (enrollmentIdTf.getText().equals("") || courseNameTf.getText().equals("") || enrollmentYearsComboBox.getSelectedIndex() == 0 ||
                                enrollmentMonthsComboBox.getSelectedIndex() == 0 || enrollmentDaysComboBox.getSelectedIndex() == 0) {
                            JOptionPane.showMessageDialog(frame3, "Invalid");
                        } else {
                            //using try catch to show popup if user input text in field of integer and double
                            try {
                                //Type conversion and provide appropriate datatype
                                int enrollmentId = Integer.parseInt(enrollmentIdTf.getText()); // try conversion
                                String courseName = courseNameTf.getText();
                                String dateOfEnrollment = enrollmentYearsComboBox.getSelectedItem() + "-" + enrollmentMonthsComboBox.getSelectedItem() + "-" + enrollmentDaysComboBox.getSelectedItem();

                                boolean scholarship = false;
                                //Using for each loop
                                for (Student student : studentArrayList) {
                                    if (student instanceof Regular && student.getEnrollmentId() == enrollmentId) {
                                        Regular regularStudent = (Regular) student; //Downcasting regular class as  regularStudent
                                        regularStudent.grantCertificate(courseName, enrollmentId, dateOfEnrollment); //Call the grantcertificate method of regular class
                                        //nested if
                                        if (regularStudent.getIsGrantedScholarship() == true) {
                                            JOptionPane.showMessageDialog(frame3, "Scholarship has been granted with certificate");
                                        } else {
                                            JOptionPane.showMessageDialog(frame3, "Scholarship is not granted but certificate is granted");
                                        }

                                        scholarship = true;
                                        break;
                                    }
                                }
                                if (!scholarship) {
                                    JOptionPane.showMessageDialog(frame3, "Enrollment ID not found.");

                                }
                            } catch (Exception e1) {
                                JOptionPane.showMessageDialog(frame3, "Invalid");
                            }
                        }
                    }
                });
                // cancel button functionality
                cancelButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //set frame3 visible false
                        frame3.setVisible(false);
                    }
                });

                frame3.setVisible(true);
                frame3.add(panel);
                frame3.pack();
                frame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);



            }
        });

        paybillsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame4 = new JFrame("Pay Bills");
                JPanel panel = new JPanel();
                GridBagLayout layout = new GridBagLayout();
                GridBagConstraints gbc = new GridBagConstraints();
                //construct label, textfield and set font
                JLabel enrollmentId = new JLabel("Enrollment Id: ");
                enrollmentId.setFont(new Font("Serif", Font.BOLD,15));
                JTextField enrollmentIdTf = new JTextField(20);

                JButton paysButton = new JButton("Pay Now");
                JButton cancelButton = new JButton("Cancel");

                panel.setLayout(layout);

                gbc.gridy = 0;
                gbc.gridx =0;
                gbc.insets = new Insets(10,0,0,0);
                panel.add(enrollmentId,gbc);

                gbc.gridx = 1;
                gbc.insets = new Insets(10,0,0,0);
                panel.add(enrollmentIdTf, gbc);

                gbc.gridy = 1;
                gbc.gridx = 1;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                gbc.insets = new Insets(10,0,0,0);
                panel.add(paysButton, gbc);

                gbc.gridy = 3;
                gbc.gridx = 1;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                gbc.insets = new Insets(10,0,0,0);
                panel.add(cancelButton, gbc);
                //pays button functionality
                paysButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //using if else to check condition
                        if (enrollmentIdTf.getText().equals("")){
                            JOptionPane.showMessageDialog(frame4, "Please enter id to check");
                        }else {
                           //using try catch to show popup if user input text in field of integer and double
                            try {
                                //Type conversion and provide appropriate datatype
                                int enrollmentId = Integer.parseInt(enrollmentIdTf.getText());

                                boolean billpay = false;
                                for (Student dropoutStudent : studentArrayList) {
                                    if (dropoutStudent instanceof Dropout && dropoutStudent.getEnrollmentId()==enrollmentId) {
                                        Dropout student = (Dropout) dropoutStudent; //Downcasting dropout class as dropout student
                                        ((Dropout) dropoutStudent).billsPayable(); //call dropout class billspayable method
                                        remainingAmountTf.setText(((Dropout) dropoutStudent).getRemainingAmount()+"");
                                        //Nested if
                                        if(((Dropout) dropoutStudent).getHasPaid()==true){
                                            JOptionPane.showMessageDialog(frame,"Bill has been paid");
                                        }
                                        else {
                                            JOptionPane.showMessageDialog(frame,"Bill has to paid");
                                        }
                                        billpay = true;
                                        break;
                                    }
                                }
                                if (!billpay) {
                                    JOptionPane.showMessageDialog(frame, "Given Enrollment ID not found.");
                                }

                            }catch (Exception e1){
                                JOptionPane.showMessageDialog(frame4, "Invalid");
                            }
                        }
                    }
                });
                //cancel button functionality
                cancelButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        frame4.setVisible(false);
                    }
                });

                frame4.setVisible(true);
                frame4.add(panel);
                frame4.pack();
                frame4.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
        //remove button functionality
        removeStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Create frame
                JFrame frame5 = new JFrame("Remove Student");
                //Create panel objcet
                JPanel panel = new JPanel();
                //create gridbaglayout object
                GridBagLayout layout = new GridBagLayout();
                //create gridbagconstraints object
                GridBagConstraints gbc = new GridBagConstraints();
                //construct label, textfield and set font
                JLabel enrollmentId = new JLabel("Enrollment Id: ");
                enrollmentId.setFont(new Font("Serif", Font.BOLD,15));
                JTextField enrollmentIdTf = new JTextField(20);
                //construct rmove button
                JButton removeButton = new JButton("Remove");
                //construct cancel button
                JButton cancelButton = new JButton("Cancel");
                //add layout in panel
                panel.setLayout(layout);
                //set grid x and y for arrangement and design
                gbc.gridy = 0;
                gbc.gridx =0;
                gbc.insets = new Insets(10,0,0,0);
                panel.add(enrollmentId,gbc);

                gbc.gridx = 1;
                gbc.insets = new Insets(10,0,0,0);
                panel.add(enrollmentIdTf, gbc);

                gbc.gridy = 1;
                gbc.gridx = 1;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                gbc.insets = new Insets(10,0,0,0);
                panel.add(removeButton, gbc);

                gbc.gridy = 3;
                gbc.gridx = 1;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                gbc.insets = new Insets(10,0,0,0);
                panel.add(cancelButton, gbc);
                //remove button functionality
                removeButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try{
                            //Type conversion and providing appropriate datatype
                            int enrollmentId = Integer.parseInt(enrollmentIdTf.getText());

                            boolean remove = false;
                            //for each loop
                            for (Student removeStudent : studentArrayList) {
                                if (removeStudent instanceof Dropout && removeStudent.getEnrollmentId() == enrollmentId) {
                                    Dropout dropout=(Dropout) removeStudent; //downcasting dropout as dropout
                                    dropout.removeStudent(); //call the method of remove student of dropout class
                                    //nested if
                                    if(dropout.getHasPaid()==false) {
                                        //Popup message
                                        JOptionPane.showMessageDialog(frame, "Dropout student with given Enrollment ID removed successfully!");
                                    }
                                    else{
                                        //Popup message
                                        JOptionPane.showMessageDialog(frame,"No need to remove");
                                    }
                                    remove = true;
                                    break;
                                }
                            }
                            if (!remove) {
                                //Popup message
                                JOptionPane.showMessageDialog(frame, "Dropout student with the given Enrollment ID not found.");
                            }
                        } catch (NumberFormatException ex) {
                            //Popup message
                            JOptionPane.showMessageDialog(frame, "Invalid input. Please enter valid numbers.");
                        }

                    }
                });

                //cancel button functionality
                cancelButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //set frame5 visibity to false
                        frame5.setVisible(false);
                    }
                });
                //add panel in frame5
                frame5.add(panel);
                //set visibilty to true
                frame5.setVisible(true);
                //set default close opertion to dispose on close
                frame5.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                //set pack in frame which will provide require frame size
                frame5.pack();


            }
        });
        //Displya button functionality
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Using for each loop
                for (Student student : studentArrayList) {
                    if (student instanceof Regular) {
                        JFrame frame8 = new JFrame("Regular Record"); //frame of regular student record
                        //Declear regular header array
                        String[] regularHeader = {"Enrollment ID", "Course Name", "Student Name", "Date Of Birth", "Date Of Enrollment", "Course Duration", "Tuition Fee",
                                "Number Of modules", "Number Of Credit Hours", "Days Present"};
                        //Create table model
                        DefaultTableModel model = new DefaultTableModel(regularHeader,0); //declaering table model and set header and row

                        Regular rStudent = (Regular) student; //Downcasting
                        int enrollmentId = (rStudent.getEnrollmentId());  //call get enrollment id method
                        String courseName = (rStudent.getCourseName()); //call get courseName method
                        String studentName = (rStudent.getStudentName());  //call get StudentName method
                        String dateOfBirth = (rStudent.getDateOfBirth()); //call get dateOfBirth method
                        String dateOfEnrollment = (rStudent.getDateOfEnrollment()); //call get dateOfEnrollment method
                        double courseDuration = (rStudent.getCourseDuration()); //call get courseDuration method
                        int tuitionFee = (rStudent.getTuitionFee()); //call get tuitionFee method
                        int numOfModules = (rStudent.getNumOfModules()); //call get numOfModules method
                        int numOfCreditHours = (rStudent.getNumOfCreditHours()); //call get numofCreditHours method
                        double daysPresent = (rStudent.getDaysPresent()); //call get daysPresent method

                        //Add row on model and store object
                        model.addRow(new Object[]{enrollmentId,courseName,studentName,dateOfBirth,dateOfEnrollment,courseDuration,tuitionFee,numOfModules,
                        numOfCreditHours,daysPresent});
                        //construct tabele and add table model
                        JTable regularTable = new JTable(model);
                        //Construct scrollpaner and add table
                        JScrollPane regularScroll = new JScrollPane(regularTable);
                        //add scrollpane in frame
                        frame8.add(regularScroll);
                        //default operation on dispose on close
                        frame8.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        //Set size
                        frame8.setSize(900, 300);
                        //Set visibity to true
                        frame8.setVisible(true);
                    }
                    if(student instanceof Dropout){
                        //Create frame
                        JFrame frame9 = new JFrame("Dropout Record");
                        //Store tabel header in arry
                        String[] dropoutHeader = {"Enrollment ID", "Course Name", "Student Name", "Date Of Birth", "Date Of Enrollment", "Course Duration", "Tuition Fee",
                                "Number Of Remaining Modules", "Number Of Months Attended", "Date Of Dropout", "Remaining Amount"};
                        //Construct table model
                        DefaultTableModel model = new DefaultTableModel(dropoutHeader,0);

                        Dropout dStudent = (Dropout) student; //oencasting dropout class as dStudent
                        int enrollmentId = (dStudent.getEnrollmentId()); //call get enrollment id method
                        String courseName = (dStudent.getCourseName()); //call get courseName method
                        String studentName = (dStudent.getStudentName()); //call get StudentName method
                        String dateOfBirth = (dStudent.getDateOfBirth()); //call get dateOfBirth method
                        String dateOfEnrollment = (dStudent.getDateOfEnrollment()); //call get dateOfEnrollment method
                        double courseDuration = (dStudent.getCourseDuration()); //call get courseDuration method
                        int tuitionFee = (dStudent.getTuitionFee()); //call get tuitionFee method
                        int numOfRemainingModules = (dStudent.getNumOfRemainingModules()); //call get numOfRemainingModules method
                        int numOfMonthsAttended = (dStudent.getNumOfMonthsAttended()); //call get numofMonthsAttend method
                        String dateOfDropout = (dStudent.getDateOfDropout()); //call get date of dropout method
                        int remainigAmount = (dStudent.getRemainingAmount()); //call get remainig amount method

                        //Add row on model and store object
                        model.addRow(new Object[]{enrollmentId,courseName,studentName,dateOfBirth,dateOfEnrollment,
                                courseDuration,tuitionFee, numOfRemainingModules, numOfMonthsAttended, dateOfDropout, remainigAmount});
                        //construct tabele and add table model
                        JTable regularTable = new JTable(model);
                        //Construct scrollpaner and add table
                        JScrollPane regularScroll = new JScrollPane(regularTable);
                        //add scrollpane in frame
                        frame9.add(regularScroll);
                        //default operation on dispose on close
                        frame9.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        //Set size
                        frame9.setSize(1000, 300);
                        //Set visibity to true
                        frame9.setVisible(true);

                    }
                }
            }
        });

//
        //Clear button functionality
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //set all textfield to empty string and combo box to index 0
                studentNameTf.setText("");
                birthYearsComboBox.setSelectedIndex(0);
                birthMonthsComboBox.setSelectedIndex(0);
                birthDaysComboBox.setSelectedIndex(0);
                enrollmentIdTf.setText("");
                courseNameTf.setText("");
                courseDurationTf.setText("");
                enrollmentYearsComboBox.setSelectedIndex(0);
                enrollmentMonthsComboBox.setSelectedIndex(0);
                enrollmentDaysComboBox.setSelectedIndex(0);
                tuitionFeeTf.setText("");
                numberOfModulesTf.setText("");
                numberOfCreditHoursTf.setText("");
                numberOfDaysPresentTf.setText("");
                numberOfRemainingModulesTf.setText("");
                numberOfMonthsAttendedTf.setText("");
                dropoutYearsComboBox.setSelectedIndex(0);
                dropoutMonthsComboBox.setSelectedIndex(0);
                dropoutDaysComboBox.setSelectedIndex(0);
                remainingAmountTf.setText("");
            }
        });

        //add panel in frame
        frame.add(panel);
        //set size of frame
        frame.setSize(1500,800);
        //set frame visibity true
        frame.setVisible(true);
        //set default operation dispose on close
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
    //Main method that call constructor
    public static void main(String[] args) {

        new StudentGui();

    }

}
