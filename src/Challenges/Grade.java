package Challenges;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your percentage: ");
        float percentage = input.nextFloat();

        if(percentage >= 90){
            System.out.println("A Grade");
        } else if (percentage >= 75) {
            System.out.println("B Grade");
        } else if (percentage >= 60) {
            System.out.println("C Grade");
        } else if (percentage >= 30) {
            System.out.println("D Grade");
        }
        else {
            System.out.println("Fail");
        }
    }
}
