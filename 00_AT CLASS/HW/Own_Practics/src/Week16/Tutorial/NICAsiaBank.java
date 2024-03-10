package src.Week16.Tutorial;

public class NICAsiaBank extends Bank {
    int interestRate = 10;

    @Override
    public void displayInterestRate() {
        System.out.println("NIC Asia Bank interest rate is: " + interestRate);
    }

    public void enableNicAsiaMobileBanking() {
        System.out.println("Mobile banking has been enabled for NIC Asia Bank");
    }
}