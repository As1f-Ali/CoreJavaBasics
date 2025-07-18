package pattern_problems;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        int num1 = in.nextInt();
        for(int i = 1; i<= num1; i++){
            for (int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
