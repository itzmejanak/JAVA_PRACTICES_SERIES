import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;
public class Java_part2
{
    public static void main(String[] args){
      Random input = new Random();
      Scanner scanner = new Scanner(System.in);  
      System.out.println("02_java.txt");
      
}

static void mathzRem(){
    // GENERATING FORMULA TO CALCULATE USER INPUT ?
        // CI = P( 1 + r/n)nt - P. 
        
        double p = Double.parseDouble(JOptionPane.showInputDialog("Principle"));
        double t = Double.parseDouble(JOptionPane.showInputDialog("Time"));
        double r = Double.parseDouble(JOptionPane.showInputDialog("Rate"));

        double first = (1 + r/100);
        double second = Math.pow(first, t);
        double third = second - 1;
        
        double CI = p * second; 
        JOptionPane.showMessageDialog(null, "Compound interest is: "+ CI);
}




static void Randomz(){
   Random input = new Random();
   // int myNum = input.nextInt(10)*3;   it will print same number into loop so
   //System.out.println(myNum);           // here i print only one random number
     
    //Trying to get less and equal to 5 random number
   
   for( int i =1; i<=5; i++){
    int myNum = input.nextInt(10)*3;
    System.out.println(myNum);
    }
    System.out.println("DONE");
}





static void STATEMENTz(){
   int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age"));
   if(age < 18){
    JOptionPane.showMessageDialog(null, "Your under 18");
    }else if(age >= 18 && age <= 30){
    JOptionPane.showMessageDialog(null, "You are adult");
    }else if(age >= 30 && age <= 50){
    JOptionPane.showMessageDialog(null, "You are belly man");
    }else{
     JOptionPane.showMessageDialog(null, "You have no more time");
    }
}


static void Switchz(){                      
    int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age"));
   switch (age){
     case 12: JOptionPane.showMessageDialog(null, "Your under 15");
     break;
     case 23: JOptionPane.showMessageDialog(null, "Your under 25");
     break;
     case 36: JOptionPane.showMessageDialog(null, "Your under 40");
     break;
     case 49: JOptionPane.showMessageDialog(null, "Your under 50");
     break;
     default: JOptionPane.showMessageDialog(null, "Age not in specified ranges\n   you have only this option\n 12 23 36 49");
     break;
    }
 }



static void LOGICAL_OPERATORS() {
    int temp = Integer.parseInt(JOptionPane.showInputDialog("Enter the temperature:"));

    if ((temp >= 18 && temp <= 35) || (temp > 35 && temp <= 45)) {
     JOptionPane.showMessageDialog(null, "Your temperature is within the acceptable range.");
    } else if (!(temp >= 18 && temp <= 35) && !(temp > 35 && temp <= 45)) {
     JOptionPane.showMessageDialog(null, "Your temperature is outside the specified ranges.");
    } else {
     JOptionPane.showMessageDialog(null, "You have no more time to stay.");
    }
}



static void while_lps() {
        String name = JOptionPane.showInputDialog("what is your name");
        while(name.isBlank()){
        JOptionPane.showMessageDialog(null, "please enter your name");
        name = JOptionPane.showInputDialog("what is your name");
        }
        JOptionPane.showMessageDialog(null, "hello :"+ name);
}




static void patten() {
    
     // for ractangle
   for(int i = 1; i<=3; i++){
       for(int j = 1; j<=6; j++){
        System.out.print("⭐ ");
        }
    System.out.println();
    }
    System.out.println("\n");
    
    
    // for trangle
    for(int i = 1; i<=5; i++){
       for(int j = 1; j<=i; j++){
        System.out.print("⭐ ");
        }
    System.out.println();
    }
    System.out.println("\n");
    
    
     //for opposite trangle
    for(int i = 5; i >= 1; --i) {  //For Loop for Row 
      for(int j = 1; j <= i; ++j) { //For Loop for Col
        System.out.print("⭐ "); //Prints *
        }
     System.out.println(); //Get to newline
        }
    System.out.println("\n");
    
    //for full trangle
   for(int i = 1; i<=4; i++){
       for(int j = 1; j<=i; j++){
        System.out.print("⭐ ");
        }
    System.out.println();
    }
    for(int i = 5; i >= 1; --i) {  //For Loop for Row 
      for(int j = 1; j <= i; ++j) { //For Loop for Col
        System.out.print("⭐ "); //Prints *
        }
     System.out.println(); //Get to newline
        }
    System.out.println("\n");
}



static void Arraysz() {
    
                                // Array
   String[] cars = {"camaro","lambo","buatni","alpha"};
   
   
   //tto print the special index
   System.out.println(cars[0]);
    
   //to print the whole array
   for(int i = 0; i<cars.length; i++){ 
    System.out.println(cars[i]);
    }
    
    
    //ADDITIONAL WAY TO CREATE ARRAYS :-
    String[] carz = new String[4];             //declare how much string we need into this array = 3
    carz[0] = "camaro";
    carz[1] = "lambo";
    carz[2] = "buatni";
    carz[3] = "alpha";
    
    for(int i = 0; i<carz.length; i++){ 
    System.out.println(carz[i]);
    }
    
    
    
}

static void twoDArrays() {
    
     String[][] car = new String[3][3];    //declare how much string we need into this array = 3

      car[0][0] = "camaro";
      car[0][1] = "butani";                //assign the value of an arrys here
      car[0][2] = "lambo";
      car[1][0] = "tesla";
      car[1][1] = "mustang";
      car[1][2] = "ranger";
      car[2][0] = "farai";
      car[2][1] = "silverado";
      car[2][2] = "F-150";



//print  :----

for (int i = 0; i<car.length; i++){
  System.out.println();
       for (int j = 0; j<car[i].length; j++){
       System.out.print(car[i][j]);
    }

}
    
    
}
}