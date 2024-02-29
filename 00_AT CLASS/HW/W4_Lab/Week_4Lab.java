import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 * Week 4 – Lab
 *
 * @author (Janak Devkota)
 * @version (13/12/2023)
 */
public class Week_4Lab
{
    public static void main(){
    //rectangle();
    primeCheck();
    }
   
    //1. WAP to calculate the area of rectangle
    static void  rectangle(){
    double b = Double.parseDouble(JOptionPane.showInputDialog("Type here: Length"));
    double h = Double.parseDouble(JOptionPane.showInputDialog("Type here: Height"));
    JOptionPane.showMessageDialog(null, "Area of Rectangle: "+ b*h);
    }
    
    
    //1. WAP to calculate the area of square.
    static void  square(){
    Scanner input = new Scanner(System.in);
    p("Number taht you want to make square ? ");
    double square = input.nextDouble();
    double madesqr = Math.pow(square, 2);
    p("your square num is: " + madesqr);
    }
    
    
    //1. WAP to calculate the area of circle.
    static void  circle(){
    double pie = 3.141592653589793238462643383279502884197;
    Scanner input = new Scanner(System.in);
    p("Enter the radius: ? ");
    double r = input.nextDouble();
    p("Area of circle is: " + pie * r);
    }
    
    
    //2. WAP to calculate the sum of two numbers.
    static void  sum(){
    Scanner input = new Scanner(System.in);
    p("Enter the Number ? ");
    double inp1 = input.nextDouble();
    p("Enter the Second Number ? ");
    double inp2 = input.nextDouble();
    p("Sum of two Dig is: " + (inp1+inp2));
    }
    
    
    
    //3. WAP to which calculates the electricity bill amount as per the below condition
    static void  electricityBill(){
    Scanner input = new Scanner(System.in);
    p("Enter the Unit that you consume ? ");
    double unit = input.nextDouble();
    double bill1 = 0.50 * Math.min(50, unit);
    double bill2 = 0.80 * Math.min(100, Math.max(0, unit - 50));
    double bill3 = 1.30 * Math.min(100, Math.max(0, unit - 150));
    double bill4 = 1.70 * Math.max(0, unit - 250);
    
    double totalBill = bill1 + bill2 + bill3 + bill4;
    double surcharge = 0.20 * totalBill;
    double finalBill = totalBill + surcharge;
    p("Total bill amount is: " + finalBill);
    }
    
    
    //4. WAP to determine whether a triangle is equilateral, scalene, or isosceles triangle
    static void  triangleEquality(){
    Scanner input = new Scanner(System.in);
    p("Enter the 'A' side of trangle ? ");
    double a = input.nextDouble();
    
    p("Enter the 'B' side of trangle ? ");
    double b = input.nextDouble();
    
    p("Enter the 'C' side of trangle ? ");
    double c = input.nextDouble();
    if(a == b && b == c ){
    p("All sides are equal, so it's an equilateral triangle");
    }else if(a != b && b != c && a != c ){
    p("All sides are different, so it's a scalene triangle");
    }else {
    p("At least two sides are equal, so it's an isosceles triangle");
    }
    }
    
    
    //5. Write a Java program that uses a while loop to print the first 10 positive odd integers
    static void  oddNum(){
    for(int i = 1; i<=10; i++){
    p("Odd numbers are:" + i);
    i = i + 1;
    }
    }
    
    
    //6. Write a Java program that uses an if-elseif statement to determine if a student's grade
    static void  gradeDetermine (){
    Scanner input = new Scanner(System.in);
    p("Enter your score? ");
    int score = input.nextInt();
    
    if(score <= 40){
    p("Your grade is F && score is: " + score);
    }else if(score >= 41 && score <= 50){
    p("Your grade is D && score is: " + score);
    }else if(score >= 51 && score <= 60){
    p("Your grade is C && score is: " + score);
    }else if(score >= 61 && score <= 80){
    p("Your grade is B && score is: " + score);
    }else if(score >= 81 && score <= 100){
    p("Your grade is A && score is: " + score);
    }else if(score == 0 || score > 100){
    p("error message: Your number must be Valid");
    }
    else {
    p("Keep studing");
    }
    }
    
