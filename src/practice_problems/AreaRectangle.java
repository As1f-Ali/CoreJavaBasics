package practice_problems;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Length of Rectangle: ");
        double length = input.nextDouble();
        System.out.print("Enter the Breadth of Rectangle:  ");
        double breadth = input.nextDouble();

        double area = length * breadth;

        System.out.println("Length: " + length);
        System.out.println("breadth: " + breadth);
        System.out.println("Area of Rectangle = length x breadth: " + length + " x " + breadth + " = " + area);
    }
}
