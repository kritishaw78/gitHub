package Challenges;

import java.util.Scanner;

public class AgeGroups {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age:");
        int age = input.nextInt();

        if(age <= 13){
            System.out.println("You are a child.");
        } else if (age <= 20) {
            System.out.println(" you are a teenager");
        } else if (age <= 60) {
            System.out.println(" you are  an adult.");
        }else {
            System.out.println("you are  a senior");
        }
    }
}
