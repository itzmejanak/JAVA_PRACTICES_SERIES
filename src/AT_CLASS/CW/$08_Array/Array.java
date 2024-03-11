package AT_CLASS.CW.$08_Array;
public class Array
{
    public static void eutaMethod(){
        String[] students = new String[5];
        
        students[0] = "Mandip";
        
        students[4] = "Aayush";
        
        for(int i = 0; i < 5; i++){
            System.out.println(students[i]);
        }
        
        
        String[] studentList = {"Mamata", "Sujima", "Rebina", "Bibash", "Randip"};
           for(String student: studentList){
            System.out.println(student);
        }
        
    }
}