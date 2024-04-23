package glab_303_6_1_array;

import java.util.Scanner;

public class GLab_303_6_1_Array {
    public static void main(String[] args){

        /* Example 1: Access Array Elements
         * Create a class named arraydemoOne and write the below code.
         */
        /* Access Array Elements */
// Create an array
        int[] age = {12, 4, 5, 2, 5};
// Access and print each array element
        System.out.println("Accessing Elements of an Array:");
        System.out.println("First Element: " + age[0]);
        System.out.println("Second Element: " + age[1]);
        System.out.println("Third Element: " + age[2]);
        System.out.println("Fourth Element: " + age[3]);
        System.out.println("Fifth Element: " + age[4]);


        /* Example 2: Using for Loop
         * Create a class named arraydemoTwo and write the code below in it
         */
        /* Using a for Loop to Iterate Through an Array */
// Create an array
        int[] ageForLoop = {12, 4, 5};
// Using a for loop to print all elements
        System.out.println("Using for Loop:");
        for(int i = 0; i < ageForLoop.length; i++) {
            System.out.println(ageForLoop[i]);
        }

        /* Example 3: Iterating Over an Array using EnhancedForLoop
         * Create a class named EnhancedForLoop and write the code below.
         */
        /* Iterating Over an Array Using an Enhanced For Loop */
        String[] names = { "New York", "Dallas", "Las Vegas", "Florida" };
        for (String name : names) {
            System.out.println(name);
        }

        /* Example 4: Compute the Sum and Average of Array Elements
         * Create a class named arraydemothree and write the code below.
         */
        /* Compute the Sum and Average of Array Elements */
        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;
        Double average;
// Access all elements using for each loop and add each element to sum
        for (int number : numbers) {
            sum += number;
        }
// Calculate the average
        average = ((double)sum / numbers.length);
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        /* Example 5: Mean and Standard Deviation
         * Create a class named MeanSDArray and write the code below.
         */
        /* Calculate Mean and Standard Deviation of Array Elements */
        int[] marks = {74, 43, 58, 60, 90, 64, 70};
        int totalSum = 0;
        int sumOfSquares = 0;
        double mean, standardDeviation;
// Compute sum and square-sum using loop
        for (int mark : marks) {
            totalSum += mark;
            sumOfSquares += mark * mark;
        }
        mean = (double) totalSum / marks.length;
        standardDeviation = Math.sqrt((double) sumOfSquares / marks.length - mean * mean);
// Print results
        System.out.printf("Mean is: %.2f%n", mean);
        System.out.printf("Standard deviation is: %.2f%n", standardDeviation);


        /* Example 6: Insert an Element at the end of an Array in Java
         * Create a class named insertElements and write the code below.
         */
        /* Insert an Element at the End of an Array */
        int[] arr = new int[11];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 10 Elements: ");
        for(int i = 0; i < 10; i++)
            arr[i] = scanner.nextInt();
        System.out.print("Enter an Element to Insert: ");
        int element = scanner.nextInt();
        arr[10] = element; // Insert element at the end
        System.out.println("\nNow the new array is: ");
        for(int value : arr) {
            System.out.print(value + " ");
        }



        /* Task 7: Reverse an Array
         * Write a program that reverses the elements of an array and prints the reversed array.
         * public class ArrayReverse {
         *     public static void main(String[] args) {
         *         int[] arr = {1, 2, 3, 4, 5};
         *         for (int i = 0; i < arr.length / 2; i++) {
         *             int temp = arr[i];
         *             arr[i] = arr[arr.length - 1 - i];
         *             arr[arr.length - 1 - i] = temp;
         *         }
         *         for (int j : arr) {
         *             System.out.println(j);
         *         }
         *     }
         * }
         */

        /* Task 8: Check for Palindrome Array
         * Write a program that checks if an array is a palindrome (the same forwards and backwards).
         * public class ArrayPalindrome {
         *     public static void main(String[] args) {
         *         int[] arr = {1, 2, 3, 2, 1};
         *         boolean isPalindrome = true;
         *         for (int i = 0; i < arr.length / 2; i++) {
         *             if (arr[i] != arr[arr.length - 1 - i]) {
         *                 isPalindrome = false;
         *                 break;
         *             }
         *         }
         *         System.out.println("Is array palindrome? " + isPalindrome);
         *     }
         * }
         */

        /* Task 9: Find the Second Largest Element in an Array
         * Write a program that finds the second largest number in an array.
         * public class SecondLargest {
         *     public static void main(String[] args) {
         *         int[] arr = {1, 23, 47, 81, 92, 88, 52};
         *         int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
         *         for (int j : arr) {
         *             if (j > largest) {
         *                 secondLargest = largest;
         *                 largest = j;
         *             } else if (j > secondLargest) {
         *                 secondLargest = j;
         *             }
         *         }
         *         System.out.println("Second largest number is: " + secondLargest);
         *     }
         * }
         */

        /* Task 10: Rotate an Array to the Right by One Position
         * Write a program that shifts an array to the right by one position in a circular fashion.
         * public class RotateArray {
         *     public static void main(String[] args) {
         *         int[] arr = {1, 2, 3, 4, 5};
         *         int last = arr[arr.length - 1];
         *         for (int i = arr.length - 1; i > 0; i--) {
         *             arr[i] = arr[i - 1];
         *         }
         *         arr[0] = last;
         *         for (int j : arr) {
         *             System.out.println(j);
         *         }
         *     }
         * }
         */

        /* Task 11: Remove Duplicates from Sorted Array
         * Write a program to remove duplicates from a sorted array and return the new length of the array.
         * public class RemoveDuplicates {
         *     public static void main(String[] args) {
         *         int[] arr = {1, 1, 2, 2, 3, 4, 4, 5, 5};
         *         int index = 1;
         *         for (int i = 1; i < arr.length; i++) {
         *             if (arr[i] != arr[i - 1]) {
         *                 arr[index++] = arr[i];
         *             }
         *         }
         *         System.out.println("New length of the array is: " + index);
         *     }
         * }
         */

        /* Task 12: Find All Pairs in Array with a Given Sum
         * Write a program to find all pairs in an integer array whose sum is equal to a given number.
         * public class FindPairs {
         *     public static void main(String[] args) {
         *         int[] arr = {2, 6, 3, 9, 11, 4, 5};
         *         int target = 10;
         *         for (int i = 0; i < arr.length; i++) {
         *             for (int j = i + 1; j < arr.length; j++) {
         *                 if (arr[i] + arr[j] == target) {
         *                     System.out.println(arr[i] + " + " + arr[j] + " = " + target);
         *                 }
         *             }
         *         }
         *     }
         * }
         */

        /* Task 13: Zigzag (or Wave) Array Rearrangement
         * Write a program that rearranges an array in zigzag fashion. Convert array into Zig-Zag fashion such that A < B > C < D > E < F.
         * public class ZigzagArray {
         *     public static void main(String[] args) {
         *         int[] arr = {4, 3, 7, 8, 6, 2, 1};
         *         boolean flag = true;
         *         for (int i = 0; i < arr.length - 1; i++) {
         *             if (flag) { // '<' relation expected
         *                 if (arr[i] > arr[i+1]) {
         *                     int temp = arr[i];
         *                     arr[i] = arr[i+1];
         *                     arr[i+1] = temp;
         *                 }
         *             } else { // '>' relation expected
         *                 if (arr[i] < arr[i+1]) {
         *                     int temp = arr[i];
         *                     arr[i] = arr[i+1];
         *                     arr[i+1] = temp;
         *                 }
         *             }
         *             flag = !flag; // flip flag
         *         }
         *         for (int i : arr) {
         *             System.out.print(i + " ");
         *         }
         *         System.out.println();
         *     }
         * }
         */

        /* Task 14: Sort Array Using Bubble Sort
         * Write a program that sorts an array using the bubble sort algorithm.
         * public class BubbleSort {
         *     public static void main(String[] args) {
         *         int[] arr = {64, 34, 25, 12, 22, 11, 90};
         *         for (int i = 0; i < arr.length-1; i++) {
         *             for (int j = 0; j < arr.length-i-1; j++) {
         *                 if (arr[j] > arr[j+1]) {
         *                     int temp = arr[j];
         *                     arr[j] = arr[j+1];
         *                     arr[j+1] = temp;
         *                 }
         *             }
         *         }
         *         for (int i : arr) {
         *             System.out.print(i + " ");
         *         }
         *         System.out.println();
         *     }
         * }
         */

        /* Task 15: Find Minimum and Maximum in Array
         * Write a program that finds the minimum and maximum values in an array.
         * public class MinMaxArray {
         *     public static void main(String[] args) {
         *         int[] numbers = {22, 3, 67, 2, 89, 44, 98};
         *         int min = numbers[0];
         *         int max = numbers[0];
         *         for (int num : numbers) {
         *             if (num < min) {
         *                 min = num;
         *             }
         *             if (num > max) {
         *                 max = num;
         *             }
         *         }
         *         System.out.println("Minimum = " + min);
         *         System.out.println("Maximum = " + max);
         *     }
         * }
         */

//        These examples are designed to cover essential array operations, from accessing elements and iterating through arrays to performing complex manipulations like sorting and rearranging. They provide a comprehensive approach to learning array operations in Java, suitable for beginners and those looking to refresh their skills.

    }
}
