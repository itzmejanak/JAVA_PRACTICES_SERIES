package src.Week16.Lab;

import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        Runner runner = new Runner();

        // Creating MyCafe object
        MyCafe myCafe = new MyCafe();
        runner.handleBilling(myCafe);

        // Creating MyRestro object
        MyRestro myRestro = new MyRestro();
        runner.handleBilling(myRestro);
    }

    void handleBilling(BillingSystem billingSystem) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Subtotal: $");
        double subtotal = scanner.nextDouble();
        billingSystem.calculateTotal(subtotal);

        if (billingSystem instanceof MyRestro) {
            MyRestro restro = (MyRestro) billingSystem;
            restro.displayFoodItems();
        } else if (billingSystem instanceof MyCafe) {
            MyCafe cafe = (MyCafe) billingSystem;
            cafe.displayCoffeeItems();
        }
    }
}
