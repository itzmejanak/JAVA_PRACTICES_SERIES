package AT_CLASS.HW.Course_Works.CourseWork_1;

public class Teacher {
    // Attributes
    private int teacherId;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private int workingHours;

    // Constructor
    public Teacher(int teacherId, String teacherName, String address, String workingType, String employmentStatus) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.address = address;
        this.workingType = workingType;
        this.employmentStatus = employmentStatus;
    }

    // Getter methods
    public int getTeacherId() {
        return teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getAddress() {
        return address;
    }

    public String getWorkingType() {
        return workingType;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    // Setter methods
    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setWorkingType(String workingType) {
        this.workingType = workingType;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    // Display method
    public void display() {
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Teacher Name: " + teacherName);
        System.out.println("Address: " + address);
        System.out.println("Working Type: " + workingType);
        System.out.println("Employment Status: " + employmentStatus);
        if (workingHours > 0) {
            System.out.println("Working Hours: " + workingHours);
        } else {
            System.out.println("Working Hours have not been assigned yet.");
        }
    }
}
