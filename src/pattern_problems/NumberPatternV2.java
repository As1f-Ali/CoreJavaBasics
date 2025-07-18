package pattern_problems;

import java.util.Scanner;

public class NumberPatternV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        for (int i = 0; i < num; i++){
            for (int j = i + 1; j <= (num + i); j++ ) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
