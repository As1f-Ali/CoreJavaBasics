package practice_problems;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        double num1 = in.nextDouble();
        System.out.print("Enter Second NUmber : ");
        double num2 = in.nextDouble();
        System.out.println();
        System.out.println("Choose One From The Given Blow :\n\n1 For Addition.\n2 For Subtraction.\n3 For Division.\n4 For Multiplication.\n5 For Modulus.\n6 For Exit.");

        int choice;
        do {
            System.out.print("Enter Your Choice : ");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Addition : "+num1+" + "+num2+" = " + (num1 + num2));
                    break;

                case 2:
                    System.out.println("Subtraction : "+num1+" - "+num2+" = " + (num1 - num2));
                    break;

                case 3:
                    System.out.println("Division : "+num1+" | "+num2+" = " + (num1 / num2));
                    break;

                case 4:
                    System.out.println("Multiplication : "+num1+" x "+num2+" = " + (num1 * num2));
                    break;

                case 5:
                    System.out.println("Modulus : "+num1+" % "+num2+" = " + (num1 % num2));
                    break;

                case 6:
                    System.out.println("Exited!");
                    break;

                default:
                    System.out.println("Invalid Input!");
                    break;
            }

        } while (choice != 6);
    }
}
