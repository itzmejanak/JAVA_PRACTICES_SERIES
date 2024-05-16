package AT_CLASS.CW.$10_GUI;

import java.util.Arrays;

import java.util.Arrays;

public class Debug {
    public static void main(String[] args) {
        // Input string
        String expression = "6 + 5 - 1 * 3 / 3";

        // Split the string based on mathematical operators
        String[] tokens = expression.split(" ");

        // Convert tokens to an array of integers
        int[] numbers = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            numbers[i] = Integer.parseInt(tokens[i]);
        }

        // Print the array of integers
        System.out.println(Arrays.toString(numbers));
    }
}

