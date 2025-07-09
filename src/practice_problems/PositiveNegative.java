package practice_problems;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number : ");
        double num1 = in.nextDouble();
        if (num1>0) System.out.println(num1+" is a positive number."); else if (num1==0) System.out.println(num1+" is a zero.");else System.out.println(num1+" is a negative number.");
    }
}
