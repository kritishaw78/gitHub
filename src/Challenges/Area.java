package Challenges;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculation of area of triangle.");
        System.out.print("Enter the base :");
        double base = input.nextDouble();
        System.out.print("Enter the height: ");
        double height = input.nextDouble();

        double area = 0.5 * base * height;   //( base * height ) / 2;
        System.out.print("Result of area of triangle is : " + area);
    }
}
