package practice_problems;

import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Starting Number : ");
        int num1 = in.nextInt();
        System.out.print("Enter Ending Number : ");
        int num2 = in.nextInt();
        int i;
        for (i = num1; i<=num2; i++ ) {
            if (i % 2 == 0) System.out.println(i + " is a even number.");
            else System.out.println(i + " is a odd number.");
        }
    }
}