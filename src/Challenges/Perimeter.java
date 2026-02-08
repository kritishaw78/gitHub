package Challenges;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculation of perimeter of rectangle : ");
        System.out.print("Enter first number : ");
        double first = input.nextDouble();
        System.out.print("Enter second number: ");
        double second = input.nextDouble();
        System.out.print("Enter third number : ");
        double third = input.nextDouble();
        System.out.print("Enter fourth number : ");
        double fourth = input.nextDouble();

        double sum = first + second + third + fourth;
        System.out.print("Result of perimeter of rectangle is...." + sum);
    }
}
