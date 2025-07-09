package practice_problems;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number : ");
        double num1 = in.nextDouble();
        if (num1%2==0){
            System.out.println(num1+" is a even number.");
        } else
            System.out.println(num1+" is a odd number.");
    }
}
