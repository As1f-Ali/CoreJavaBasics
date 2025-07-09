package practice_problems;

import java.util.Scanner;

public class StudentData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String studentName = input.nextLine();
        System.out.print("Enter Your Roll Number: ");
        int studentRollNumber = input.nextInt();
        System.out.print("Enter Your Age: ");
        byte studentAge = input.nextByte();
        System.out.print("Enter Your CGPA: ");
        double studentCgpa = input.nextDouble();
        System.out.print("Enter Your Grade: ");
        char studentGrade = input.next().charAt(0);
        System.out.print("Enter Your Yearly Fee: ");
        int studentYearlyFee = input.nextInt();
        System.out.println();

        System.out.println("Student Details: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll Number: " + studentRollNumber);
        System.out.println("Age: " + studentAge);
        System.out.println("CGPA: " + studentCgpa);
        System.out.println("Grade: " + studentGrade);
        System.out.println("Fee: " + studentYearlyFee);
    }
}
