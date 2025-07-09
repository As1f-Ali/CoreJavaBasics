package practice_problems;

import java.util.Scanner;

public class SumNaturalNumberV1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number to find the Sum: ");
        int num = in.nextInt();
        System.out.println("Sum of All Natural Numbers till " + num + " is: " + ((num*(num+1))/2));
    }
}
