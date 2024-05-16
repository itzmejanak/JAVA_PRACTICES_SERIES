package Coursework_1;

public class Dropout extends Student{
    //Declare instanace variables
    private int numOfRemainingModules;
    private int numOfMonthsAttended;
    private String dateOfDropout;
    private int remainingAmount;
    private boolean hasPaid;

    //Parameterize constructor with 10 parameters
    public Dropout(int enrollmentId,
                   String courseName,
                   String dateOfEnrollment, String dateOfBirth, String studentName, double courseDuration, int tuitionFee,
                   int numOfRemainingModules, int numOfMonthsAttended, String dateOfDropout){
        super(dateOfBirth, studentName, courseDuration, tuitionFee); //Calling the super class constructor
        super.setEnrollmentId(enrollmentId); //Calling the setter method of super class
        super.setDateOfEnrollment(dateOfEnrollment); //Calling the setter method of super class
        super.setCourseName(courseName); //Calling the setter method of super class
        this.numOfRemainingModules = numOfRemainingModules;
        this.numOfMonthsAttended = numOfMonthsAttended;
        this.dateOfDropout = dateOfDropout;
        this.remainingAmount = 0;
        this.hasPaid = false; //Assigning the value of hasPaid to false
    }

    //Getter Method that returns the value 
    public int getNumOfRemainingModules(){
        return numOfRemainingModules; //allows to access an numOfModules of given dropout class
    }

    public int getNumOfMonthsAttended(){
        return numOfMonthsAttended;  //allows to access an numOfMonthsAttended of given dropout class
    }

    public String getDateOfDropout(){
        return dateOfDropout;  //allows to access an dateOfDropout of given dropout class
    }

    public int getRemainingAmount(){
        return remainingAmount;  //allows to access an remainingAmount of given dropout class
    }

    public boolean getHasPaid(){
        return hasPaid;  //allows to access an hasPaid of given dropout class
    }

    //BillsPayable method us to diplay remainingamounts
    public void billsPayable(){
        remainingAmount = (int)((super.getCourseDuration() - numOfMonthsAttended) * getTuitionFee());
        //Using if else condition to check the codition of remainingAmount
        if(remainingAmount<=0){
            hasPaid = true;
        }
        else{
            hasPaid=false;
        }
    }

    //RemoveStudent method use to remove student if the hasPaid value is true
    public void removeStudent(){
        if(hasPaid == true){
            setDateOfBirth("");
            setCourseName("");
            setStudentName(""); 
            setDateOfEnrollment("");
            setCourseDuration(0);
            setTuitionFee(0);
            setEnrollmentId(0);
            this.numOfRemainingModules = 0;
            this.numOfMonthsAttended = 0;
            this.dateOfDropout ="";
            this.remainingAmount=0;
        }
        else{
            System.out.println("All bills not cleared");
        }
    }

    //Display method use to display the details of dropout class
    public void display(){
        super.display(); //Calling the display method of super class
        System.out.println("Number of Remaining Modules: " +numOfRemainingModules);
        System.out.println("Number of Months attended: " +numOfMonthsAttended);
        System.out.println("Date of Dropout: " +dateOfDropout);
        System.out.println("Remainig Amount: " +remainingAmount);
    }
}