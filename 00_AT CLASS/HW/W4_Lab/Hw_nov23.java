import java.util.Scanner;

public class Hw_nov23 {
    public static void main() {
        Scanner inp_mood = new Scanner(System.in);
        System.out.println("Enter your mood");
        String mood = inp_mood.nextLine();

        if (mood.equals("upset")) {
            System.out.println("I want to have a cup of tea with cigarette");
        } else if (mood.equals("happy")) {
            System.out.println("I want to go to the restaurant for momo");
        } else if (mood.equals("angry")) {
            System.out.println("I want to go to the restaurant for panipuri");
        } else if (mood.equals("sad")) {
            System.out.println("I want to go to the restaurant for panipuri");
        } else {
            System.out.println("I am very hungry, I will make breakfast");
        }
    }
}
