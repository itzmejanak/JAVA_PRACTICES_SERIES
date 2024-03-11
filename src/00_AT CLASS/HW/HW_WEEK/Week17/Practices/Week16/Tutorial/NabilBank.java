package src.Week16.Tutorial;

public class NabilBank extends Bank {
    int interestRate = 10;

    @Override
    public void displayInterestRate() {
        System.out.println("Nabil Bank interest rate is: " + interestRate);
    }

    public void enableNabilSmsBanking() {
        System.out.println("SMS banking has been enabled for Nabil Bank");
    }
}