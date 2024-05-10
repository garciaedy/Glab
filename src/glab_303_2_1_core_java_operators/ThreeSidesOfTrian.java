package glab_303_2_1_core_java_operators;

import java.util.Scanner;

public class ThreeSidesOfTrian {
    public static void main(String[] str) {
        // Create a Scanner object for reading from standard input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the lengths of the sides of the triangle
        System.out.print("Enter the length of side A: ");
        double a = sc.nextDouble(); // Read the length of side A

        System.out.print("Enter the length of side B: ");
        double b = sc.nextDouble(); // Read the length of side B

        System.out.print("Enter the length of side C: ");
        double c = sc.nextDouble(); // Read the length of side C

        // Calculate the semi-perimeter of the triangle
        double s = (a + b + c) / 2.0;

        // Calculate the area of the triangle using Heron's formula
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Output the computed area of the triangle
        System.out.println("Area of the triangle is: " + area);

        // Close the scanner to free up resources
        sc.close();

    }
}
