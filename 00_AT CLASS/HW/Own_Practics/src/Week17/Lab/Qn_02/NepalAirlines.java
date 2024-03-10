package src.Week17.Lab.Qn_02;

public class NepalAirlines implements Airlines{

    private int totalAvailableSeats = 100;
    @Override
    public int getTotalAvailableSeats() {
        return totalAvailableSeats;
    }

    @Override
    public void printName() {
        System.out.println("Welcome to nepal Airlines");
    }

    @Override
    public boolean book(String name, String passportNo) {
        if(totalAvailableSeats > 0){
            totalAvailableSeats--;
            System.out.println("Booking confirmed for " + name + " with passport number " + passportNo);
            return true;
        }else {
            System.out.println("Sorry, no available seats.");
            return false;
        }
    }
}
