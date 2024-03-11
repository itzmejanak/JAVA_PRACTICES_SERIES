package AT_CLASS.CW.$07_OPP.Own_Practics;
import java.util.Scanner;
public class Bank{
    int pwd;
    int accountBal = 0;
    public Bank(int pwd, int accountBal){
    this.pwd = pwd;
    this.accountBal = accountBal;
    }
    
    public void myBalance(){
    System.out.println("Your balance is:"+ accountBal);
    }
    
    public void checkPwd(){
    if(pwd == 143){
    this.myBalance();
    }else{
    System.out.println("Wrong password");
    }
    }
    
    public static void main(String[] args){
    Scanner inp = new Scanner(System.in);
    System.out.println("What is your pass");
    int pass = inp.nextInt();

    System.out.println("What is acc balance");
    int Balance = inp.nextInt();
    Bank cos1 = new Bank(pass, Balance);
    
    cos1.checkPwd();
    }
    
    
}