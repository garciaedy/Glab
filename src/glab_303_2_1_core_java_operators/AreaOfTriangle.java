package glab_303_2_1_core_java_operators;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] arg){
        // Area= 1/2 bh
        Scanner sc = new Scanner(System.in);
        // Prompt user for base
        System.out.print("Enter base: ");
        double base = sc.nextDouble();

        // Prompt user for height
        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        // Calculate the area
        double area = base * height / 2;

        // Output the area
        System.out.println("The area is " + area);

        // Close the scanner to prevent resource leaks
        sc.close();


    }
}
