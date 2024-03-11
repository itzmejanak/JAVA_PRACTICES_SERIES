package AT_CLASS.CW.$06_Basics;
import java.util.Scanner;

/**
 * Write a description of class Addition here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int a = input.nextInt();

        System.out.println("Enter the second number:");
        int b = input.nextInt();

        Addition sum = new Addition(a, b);
        sum.calculateSum();
    }

    private int firstDigit;
    private int secondDigit;

    public Addition(int firstDigit, int secondDigit) {
        this.firstDigit = firstDigit;
        this.secondDigit = secondDigit;
    }

    public void calculateSum() {
        int result = firstDigit + secondDigit;
        System.out.println("Sum is: " + result);
    }
}
