package practice_problems;

import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = in.nextInt();
        int fact = 1;
        int i = 2;
        while (i<=num){
            fact *= i;
            i++;
        }
        if (num == 0 || num == 1) System.out.println("Factorial of "+num+" is "+fact+".");
        else if (num>0) System.out.println("Factorial of "+num+" is "+fact+".");
        else System.out.println(num+" Not a Valid Input!");
    }
}
