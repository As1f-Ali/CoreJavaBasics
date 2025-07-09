package practice_problems;

import java.util.Scanner;

public class RangePalindromeWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Starting Range Number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the Ending Range Number: ");
        int num2 = in.nextInt();
        while (num2>=num1){
            int i = num1;
            int palindrom = 0;
            while (i>0) {
                palindrom *= 10;
                palindrom += (i % 10);
                i = i / 10;
            }
            if (num1== palindrom) System.out.println(palindrom+" is a Palindrome Number.");
            num1++;
        }
    }
}
