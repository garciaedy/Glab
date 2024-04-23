package glab_303_5_1_for_loop;

public class GLab_303_5_1_For_Loop {

    public static void main(String[] args){
        /* Task 1: Print a Multiplication Table
         * Write a program that uses nested for loops to print a multiplication table.
         * The outer loop should iterate through the numbers you are multiplying by,
         * and the inner loop should iterate through the range you are multiplying.
         */
/*
for (int i = 1; i <= 10; i++) {
    for (int j = 1; j <= 10; j++) {
        System.out.printf("%d * %d = %d\t", i, j, i * j);
    }
    System.out.println(); // Move to the next line after each row
}
*/

        /* Task 2: Find the Greatest Common Divisor
         * Write a program that prompts the user to enter two positive integers, and find their greatest common divisor (GCD).
         * Examples:
         * Enter 2 and 4. The gcd is 2.
         * Enter 16 and 24. The gcd is 8.
         * How do you find the gcd?
         * Name the two input integers n1 and n2.
         * You know number 1 is a common divisor, but it may not be the gcd.
         * Check whether k (for k = 2, 3, 4, and so on) is a common divisor for n1 and n2, until k is greater than n1 or n2.
         */
/*
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the first number: ");
int n1 = scanner.nextInt();
System.out.print("Enter the second number: ");
int n2 = scanner.nextInt();
int gcd = 1;
int k = 2; // Start checking for gcd from 2
while (k <= n1 && k <= n2) {
    if (n1 % k == 0 && n2 % k == 0) {
        gcd = k; // Update gcd if k is a common divisor
    }
    k++; // Increment k
}
System.out.println("The gcd of " + n1 + " and " + n2 + " is " + gcd);
*/

        /* Task 3: Predict Future Tuition
         * Suppose the tuition for a university is $10,000 for the current year and increases by 7 percent every year.
         * In how many years will the tuition be doubled?
         * Year
         * Tuition
         * 0
         * $10,000
         * 1
         * tuition = 1.07 * tuition
         * …
         * tuition = 1.07 * tuition
         * …
         * tuition = 1.07 * tuition
         * …
         * …
         * ?
         * $20,000 or more
         */
/*
double tuition = 10000; // Starting tuition
double target = 20000;  // Target tuition
int year = 0;
while (tuition < target) {
    tuition *= 1.07; // Increase tuition by 7% each year
    year++;           // Increment the year counter
}
System.out.println("Tuition will double in " + year + " years.");
*/

        /* Task 4: Print All Lowercase Letters
         * Write a program using a for loop to print all lowercase letters from 'a' to 'z'.
         */
/*
for (char c = 'a'; c <= 'z'; c++) {
    System.out.print(c + " ");
}
System.out.println();
*/

        /* Task 5: Sum of Natural Numbers
         * Write a program using a for loop to calculate the sum of the first 100 natural numbers.
         */
/*
int sum = 0;
for (int i = 1; i <= 100; i++) {
    sum += i;
}
System.out.println("Sum of first 100 natural numbers: " + sum);
*/

        /* Task 6: Generate Fibonacci Series Up to N Terms
         * Write a program using a for loop to print the first N terms of the Fibonacci series.
         * N is provided by the user.
         */
/*
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number of terms: ");
int terms = scanner.nextInt();
int first = 0, second = 1, next;
for (int i = 1; i <= terms; i++) {
    System.out.print(first + " ");
    next = first + second;
    first = second;
    second = next;
}
System.out.println();
*/

        /* Task 7: Print a Rectangle of Asterisks
         * Write a program using a for loop to print a rectangle of asterisks with 5 rows and 10 columns.
         */
/*
for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 10; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
*/

        /* Task 8: Count Down Timer
         * Write a program that counts down from 30 to 0, printing each number using a for loop. After reaching 0, print "GO!".
         */
/*
for (int i = 30; i >= 0; i--) {
    System.out.println(i);
}
System.out.println("GO!");
*/

        /* Task 9: Print Even Numbers in Reverse Order
         * Write a program using a for loop to print even numbers from 100 down to 0 in reverse order.
         */
/*
for (int i = 100; i >= 0; i -= 2) {
    System.out.println(i);
}
*/

        /* Task 10: Sum of Squares
         * Write a program using a for loop that calculates the sum of the squares of the first 50 positive integers.
         */
/*
int sumSquares = 0;
for (int i = 1; i <= 50; i++) {
    sumSquares += i * i;
}
System.out.println("Sum of the squares of the first 50 positive integers: " + sumSquares);
*/

        /* Task 11: Calculate Compound Interest
         * Write a program using a for loop that calculates the compound interest on an initial amount of $1,000
         * with an interest rate of 5% over 10 years.
         */
/*
double principal = 1000;
double rate = 0.05;
for (int year = 1; year <= 10; year++) {
    principal *= (1 + rate);
}
System.out.println("Amount after 10 years: " + principal);
*/

        /* Task 12: Decimal to Binary Conversion
         * Write a program using a for loop to convert a decimal number entered by the user to binary.
         */
/*
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a decimal number: ");
int decimal = scanner.nextInt();
StringBuilder binary = new StringBuilder();
for (int temp = decimal; temp > 0; temp /= 2) {
    binary.insert(0, temp % 2);
}
System.out.println("Binary representation: " + binary.toString());
*/

        /* Task 13: Prime Numbers Within a Range
         * Write a program using a for loop to print all prime numbers between 2 and 100.
         */
/*
boolean isPrime;
for (int i = 2; i <= 100; i++) {
    isPrime = true;
    for (int j = 2; j <= i / 2; j++) {
        if (i % j == 0) {
            isPrime = false;
            break;
        }
    }
    if (isPrime) {
        System.out.println(i);
    }
}
*/

    }
}
