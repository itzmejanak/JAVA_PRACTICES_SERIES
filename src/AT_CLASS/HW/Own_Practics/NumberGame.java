package AT_CLASS.HW.Own_Practics;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    Random random = new Random();
    int randomNumber = random.nextInt(100) + 1;

    public static void main(String[] args) {
        NumberGame nbr = new NumberGame();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number here: ");
        int guessedNumber = scanner.nextInt();

        while (true) {
            if (guessedNumber > nbr.randomNumber) {
                System.out.println("Your number is too high");
            } else if (guessedNumber < nbr.randomNumber) {
                System.out.println("Your number is too low");
            } else {
                System.out.println("Congratulations! You guessed the number!");
                break; // Exit the loop if the number is guessed correctly
            }
            // Ask for input again if the number is not guessed correctly
            System.out.println("Please enter your number here: ");
            guessedNumber = scanner.nextInt();
        }
        scanner.close();
    }
}
