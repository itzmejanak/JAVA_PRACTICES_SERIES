package AT_CLASS.HW.HW_WEEK.Week17.Practices.Week16.Tutorial;

public class NepalRastraBank {
    public void printDetail(Bank bank) {
        bank.displayInterestRate();
        if (bank instanceof NICAsiaBank) {
            NICAsiaBank nicBank = (NICAsiaBank) bank;
            nicBank.enableNicAsiaMobileBanking();
        } else if (bank instanceof NabilBank) {
            NabilBank nabilBank = (NabilBank) bank;
            nabilBank.enableNabilSmsBanking();
        }
    }

    public static void main(String[] args) {
        NepalRastraBank nrBank = new NepalRastraBank();

        Bank bank = new Bank();
        bank.displayInterestRate();

        Bank nicBank = new NICAsiaBank();
        nrBank.printDetail(nicBank);

        Bank nabilBank = new NabilBank();
        nrBank.printDetail(nabilBank);
    }
}