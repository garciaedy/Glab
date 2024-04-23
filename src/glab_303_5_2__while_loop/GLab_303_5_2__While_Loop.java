package glab_303_5_2__while_loop;


import java.util.Scanner;

public class GLab_303_5_2__While_Loop {
    public static void main(String[] args){
        /* Task 1: Print Numbers from 1 to 10
         * Write a program that prints numbers from 1 to 10 using a while loop.
         */
/*
int i = 1;
while (i <= 10) {
    System.out.println(i);
    i++;
}
*/

        /* Task 2: Reverse Counting from 10 to 1
         * Write a program that counts backwards from 10 to 1 using a while loop.
         */
/*
int num = 10;
while (num > 0) {
    System.out.println(num);
    num--;
}
*/

        /* Task 3: Print All Even Numbers Between 1 and 20
         * Write a program using a while loop to print all even numbers between 1 and 20.
         */
/*
int j = 2;
while (j <= 20) {
    if (j % 2 == 0) {
        System.out.println(j);
    }
    j++;
}
*/

        /* Task 4: Keep Asking for User Input Until They Type 'stop'
         * Write a program that continually asks the user for input until they type 'stop'.
         */
/*
Scanner scanner = new Scanner(System.in);
String input = "";
while (!input.equals("stop")) {
    System.out.println("Enter 'stop' to exit: ");
    input = scanner.nextLine();
}
*/

        /* Task 5: Sum Numbers Entered by User Until Zero is Entered
         * Write a program that sums numbers entered by the user until the user enters zero.
         */
/*
Scanner scanner = new Scanner(System.in);
int sum = 0;
int number;
do {
    System.out.print("Enter a number (0 to stop): ");
    number = scanner.nextInt();
    sum += number;
} while (number != 0);
System.out.println("Total sum: " + sum);
*/

        /* Task 6: Validate User Input
         * Write a program that continues to ask for a positive number until the user enters one.
         */
/*
Scanner scanner = new Scanner(System.in);
int number;
do {
    System.out.print("Enter a positive number: ");
    number = scanner.nextInt();
} while (number <= 0);
*/

        /* Task 7: Countdown from 100 Skipping Multiples of 10
         * Write a program using a while loop to countdown from 100, skipping numbers that are multiples of 10.
         */
/*
int count = 100;
while (count > 0) {
    if (count % 10 != 0) {
        System.out.println(count);
    }
    count--;
}
*/

        /* Task 8: Print the Alphabet Using a While Loop
         * Write a program to print the alphabet using a while loop.
         */
/*
char c = 'a';
while (c <= 'z') {
    System.out.print(c + " ");
    c++;
}
System.out.println();
*/

        /* Task 9: Guessing Game
         * Write a simple guessing game using a while loop where the user has to guess a set number.
         */
/*
Scanner scanner = new Scanner(System.in);
int answer = 7, guess;
do {
    System.out.print("Guess a number between 1 and 10: ");
    guess = scanner.nextInt();
} while (guess != answer);
System.out.println("Correct!");
*/

        /* Task 10: Display Digits of a Number in Reverse Order
         * Write a program that takes a number and displays its digits in reverse order using a while loop.
         */
/*
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = scanner.nextInt();
while (number > 0) {
    System.out.print(number % 10);
    number /= 10;
}
System.out.println();
*/

        /* Task 11: Counting the Number of Digits in an Integer
         * Write a program that counts the number of digits in a given integer.
         */
/*
int number = 123456;
int digits = 0;
while (number > 0) {
    number /= 10;
    digits++;
}
System.out.println("Number of digits: " + digits);
*/

        /* Task 12: Exponential Growth Simulation
         * Write a program to simulate exponential growth starting with 1 and doubling it until it exceeds 1000.
         */
/*
int value = 1;
while (value <= 1000) {
    System.out.println(value);
    value *= 2;
}
*/

        /* Task 13: Print Square Numbers Up to 100
         * Write a program that prints all square numbers up to 100.
         */
/*
int square = 1;
int increment = 3;
while (square <= 100) {
    System.out.println(square);
    square += increment;
    increment += 2;  // Increment to get the next odd number
}
*/

        /* Task 14: Loop Through Array Elements
         * Write a program using a while loop to print each element in an array.
         */
/*
int[] array = {1, 2, 3, 4, 5};
int index = 0;
while (index < array.length) {
    System.out.println(array[index]);
    index++;
}
*/

        /* Task 15: Stay Above Water
         * Write a program where you simulate a player's oxygen level in a diving game. The player starts with 100 oxygen and loses 15 oxygen per minute. Use a while loop to determine how long they can stay underwater before they run out of air.
         */
/*
int oxygen = 100;
int minutes = 0;
while (oxygen > 0) {
    System.out.println("Oxygen level: " + oxygen + "%");
    oxygen -= 15;
    minutes++;
}
System.out.println("Total underwater time: " + minutes + " minutes");
*/

        /* Task 16: Avoid Zero Division
         * Write a program that asks the user for numbers and divides 100 by each number entered. The program should stop if the user enters zero.
         */
/*
Scanner scanner = new Scanner(System.in);
int divisor;
while (true) {
    System.out.print("Enter a number (0 to exit): ");
    divisor = scanner.nextInt();
    if (divisor == 0) {
        break;
    }
    System.out.println("100 / " + divisor + " = " + (100.0 / divisor));
}
*/

        /* Task 17: Print Star Pyramid
         * Write a program that prints a pyramid of stars where the number of rows is specified by the user.
         */
/*
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number of rows for the pyramid: ");
int rows = scanner.nextInt();
int k = 0;
while (k < rows) {
    int space = rows - k - 1;
    while (space > 0) {
        System.out.print(" ");
        space--;
    }
    int stars = 2 * k + 1;
    while (stars > 0) {
        System.out.print("*");
        stars--;
    }
    System.out.println();
    k++;
}
*/

        /* Task 18: Validate User Password
         * Write a program that repeatedly asks the user to enter a valid password until the correct password, "Java123", is entered.
         */
/*
Scanner scanner = new Scanner(System.in);
String password;
while (true) {
    System.out.print("Enter your password: ");
    password = scanner.nextLine();
    if (password.equals("Java123")) {
        System.out.println("Password accepted.");
        break;
    } else {
        System.out.println("Incorrect password, try again.");
    }
}
*/

        /* Task 19: Accumulate Positive Numbers
         * Write a program that asks the user to enter positive numbers and adds them together. The program should stop when a negative number is entered.
         */
/*
Scanner scanner = new Scanner(System.in);
int sum = 0, input;
while (true) {
    System.out.print("Enter a positive number (negative to stop): ");
    input = scanner.nextInt();
    if (input < 0) {
        break;
    }
    sum += input;
}
System.out.println("Sum of positive numbers: " + sum);
*/

        /* Task 20: Convert Binary to Decimal
         * Write a program that converts a binary number (as a string) to its decimal equivalent using a while loop.
         */
/*
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a binary number: ");
String binary = scanner.nextLine();
int decimal = 0;
int base = 1; // 2^0
int length = binary.length() - 1;
while (length >= 0) {
    if (binary.charAt(length) == '1') {
        decimal += base;
    }
    base *= 2;
    length--;
}
System.out.println("Decimal equivalent: " + decimal);
*/

    }
}
