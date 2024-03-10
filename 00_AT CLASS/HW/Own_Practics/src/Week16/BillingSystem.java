package src;
import java.util.Scanner;

//Week 16 Lab
//1. Create a class BillingSystem (Super Class) with the following
public class BillingSystem {
    Scanner scanner = new Scanner(System.in);

    public int getDiscount(){
        return 10;
    }

    public void calculateTotal(){
        System.out.print("Enter the subtotal: ");
        int subtotal = scanner.nextInt();

        int discount = getDiscount();
        int total = subtotal - (discount  * subtotal/ 100);
        System.out.println("The Discounted amount is: "+ total);

    }

//    public static void main(String[] args) {
//        BillingSystem result = new BillingSystem();
//        result.calculateTotal();
//    }
}
