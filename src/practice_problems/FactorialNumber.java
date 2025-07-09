package practice_problems;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number to Find  the Factorial: ");
        int num = input.nextInt();

        if (num == 0){
            System.out.println("Factorial is 1.");
        } else if (num > 0) {
            for (int i = num - 1; i > 0; i--) {
                num *= i;
            }
            System.out.println("Factorial is: " + num + ".");
        }else {
            System.out.println("Factorial of " + num + " is not defined!");
        }


    }




}
