package pattern_problems;

import java.util.Scanner;

public class StarPatternV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rows that should be printed: ");
        int rows = input.nextInt();
        for (int i = 0; i < rows; i++){
            for (int j = rows; j > i; j--){
                System.out.print(" ");
            }
            for (int j =0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < rows; i++){
            for (int j = 0; j <= i + 1; j++){
                System.out.print(" ");
            }
            for (int j = rows-1; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
