package glab_303_2_1_core_java_operators;

public class OperatorsAnsw {

    // 1. Sum of Two Integers
    {
        int a = 5, b = 7;
        int sum = a + b;
        System.out.println("The sum is " + sum + ".");
    }

    // 2. Difference Between Two Doubles
    {
        double x = 15.75, y = 8.25;
        double difference = x - y;
        System.out.println("The difference is " + difference + ".");
    }

    // 3. Multiplication of Two Floats
    {
        float a = 4.5f, b = 3.2f;
        float product = a * b;
        System.out.println("The product is " + product + ".");
    }

    // 4. Division of Two Integers
    {
        int a = 18, b = 3;
        int quotient = a / b;
        System.out.println("The quotient is " + quotient + ".");
    }

    // 5. Modulus Operation
    {
        int a = 25, b = 4;
        int remainder = a % b;
        System.out.println("The remainder is " + remainder + ".");
    }

    // 6. Logical AND Operator
    {
        int A = 5, B = -3;
        if (A > 0 & B < 0) {
            System.out.println("Both conditions are met: A is positive and B is negative.");
        }
    }

    // 7. Logical OR Operator
    {
        int X = 8, Y = 3;
        if (X > 10 || Y < 5) {
            System.out.println("At least one condition is met.");
        }
    }

    // 8. Logical NOT Operator
    {
        boolean input = true;
        boolean negated = !input;
        System.out.println("The opposite value is " + negated + ".");
    }

    // 9. Bitwise AND Operator
    {
        int a = 6, b = 3;
        int bitwiseAnd = a & b;
        System.out.println("Bitwise AND result is " + bitwiseAnd + ".");
    }

    // 10. Bitwise OR Operator
    {
        int a = 5, b = 9;
        int bitwiseOr = a | b;
        System.out.println("Bitwise OR result is " + bitwiseOr + ".");
    }

    // 11. Increment Operator
    {
        int a = 12;
        a++;
        System.out.println("The incremented value is " + a + ".");
    }

    // 12. Decrement Operator
    {
        int a = 15;
        a--;
        System.out.println("The decremented value is " + a + ".");
    }

    // 13. Compound Addition Assignment
    {
        int initial = 10, addValue = 7;
        initial += addValue;
        System.out.println("The updated value is " + initial + ".");
    }

    // 14. Compound Multiplication Assignment
    {
        int initial = 4, multiplyBy = 5;
        initial *= multiplyBy;
        System.out.println("The updated value is " + initial + ".");
    }

    // 15. Compare Two Floats
    {
        float a = 5.8f, b = 6.3f;
        if (a < b) {
            System.out.println(a + " is less than " + b + ".");
        } else if (a > b) {
            System.out.println(a + " is greater than " + b + ".");
        } else {
            System.out.println(a + " is equal to " + b + ".");
        }
    }

    // 16. Check Even/Odd Using Modulus
    {
        int number = 22;
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    // 17. Bitwise Shift Left
    {
        int num = 7;
        int shifted = num << 2;
        System.out.println("Left-shifted value is " + shifted + ".");
    }

    // 18. Bitwise Shift Right
    {
        int num = 8;
        int shifted = num >> 1;
        System.out.println("Right-shifted value is " + shifted + ".");
    }

    // 19. Absolute Value Calculation
    {
        int number = -12;
        int abs = number < 0 ? -number : number;
        System.out.println("The absolute value is " + abs + ".");
    }

    // 20. Check if Number is Positive or Negative
    {
        int number = 0;
        String result = (number > 0) ? "positive" : (number < 0) ? "negative" : "zero";
        System.out.println("The number is " + result + ".");
    }

    // 21. Compare Character Values
    {
        char a = 'a', b = 'c';
        if (a < b) {
            System.out.println("'" + a + "' is smaller than '" + b + "'.");
        } else if (a > b) {
            System.out.println("'" + a + "' is greater than '" + b + "'.");
        } else {
            System.out.println("'" + a + "' is equal to '" + b + "'.");
        }
    }

    // 22. Concatenate Two Strings
    {
        String str1 = "Java", str2 = "Rocks";
        String concatenated = str1 + str2;
        System.out.println("The concatenated string is '" + concatenated + "'.");
    }

    // 23. Check Leap Year Using Logical Operators
    {
        int year = 2024;
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(year + (isLeapYear ? " is a leap year." : " is not a leap year."));
    }

    // 24. Bitwise XOR Operation
    {
        int a = 5, b = 3;
        int xorResult = a ^ b;
        System.out.println("Bitwise XOR result is " + xorResult + ".");
    }

    // 25. Check Divisibility by Both 3 and 5
    {
        int number = 15;
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println(number + " is divisible by both 3 and 5.");
        }
    }

    // 26. Determine Largest of Two Integers
    {
        int a = 18, b = 22;
        int largest = a > b ? a : b;
        System.out.println("The larger number is " + largest + ".");
    }

