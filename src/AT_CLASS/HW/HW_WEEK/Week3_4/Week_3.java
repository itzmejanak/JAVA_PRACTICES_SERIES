package AT_CLASS.HW.HW_WEEK.Week3_4;
import java.util.Scanner;

public class Week_3 {
    public static void main() {
        Scanner inpMood = new Scanner(System.in);
        System.out.println("Enter your mood");
        String mood = inpMood.nextLine();

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
