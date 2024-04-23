package glab_303_4_1_control_flow;

public class Glab_303_4_1_Control_Flow {
    public static void main(String[] args){
        /*
         * Example 1:
         * Write a program that declares 1 integer variable x, and then assigns 7 to it.
         * Write an if statement to print out "Less than 10" if x is less than 10.
         * Change x to equal 15, and notice the result (console should not display anything).
         */
 int x = 7;
 if (x < 10) {
     System.out.println("Less than 10");
 }
 x = 15;

        /*
         * Example 2:
         * Write a program that declares 1 integer variable x, and then assigns 7 to it.
         * Write an if-else statement that prints out "Less than 10" if x is less than 10,
         * and "Greater than 10" if x is greater than 10.
         * Change x to 15 and notice the result.
         */
// int x = 7;
// if (x < 10) {
//     System.out.println("Less than 10");
// } else {
//     System.out.println("Greater than 10");
// }
// x = 15;

        /*
         * Example 3:
         * Write a program that declares 1 integer variable x, and then assigns 15 to it.
         * Write an if-else-if statement that prints out "Less than 10" if x is less than 10;
         * "Between 10 and 20" if x is greater than 10 but less than 20, and "Greater than or equal to 20"
         * if x is greater than or equal to 20. Change x to 50 and notice the result.
         */
// int x = 15;
// if (x < 10) {
//     System.out.println("Less than 10");
// } else if (x > 10 && x < 20) {
//     System.out.println("Between 10 and 20");
// } else {
//     System.out.println("Greater than or equal to 20");
// }
// x = 50;

        /*
         * Example 4:
         * Write a program that declares 1 integer variable x, and then assigns 15 to it.
         * Write an if-else statement that prints "Out of range" if the number is less than 10 or greater than 20
         * and prints "In range" if the number is between 10 and 20 (including equal to 10 or 20).
         * Change x to 5 and notice the result.
         */
// int x = 15;
// if (x < 10 || x > 20) {
//     System.out.println("Out of range");
// } else {
//     System.out.println("In range");
// }
// x = 5;

        /*
         * Example 5:
         * Write a program that uses if-else-if statements to print out grades A, B, C, D, F, according to the following criteria:
         * A: 90-100
         * B: 80-89
         * C: 70-79
         * D: 60-69
         * F: <60
         * Use the Scanner class to accept a number score from the user to determine the letter grade.
         * Print out "Score out of range" if the score is less than 0 or greater than 100.
         */
// Scanner scanner = new Scanner(System.in);
// int score = scanner.nextInt();
// if (score >= 90 && score <= 100) {
//     System.out.println("A");
// } else if (score >= 80 && score < 90) {
//     System.out.println("B");
// } else if (score >= 70 && score < 80) {
//     System.out.println("C");
// } else if (score >= 60 && score < 70) {
//     System.out.println("D");
// } else if (score < 60 && score >= 0) {
//     System.out.println("F");
// } else {
//     System.out.println("Score out of range");
// }

        /*
         * Example 6:
         * Write a program that accepts an integer between 1 and 7 from the user.
         * Use a switch statement to print out the corresponding weekday.
         * Print "Out of range" if the number is less than 1 or greater than 7.
         * Do not forget to include "break" statements in each of your cases.
         */
// Scanner scanner = new Scanner(System.in);
// int day = scanner.nextInt();
// switch (day) {
//     case 1: System.out.println("Monday"); break;
//     case 2: System.out.println("Tuesday"); break;
//     case 3: System.out.println("Wednesday"); break;
//     case 4: System.out.println("Thursday"); break;
//     case 5: System.out.println("Friday"); break;
//     case 6: System.out.println("Saturday"); break;
//     case 7: System.out.println("Sunday"); break;
//     default: System.out.println("Out of range"); break;
// }

        /*
         * Example 7:
         * Create a program that lets the users input their filing status and income.
         * Display how much tax the user would have to pay according to status and income.
         * The U.S. federal personal income tax is calculated based on the filing status and taxable income.
         * There are four filing statuses: Single, Married Filing Jointly, Married Filing Separately, and Head of Household.
         * The tax rates for 2009 are shown below.
         */
// Scanner scanner = new Scanner(System.in);
// System.out.println("Enter your filing status:");
// String status = scanner.nextLine();
// System.out.println("Enter your income:");
// double income = scanner.nextDouble();
// // Tax calculation logic here (not displayed)
        /*
         * Example 8:
         * Problem: Write a program that prints all the even numbers from 1 to 100.
         */
// for (int i = 1; i <= 100; i++) {
//     if (i % 2 == 0) {
//         System.out.println(i);
//     }
// }

        /*
         * Example 9:
         * Problem: Write a program to calculate the factorial of a number provided by the user.
         */
// Scanner scanner = new Scanner(System.in);
// System.out.print("Enter a number: ");
// int number = scanner.nextInt();
// int factorial = 1;
// for (int i = 1; i <= number; i++) {
//     factorial *= i;
// }
// System.out.println("Factorial of " + number + " is " + factorial);

        /*
         * Example 10:
         * Problem: Write a program that asks the user for a number and then prints whether the number is prime or not.
         */
// Scanner scanner = new Scanner(System.in);
// System.out.print("Enter a number: ");
// int num = scanner.nextInt();
// boolean isPrime = true;
// for (int i = 2; i <= num / 2; i++) {
//     if (num % i == 0) {
//         isPrime = false;
//         break;
//     }
// }
// if (isPrime && num > 1) {
//     System.out.println(num + " is a prime number.");
// } else {
//     System.out.println(num + " is not a prime number.");
// }

        /*
         * Example 11:
         * Problem: Write a program that prints the multiplication table of a number n provided by the user, up to 10.
         */
// Scanner scanner = new Scanner(System.in);
// System.out.print("Enter a number: ");
// int n = scanner.nextInt();
// for (int i = 1; i <= 10; i++) {
//     System.out.println(n + " * " + i + " = " + (n * i));
// }

        /*
         * Example 12:
         * Problem: Write a program that continuously asks the user for numbers until the user inputs -1, then prints the sum of all numbers entered.
         */
// Scanner scanner = new Scanner(System.in);
// int sum = 0;
// int number;
// do {
//     System.out.print("Enter a number (-1 to stop): ");
//     number = scanner.nextInt();
//     if (number != -1) {
//         sum += number;
//     }
// } while (number != -1);
// System.out.println("Sum of all numbers: " + sum);

        /*
         * Example 13:
         * Problem: Write a program that prints a simple ASCII art pattern of your choice using nested loops.
         */
// for (int i = 1; i <= 5; i++) {
//     for (int j = 1; j <= i; j++) {
//         System.out.print("* ");
//     }
//     System.out.println();
// }

        /*
         * Example 14:
         * Problem: Write a program that simulates a dice roll repeatedly until the user decides to quit by entering 'q'.
         */
// Scanner scanner = new Scanner(System.in);
// String input;
// do {
//     int dice = (int) (Math.random() * 6 + 1);
//     System.out.println("Dice roll: " + dice);
//     System.out.print("Roll again? (q to quit): ");
//     input = scanner.next();
// } while (!input.equalsIgnoreCase("q"));

        /*
         * Example 15:
         * Problem: Write a program that reads a string from the user and prints it in reverse order.
         */
// Scanner scanner = new Scanner(System.in);
// System.out.print("Enter a string: ");
// String input = scanner.next();
// String reversed = "";
// for (int i = input.length() - 1; i >= 0; i--) {
//     reversed += input.charAt(i);
// }
// System.out.println("Reversed string: " + reversed);

        /*
         * Example 16:
         * Problem: Write a program that asks for numbers between 1 and 10 until the user enters 0, then prints the maximum and minimum numbers entered.
         */
// Scanner scanner = new Scanner(System.in);
// int max = Integer.MIN_VALUE;
// int min = Integer.MAX_VALUE;
// int number;
// do {
//     System.out.print("Enter a number (0 to stop): ");
//     number = scanner.nextInt();
//     if (number > 0 && number <= 10) {
//         if (number > max) max = number;
//         if (number < min) min = number;
//     }
// } while (number != 0);
// System.out.println("Maximum: " + max);
// System.out.println("Minimum: " + min);

        /*
         * Example 17:
         * Problem: Write a program that asks the user to input a letter. Use a switch statement to print whether the letter is a vowel or consonant.
         */
// Scanner scanner = new Scanner(System.in);
// System.out.print("Enter a letter: ");
// char ch = scanner.next().toLowerCase().charAt(0);
// switch (ch) {
//     case 'a':
//     case 'e':
//     case 'i':
//     case 'o':
//     case 'u':
//         System.out.println(ch + " is a vowel.");
//         break;
//     default:
//         System.out.println(ch + " is a consonant.");
//         break;
// }



    }
}
