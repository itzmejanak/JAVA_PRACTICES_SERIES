package Coursework_1;

public class Student{
    //Declare Instance variables 
    private int enrollmentId;
    private String dateOfBirth;
    private String courseName;
    private String studentName;
    private String dateOfEnrollment;
    private double courseDuration;
    private int tuitionFee;

    //Constructor with four parameters
    public Student(String dateOfBirth, String studentName, double courseDuration, int tuitionFee){
        this.dateOfBirth = dateOfBirth;
        this.studentName = studentName;
        this.courseDuration = courseDuration;
        this.tuitionFee = tuitionFee;
        this.courseName= "" ; //empty string of courseName attributes
        this.dateOfEnrollment=""; //empty string of dateOfEnrollment attributes
        this.enrollmentId = 0; //initializing enrollmentID to 0.
    }

    //Getter Method
    public int getEnrollmentId() {
        return enrollmentId; //allows to access an EnrollmentID of given student class 
    } 

    public String getDateOfBirth() {
        return dateOfBirth; //allows to access an DateOfBirth of given student class
    }

    public String getCourseName(){
        return courseName; //allows to access an CourseName of given student class
    }

    public String getStudentName(){
        return studentName; //allows to access an StudentName of given student class
    }

    public String getDateOfEnrollment(){
        return dateOfEnrollment; //allows to access an dateOfEnrollment of given student class
    }

    public double getCourseDuration(){
        return courseDuration; //allows to access an CourseDuration of given student class
    }

    public int getTuitionFee(){
        return tuitionFee; //allows to access an TuitionFee of given student class
    }

    //setter Method
    public void setCourseName(String newCourseName){
        this.courseName = newCourseName; //allows to set or mutate the value of an CourseName in a student class.
    }

    public void setEnrollmentId(int newEnrollmentId){
        this.enrollmentId = newEnrollmentId; //allows to set or mutate the value of an EnrollmentID in a student class.
    }

    public void setDateOfEnrollment(String newDateOfEnrollment){
        this.dateOfEnrollment = newDateOfEnrollment; //allows to set or mutate the value of an DateofEnrollment in a student class.
    }

    public void setDateOfBirth(String newDateOfBirth){
        this.dateOfBirth = newDateOfBirth; //allows to set or mutate the value of an DateOfBirth in a student class.
    }

    public void setStudentName(String newStudentName){
        this.studentName = newStudentName; //allows to set or mutate the value of an StudentName in a student class.
    }

    public void setCourseDuration(double newCourseDuration){
        this.courseDuration = newCourseDuration; //allows to set or mutate the value of an CourseDuration in a student class.
    }

    public void setTuitionFee(int newTuitionFee){
        this.tuitionFee = newTuitionFee; //allows to set or mutate the value of an TuitionFee in a student class.
    }

    //Method to dispaly the details of students
    public void display(){
        //using if else condition and  printing suitable message if the parameters have not been set
        if(enrollmentId==0 || courseName==("") || dateOfEnrollment==("") || studentName==("") || dateOfBirth==("") || courseDuration==0 || tuitionFee==0){
            System.out.println("No Data Found");
        }else{
            System.out.println("Enrollment ID: " +enrollmentId);
            System.out.println("Course Name: " +courseName);
            System.out.println("Date Of Enrollment: " +dateOfEnrollment);
            System.out.println("Student Name: " +studentName);
            System.out.println("Date Of Birth: " +dateOfBirth);
            System.out.println("Course Duration: " +courseDuration);
            System.out.println("Tuition Fee: " +tuitionFee);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "enrollmentId=" + enrollmentId +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", courseName='" + courseName + '\'' +
                ", studentName='" + studentName + '\'' +
                ", dateOfEnrollment='" + dateOfEnrollment + '\'' +
                ", courseDuration=" + courseDuration +
                ", tuitionFee=" + tuitionFee +
                '}';
    }
}

