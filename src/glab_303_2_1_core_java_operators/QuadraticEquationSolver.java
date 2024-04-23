package glab_303_2_1_core_java_operators;

import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        // Create a Scanner object for reading from standard input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the coefficients of the quadratic equation
        System.out.print("Enter the coefficient a: ");
        double a = sc.nextDouble(); // Read the coefficient a

        System.out.print("Enter the coefficient b: ");
        double b = sc.nextDouble(); // Read the coefficient b

        System.out.print("Enter the coefficient c: ");
        double c = sc.nextDouble(); // Read the coefficient c

        // Calculate the discriminant of the quadratic equation
        double discriminant = b * b - 4 * a * c;

        // Determine the nature of the roots based on the discriminant value
        if (discriminant < 0) {
            // If the discriminant is less than zero, the roots are complex and not real
            System.out.println("The equation has no real roots.");
        } else {
            // Calculate the roots of the quadratic equation
            double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double r2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            // Check if the discriminant is zero, implying that both roots are equal
            if (discriminant == 0) {
                System.out.println("Both roots are the same: " + r1);
            } else {
                // If the discriminant is positive, the equation has two distinct roots
                System.out.println("Roots are: " + r1 + " and " + r2);
            }
        }
        // Close the scanner to free up resources
        sc.close();
    }
}
