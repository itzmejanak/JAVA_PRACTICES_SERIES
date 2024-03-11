package AT_CLASS.CW.$07_OPP.OPP_Basics.$01_Concepts;
/**
 * Write a description of class Add here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Add
{
    int a;
    int b; 
    double x;
    double y;
    public Add(int aa, int bb){
    this.a = aa;
    this.b  = bb; 
    }
    
    public Add(double xx, double yy){
    this.x = xx;
    this.y = yy;
    }
    
    public void addOne(){
    System.out.println("the sum of 2 intiger is:"+ (a + b));
    }
    
    public void addnext(){
    System.out.println("the sum of 2 double is:"+ (x + y));
    }
    
    public static void main(String[] args){
    Add first = new Add(4,7);
    first.addOne();
    
    Add second = new Add(6.5,9.3);
    second.addnext();
    
    }
}
