package glab_303_6_1_array;

public class Arrays2 {

    public static void main(String[] args){

    /* Exercise 1: Sum of Numbers in an Array
     * Objective: Write a method that takes an array of numbers as input and returns the sum of the numbers.
     * Edge Case: If the array is empty, return 0.
     * Examples:
     * - sumOfNumbers(new int[]{1, 2, 3, 4, 5}) should return 15.
     * - sumOfNumbers(new int[]{0, 0, 5}) should return 5.
     * - sumOfNumbers(new int[]{-1, 0, 1}) should return 0.
     * - sumOfNumbers(new int[]{}) should return 0.
     */

    /* Exercise 2: Filter Numbers Greater Than Ten
     * Objective: Write a method that takes an array of numbers and returns an array of numbers that are strictly greater than 10.
     * Example: numbersGreaterThanTen(new int[]{-1, 0, 1, 9, 9.5, 9.99, 10, 11, 20, 100}) should return {11, 20, 100}.
     */

    /* Exercise 3: All Numbers Greater Than Ten
     * Objective: Write a method that returns true if all numbers in an array are strictly greater than 10, and false otherwise.
     * Edge Case: If the array is empty, return true.
     * Examples:
     * - allGreaterThanTen(new int[]{11, 20, 100}) should return true.
     * - allGreaterThanTen(new int[]{9, 100, 299}) should return false.
     * - allGreaterThanTen(new int[]{}) should return true.
     */

    /* Exercise 4: Words With At Least Five Letters
     * Objective: Write a method that takes an array of words and returns an array of all words with five or more letters.
     * Example: wordsWithAtLeastFiveLetters(new String[]{"alphabet", "banana", "carrot", "doe", "egg"}) should return {"alphabet", "banana", "carrot"}.
     */

    /* Exercise 5: All Words Starting With 'A'
     * Objective: Write a method that returns true if all words in an array start with the letter 'A' (case-insensitive), and false otherwise.
     * Edge Case: If the array is empty, return true.
     * Examples:
     * - allStartingWithA(new String[]{"apple", "alligator", "Arkansas"}) should return true.
     * - allStartingWithA(new String[]{"Amy", "Bob"}) should return false.
     * - allStartingWithA(new String[]{}) should return true.
     */

    /* Exercise 6: Any Words Starting With 'B'
     * Objective: Write a method that returns true if there are any words in an array that start with the letter 'B' (case-insensitive), and false otherwise.
     * Examples:
     * - anyStartingWithB(new String[]{"Amy", "Bob"}) should return true.
     * - anyStartingWithB(new String[]{"apple", "alligator", "Arkansas"}) should return false.
     */

    /* Exercise 7: Word With At Least 'N' Vowels
     * Objective: Write a method that checks if a word has at least some number (n) of vowels.
     * Edge Case: If n is less than zero, return null.
     * Examples:
     * - hasAtLeastNVowels("uncopywriteable", 0) should return true.
     * - hasAtLeastNVowels("dangerous", 5) should return false.
     * - hasAtLeastNVowels("banana", -1) should return null.
     */

    /* Additional Exercises */
    /* Exercise 13: Find Maximum Number in an Array
     * Objective: Write a method that returns the maximum number found in an array of integers.
     * Examples:
     * - findMaximum(new int[]{1, 2, 3, 4, 5}) should return 5.
     * - findMaximum(new int[]{10, 9, 8, 100, 2, 3}) should return 100.
     * - findMaximum(new int[]{-1, -2, -3, -4}) should return -1.
     */

    /* Exercise 14: Sum of Diagonals in a Matrix
     * Objective: Write a method that takes a square matrix (2D array) and returns the sum of the diagonals.
     * Example: sumOfDiagonals(new int[][]{{1,2,3}, {4,5,6}, {7,8,9}}) should return 30 (1+5+9+3+5+7).
     */

    /* Exercise 15: Check Symmetry of a String
     * Objective: Write a method that checks if a given string is a palindrome.
     * Examples:
     * - isPalindrome("racecar") should return true.
     * - isPalindrome("hello") should return false.
     */

    /* Exercise 16: Convert Array to Set
     * Objective: Write a method that converts an array of integers into a Set to remove duplicates and returns this Set.
     * Example: arrayToSet(new Integer[]{1, 2, 2, 3, 4, 4, 5}) should return a Set containing {1, 2, 3, 4, 5}.
     */

    /* Exercise 17: Frequency Counter
     * Objective: Write a method that counts the frequency of each element in an array and returns a map of elements with their corresponding frequencies.
     * Example: countFrequencies(new int[]{1, 2, 2, 3, 3, 3, 4}) should return a map where the keys are the numbers and the values are the counts: {1=1, 2=2, 3=3, 4=1}.
     */

    /* Exercise 18: Merge Two Sorted Arrays
     * Objective: Write a method that merges two sorted arrays into one sorted array.
     * Examples:
     * - mergeArrays(new int[]{1, 3, 5}, new int[]{2, 4, 6}) should return {1, 2, 3, 4, 5, 6}.
     * - mergeArrays(new int[]{5, 10, 15}, new int[]{2, 20, 100}) should return {2, 5, 10, 15, 20, 100}.
     */

    /* Exercise 19: Reverse an Array
     * Objective: Write a method that reverses an array in place and returns the array.
     * Examples:
     * - reverseArray(new int[]{1, 2, 3, 4, 5}) should return {5, 4, 3, 2, 1}.
     * - reverseArray(new int[]{9, 8, 7}) should return {7, 8, 9}.
     */
}
}
