package AT_CLASS.CW.$07_OPP.Own_Practics;
import java.util.Scanner;
/**
 * Overview of my code
 * Methods are (CheckBalance, WithDraw, Deposit);
 * Variables should be (balance, pwd);
 * @author (Janak Devkota)
 * @version (21/01/2024)
 */
public class BankingSystem
{
    private int Balance = 3000;
    private  int pwd;
    
    
    public void CheckBalance(){
    Scanner input =  new Scanner(System.in);
    System.out.println("Enter your password");
    pwd = input.nextInt();
    if(pwd == 5060){
        System.out.println("Your balance is: "+ Balance);
    }
    }
    
    public void WithDraw(){
    Scanner input1 =  new Scanner(System.in);
    System.out.println("Enter your password");
    pwd = input1.nextInt();
    
    if(pwd == 5060){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the amount that you want to withdraw");
    int amt = input.nextInt();
    
    if(amt >= 3000){
        System.out.println("You do not have enough balance");
    }else{
        System.out.println("you have successfully withdraw Rs: "+ amt);
        Balance -= amt;
        System.out.println("your new balance is: " +Balance);
    }
    }
}

    public void Deposit(){
    Scanner input1 =  new Scanner(System.in);
    System.out.println("Enter your password");
    pwd = input1.nextInt();
    
    if(pwd == 5060){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the amount that you want to Deposit");
    int amtD = input.nextInt();
    
    if(amtD >= 100000){
        System.out.println("You do not have Permission to diposit this much balance");
    }else{
        System.out.println("you have successfully Deposit Rs: "+ amtD);
        Balance += amtD;
        System.out.println("your new balance is: " +Balance);
    }
    }
    }
    
    public static void main(String[] args){
    BankingSystem Banking = new BankingSystem();
    //if(pwd == 5060){
    Scanner input = new Scanner(System.in);
    System.out.println("1.Check Balance \n 2.Deposit \n 3.Withdraw");
    int nbr = input.nextInt();
    
    if(nbr == 1){
    Banking.CheckBalance();
    }else if (nbr == 3){
    Banking.WithDraw();
    }else if (nbr == 2){
    Banking.Deposit();
    }
    //}
}
}


//BY GPT

/*
import java.util.Scanner;

public class BankingSystem {
    private int balance = 3000;
    private int password;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int newBalance) {
        this.balance = newBalance;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int newPassword) {
        this.password = newPassword;
    }

    public void checkBalance() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter your password");
            setPassword(input.nextInt());

            if (getPassword() == 5060) {
                System.out.println("Your balance is: " + getBalance());
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }

    // Similar modifications for Withdraw() and Deposit() methods...

    public static void main(String[] args) {
        BankingSystem banking = new BankingSystem();

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("1.Check Balance \n2.Deposit \n3.Withdraw");
            int nbr = input.nextInt();

            if (nbr == 1) {
                banking.checkBalance();
            } else if (nbr == 3) {
                banking.withdraw();
            } else if (nbr == 2) {
                banking.deposit();
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }
}

*/
