package AT_CLASS.HW.HW_WEEK.Week17.Practices.Week17.Tutorial;

public abstract class FirstYearCourse {
    public abstract void printName();
    public abstract void printCode();
    public void printTotalWeeks(){
        int days = 365;
        int weeks = 7;
        System.out.println("The number of total weeks are: "+ days / weeks);
    }
}
