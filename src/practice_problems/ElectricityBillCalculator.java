package practice_problems;

import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Units: ");
        int num = input.nextInt();
        int amount;

        if (num >=300) {
            amount = 100 * 6 + 50 * 7 + 50 * 10 + 100 * 15 + (num - 300) * 20;
            System.out.println(amount);
        }
        else if (num >= 200) {
            amount = 100 * 6 + 50 * 7 + 50 * 10  + (num - 200) * 15;
            System.out.println(amount);
        }
        else if (num >= 150)  {
            amount = 100 * 6 + 50 * 7 + (num - 150) * 10;
            System.out.println(amount);
        }
        else if (num >= 100)  {
            amount = 100 * 6 + (num - 100) * 7;
            System.out.println(amount);
        }
        else if (num >=1){
            amount = num * 6;
            System.out.println(amount);
        } else System.out.println("Enter the Correct Units!");
    }
}
