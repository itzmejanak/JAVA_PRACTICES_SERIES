import java.util.Scanner;
 
public class Snov28
{
    public static void main(){
    Scanner input = new Scanner(System.in);
   System.out.println("HOW WAY YOUR DAY");
   System.out.println("1.SUNNY \n 2.WINDY \n 3.RAINY \n 4.COLD \n 5.SNOWY");
   int weather = input.nextInt();
   switch(weather)
   {
    case (1):
        System.out.println("ITS A SUNNY DAY");
        break;
        case (2):
        System.out.println("ITS A WINDY DAY");
        break;
        case (3):
        System.out.println("ITS A RAINY DAY");
        break;
        case (4):
        System.out.println("ITS A COLD DAY");
        break;
        case (5):
        System.out.println("ITS A SNOWY DAY");
        break;
        default:
        System.out.println("hiello");
    }
   
   
}
}
