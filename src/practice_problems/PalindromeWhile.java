package practice_problems;

import java.util.Scanner;

public class PalindromeWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Palindrome Number: ");
        int num = in.nextInt();
        int i = num;
        int palindrom = 0;
        while (i>0){
            palindrom *=10;
            palindrom += (i%10);
            i = i/10;
        }
        if (num == palindrom) System.out.println(palindrom+" is a Palindrome Number.");
        else System.out.printf(palindrom+" in not a Palindrome Number");
    }
}
