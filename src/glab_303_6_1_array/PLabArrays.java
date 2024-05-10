package glab_303_6_1_array;

import java.util.Scanner;

public class PLabArrays {
    public static void main(String[] args){
        // Task 1: Write a program that creates an array of integers with a length of 3.
        // Assign the values 1, 2, and 3 to the indexes. Print out each array element.
        int[] task1Array = {1, 2, 3};

        // Task 2: Write a program that returns the middle element in an array.
        // Give the following values to the integer array: {13, 5, 7, 68, 2} and
        // produce the following output: 7
        int[] task2Array = {13, 5, 7, 68, 2};

        // Task 3: Write a program that creates an array of String type and initializes
        // it with the strings “red,” “green,” “blue,” and “yellow.” Print out the array
        // length. Make a copy using the clone( ) method. Use the Arrays.toString( )
        // method on the new array to verify that the original array was copied.
        String[] task3Array = {"red", "green", "blue", "yellow"};

        // Task 4: Write a program that creates an integer array with 5 elements.
        // Print out the value at the first index and the last index using length - 1
        // as the index.
        int[] task4Array = {12, 43, 55, 64, 23};

        // Task 5: Write a program where you create an integer array with a length of 5.
        // Loop through the array and assign the value of the loop control variable
        // (e.g., i) to the corresponding index in the array.
        int[] task5Array = new int[5];

        // Task 6: Write a program where you create an integer array of 5 numbers.
        // Loop through the array and assign the value of the loop control variable
        // multiplied by 2 to the corresponding index in the array.
        int[] task6Array = new int[5];

        // Task 7: Write a program where you create an array of 5 elements.
        // Loop through the array and print the value of each element, except for
        // the middle (index 2) element.
        int[] task7Array = {11, 22, 33, 44, 55};

        // Task 8: Write a program that creates a String array of 5 elements and swaps
        // the first element with the middle element without creating a new array.
        String[] task8Array = {"one", "two", "three", "four", "five"};

        // Task 9: Write a program to sort the following int array in ascending order:
        // {4, 2, 9, 13, 1, 0}. Print the array in ascending order, and print the smallest
        // and the largest element of the array.
        int[] task9Array = {4, 2, 9, 13, 1, 0};

        // Task 10: Create an array that includes an integer, 3 strings, and 1 double.
        // Print the array.
        Object[] task10Array = {5, "hello", "world", "Java", 3.14};

        // Task 11: Write some Java code that asks the user how many favorite things they
        // have. Based on their answer, you should create a String array of the correct
        // size. Then ask the user to enter the things and store them in the array you
        // created. Finally, print out the contents of the array.
//        Example
//        How many favorite things do you have?
//        7
//        Enter your thing: phone
//        Enter your thing: tv
//        Enter your thing: xbox
//        Enter your thing: wine
//        Enter your thing: beer
//        Enter your thing: sofa
//        Enter your thing: book
//        Your favorite  things are:
//        phone tv xbox wine beer sofa book

        Scanner scanner = new Scanner(System.in);

        // Implementations go below as needed.

        // Task 12: Write a program that finds the maximum and minimum values in an
        // array of integers.
        int[] task12Array = {17, 3, 67, 22, 89, 44, 98};

        // Task 13: Write a program that creates a String array and replaces the first
        // occurrence of a specified string with another string.
        String[] task13Array = {"apple", "banana", "cherry", "apple", "date"};

        // Task 14: Write a program to merge two integer arrays into a new one.
        int[] task14Array1 = {1, 2, 3};
        int[] task14Array2 = {4, 5, 6};

        // Task 15: Write a program that removes a specified element from an integer array.
        int[] task15Array = {7, 8, 9, 10, 11};

        // Task 16: Write a program that creates a double array and finds the average
        // of all its elements.
        double[] task16Array = {1.1, 2.2, 3.3, 4.4, 5.5};

        // Task 17: Write a program that creates a 2D array and initializes it with
        // multiplication table values.
        int[][] task17Array = new int[5][5];

        // Task 18: Write a program that fills an integer array with random numbers
        // within a specified range.
        int[] task18Array = new int[10];

        // Task 19: Write a program that shifts an integer array to the left by one position.
        int[] task19Array = {21, 32, 43, 54, 65};

        // Task 20: Write a program to concatenate two String arrays into one.
        String[] task20Array1 = {"one", "two", "three"};
        String[] task20Array2 = {"four", "five", "six"};

        // Task 21: Write a program that creates a 3D array and initializes it with
        // different values.
        int[][][] task21Array = new int[2][3][4];

        // Task 22: Write a program that counts how many times a specific value appears
        // in an array of integers.
        int[] task22Array = {11, 22, 33, 44, 22, 22, 55};

        // Task 23: Write a program that creates a boolean array and determines how many
        // elements are true and how many are false.
        boolean[] task23Array = {true, false, true, true, false};

        // Task 24: Write a program that compares two integer arrays for equality.
        int[] task24Array1 = {12, 23, 34, 45};
        int[] task24Array2 = {12, 23, 34, 45};

        // Task 25: Write a program that creates an array of integers and then finds
        // pairs of numbers that add up to a specified target sum.
        int[] task25Array = {3, 8, 12, 15, 7, 11};

        // Implementations go below as needed.
    }
}