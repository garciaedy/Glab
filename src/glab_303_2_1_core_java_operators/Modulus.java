package glab_303_2_1_core_java_operators;

import java.util.Scanner;

public class Modulus {
    public static void main(String[] args) {
        // Create a Scanner object for reading from standard input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the maximum number up to which even and odd numbers will be classified
        System.out.print("Enter the maximum number: ");
        int maxNumber = scanner.nextInt(); // Read the maximum number for number classification

        // Iterate over each number from 1 up to and including the maximum number
        for (int number = 0; number <= maxNumber; number++) {
            // Check if the number is divisible by 2
            if (number % 2 == 0) {
                // If divisible by 2, classify and print the number as 'even'
                System.out.println(number + " is even.");
            } else {
                // If not divisible by 2, classify and print the number as 'odd'
                System.out.println(number + " is odd.");
            }
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
