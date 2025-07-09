package practice_problems;

import java.util.Scanner;

public class SumNaturalNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num = in.nextInt();
        int sum = 0;

        for (int i = 0; i <= num; i++) {
            sum += i;
        }

        System.out.println("Sum of all Natural Numbers till " + num + " is: " + sum + ".");
    }
}
