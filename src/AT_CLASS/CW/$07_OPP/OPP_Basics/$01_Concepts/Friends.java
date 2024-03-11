package AT_CLASS.CW.$07_OPP.OPP_Basics.$01_Concepts;
/**
 * Write a description of class Friends here.
 *
 * @author (janak devkota)
 * @version (19/12/2023)
 */
public class Friends
{
   String name;
   int age;
   
   public Friends(String n, int a){
    this.name = n;
    this.age = a;
    
    }
    
    //action
    public void onCreate(){
    System.out.println(name + " Greeting whose age is:"+ age);
    }
    public static void main(String[] args){
    Friends a = new Friends("parbesh", 20);
    Friends b = new Friends("rehaan", 44);
    a.onCreate();
    b.onCreate();
    }
}
