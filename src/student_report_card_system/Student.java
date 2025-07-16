package student_report_card_system;

import java.util.Scanner;

public class Student extends StudentData {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number of Students: ");
        int n = in.nextInt();
        in.nextLine();
        Student[] student = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Details for student " + (i+1) + ": ");
            student[i] = new Student();
            System.out.print("Name: ");
            student[i].name = in.nextLine();
            System.out.print("Roll Number: ");
            student[i].rollNumber = in.nextInt();
            System.out.print("Marks: ");
            for (int j = 0; j < 5; j++) {
                student[i].marks[j] = in.nextInt();
            }
            in.nextLine();
        }

        System.out.println();
        System.out.println("--------------- Report Card ---------------");
        for (int i = 0; i < n; i++) {
            System.out.println("Report Card of Strudent " + (i+1) + ": ");
            student[i].printReportCard();
        }
    }
}
