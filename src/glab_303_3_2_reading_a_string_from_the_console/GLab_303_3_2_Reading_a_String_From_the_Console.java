package glab_303_3_2_reading_a_string_from_the_console;

import java.util.Scanner;
import java.io.BufferedReader;  // Line 1: Import BufferedReader for efficient reading
import java.io.IOException;  // Line 2: Import IOException to handle input errors
import java.io.InputStreamReader;  // Line 3: Import InputStreamReader to convert bytes to characters



public class GLab_303_3_2_Reading_a_String_From_the_Console {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter three words separated by spaces: ");
//        String s1 = input.next();
//        String s2 = input.next();
//        String s3 = input.next();
//        System.out.println("s1 is " + s1);
//        System.out.println("s2 is " + s2);
//        System.out.println("s3 is " + s3);

//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a character: ");
//        String s = input.nextLine();
//        char ch = s.charAt(0);
//        System.out.println("The character entered is " + ch);
        Scanner scanner = new Scanner(System.in);  // Line 5: Create a new Scanner object to read console input

        System.out.print("Enter your name: ");  // Line 7: Prompt the user to enter their name
        String name = scanner.nextLine();  // Line 8: Read the entire line of text as the user's name

        System.out.println("Hello, " + name + "!");  // Line 10: Greet the user by printing their name

        Scanner intScanner = new Scanner(System.in);  // Line 5: Create a Scanner object specifically for integer input

//        Example 1b: Reading an Integer Input

        System.out.print("Enter your age: ");  // Line 7: Prompt the user to enter their age
        int age = intScanner.nextInt();  // Line 8: Read the user's input as an integer

        System.out.println("You are " + age + " years old.");  // Line 10: Print the age back to the user

        intScanner.close();  // Line 12: Close the Scanner to free up resources

//        Example 2b: Reading a Float Input

        Scanner floatScanner = new Scanner(System.in);  // Line 5: Create a Scanner object specifically for float input

        System.out.print("Enter your height in meters: ");  // Line 7: Prompt the user to enter their height
        float height = floatScanner.nextFloat();  // Line 8: Read the input as a float

        System.out.println("Your height is " + height + " meters.");  // Line 10: Print the height

        floatScanner.close();  // Line 12: Close the Scanner to free up resources

//       example 2c: mixes data types: double, int, and String.

//        Scanner mixedScanner = new Scanner(System.in);  // Line 5: Create a Scanner object for mixed input types
//
//        System.out.print("Enter your name: ");  // Line 7: Prompt the user to enter their name
//        String name = mixedScanner.nextLine();  // Line 8: Read the entire line of text as the user's name
//
//        System.out.print("Enter your age: ");  // Line 10: Prompt the user to enter their age
//        int age = mixedScanner.nextInt();  // Line 11: Read the user's input as an integer
//
//        System.out.print("Enter your height in meters: ");  // Line 13: Prompt the user to enter their height in meters
//        double height = mixedScanner.nextDouble();  // Line 14: Read the input as a double
//
//        // Line 16: Print a summary of the information collected
//        System.out.println("Hello, " + name + "! You are " + age + " years old and " + height + " meters tall.");
//
//        mixedScanner.close();  // Line 18: Close the Scanner to free up resources

        Scanner inputReader = new Scanner(System.in);  // Line 5: Create a Scanner object for mixed input types

        System.out.print("Enter your favorite fruit: ");  // Line 7: Prompt the user to enter their favorite fruit
        String favoriteFruit = inputReader.nextLine();  // Line 8: Read the entire line of text as the user's favorite fruit

        System.out.print("Enter the number of fruits you have: ");  // Line 10: Prompt the user to enter the quantity
        int fruitCount = inputReader.nextInt();  // Line 11: Read the user's input as an integer

        System.out.print("Enter the average weight per fruit in grams: ");  // Line 13: Prompt the user to enter weight per fruit
        double fruitWeight = inputReader.nextDouble();  // Line 14: Read the input as a double

        // Line 16: Print a summary of the information collected
        System.out.println("You have " + fruitCount + " " + favoriteFruit + "(s) with an average weight of " + fruitWeight + " grams each.");

        inputReader.close();  // Line 18: Close the Scanner to free up resources

//      Example 2: Reading String Input Efficiently with BufferedReader
        scanner.close();  // Line 12: Close the Scanner to free up resources
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));  // Line 6: Create BufferedReader to read console input

        try {
            System.out.print("Enter your city: ");  // Line 9: Prompt the user to enter a city
            String city = reader.readLine();  // Line 10: Read the entire line of text as the city name

            System.out.println("You are from " + city + ".");  // Line 12: Print a message containing the city name

            reader.close();  // Line 14: Close BufferedReader to free up resources

        } catch (IOException e) {  // Line 16: Handle potential I/O errors
            e.printStackTrace();  // Line 17: Print the error details to help debug
        }

//       Method 3: Using Console Class

        java.io.Console console = System.console();  // Line 3: Obtain the system console

        if (console != null) {  // Line 5: Check if a console is available
            String userName = console.readLine("Enter your username: ");  // Line 6: Read a string input for the username
            char[] passwordArray = console.readPassword("Enter your password: ");  // Line 7: Securely read the password without echoing

            System.out.println("Welcome, " + userName + "!");  // Line 9: Greet the user with their name

            // Clear password from memory after use
            java.util.Arrays.fill(passwordArray, ' ');  // Line 11: Erase the password from memory for security
        } else {
            System.out.println("No console available.");  // Line 13: Notify if no console is available
        }
    }
}
