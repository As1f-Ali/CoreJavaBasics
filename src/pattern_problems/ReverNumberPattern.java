package pattern_problems;

import java.util.Scanner;

public class ReverNumberPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        int num1 = in.nextInt();
        int i;
        for(i = num1; i>= 1; i--){
            for (int j = num1; j>= i; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
