package AT_CLASS.HW.Own_Practics;

import java.util.Scanner;

public class V_or_Cons {
    public static void main(String[] args) {
        char[] vowelsArray = {'a', 'e', 'i', 'o', 'u'};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your character: ");
        String input = scanner.next(); // Read a string
        char character = input.charAt(0);

        boolean isVowel = false;
        for (char vowel : vowelsArray) {
            if (vowel == character) {
                isVowel = true;
                break;
            }
        }

        if (isVowel) {
            System.out.println("Your character is a vowel.");
        } else {
            System.out.println("Your character is a consonant.");
        }
    }
}
