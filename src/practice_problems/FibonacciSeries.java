package practice_problems;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = in.nextInt();
        System.out.print("Enter the Position of a Number: ");
        int pos = in.nextInt();
        System.out.print("Fibonacci Series is: ");
        int num1 = 0;
        int num2 = 1;
        int num3;
        System.out.print(num1+" ");
        System.out.print(num2+" ");
        for(int i = 1; i <=num-2; i++){
            num3 = num1+num2;
            System.out.print(num3+" ");
            num1 = num2;
            num2 = num3;
        }
        num1 = 0;
        num2 = 1;
        num3 = 0;
        System.out.println();
        for(int i = 1; i <=pos-2; i++) {
            num3 = num1+num2;
            num1 = num2;
            num2 = num3;
        }
        System.out.println("Element at position "+pos+" is "+num3+".");
    }
}
