package practice_problems;

import java.util.Scanner;

public class PrimeWhile
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = in.nextInt();
        boolean is_prime = true;
        int i = 1;
        while (i<=num/2){
            if (num==1) {
                is_prime = false;
                break;
            } else if (num == 2) {
                break;
            } else if (i >2 && num%i == 0) {
                is_prime = false;
                break;
            }
            i++;
        }
        if(num<1) System.out.println(num+" is not a valid input");
        else if (is_prime) System.out.println(num+" is a prime Number.");
        else System.out.println(num+" is not a Prime Number.");
    }
}
