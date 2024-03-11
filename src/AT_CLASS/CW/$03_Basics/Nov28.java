package AT_CLASS.CW.$03_Basics;
import java.util.Scanner;
public class Nov28
{
  public static void main(){
        Scanner condition = new Scanner(System.in);
        System.out.println("Enter your situation");
        String mood = condition.nextLine();
        
        if (mood.equals("rainy")){
        System.out.println("THERE IS rain outside stay at home");
        }
        else if (mood.equals( "sunny")){
        System.out.println("PLEASE USE SUNCREAM WHEN YOU WENT TO OUTSIDE");
        }
        else if (mood.equals("snowy")){
        System.out.println("PLEASE USE jacket and warm clothes WHEN YOU WENT TO OUTSIDE");
        }
        else if (mood.equals("cold")){
        System.out.println("burn fire and stay at home");
        }
        else if (mood.equals("windy")){
        System.out.println("LOCK THE DOOR OF YOUR HOUSE");
        }
        else{
            System.out.println("i dont know");
        }
    }

}
