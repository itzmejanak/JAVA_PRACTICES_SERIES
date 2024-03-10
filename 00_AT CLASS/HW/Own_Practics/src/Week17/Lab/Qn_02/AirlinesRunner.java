package src.Week17.Lab.Qn_02;

public class AirlinesRunner {
    public static void main(String[] args) {
        AirlinesRunner runAllAirlines = new AirlinesRunner();
        runAllAirlines.runAirLines(new NepalAirlines());
        runAllAirlines.runAirLines(new BuddhAirlines());

    }
    public void runAirLines(Airlines airline){
        airline.printName();
        System.out.println("Total available seats: " + airline.getTotalAvailableSeats());
        airline.book("John Doe", "AB12345");
        System.out.println("Now the Total available seats: " + airline.getTotalAvailableSeats());
        System.out.println();
    }
}
