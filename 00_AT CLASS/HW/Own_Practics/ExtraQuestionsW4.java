import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 * week 4
 *
 * @author (Janak Devkota)
 * @version (ExtraQuestions) */
public class ExtraQuestionsW4
{
    Scanner input = new Scanner(System.in);
    public static void main(String[] args){
    p("Week 4 onward question (EXTRA QUESTIONS)");
    }
    
    public static void swap(){
    int a = 15;
    int b = 20;
    int temp;
    
    temp = a;
    a = b;
    b = temp;
    p("the value of a is: "+a+" and b is:"+b);
    }
    
    public static void multipication(){
    int total = 50;
    int inc = 1;
    for(int i = 5; i <=total; i+=5){
    p("5 x "+ inc++ +" = " +i);
    }
    }
    
    public static void square(){
    int inc = 1;
    for(int input = 1; input<=20; input++){
    int power  = (int)Math.pow(input, 2);
    p("the square of: "+ inc++ +" = "+ power +" , ");
    }
    }
    
    public static void descending(){
    int start = 5;
    int max = 500;
    for(int i = max; i >=start; i-= 2){
    p(i + ", ");
    }
    }
    
    public static void checkWeekends(){
    Scanner input = new Scanner(System.in);
    p("Type here your day number");
    int num = input.nextInt();
    if(num > 0 && num <=  7){
    if(num >= 2){
    p("Weekdays");
    }else{
    p("Enjoy");
    }
    }else{
    p("error: out of range");
    }
    }
    
    public static void respectiveDay(){
    Scanner input = new Scanner(System.in);
    p("what is your day num");
    int dayNum = input.nextInt();
    String day;
    switch(dayNum){
    case 0: p("Sunday");
    break;
    case 1: p("Monday");
    break;
    case 2: p("Tueday");
    break;
    case 3: p("Wenesday");
    break;
    case 4: p("Thruday");
    break;
    case 5: p("Friday");
    break;
    default: p("Saturday");
    break;
    }
    
    }
    
    public static void Fibonacci(){
    int max = 10;
    int start = 1;
    int temp = 0;
    while(start <= max){
    temp+= start;
    start++;
    System.out.print(temp + ",😁?");
    }
    }
    
    public static void temperature(){
    int input = Integer.parseInt(JOptionPane.showInputDialog("What id your temperature"));
    if(input <= 135){
        if(input <= 33){
        JOptionPane.showMessageDialog(null, "Freezing");
        }else if (input >= 34 && input <= 50){
        JOptionPane.showMessageDialog(null, "Cold");
        }else if (input >= 51 && input <= 70){
        JOptionPane.showMessageDialog(null, "Moderate");
        }else if (input >= 71 && input <= 90){
        JOptionPane.showMessageDialog(null, "Warm");
        }else{
        JOptionPane.showMessageDialog(null, "Hot");                                               
        }
    }else{
        JOptionPane.showMessageDialog(null, "error: Out of range");                                            
    }
    }
    
    public static void p(String txt){
    System.out.println(txt);
    }
}
