package Challenges;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num = input.nextInt();

        if(num>0){
            System.out.println("This number is positive.");
        } else if (num==0) {
            System.out.println("this number is zero.");
        }
        else {
            System.out.println("This number is negative");
        }
    }


}
