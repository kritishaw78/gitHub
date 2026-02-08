package Challenges;

import java.util.Scanner;

public class FloatingProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first decimal number: ");
        double firstNumber = input.nextDouble();
        System.out.print("Enter second decimal number: ");
        double secondNumber = input.nextDouble();

        double mul = firstNumber * secondNumber;
        System.out.println(mul);
    }
}
