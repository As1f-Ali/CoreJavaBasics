package practice_problems;

import java.util.Scanner;

public class ArmstrongNumberWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = in.nextInt();
        int i = num;
        int digits = 0;
        int armstrong = 0;
        while (i>0){
            i /=10;
            digits++;
        }
        System.out.println(digits);
        i = num;
        while (i>0){
            armstrong += (int) Math.pow((i%10),digits);
            i /= 10;
        }
        if (num<0) System.out.println(num+" Not a Valid Input!");
        else if (num == armstrong) System.out.println(num+" is a Armstrong Number.");
        else System.out.printf(num+" is not a Armstrong Number.");
    }
}
