package glab_303_3_1_java_string_methods;

public class Scanner {
    public static void main(String[] args) {
        // Prompt 1: Greeting a User by Name
        /*
         * Task: Prompt the user to enter their first name and greet them.
         * Scanner instance: scannerGreet
         * Variable names: firstName
         * Example Data: John
         * Expected Output: "Hello, John!"
         */

        // Prompt 2: Calculate the Area of a Circle
        /*
         * Task: Prompt the user for the radius of a circle and calculate its area.
         * Scanner instance: scannerCircle
         * Variable names: circleRadius
         * Example Data: 5.0
         * Expected Output: "The area of the circle is 78.54."
         */

        // Prompt 3: Determine if a Number is Even or Odd
        /*
         * Task: Prompt the user to enter a number and determine whether it is even or odd.
         * Scanner instance: scannerEvenOdd
         * Variable names: inputNumber
         * Example Data: 4
         * Expected Output: "4 is an even number."
         */

        // Prompt 4: Calculate the Square Root
        /*
         * Task: Prompt the user to enter a number and compute its square root.
         * Scanner instance: scannerSqrt
         * Variable names: sqrtNumber
         * Example Data: 16.0
         * Expected Output: "The square root of 16.0 is 4.0."
         */

        // Prompt 5: Age Verification
        /*
         * Task: Prompt the user to enter their age and verify if they are 18 or older.
         * Scanner instance: scannerAge
         * Variable names: userAge
         * Example Data: 20
         * Expected Output: "You are eligible."
         */

        // Prompt 6: Sum of Two Integers
        /*
         * Task: Prompt the user to enter two integers and calculate their sum.
         * Scanner instance: scannerSum
         * Variable names: firstInt, secondInt
         * Example Data: 7, 8
         * Expected Output: "The sum is 15."
         */

        // Prompt 7: Calculate Body Mass Index (BMI)
        /*
         * Task: Prompt the user to enter their weight (kg) and height (m) and calculate their BMI.
         * Scanner instance: scannerBMI
         * Variable names: userWeight, userHeight
         * Example Data: 70.0, 1.75
         * Expected Output: "Your BMI is 22.86."
         */

        // Prompt 8: Concatenate Strings
        /*
         * Task: Prompt the user to enter two words and concatenate them.
         * Scanner instance: scannerConcat
         * Variable names: wordOne, wordTwo
         * Example Data: "Java", "Programming"
         * Expected Output: "Combined: JavaProgramming."
         */

        // Prompt 9: Temperature Conversion (Celsius to Fahrenheit)
        /*
         * Task: Prompt the user to enter a temperature in Celsius and convert it to Fahrenheit.
         * Scanner instance: scannerTempConv
         * Variable names: celsiusTemp
         * Example Data: 25.0
         * Expected Output: "25.0°C is 77.0°F."
         */

        // Prompt 10: Count Characters in a String
        /*
         * Task: Prompt the user to enter a word and count the number of characters.
         * Scanner instance: scannerCharCount
         * Variable names: inputString
         * Example Data: "Elephant"
         * Expected Output: "The word 'Elephant' has 8 characters."
         */

        // Prompt 11: Compute the Perimeter of a Rectangle
        /*
         * Task: Prompt the user to enter the length and width of a rectangle and compute its perimeter.
         * Scanner instance: scannerPerimeter
         * Variable names: length, width
         * Example Data: 4.0, 6.0
         * Expected Output: "The perimeter of the rectangle is 20.0."
         */

        // Prompt 12: Determine Leap Year
        /*
         * Task: Prompt the user to enter a year and determine whether it's a leap year.
         * Scanner instance: scannerLeapYear
         * Variable names: inputYear
         * Example Data: 2024
         * Expected Output: "2024 is a leap year."
         */

        // Prompt 13: Calculate Average of Three Test Scores
        /*
         * Task: Prompt the user to enter three test scores and compute their average.
         * Scanner instance: scannerTestScores
         * Variable names: scoreOne, scoreTwo, scoreThree
         * Example Data: 85, 90, 80
         * Expected Output: "The average score is 85.0."
         */

        // Prompt 14: Multiply Two Floats
        /*
         * Task: Prompt the user to enter two floating-point numbers and multiply them.
         * Scanner instance: scannerFloatMultiply
         * Variable names: floatOne, floatTwo
         * Example Data: 1.5, 2.3
         * Expected Output: "The result is 3.45."
         */

        // Prompt 15: Convert Minutes to Hours and Minutes
        /*
         * Task: Prompt the user to enter a number of minutes and convert it to hours and minutes.
         * Scanner instance: scannerTimeConv
         * Variable names: totalMinutes
         * Example Data: 125
         * Expected Output: "125 minutes is 2 hours and 5 minutes."
         */

//        Error Handling: Always anticipate and handle potential input errors using try-catch blocks or input validation.
//        Data Parsing: Be mindful when parsing numeric inputs to avoid exceptions due to incorrect formats.
//        Scanner Reuse: Avoid reusing the same Scanner object across different data types to prevent unexpected behavior.
//        Closing Scanner: Remember to close the Scanner after use to free system resources.

        // Example 1: Multiply Two Integers
        /*
         * Task: Prompt the user to enter two integers and multiply them.
         * Scanner instance: scannerIntMultiply
         * Variable names: num1, num2
         * Example Data: 6, 7
         * Expected Output: "The product is 42."
         */

        // Example 2: Check for Positive or Negative Number
        /*
         * Task: Prompt the user to enter a number and determine if it's positive, negative, or zero.
         * Scanner instance: scannerPosNeg
         * Variable names: numberCheck
         * Example Data: -5
         * Expected Output: "-5 is a negative number."
         */

        // Example 3: Sum of Digits in a Number
        /*
         * Task: Prompt the user to enter an integer and compute the sum of its digits.
         * Scanner instance: scannerSumDigits
         * Variable names: numToSum
         * Example Data: 345
         * Expected Output: "The sum of digits in 345 is 12."
         */

        // Example 4: Calculate Rectangle Area
        /*
         * Task: Prompt the user to enter the length and width of a rectangle and compute the area.
         * Scanner instance: scannerRectArea
         * Variable names: lengthRect, widthRect
         * Example Data: 8.0, 3.5
         * Expected Output: "The area of the rectangle is 28.0."
         */

        // Example 5: Compute Sales Tax
        /*
         * Task: Prompt the user to enter the purchase amount and compute the sales tax at 8%.
         * Scanner instance: scannerSalesTax
         * Variable names: purchaseAmount
         * Example Data: 120.0
         * Expected Output: "The sales tax is 9.6, and the total is 129.6."
         */

        // Example 6: Calculate Compound Interest
        /*
         * Task: Prompt the user to enter the principal, rate, and time, then calculate compound interest.
         * Scanner instance: scannerCompInterest
         * Variable names: principal, rate, timeYears
         * Example Data: 1000, 5.0, 2
         * Expected Output: "The compound interest after 2 years is 102.50."
         */

        // Example 7: Days Between Two Dates
        /*
         * Task: Prompt the user to enter two dates in "dd/MM/yyyy" format, then compute the number of days between them.
         * Scanner instance: scannerDateDiff
         * Variable names: firstDate, secondDate
         * Example Data: "01/01/2023", "10/01/2023"
         * Expected Output: "The number of days between 01/01/2023 and 10/01/2023 is 9."
         */

        // Example 8: Count Specific Character in a String
        /*
         * Task: Prompt the user to enter a string and a character to count its occurrences.
         * Scanner instance: scannerCharCount
         * Variable names: inputStr, searchChar
         * Example Data: "banana", 'a'
         * Expected Output: "The character 'a' appears 3 times."
         */

        // Example 9: Convert Milliseconds to Seconds
        /*
         * Task: Prompt the user to enter milliseconds and convert them to seconds.
         * Scanner instance: scannerMillis
         * Variable names: milliseconds
         * Example Data: 5000
         * Expected Output: "5000 milliseconds is 5 seconds."
         */

        // Example 10: Validate Password Length
        /*
         * Task: Prompt the user to enter a password and validate that it contains at least 8 characters.
         * Scanner instance: scannerPassLength
         * Variable names: userPassword
         * Example Data: "secure123"
         * Expected Output: "Password accepted."
         */
    }
}