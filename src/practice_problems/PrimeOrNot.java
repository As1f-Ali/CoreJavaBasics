package practice_problems;

import java.util.Scanner;


public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num1 = in.nextInt();
        boolean isPrime = true;
        if (num1 < 2) isPrime = false;
        else if (num1 > 2) if (num1%2==0) isPrime = false;
        for (int i = 3; i <= num1 / 2; i++) {
            if (num1 % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println(num1+" is a prime number.");
        else System.out.println(num1+" is not a prime number.");
    }
}
