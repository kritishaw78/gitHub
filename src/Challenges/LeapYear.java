package Challenges;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year that you want to check: ");
        int year = input.nextInt();

        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("your year is leap year.");
        }
        else {
            System.out.println("Your year is not leap year");
        }
    }
}
