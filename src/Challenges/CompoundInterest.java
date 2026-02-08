package Challenges;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculation of Compound interest.");
        System.out.print("Enter the value of principle:");
        int p = input.nextInt();
        System.out.print("Enter the value of time:");
        float T = input.nextFloat();
        System.out.print("Enter the value of rate:");
        float r = input.nextFloat();

        double CompoundInterest = p * Math.pow((1+r/100), T);
        System.out.print(" Result of Compound interest is : "+ CompoundInterest);
    }
}
