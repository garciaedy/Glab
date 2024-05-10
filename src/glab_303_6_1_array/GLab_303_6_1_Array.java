package glab_303_6_1_array;

import java.util.Scanner;

public class GLab_303_6_1_Array {
    public static void main(String[] args) {
        // Example 1: Access Array Elements
        // Create an array
        int[] age = {12, 4, 5, 2, 5};

        // Example 2: Using for Loop
        // Create an array
        int[] ageForLoop = {12, 4, 5};

        // Example 3: Iterating Over an Array using Enhanced For Loop
        // Create an array
        String[] names = {"New York", "Dallas", "Las Vegas", "Florida"};

        // Example 4: Compute the Sum and Average of Array Elements
        // Create an array
        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};

        // Example 5: Mean and Standard Deviation
        // Create an array
        int[] marks = {74, 43, 58, 60, 90, 64, 70};

        // Example 6: Insert an Element at the End of an Array in Java
        // Create an empty array with 11 slots
        int[] arr = new int[11];

        // Task 7: Reverse an Array
        // Create an array
        int[] reverseArray = {1, 2, 3, 4, 5};

        // Task 8: Check for Palindrome Array
        // Create an array
        int[] palindromeArray = {1, 2, 3, 2, 1};

        // Task 9: Find the Second-Largest Element in an Array
        // Create an array
        int[] secondLargestArray = {1, 23, 47, 81, 92, 88, 52};

        // Task 10: Rotate an Array to the Right by One Position
        // Create an array
        int[] rotateArray = {1, 2, 3, 4, 5};

        // Task 11: Remove Duplicates from Sorted Array
        // Create an array
        int[] sortedArrayWithDuplicates = {1, 1, 2, 2, 3, 4, 4, 5, 5};

        // Task 12: Find All Pairs in Array with a Given Sum
        // Create an array
        int[] pairsArray = {2, 6, 3, 9, 11, 4, 5};

        // Task 13: Zigzag (or Wave) Array Rearrangement
        // Create an array
        int[] zigzagArray = {4, 3, 7, 8, 6, 2, 1};

        // Task 14: Sort Array Using Bubble Sort
        // Create an array
        int[] unsortedArray = {64, 34, 25, 12, 22, 11, 90};

        // Task 15: Find Minimum and Maximum in Array
        // Create an array
        int[] minMaxArray = {22, 3, 67, 2, 89, 44, 98};

        // For the 'Insert an Element' example, prompt the user for input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 10 Elements: ");
        for (int i = 0; i < 10; i++)
            arr[i] = scanner.nextInt();
        // Task 16: Find the sum of all even numbers in an array
        int[] numbers1 = {1, 4, 6, 7, 8, 10};

        // Task 17: Find the index of a target number in an array
        int[] numbers2 = {9, 3, 15, 20, 7, 12};
        int target = 20;

        // Task 18: Find the median of an array
        int[] numbers3 = {2, 5, 8, 1, 4, 6, 3};

        // Task 19: Sort an array using selection sort
        int[] numbers4 = {29, 10, 14, 37, 14};

        // Task 20: Count the number of occurrences of each element in an array
        int[] numbers5 = {2, 3, 4, 2, 3, 4, 5};

        // Task 21: Find the mode (most frequently occurring element) of an array
        int[] numbers6 = {3, 7, 3, 2, 9, 7, 3, 7};

        // Task 22: Merge two sorted arrays into one sorted array
        int[] sorted1 = {1, 3, 5, 7};
        int[] sorted2 = {2, 4, 6, 8};

        // Task 23: Rotate an array to the left by one position
        int[] rotateLeft = {10, 20, 30, 40, 50};

        // Task 24: Count the total number of unique elements in an array
        int[] numbers7 = {10, 20, 20, 30, 40, 40, 50};

        // Task 25: Find the largest odd number in an array
        int[] numbers8 = {18, 3, 25, 44, 9, 5};

        // Task 26: Find the largest sum of contiguous subarray using Kadane’s algorithm
        int[] kadaneArray = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        // Task 27: Find the missing number in a consecutive sequence array
        int[] sequence = {1, 2, 3, 5, 6};

        // Task 28: Rearrange array elements so that even numbers come before odd numbers
        int[] rearrangeArray = {5, 8, 12, 1, 9, 4};

        // Task 29: Replace each element in an array with the greatest element to its right
        int[] numbers9 = {16, 17, 4, 3, 5, 2};

        // Task 30: Calculate the cumulative sum of an array
        int[] numbers10 = {1, 2, 3, 4, 5};

        // Add code implementations for each task below:
    }
}
