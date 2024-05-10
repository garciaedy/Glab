package glab_303_5_2__while_loop;

import java.util.Scanner;

public class GLab_303_5_2__While_Loop {
    public static void main(String[] args){
        /* Task 1: Print Numbers from 1 to 10
         * Write a program that prints numbers from 1 to 10 using a while loop.
         */
        // No input needed here; just print numbers 1 to 10

        /* Task 2: Reverse Counting from 10 to 1
         * Write a program that counts backwards from 10 to 1 using a while loop.
         */
        // No input needed here; count down from 10 to 1

        /* Task 3: Print All Even Numbers Between 1 and 20
         * Write a program using a while loop to print all even numbers between 1 and 20.
         */
        // No input needed here; print all even numbers between 1 and 20

        /* Task 4: Keep Asking for User Input Until They Type 'stop'
         * Write a program that continually asks the user for input until they type 'stop'.
         */
        // Expect user to input multiple text values until "stop" is typed

        /* Task 5: Sum Numbers Entered by User Until Zero is Entered
         * Write a program that sums numbers entered by the user until the user enters zero.
         */
        // Expect user to input multiple integers until 0 is entered

        /* Task 6: Validate User Input
         * Write a program that continues to ask for a positive number until the user enters one.
         */
        // Expect user to input a positive number

        /* Task 7: Countdown from 100 Skipping Multiples of 10
         * Write a program using a while loop to countdown from 100, skipping numbers that are multiples of 10.
         */
        // Countdown starting from 100 but skip numbers divisible by 10

        /* Task 8: Print the Alphabet Using a While Loop
         * Write a program to print the alphabet using a while loop.
         */
        // No input needed; print all letters of the alphabet

        /* Task 9: Guessing Game
         * Write a simple guessing game using a while loop where the user has to guess a set number.
         */
        // User guesses a number repeatedly until they find the hidden number

        /* Task 10: Display Digits of a Number in Reverse Order
         * Write a program that takes a number and displays its digits in reverse order using a while loop.
         */
        // Expect user to input an integer for reversing its digits

        /* Task 11: Counting the Number of Digits in an Integer
         * Write a program that counts the number of digits in a given integer.
         */
        int numberToCount = 123456;

        /* Task 12: Exponential Growth Simulation
         * Write a program to simulate exponential growth starting with 1 and doubling it until it exceeds 1000.
         */
        // Start with 1 and double the value repeatedly until exceeding 1000

        /* Task 13: Print Square Numbers Up to 100
         * Write a program that prints all square numbers up to 100.
         */
        // No input needed; just calculate and print square numbers up to 100

        /* Task 14: Loop Through Array Elements
         * Write a program using a while loop to print each element in an array.
         */
        int[] arrayElements = {1, 2, 3, 4, 5};

        /* Task 15: Stay Above Water
         * Write a program where you simulate a player's oxygen level in a diving game. The player starts with 100 oxygen and loses 15 oxygen per minute. Use a while loop to determine how long they can stay underwater before they run out of air.
         */
        int initialOxygen = 100;
        int oxygenLossPerMinute = 15;

        /* Task 16: Avoid Zero Division
         * Write a program that asks the user for numbers and divides 100 by each number entered. The program should stop if the user enters zero.
         */
        // Expect user to input numbers for dividing 100

        /* Task 17: Print Star Pyramid
         * Write a program that prints a pyramid of stars where the number of rows is specified by the user.
         */
        // Expect user to input a number representing pyramid rows

        /* Task 18: Validate User Password
         * Write a program that repeatedly asks the user to enter a valid password until the correct password, "Java123", is entered.
         */
        String correctPassword = "Java123";

        /* Task 19: Accumulate Positive Numbers
         * Write a program that asks the user to enter positive numbers and adds them together. The program should stop when a negative number is entered.
         */
        // Expect user to input multiple positive numbers

        /* Task 20: Convert Binary to Decimal
         * Write a program that converts a binary number (as a string) to its decimal equivalent using a while loop.
         */
        // Expect user to input a binary number

        /* Task 21: Calculate Factorial of a Number
         * Write a program that calculates the factorial of a number using a while loop.
         * Example: num = 5 (Expected output: 120)
         */
        int num = 5; // Example input
        int factorial = 1;
        int n = num;

        /* Task 22: Sum of Odd Numbers up to 50
         * Write a program that calculates the sum of all odd numbers up to 50 using a while loop.
         * Example: The sum of all odd numbers up to 50 is 625.
         */
        int current = 1;
        int oddSum = 0;

        /* Task 23: Count Occurrences of a Character
         * Write a program that counts the occurrences of a given character in a user-provided string using a while loop.
         * Example: text = "hello world", searchChar = 'l' (Expected output: 3)
         */
        String text = "hello world"; // Example string input
        char searchChar = 'l'; // Example character to search
        int index = 0;
        int count = 0;

        /* Task 24: Repeat Multiplication Table
         * Write a program that prints the multiplication table of a given number up to 12 times, using a while loop.
         * Example: number = 7 (Expected output: 7, 14, 21, ..., 84)
         */
        int number = 7; // Example multiplication table number
        int multiplier = 1;

        /* Task 25: Fibonacci Sequence up to a Limit
         * Write a program that prints the Fibonacci sequence up to a certain limit using a while loop.
         * Example: limit = 100 (Expected output: 0, 1, 1, 2, 3, 5, ..., 89)
         */
        int limit = 100; // Example limit
        int a = 0, b = 1;

        /* Task 26: Reverse a String
         * Write a program to reverse a user-provided string using a while loop.
         * Example: original = "example" (Expected output: "elpmaxe")
         */
        String original = "example"; // Example string to reverse
        int length = original.length() - 1;

        /* Task 27: Check Prime Status
         * Write a program to determine if a user-provided number is prime using a while loop.
         * Example: num = 29 (Expected output: true, as 29 is a prime number)
         */
        int primeNum = 29; // Example number to check
        boolean isPrime = primeNum > 1;
        int divisor = 2;

        /* Task 28: Calculate Power of a Number
         * Write a program to calculate the power of a number (base raised to an exponent) using a while loop.
         * Example: base = 2, exponent = 3 (Expected output: 8, which is 2^3)
         */
        int base = 2; // Example base number
        int exponent = 3; // Example exponent
        int result = 1;
        int powerCounter = exponent;

        /* Task 29: Generate a Sequence of Perfect Squares
         * Write a program to generate and print the first 10 perfect squares using a while loop.
         * Expected output: 1, 4, 9, 16, ..., 100
         */
        int countSquares = 0;
        int currentSquare = 1;
        int squareBase = 1;

        /* Task 30: Convert Decimal to Binary
         * Write a program to convert a decimal number to binary using a while loop.
         * Example: decimalNumber = 42 (Expected output: "101010")
         */
        int decimalNumber = 42; // Example decimal number
        int tempDecimal = decimalNumber;
        StringBuilder binaryString = new StringBuilder();
    }
}