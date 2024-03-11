package AT_CLASS.CW.$08_Array;
/**
 * Write a description of class FirstArrysL here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FirstArrysL
{
    public static void main(String [] args){
    String[] students = new String[5];
    students[0] = "janak";
    students[4] = "janak";
    students[3] = "janakBoy"; // its give an error because the lenghn/index of array is 4
     //to give values for single time
     //String[] students = {"", "", "", ""};
    for(int i = 0; i< 5; i++ ){
    System.out.println(students[i]);
    }
    
    //enhanched forLoop which is foreach loop
    for(String studentss: students){
        System.out.println(studentss);
    }
    }
    
    public static void newArray() {
    String[] students = {"jan", "ak", "pb", "rj", "rt"};
    
     for(String studenty: students){
        System.out.println(studenty);
        }
}

}
