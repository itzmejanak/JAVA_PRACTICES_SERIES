
/**
 * Write a description of class GrandPA here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GrandPA
{
    private String name;
    private int height;
    private int age;
    
    public GrandPA(String name, int age){
    this.name = name;
    this.age = age;
    }
    
    public GrandPA(String name, int height, int age){
    this.name = name;
    this.age = age;
    this.height = height;
    }
    
    public void setName(String name){
    this.name = name;
    }
    
    public String getName(){
    return name;
    }
    
    public void setAge(int age){
    this.age = age;
    }
    
    public int getAge(){
    return age;
    }

    public void setHeight(int height){
    this.height = height;
    }
    
    public int getHeight(){
    return height;
    }
  
    public void walk(){
    System.out.println("the man named : "+name+" age is: " + age+" is walking");
    }
    
    public void talk(){
    System.out.println("the named man: "+name+" whose age is: " + age+" was talking");
    }
    
   // public static void main(String [] args){
    //GrandPA info1  = new GrandPA("DADA", 78);
    //info1.walk();
    //GrandPA info2  = new GrandPA("DADA", 5,  98 );
    //info2.talk();
  //  }
}