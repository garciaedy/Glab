package glab_303_4_1_control_flow;

import java.util.ArrayList;
import java.util.Arrays;

public class ControlFlow2 {

    public static void main(String[] arg){
        // Java Practice Exercises: Loops and Conditionals
// This README contains a series of Java programming exercises focused on mastering loops and conditional statements. These exercises will help you understand and implement different types of loops and conditions in Java.

// Prompt 1: Simple Counting Loop
// Create a loop that counts from 0 to 10, printing each number.
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i);
//        }

// Prompt 2: Even Numbers Loop
// Create a loop that prints every even number between 0 and 100.
//        for (int i = 0; i <= 100; i += 2) {
//            System.out.println(i);
//        }

// Prompt 3: Negative to Positive Loop
// Create a loop that counts from -5 to 5, printing each number.
//        for (int i = -5; i <= 5; i++) {
//            System.out.println(i);
//        }

// Prompt 4: Countdown Loop
// Create a loop that counts down from 10 to 0, printing each number.
//        for (int i = 10; i >= 0; i--) {
//            System.out.println(i);
//        }

// Prompt 5: Negative Countdown Loop
// Create a loop that counts down from 5 to -5, printing each number.
//        for (int i = 5; i >= -5; i--) {
//            System.out.println(i);
//        }

// Prompt 6: Count by Twos
// Create a loop that counts from 0 to 50 in multiples of 2, printing each number.
//        for (int i = 0; i <= 50; i += 2) {
//            System.out.println(i);
//        }

// Prompt 7: Multiples of Five
// For the numbers 0 to 100, print "I found a [number]. High five!" if the number is a multiple of five.

        for (int i = 0; i <= 100; i++) {
            if (i != 0 && i % 5 == 0) {
                System.out.println("I found a " + ". High five!" + i);
            }
        }

// Prompt 8: Conditional Statements with Random Numbers
// Create a variable called `someNumber` and assign it a random number between 0 and 100.
//        int someNumber = (int) (Math.random() * 101);
//// Create a conditional statement:
//        if (someNumber < 30) {
//            System.out.println("that's a small number");
//        } else if (someNumber >= 30 && someNumber <= 60) {
//            System.out.println("the number is medium-sized");
//        } else {
//            System.out.println("We got a big one!");
//        }

// Prompt 9: Iterate Over Array
// Given an array `String[] starWars = {"Han", "C3PO", "R2D2", "Luke", "Leia", "Anakin"};`
// Iterate over the array printing each character's name and index.
//        String[] starWars = {"Han", "C3PO", "R2D2", "Luke", "Leia", "Anakin"};
//        for (int i = 0; i < starWars.length; i++) {
//            System.out.println("Index " + i + ": " + starWars[i]);
//        }

// Prompt 10: Store Even Numbers in an Array
// Write a loop that adds every even number between 0 and 100 to an ArrayList and then print the ArrayList.
//        ArrayList<Integer> evenNumbers = new ArrayList<>();
//        for (int i = 0; i <= 100; i += 2) {
//            evenNumbers.add(i);
//        }
//        System.out.println(evenNumbers);

// Prompt 11: Find the Median
// Given an array `int[] nums = {14, 11, 16, 15, 13, 16, 15, 17, 19, 11, 12, 14, 19, 11, 15, 17, 11, 18, 12, 17, 12, 71, 18, 15, 12};`
// Find the median number in the array and print it. Consider using `Arrays.sort()` method and `Math.floor()` to find the middle index.
//        int[] nums = {14, 11, 16, 15, 13, 16, 15, 17, 19, 11, 12, 14, 19, 11, 15, 17, 11, 18, 12, 17, 12, 71, 18, 15, 12};
//        Arrays.sort(nums);
//        double median;
//        if (nums.length % 2 == 0) {
//            median = (double) (nums[nums.length / 2] + nums[nums.length / 2 - 1]) / 2;
//        } else {
//            median = nums[nums.length / 2];
//        }
//        System.out.println("Median: " + median);

// Prompt 12: Nested Loops
// Create an "outer" loop that counts up from 1 to 10 with an incrementer `i`.
// Create an "inner" loop that counts from 11 to 20 with an incrementer `j`.
// Inside the inner loop, print `i: ${i} / j: ${j}` using System.out.printf to format the output.
//        for (int i = 1; i <= 10; i++) {
//            for (int j = 11; j <= 20; j++) {
//                System.out.printf("i: %d / j: %d%n", i, j);
//            }
//        }

// Prompt 13: Nested Arrays Loop
// Given a 2D array `String[][] nestedArrays = {{"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"}};`
// Use nested loops to print the values inside the nested arrays.
//        String[][] nestedArrays = {{"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"}};
//        for (String[] array : nestedArrays) {
//            for (String element : array) {
//                System.out.print(element + " ");
//            }
//            System.out.println();
//        }

        /*
         * Java Practice Exercises: Additional Prompts
         *
         * Prompt 14: Prime Numbers
         * Write a program that prints all prime numbers between 1 and 100.
         */

        /*
         * Prompt 15: Fibonacci Sequence
         * Write a program that generates and prints the first 20 numbers in the Fibonacci sequence.
         */

        /*
         * Prompt 16: Palindrome Check
         * Write a program to check if a given string is a palindrome or not.
         */

        /*
         * Prompt 17: Factorial Calculation
         * Write a program to calculate and print the factorial of a given number.
         */

        /*
         * Prompt 18: Perfect Numbers
         * Write a program to find and print all perfect numbers between 1 and 1000.
         */

        /*
         * Prompt 19: Armstrong Numbers
         * Write a program to find and print all Armstrong numbers between 1 and 500.
         */

        /*
         * Prompt 20: Decimal to Binary Conversion
         * Write a program to convert a given decimal number to its binary representation.
         */

        /*
         * Prompt 21: Binary to Decimal Conversion
         * Write a program to convert a given binary number to its decimal representation.
         */

        /*
         * Prompt 22: Sum of Digits
         * Write a program to calculate and print the sum of the digits of a given integer.
         */

        /*
         * Prompt 23: Reverse Array
         * Write a program to reverse the elements of an array without using any additional array.
         */



    }
}
