
/**
 * Write a description of class Dogs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dogs
{
    int eye; 
    int legs;
    String fattness;
    
    
   public Dogs(int e, int l, String f){
   eye = e;
   legs = l;
   fattness = f;
    }
    
    public static void main(String [] args){
    Dogs jacky =  new Dogs(1 , 4, "to fat");
    jacky.eat();
    }
    
    public void eat(){
    System.out.println("i am eating dogg food do not distrub me");
    }
}
