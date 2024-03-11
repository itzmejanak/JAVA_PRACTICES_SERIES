package AT_CLASS.CW.$07_OPP.OPP_Basics.$01_Concepts;
/**
 * OPPS in java //kkhunxa //kkgarcha 
 *
 * @author (janak devkota)
 * @version (12/12/2023)
 */
public class Opps   //declaring the variables   step 1
{
    int eye;
    String eyeClr;
    String hairclr;
    int noOfHands;
    
    
    //creating the blueprint of declared variable    step 2
    public Opps(int e, String ec, String hc, int noh){ 
    eye = e;
    eyeClr = ec;
    hairclr = hc;
    noOfHands = noh;
    }
    
    
    //giving the action to the created object
    public void pass(){
    System.out.println("he has this "+ eye+ "this "+ eyeClr);
    }
                                                                           //step 4
    public void fail(){
    System.out.println("he has this "+ eye+ "this "+ eyeClr);
    }
    
    
    //creating the object with specs
    public static void main(String[] args){          //step 3
        Opps prabesh = new Opps(2, "black", "black", 2);
        Opps rihan = new Opps(2, "white", "white", 2);
        
        prabesh.pass();      //calling here
        rihan.fail();
    }
    
    
}
