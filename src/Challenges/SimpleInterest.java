package Challenges;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculation of simple interest.");
        System.out.print("Enter the value of principle:");
        int principle = input.nextInt();
        System.out.print("Enter the value of rate:");
        float rate = input.nextFloat();
        System.out.print("Enter the value of time:");
        float time = input.nextFloat();

        float simpleInterest = (principle * rate * time) / 100;
        System.out.print("Result of simple Interest is : " + simpleInterest);
    }
}
