package glab_303_2_1_core_java_operators;

import java.util.Scanner;

public class OddEvenChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Read the number from the user

        // Check if the number is even or odd
        if (number % 2 == 0) {
            // If the number is divisible by 2, it's even
            System.out.println(number + " is even.");
        } else {
            // If the number is not divisible by 2, it's odd
            System.out.println(number + " is odd.");
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}