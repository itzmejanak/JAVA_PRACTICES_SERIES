package Coursework_1;

public class Regular extends Student{
    //Declera instance variable
    private int numOfModules;
    private int numOfCreditHours;
    private double daysPresent;
    private boolean isGrantedScholarship;

    //Constructor that accepts 10 parameters
    public Regular(int enrollmentId, String dateOfBirth, String courseName, String studentName,
                   String dateOfEnrollment, double courseDuration,
                   int tuitionFee, int numOfModules, double daysPresent){
        super(dateOfBirth, studentName, courseDuration, tuitionFee); //Calling the parent constructor method
        super.setCourseName(courseName); //Calling the setter method of parent classs
        super.setEnrollmentId(enrollmentId); //Calling the setter method of parent classs
        super.setDateOfEnrollment(dateOfEnrollment); //Calling the setter method of parent classs
        this.numOfModules = numOfModules;
        this.numOfCreditHours = numOfCreditHours;
        this.daysPresent =  daysPresent;
        this.isGrantedScholarship = false; //Assigning the false value to the isGrantedScholarship variable
    }

    //Getter method
    public int getNumOfModules(){
        return numOfModules; //allows to access an numOfModules of given regular class
    }

    public int getNumOfCreditHours(){
        return numOfCreditHours; //allows to access an numOfCreditHours of given regular class
    }

    public double getDaysPresent(){
        return daysPresent; //allows to access an daysPresent of given regular class
    }

    public boolean getIsGrantedScholarship(){
        return isGrantedScholarship; //allows to access an isGrantedScholarship of given regular class
    }

    //Method to calculate present percentage
    public String presentPercentage(double daysPresent){
        double presentPercentage = daysPresent/(super.getCourseDuration()* 30)*100;
        String attendanceGrade = "";
        isGrantedScholarship = false;
        //Using if else condition to check attendanceGrade and isGrantedScholarship
        if(super.getCourseDuration()*30 < daysPresent){
            attendanceGrade = "";
            System.out.println("No of days present is greater than course duration");
        }
        else if(presentPercentage>=80){
            attendanceGrade = "A";
            isGrantedScholarship = true;
        }
        else if(presentPercentage>=60){
            attendanceGrade = "B";
        }
        else if(presentPercentage>=40){
            attendanceGrade ="C";
        }
        else if(presentPercentage>=20){
            attendanceGrade = "D";
        }
        else if (presentPercentage >= 0){
            attendanceGrade = "E";
        }
        else{
            System.out.println("Invalid input");
            attendanceGrade = "";
        }
        return attendanceGrade;
    }

    //Method to grant certificate
    public void grantCertificate(String courseName, int enrollmentID, String dateOfEnrollment){
        System.out.println(getStudentName() +  "has graduated from" +getCourseName()+ "with enrollmentid" +enrollmentID+ "date of enrollment was" +dateOfEnrollment);
        //Using if else condition to check is scholarship granted or not
        if(isGrantedScholarship == true){
            System.out.println("The scholarship has been granted");
        }
    }

    //Method to display details of regular
    public void display(){
        super.display(); //Calling the display method of parent class
        System.out.println("Number Of Modules: " +this.numOfModules);
        System.out.println("Number Of Credit Hours: " +this.numOfCreditHours);
        System.out.println("Days Present: " +this.daysPresent);
    }
}