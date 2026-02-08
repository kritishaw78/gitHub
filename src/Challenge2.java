import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our Calculator.");
        System.out.println("Enter first number:");
        int firstNum = input.nextInt();
        System.out.println("Enter second number:");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("Sum of a and b is: " + sum);
    }
}
