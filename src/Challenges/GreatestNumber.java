package Challenges;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number:  ");
        int first = input.nextInt();
        System.out.print("Enter second number: ");
        int second = input.nextInt();
        System.out.print("Enter third number: ");
        int third = input.nextInt();

        if(first > second && third < first){
            System.out.println( first+ "Is greatest of three number.");
        } else if (second > first && third < second) {
            System.out.println(second+ " Is greatest of three number.");
        }
        else {
            System.out.println(third+ " Is greatest of three number.");
        }
    }
}
