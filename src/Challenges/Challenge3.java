package Challenges;

import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of a :");
        int a = input.nextInt();
        System.out.print("Enter value of b :");
        int b = input.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);
    }
}
