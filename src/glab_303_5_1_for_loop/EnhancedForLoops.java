package glab_303_5_1_for_loop;

public class EnhancedForLoops {
    public static void main(String[] args){
        /* Task 1: Print All Elements in an Array
         * Write a program using an enhanced for loop to print all elements in an integer array.
         */
            /*
            int[] numbers = {1, 2, 3, 4, 5};
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
            */

        /* Task 2: Calculate the Sum of All Elements in an Array
         * Write a program using an enhanced for loop to sum all elements in an integer array.
         */

            int[] numbers = {1, 2, 3, 4, 5};
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            System.out.println("Sum: " + sum);


        /* Task 3: Find the Maximum Element in an Array
         * Write a program using an enhanced for loop to find the maximum element in an array of integers.
         */
/*
int[] numbers = {5, 9, 1, 3};
int max = Integer.MIN_VALUE;
for (int num : numbers) {
    if (num > max) {
        max = num;
    }
}
System.out.println("Maximum: " + max);
*/

        /* Task 4: Count Occurrences of a Specific Value
         * Write a program using an enhanced for loop to count how many times a specific value appears in an integer array.
         */
/*
int[] numbers = {1, 1, 2, 1, 3, 4, 1};
int count = 0;
int target = 1;
for (int num : numbers) {
    if (num == target) {
        count++;
    }
}
System.out.println(target + " appears " + count + " times.");
*/

        /* Task 5: Print All Strings in a List
         * Write a program using an enhanced for loop to print all strings stored in an ArrayList.
         */
/*
ArrayList<String> strings = new ArrayList<>(Arrays.asList("Hello", "World", "Java", "Python"));
for (String str : strings) {
    System.out.println(str);
}
*/

        /* Task 6: Convert All Strings in a List to Uppercase
         * Write a program using an enhanced for loop to convert all strings in an ArrayList to uppercase and print them.
         */
/*
ArrayList<String> strings = new ArrayList<>(Arrays.asList("Hello", "World", "Java", "Python"));
for (String str : strings) {
    System.out.println(str.toUpperCase());
}
*/

        /* Task 7: Sum of Array Using Enhanced For Loop
         * Write a program that sums the values of an array of doubles using an enhanced for loop.
         */
    /*
    double[] values = {1.0, 2.5, 3.7, 4.4};
    double total = 0.0;
    for (double value : values) {
        total += value;
    }
    System.out.println("Total: " + total);
    */

        /* Task 8: Print Even Numbers in an Array
         * Write a program using an enhanced for loop to print only even numbers from an array.
         */
/*
int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
for (int num : numbers) {
    if (num % 2 == 0) {
        System.out.println(num);
    }
}
*/

        /* Task 9: Find If a List Contains a Given String
         * Write a program using an enhanced for loop to determine if an ArrayList of strings contains a specific string.
         */
/*
ArrayList<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
String search = "banana";
boolean found = false;
for (String item : list) {
    if (item.equals(search)) {
        found = true;
        break;
    }
}
System.out.println("Found: " + found);
*/

        /* Task 10: Concatenate Strings from an Array
         * Write a program using an enhanced for loop to concatenate all strings in an array into a single string.
         */
/*
String[] words = {"Hello", "world", "this", "is", "Java"};
StringBuilder result = new StringBuilder();
for (String word : words) {
    result.append(word).append(" ");
}
System.out.println(result.toString().trim());
*/

        /* Task 11: Calculate the Average of Array Elements
         * Write a program using an enhanced for loop to calculate the average of an array of integers.
         */
/*
int[] numbers = {10, 20, 30, 40, 50};
int sum = 0;
for (int num : numbers) {
    sum += num;
}
double average = sum / (double)numbers.length;
System.out.println("Average: " + average);
*/

        /* Task 12: Reverse a List of Characters
         * Write a program using an enhanced for loop to print the elements of a List<Character> in reverse order.
         */
/*
List<Character> chars = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd'));
Collections.reverse(chars);
for (char c : chars) {
    System.out.print(c + " ");
}
System.out.println();
*/

        /* Task 13: Filter and Print Negative Numbers
         * Write a program using an enhanced for loop to print all negative numbers from an array of integers.
         */
/*
int[] numbers = {-1, 2, -3, 4, -5};
for (int num : numbers) {
    if (num < 0) {
        System.out.println(num);
    }
}
*/

        /* Task 14: Accumulate Strings Conditionally
         * Write a program using an enhanced for loop to add strings that start with 'a' from an array to a list.
         */
/*
String[] words = {"apple", "banana", "avocado", "grape", "apricot"};
ArrayList<String> aWords = new ArrayList<>();
for (String word : words) {
    if (word.startsWith("a")) {
        aWords.add(word);
    }
}
System.out.println(aWords);
*/

        /* Task 15: Print Characters of a String
         * Write a program using an enhanced for loop to print each character of a string individually.
         */
/*
String text = "Hello, World!";
for (char ch : text.toCharArray()) {
    System.out.println(ch);
}
*/

    }
}
