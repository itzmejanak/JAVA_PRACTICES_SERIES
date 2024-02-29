import java.util.Scanner;
import javax.swing.JOptionPane;
public class Java_part1
{
    public static void main(String[] args){
      Apps();
      EXPRESSIONz();
      System.out.println("01_java.txt");
      
}

static void printMe(){
                              //comment one by one checkit
    System.out.println("print vs println and alternative of println = \n ");
    
    //print
    System.out.print("print my first sentence");
    System.out.print("print my second sentence");
    
    //println
    System.out.println("print my first sentence");
    System.out.println("print my second sentence");               
    
    // (\n)
    //print
    System.out.print("print my first sentence\n");
    System.out.print("print my second sentence");
    
    //also we can use botn println and \n for magic means we can generate empty space by this
    System.out.println("print my first sentence\n");
    System.out.println("print my second sentence");
    
    //we can also use the empty space at the first of our string by \t
    System.out.println("\tprint my first sentence");
    System.out.println("\tprint my second sentence"); 

    //if we need to display 
    //back \ in the string we can use double back \\ between the double qoutes ("\\HELLO");
    System.out.println("\\print my first sentence");
    System.out.println("\\tprint my second sentence");
    
    //escape the double quotes insite the string and show the use of 
    //double quotes into result ("\"I LOVE YOU \""):-
    System.out.println("\"I LOVE YOU\"");
    System.out.println("\"I LOVE YOU TOO\"");

}




static void variablesz(){
   //(note: references data types start with capital letter)
   //(note: primitives data types start with small letter)
   
   //variable declaration and assignment eg:-
   int a;   //declaration
   a = 15;   //assignment
   
   //OR direct initialization;
   int b = 15;
   
   
   //when we declare the long and float data types the value also contains somethins with digit at last as (L)
   
   long c = 1234567L;
   float d = 1234567F;
   //(note in other data types we dont need this all)
   
   //Char only contains only one letter eg :-
   char e = 'A';
}





static void swapping(){                           
   int x = 17;
   int y = 25;
   int temp;
   
   temp = x;  //x is empty now
   x = y;     // empty x is aasign as y value
   y= temp;    // y is empty and assign the temp value into y
   System.out.println(x);
   System.out.println(y);
}


static void takingInput(){                      
    //HOW WE CAN ACCEPT USER INPUT USING JAVA ?
    //import java.util.Scanner;
    Scanner scanner = new Scanner(System.in);  //input table generating
    System.out.println("what is the value of xNum?");  //showing the query to user
    int xNum = scanner.nextInt();  //displaying result
    scanner.nextLine();
    
    //we can also dispaly result into attractive form
    System.out.println("Your xNum is :" + xNum);
    
    //problems
    System.out.println("what is your name?");
    String name = scanner.nextLine();
    
    System.out.println("what is your age?");
    int age = scanner.nextInt();
    scanner.nextLine();
    
    System.out.println("what is your favroute food?");
    String food = scanner.nextLine();
 }



static void EXPRESSIONz(){
    //HOW THE EXPRESSION WORKS IN JAVA ?
    int friends = 10;
    
    //int friend1 = friends / 3;               fix this
    double friend1 = (double)friends / 3;
    int friend2 = friends * 3;
    int friend3 = friends -  3;
    int friend4 = friends + 3;
    //int friend1 = friends % 3;               fix this
    double friend5 = (double)friends % 3;
    
    System.out.println(friend1);
    System.out.println(friend2);
    System.out.println(friend3);
    System.out.println(friend4);
    System.out.println(friend5);
}


static void Apps() {
        // Creating input dialog
        String namez = JOptionPane.showInputDialog("What is your name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age"));
        double height = Double.parseDouble(JOptionPane.showInputDialog("What is your height"));

        // Creating message dialog
        JOptionPane.showMessageDialog(null, "Hello handsome boy: " + namez);
        JOptionPane.showMessageDialog(null, "Hello handsome boy your age is : " + age);
        JOptionPane.showMessageDialog(null, "Hello handsome boy your height is: " + height);
        
        //problems for int double long float:-  just do this   Wrapper.parseWrapper(..JOptionrem...)
        return;
    }




static void mathz() {
    // HOW TO USE MATH CLASS OF JAVA?
    int u = 15;
    double v = 15.345;

    double ab = Math.min(u, v);
    System.out.println(ab);
    
    double ah = Math.max(u, v);
    System.out.println(ah);
    
    int ac = Math.abs(u);
    System.out.println(ac);

    double ad = Math.sqrt(u);
    System.out.println(ad);

    double ae = (long)Math.round(v);
    System.out.println(ae);

    double af = (long)Math.ceil(v);
    System.out.println(af);

    double ag = (long)Math.floor(v);
    System.out.println(ag);
    
    double ai = Math.pow(v, u);
    System.out.println(ai);
}

}