    //7. WAP that uses an if-else statement to determine if a number is even or odd for first 10 numbers.
     static void  determineEvenOdd(){
    Scanner input = new Scanner(System.in);
    p("Enter your Number ? ");
    int number = input.nextInt();
    
    if(number <= 10){
    if(number % 2 == 0){
    p("The number you have enter is even");
    }else if(number % 2 == 1){
    p("The number you have enter is odd");
    }
    }else{
    p("Out of range");
    }
    }
    
    
    //8. WAP to print all the even numbers of first 20 numbers.
    static void  evenNum(){
    for(int i = 0; i<=20; i+= 2){
        
    if(i == 0){
    continue;
    }
    p("Even numbers are:" + i);
    }
    }
    
    //9. Write a Java program that uses a while loop to calculate the sum of all positive integers less than or equal to 100.
    static void  integers(){
    int sum = 0;
    int maxNum = 100;
    int changing = 1;
    while(changing <= maxNum){
    sum += changing;
    changing++;
    }
    p("sum upto 100 is: " + sum);
    }
    
    
    //10. Write a Java program that uses an if statement to determine if a year is a leap
    static void  leapYear(){
    Scanner input = new Scanner(System.in);
    p("Enter the Date ");
    int year = input.nextInt();
    
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
    p("The year is a leap year");
    }else {
    p("The year " + year+"_AD is not a leap year");
    }
    }
    
    
    
// 11. WAP using an if-else statement to determine if a number is prime or not.
static void primeCheck() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();

    boolean isPrime = true;

    if (number <= 1) {
        isPrime = false;
    } else {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
    }

    if (isPrime) {
        System.out.println("It is a prime number");
    } else {
        System.out.println("It is not a prime number");
    }
    }

    
    //12. Write a Java program that uses a for loop to print all the odd numbers between 1
    //and 20. Use a continue statement to skip the even numbers.
    static void  printOdd(){
    for(int i = 1; i<=20; i++){
        
    if(i % 2 == 0){
    continue;
    }
    p("odd numbers are:" + i);
    }
    }
    
    
    //13. Write a Java program that uses a while loop to print the Fibonacci sequence up
    //to the first 10 terms.
    static void  Fibonacci(){
    int n = 10;
    int firstTerm = 1;
    int secondTerm = 1;
    
    int count = 0;
    while(count < n){
    System.out.print(firstTerm + ", ");
    
    int nextTerm = firstTerm + secondTerm;
    firstTerm = secondTerm;
    secondTerm = nextTerm;
    
    count++;
    }
    }
    
    
    //13. Write a Java program that uses a while loop to print the Fibonacci sequence up
    //to the first 10 terms.
    static void fnb(){
    int n = 10; 
    int a = 1, b = 1;

    for (int i = 0; i < n; i++) {
        
    System.out.print(a + ", ");
    int nextTerm = a + b;
    a = b;
    b = nextTerm;
        }
    }
    
    // Extra Question
        // a. Write a Java program that uses a while loop to prompt the user to enter numbers
        //between 1 and 10. If the user enters a number greater than 10, use a break
        //statement to exit the loop. Print the sum of all the valid numbers entered by the
         //user.
    static void  validNum(){
    Scanner input = new Scanner(System.in);
    int number;
    int sum = 0;
    while(true){
    p("Enter the Number ");
    number = input.nextInt();
    
    if(number > 10){
    p("Out of range");
    break;
    }
    if(number >= 1&& number <= 10){
    sum += number;
    }else{
    p("enter less than 10");
    }
    p("Sum of valid numbers entered: " + sum);
    }
    p("Total Sum of valid numbers entered: " + sum);
    }
    
    
    static void  p(String txt){
    System.out.println(txt);
    }
    
}
