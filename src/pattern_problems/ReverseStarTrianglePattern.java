package pattern_problems;

import java.util.Scanner;

public class ReverseStarTrianglePattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        int num1 = in.nextInt();
        for(int i = num1; i>= 1; i--){
            for (int j = i; j<num1; j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k<i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}