
/**
 * Write a description of class Students here.
 *
 * @author (your name)                                                             //access modifier
 * @version (a version number or a date)
 */
public class Students
{
    String name; 
    int srction;
    
    public void walk(){
    System.out.println(name + "is walking");
    }
    
    public void eat(){
    System.out.println(name + "is eating");
    }
   
    
    public static void main(String [] args){
    Students students1 = new Students();
    students1.name = "Bibash";
    students1.walk();
    
    Students students2 = new Students();
    students2.name = "janak";
    students2.walk();
    }
}
