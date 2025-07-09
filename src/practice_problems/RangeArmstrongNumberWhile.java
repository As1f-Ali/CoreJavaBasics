package practice_problems;

import java.util.Scanner;

public class RangeArmstrongNumberWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Starting Range Number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the ending Range Number: ");
        int num2 = in.nextInt();
        while (num1 < num2) {
            int i = num1;
            int digits = 0;
            int armstrong = 0;
            while (i > 0) {
                i /= 10;
                digits++;
            }
            i = num1;
            while (i > 0) {
                armstrong += (int) Math.pow((i % 10), digits);
                i /= 10;
            }
            if (num1 == armstrong) System.out.println(num1 + " is a Armstrong Number.");
            num1++;
        }
    }
}
