package AT_CLASS.CW.$07_OPP.OPP_Basics.$01_Concepts;
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
  
   String brand;
   String model;
   int Year;
   
   public Car(String b, String m, int y){
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
    Car car1 = new Car("BMW", "GM:4374(pro)", 1999);
    Car car2 = new Car("Merceties", "MF:30vd23", 1970);
    Car car3 = new Car("Tesla", "Tesla: GD:87654", 1970);
    car1.info();
    car2.info();
    car3.info();
    }
}