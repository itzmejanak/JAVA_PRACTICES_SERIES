package AT_CLASS.CW.$07_OPP.OPP_Basics.$01_Concepts;
import java.util.Scanner;
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StatClass
{
  
   String brand;
   String model;
   static int Year;
   
   public StatClass(String b, String m, int y){
    this.brand = b;
    this.model = m;
    this.Year = y;  
    }
    
    //action
    public void info(){
    System.out.println("Brand: " + brand +"\n"+ "Model: "+ model + "\n"+"Manufactor Year: " + Year);                     //"title: " + title +"\n"+ "Author: "+ author + "\n"+"publication Year: "+pubicationYear
    System.out.println("\n");
    }
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.println("What is the car barand");
    String brand = input.nextLine();
    
    System.out.println("What is the car model");
    String model = input.nextLine();
    
    System.out.println("What is the car Year");
    int Year = input.nextInt();
    
    NwwCar car1 = new NwwCar(brand, model, Year);
    
    car1.info();
    }
}