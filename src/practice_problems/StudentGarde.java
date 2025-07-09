package practice_problems;

import java.util.Scanner;

public class StudentGarde {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Marks: ");
        int num = input.nextInt();
        if (num > 100) System.out.println("Marks can't be greater tha 100!");
        else if (num >= 90) System.out.println("Grade: A");
        else if (num >= 70) System.out.println("Grade: B");
        else if (num >= 60) System.out.println("Grade: C");
        else if (num >= 40) System.out.println("Grade: D");
        else System.out.println("Fail!");
    }
}
