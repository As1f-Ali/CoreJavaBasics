package practice_problems;

import java.util.Scanner;

public class ReverseStringMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse using StringBuilder
        String reversed = new StringBuilder(input).reverse().toString();

        System.out.println("Reversed string: " + reversed);
    }
}
