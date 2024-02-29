import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1 = subtractionDigit1();
        int number2 = subtractionDigit2();
        subtractionFinal(number1, number2);
    }

    public static int subtractionDigit1() {
        Scanner inp_dig1 = new Scanner(System.in);
        System.out.print("Enter the first digit: ");
        return inp_dig1.nextInt();
    }

    public static int subtractionDigit2() {
        Scanner inp_dig2 = new Scanner(System.in);
        System.out.print("Enter the second digit: ");
        return inp_dig2.nextInt();
    }

    public static void subtractionFinal(int number1, int number2) {
        int result = number1 - number2;
        System.out.println("Subtraction: " + result);
    }
}



// public class Teacherway {
    
    // public static void main (String[] args){
        // // Datatype identifier; Declare garney
        // // identifier = value; Initialize garney
        // // Datatype identifier = value; Declare and Initialize variables
        
        // Scanner scanner = new Scanner(System.in);
        
        // System.out.println("Please enter a number");
        // int num1 = scanner.nextInt();
              
        // System.out.println("Please enter 2nd number");
        // int num2 = scanner.nextInt();
        
        // System.out.println("User ley deko No"+num1);
        
        // System.out.println("Hard code");
         // addition(10, 20);
         
         
           // System.out.println("User Input");
         // addition(num1, num2);
         
         
        // scanner.close();
        
    // }
    
    // public static void addition(int number1, int number2){
        
        // System.out.println(number1+" add "+number2+" = "+(number1+number2));
    // }
// }
