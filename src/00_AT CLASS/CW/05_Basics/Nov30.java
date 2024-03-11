import java.util.Scanner;

public class Nov30{

    public static void main(){
    Scanner input1 = new Scanner(System.in);
    p("1st condition");
    String one = input1.nextLine();
    Scanner input2 = new Scanner(System.in);
    p("second condition");
    String two = input2.nextLine();
    
    if (one.equals("rain") && two.equals("busy")){
        p("CoFFee");
    }else if (one.equals("rain") && two.equals("free")){
        p("POAKUDA");
    }else if ((one.equals("sunny") || one.equals("cloudy")) && two.equals("busy")){
        p("ice-cream");
    }else if((one.equals("sunny") || one.equals("cloudy")) && two.equals("free")){
    p("stay indoor");
    //}else if(one.equals("cold") || two.equals("mind")){
        //p("weather");
    //}else if (one.equals("busy") || two.equals("free")){
       // p("avialiable");
    }else{
        p("bye bye");
    }
    }
    
    public static void p(String txt){
 System.out.println(txt);
 }
 
}



