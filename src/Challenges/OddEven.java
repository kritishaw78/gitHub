package Challenges;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.println("This number is even number.");
        }
        else {
            System.out.println("This number is odd number.");
        }
    }
}
