package practice_problems;

import java.util.Scanner;

public class CountDigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take full number input
        System.out.print("Enter a number: ");
        String number = scanner.nextLine();  // Read as string to handle digits easily

        // Take single digit to search
        System.out.print("Enter a single digit to count: ");
        char digit = scanner.next().charAt(0);

        // Validate if input is a digit
        if (!Character.isDigit(digit)) {
            System.out.println("Invalid input. Please enter a single digit (0-9).");
            return;
        }

        // Count frequency
        int count = 0;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                count++;
            }
        }

        System.out.println("Digit '" + digit + "' appears " + count + " time(s) in the number " + number + ".");
    }
}
