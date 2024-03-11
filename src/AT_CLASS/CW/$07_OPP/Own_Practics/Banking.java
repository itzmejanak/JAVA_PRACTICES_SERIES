package AT_CLASS.CW.$07_OPP.Own_Practics;
import javax.swing.JOptionPane;
/**
 * Write a description of class Banking here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Banking
{
    private int accountBalance = 5000;
    private int pwd;
    
    public void deposit(){
    if(pwd == 5060){
     int amountToDeposit = Integer.parseInt(JOptionPane.showInputDialog("how much you want Money to deposit"));
     accountBalance += amountToDeposit;
     JOptionPane.showMessageDialog(null, "Money Deposeted");
     JOptionPane.showMessageDialog(null, "Your Balance is: "+ accountBalance);
    }else{
    JOptionPane.showMessageDialog(null, "wrong password");
    }
    }
    
    public void witdraw(){
    if(pwd == 5060){
     int amountToWitdraw = Integer.parseInt(JOptionPane.showInputDialog("how much you want Money to deposit"));
     accountBalance -= amountToWitdraw;
     JOptionPane.showMessageDialog(null, "Succesfully withdraw");
     JOptionPane.showMessageDialog(null, "Your Balance is: "+ amountToWitdraw);
    }else{
    JOptionPane.showMessageDialog(null, "wrong password");
    }
    }
    
    public static void main(String[] args){
    int pwd = Integer.parseInt(JOptionPane.showInputDialog("what is your password"));
    Banking  one = new Banking();
    one.pwd = pwd;
    int cases = Integer.parseInt(JOptionPane.showInputDialog("what you want to do"));
    if(cases == 1){
    JOptionPane.showMessageDialog(null, "Well!: you want to Deposit");
    one.deposit();
    }else if(cases == 2){
    JOptionPane.showMessageDialog(null, "Well!: you want to Witdraw");
    one.witdraw();
    }
    }
}