    // 27. Calculate Power of Two
    {
        int base = 3;
        int result = (int) Math.pow(base, 2);
        System.out.println(base + " raised to the power of 2 is " + result + ".");
    }

    // 28. Toggle Boolean Value
    {
        boolean input = false;
        boolean toggled = !input;
        System.out.println("The toggled value is " + toggled + ".");
    }

    // 29. Unary Minus Operator
    {
        int number = 45;
        int negated = -number;
        System.out.println("The result of applying unary minus is " + negated + ".");
    }

    // 30. Find BMI
    {
        double weight = 70, height = 1.75;
        double bmi = weight / (height * height);
        System.out.println("Your BMI is " + String.format("%.2f", bmi) + ".");
    }

    // 31. Check Voter Eligibility
    {
        int age = 17;
        String eligibility = age >= 18 ? "eligible to vote." : "not eligible to vote.";
        System.out.println("You are " + eligibility);
    }

    // 32. Check Prime Status
    {
        int number = 29;
        boolean isPrime = number > 1;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(number + (isPrime ? " is a prime number." : " is not a prime number."));
    }

    // 33. Check Palindrome String
    {
        String word = "level";
        String reversed = new StringBuilder(word).reverse().toString();
        boolean isPalindrome = word.equals(reversed);
        System.out.println(word + (isPalindrome ? " is a palindrome." : " is not a palindrome."));
    }

    // 34. Reverse a String
    {
        String input = "hello";
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("The reversed string is '" + reversed + "'.");
    }

    // 35. Check for Alphabetic Character
    {
        char c = 'g';
        boolean isAlphabetic = Character.isAlphabetic(c);
        System.out.println("'" + c + "' is " + (isAlphabetic ? "an" : "not an") + " alphabetic character.");
    }

    // 36. Bitwise NOT Operator
    {
        int num = 9;
        int bitwiseNot = ~num;
        System.out.println("Bitwise NOT result is " + bitwiseNot + ".");
    }

    // 37. Swap Two Variables Without Temporary Variable
    {
        int A = 4, B = 7;
        A = A + B;  // A becomes 11
        B = A - B;  // B becomes 4
        A = A - B;  // A becomes 7
        System.out.println("After swapping: A = " + A + ", B = " + B + ".");
    }

    // 38. Count Vowels in a String
    {
        String word = "banana";
        int count = 0;
        for (char c : word.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        System.out.println("The number of vowels is " + count + ".");
    }

    // 39. Sum of Odd Integers in a Range
    {
        int start = 5, end = 10;
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("The sum of odd integers between " + start + " and " + end + " is " + sum + ".");
    }

    // 40. Compare Decimal and Binary Values
    {
        int decimal = 8, binary = 0b1000;
        String result = (decimal == binary) ? "Both values are equal." : "The values are not equal.";
        System.out.println(result);
    }

    // 41. Check Character Case
    {
        char c = 'A';
        String caseType = Character.isUpperCase(c) ? "uppercase" : "lowercase";
        System.out.println("'" + c + "' is " + caseType + ".");
    }

    // 42. Round a Double Value
    {
        double value = 5.87;
        int rounded = (int) Math.round(value);
        System.out.println("The rounded value is " + rounded + ".");
    }

    // 43. Compare Object References
    {
        String s1 = new String("Hello"), s2 = new String("Hello");
        System.out.println("The two references are " + (s1 == s2 ? "equal." : "not equal."));
    }

    // 44. Compare Using .equals() Method
    {
        String str1 = "Hello", str2 = "Hello";
        boolean areEqual = str1.equals(str2);
        System.out.println("The two values are " + (areEqual ? "equal." : "not equal."));
    }

    // 45. Determine Even/Odd Using Ternary Operator
    {
        int number = 29;
        String parity = (number % 2 == 0) ? "even" : "odd";
        System.out.println(number + " is " + parity + ".");
    }

    // 46. Multiply by a Factor of 2 Using Left Shift
    {
        int num = 3;
        int result = num << 1;
        System.out.println("Multiplying " + num + " by 2 gives " + result + ".");
    }

    // 47. Nested Ternary Operator for Grading
    {
        int score = 85;
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
        System.out.println("The grade is " + grade + ".");
    }

    // 48. Sum Digits of a Two-Digit Number
    {
        int number = 48;
        int sum = number / 10 + number % 10;
        System.out.println("The sum of the digits is " + sum + ".");
    }

    // 49. Average of Three Floats
    {
        float a = 4.5f, b = 7.8f, c = 6.2f;
        float average = (a + b + c) / 3;
        System.out.println("The average is " + String.format("%.2f", average) + ".");
    }

    // 50. Convert Celsius to Fahrenheit
    {
        int celsius = 25;
        double fahrenheit = celsius * 9 / 5.0 + 32;
        System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit.");
    }

}

