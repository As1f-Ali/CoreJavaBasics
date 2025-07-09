package practice_problems;

import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num1 = in.nextInt();
        System.out.println("Table for "+num1+" : ");
        int i;
        for (i = 1; i <= 10; i++){
            System.out.println(num1+" x "+i+" = "+ (num1 * i));
        }
    }
}