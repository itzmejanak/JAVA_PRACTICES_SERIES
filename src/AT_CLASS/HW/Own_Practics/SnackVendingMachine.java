package AT_CLASS.HW.Own_Practics;

import java.util.Scanner;

public class SnackVendingMachine {
    Scanner scanner = new Scanner(System.in);
    public void showSnacks(){
        System.out.println("\n1. Chips\n2. Chocolate\n3. Soda");
        System.out.println("Choose one option from here: ");
        int snack = scanner.nextInt();
        this.displayMessage(snack);
    }

    public void displayMessage(int snack){
        if(snack == 1){
            System.out.println("Enjoy your Chips!");
        } else if (snack == 2) {
            System.out.println("Indulge in the Chocolate goodness!");
        } else if (snack == 3) {
            System.out.println("Refreshing Soda coming right up!");
        }else {
            System.out.println("Invalid input ! ");
        }
    }

    public int checkMoney(){
        System.out.println("Enter the amount that you have: ");
        return scanner.nextInt();
    }


    public void runCode(){
        int money = this.checkMoney();
        if (money > 1){
            this.showSnacks();
        }else {
            System.out.println("You don't have enough money to buy snacks.");
        }
    }

    public static void main(String[] args) {
        SnackVendingMachine svm = new SnackVendingMachine();
        svm.runCode();
    }

}
