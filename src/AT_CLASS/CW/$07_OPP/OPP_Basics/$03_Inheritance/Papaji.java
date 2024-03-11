package AT_CLASS.CW.$07_OPP.OPP_Basics.$03_Inheritance;
public class Papaji extends GrandPA {
   public Papaji(String name, int age){
    super(name, age);
    }
    public Papaji(String name, int height, int age){
    super(name,height,age);
    }
    
    //@override
    public void walk(String name){
    //super.walk(name);
    System.out.println("father is walking"); 
    }
    
    public static void main(String [] args){
    Papaji info1  = new Papaji("DADA", 78);
    info1.walk();
    Papaji info2  = new Papaji("DADA", 5,  98 );
    info2.talk();
    }
}