package glab_303_3_1_java_string_methods;

public class GLab_303_3_1_Java_String_methods {
    public static void main(String[] args) {
        /*
         * Example 2: Check if String Is Empty
         * Problem: Write a function to check if a given string is empty.
         * Initial data: "" (an empty string)
         * Expected output: true
         * public boolean isStringEmpty(String str) {}
         */

        /*
         * Java Substring
         *
         * Example 3: Extract a Substring
         * Problem: Write a method that extracts a substring from a given string from index `start` to index `end`.
         * Initial data: "hello world", start: 0, end: 5
         * Expected output: "hello"
         * public String extractSubstring(String str, int start, int end) {}
         */

        /*
         * Example 4: Remove a Substring
         * Problem: Write a method to remove a specific substring from a string.
         * Initial data: "hello world", substring: "world"
         * Expected output: "hello "
         * public String removeSubstring(String str, String substring) {}
         */

        /*
         * Java Substring Comparisons
         *
         * Example 5: Find Lexicographically Smallest and Largest Substring
         * Problem: Write a function that finds the lexicographically smallest and largest substrings of length `k` from a given string.
         * Initial data: "welcometojava", k: 3
         * Expected output: ["ava", "wel"]
         * public String[] findSmallestAndLargestSubstring(String str, int k) {}
         */

        /*
         * Example 6: Compare Two Strings Lexicographically
         * Problem: Write a method to compare two strings lexicographically without using library functions.
         * Initial data: "apple", "banana"
         * Expected output: -1 (because "apple" is less than "banana")
         * public int compareStrings(String str1, String str2) {}
         */

        /*
         * Java String Reverse
         *
         * Example 7: Reverse a String
         * Problem: Write a method that reverses a given string.
         * Initial data: "OpenAI"
         * Expected output: "IAnepO"
         * public String reverseString(String str) {}
         */

        /*
         * Example 8: Check for Palindrome
         * Problem: Write a function to determine if a given string is a palindrome.
         * Initial data: "level"
         * Expected output: true
         * public boolean isPalindrome(String str) {}
         */

        /*
         * Java String Tokens
         *
         * Example 9: Tokenize a String Based on Delimiters
         * Problem: Write a method that splits a string based on a delimiter and returns an array of tokens.
         * Initial data: "java,python,c#", delimiter: ","
         * Expected output: ["java", "python", "c#"]
         * public String[] tokenizeString(String str, String delimiter) {}
         */

        /*
         * Example 10: Count Words in a String
         * Problem: Write a function to count the number of words in a string. Assume words are separated by spaces.
         * Initial data: "The quick brown fox"
         * Expected output: 4
         * public int countWords(String str) {}
         */

        /*
         * Additional String Manipulation Exercises
         *
         * Example 11: Convert to Upper Case
         * Problem: Write a function that converts all characters in a string to upper case.
         * Initial data: "hello"
         * Expected output: "HELLO"
         * public String toUpperCase(String str) {}
         */

        /*
         * Example 12: Convert to Lower Case
         * Problem: Write a function that converts all characters in a string to lower case.
         * Initial data: "GOODBYE"
         * Expected output: "goodbye"
         * public String toLowerCase(String str) {}
         */

        /*
         * Example 13: Replace Characters
         * Problem: Write a method to replace all occurrences of a character with another character in a string.
         * Initial data: "banana", oldChar: 'a', newChar: 'o'
         * Expected output: "bonono"
         * public String replaceCharacters(String str, char oldChar, char newChar) {}
         */

        /*
         * Example 14: Check if String Contains a Substring
         * Problem: Write a function that checks if a string contains a particular substring.
         * Initial data: "programming", substring: "gram"
         * Expected output: true
         * public boolean containsSubstring(String str, String substring) {}
         */

        /*
         * Example 15: Trim Whitespace
         * Problem: Write a method to trim leading and trailing whitespace from a string.
         * Initial data: "   space   "
         * Expected output: "space"
         * public String trimWhitespace(String str) {}
         */

        /*
         * Example 16: Concatenate Two Strings
         * Problem: Write a function to concatenate two given strings.
         * Initial data: "Hello", "World"
         * Expected output: "HelloWorld"
         * public String concatenateStrings(String str1, String str2) {}
         */

        /*
         * Example 17: Replace a Word in a Sentence
         * Problem: Write a function that replaces all occurrences of a word in a sentence.
         * Initial data: "OpenAI is great", oldWord: "great", newWord: "awesome"
         * Expected output: "OpenAI is awesome"
         * public String replaceWord(String sentence, String oldWord, String newWord) {}
         */

        /*
         * Example 18: Find a Character Index
         * Problem: Write a method to find the first index of a specific character in a string.
         * Initial data: "alphabet", character: 'b'
         * Expected output: 5
         * public int findCharIndex(String str, char ch) {}
         */

        /*
         * Example 19: Repeat a String
         * Problem: Write a method that repeats a given string `n` times.
         * Initial data: "ha", times: 3
         * Expected output: "hahaha"
         * public String repeatString(String str, int n) {}
         */

        /*
         * Example 20: Capitalize First Letter of Each Word
         * Problem: Write a function to capitalize the first letter of each word in a string.
         * Initial data: "capitalize each word"
         * Expected output: "Capitalize Each Word"
         * public String capitalizeFirstLetter(String str) {}
         */

        /*
         * Example 21: Check if Two Strings Are Anagrams
         * Problem: Write a function to determine if two strings are anagrams.
         * Initial data: "listen", "silent"
         * Expected output: true
         * public boolean areAnagrams(String str1, String str2) {}
         */

        /*
         * Example 22: Count Specific Characters
         * Problem: Write a method to count the number of occurrences of a specific character in a string.
         * Example 22 (continued): Count Specific Characters
         * Problem: Write a method to count the number of occurrences of a specific character in a string.
         * Initial data: "programming", character: 'm'
         * Expected output: 2
         * public int countSpecificCharacter(String str, char ch) {}
         */

        /*
         * Example 23: Remove Non-Alphanumeric Characters
         * Problem: Write a function to remove all non-alphanumeric characters from a string.
         * Initial data: "He11o_World!"
         * Expected output: "He11oWorld"
         * public String removeNonAlphanumeric(String str) {}
         */

        /*
         * Example 24: Find Longest Word in a String
         * Problem: Write a function to find the longest word in a given string.
         * Initial data: "The quick brown fox jumps over the lazy dog"
         * Expected output: "jumps"
         * public String findLongestWord(String str) {}
         */

        /*
         * Example 25: Compare Two Strings Ignoring Case
         * Problem: Write a function to compare two strings, ignoring case sensitivity.
         * Initial data: "Hello", "hello"
         * Expected output: true
         * public boolean compareIgnoreCase(String str1, String str2) {}
         */

        /*
         * Example 26: Check if String Starts With a Prefix
         * Problem: Write a function to check if a string starts with a specific prefix.
         * Initial data: "Hello, World!", prefix: "Hello"
         * Expected output: true
         * public boolean startsWithPrefix(String str, String prefix) {}
         */

        /*
         * Example 27: Check if String Ends With a Suffix
         * Problem: Write a function to check if a string ends with a specific suffix.
         * Initial data: "Hello, World!", suffix: "World!"
         * Expected output: true
         * public boolean endsWithSuffix(String str, String suffix) {}
         */

        /*
         * Example 28: Get Last Index of a Character
         * Problem: Write a function to find the last index of a specific character in a string.
         * Initial data: "abracadabra", character: 'a'
         * Expected output: 10
         * public int getLastCharIndex(String str, char ch) {}
         */

        /*
         * Example 29: Extract Numeric Characters Only
         * Problem: Write a function to extract all numeric characters from a string.
         * Initial data: "Phone123Number456"
         * Expected output: "123456"
         * public String extractNumbers(String str) {}
         */

        /*
         * Example 30: Find Frequency of Each Character
         * Problem: Write a function to find the frequency of each character in a string.
         * Initial data: "frequency"
         * Expected output: {f=1, r=1, e=2, q=1, u=1, n=1, c=1, y=1}
         * public Map<Character, Integer> findCharFrequency(String str) {}
         */

        /*
         * Example 31: Check if String Contains Only Digits
         * Problem: Write a method to determine if a string contains only digits.
         * Initial data: "123456"
         * Expected output: true
         * public boolean containsOnlyDigits(String str) {}
         */

        /*
         * Example 32: Replace Words Using Regular Expressions
         * Problem: Write a function that replaces words using regular expressions.
         * Initial data: "I have 2 cats and 1 dog", pattern: "\\d"
         * Expected output: "I have # cats and # dog"
         * public String replaceUsingRegex(String str, String pattern, String replacement) {}
         */

        /*
         * Example 33: Split a String into an Array of Words
         * Problem: Write a method to split a string into an array of words.
         * Initial data: "Split this sentence into words"
         * Expected output: ["Split", "this", "sentence", "into", "words"]
         * public String[] splitIntoWords(String str) {}
         */

        /*
         * Example 34: Count Occurrences of a Substring
         * Problem: Write a function to count how many times a particular substring appears in a given string.
         * Initial data: "apple apple banana apple", substring: "apple"
         * Expected output: 3
         * public int countSubstringOccurrences(String str, String substring) {}
         */

        /*
         * Example 35: Get ASCII Value of Characters
         * Problem: Write a method to obtain the ASCII values of all characters in a string.
         * Initial data: "ASCII"
         * Expected output: [65, 83, 67, 73, 73]
         * public int[] getAsciiValues(String str) {}
         */

        /*
         * Example 36: Find First Non-Repeated Character
         * Problem: Write a function to find the first non-repeated character in a string.
         * Initial data: "swiss"
         * Expected output: 'w'
         * public Character findFirstNonRepeatedChar(String str) {}
         */

        /*
         * Example 37: Check if All Characters are Unique
         * Problem: Write a method to check if all characters in a string are unique.
         * Initial data: "unique"
         * Expected output: false
         * public boolean hasUniqueCharacters(String str) {}
         */

        /*
         * Example 38: Join Multiple Strings into One
         * Problem: Write a method that joins multiple strings into one string, separated by a delimiter.
         * Initial data: ["java", "python", "c++"], delimiter: "-"
         * Expected output: "java-python-c++"
         * public String joinStrings(String[] strArray, String delimiter) {}
         */

        /*
         * Example 39: Reverse Words in a Sentence
         * Problem: Write a function to reverse the words in a given sentence while preserving the order of words.
         * Initial data: "reverse the words in this sentence"
         * Expected output: "sentence this in words the reverse"
         * public String reverseWords(String str) {}
         */

        /*
         * Example 40: Extract Unique Words from a String
         * Problem: Write a method to extract unique words from a string while maintaining their order.
         * Initial data: "apple banana apple orange banana"
         * Expected output: ["apple", "banana", "orange"]
         * public List<String> extractUniqueWords(String str) {}
         */

        /*
         * Example 41: Find Longest Palindromic Substring
         * Problem: Write a function that finds the longest palindromic substring in a string.
         * Initial data: "bananas"
         * Expected output: "anana"
         * public String findLongestPalindromicSubstring(String str) {}
         */

        /*
         * Example 42: Find Most Frequent Word
         * Problem: Write a method to identify the most frequently occurring word in a given string.
         * Initial data: "apple orange apple banana orange apple"
         * Expected output: "apple"
         * public String findMostFrequentWord(String str) {}
         */

        /*
         * Example 43: Encode String Using Caesar Cipher
         * Problem: Write a function that encodes a string using Caesar cipher (shift characters by `k` positions).
         * Initial data: "hello", shift: 2
         * Expected output: "jgnnq"
         * public String caesarCipherEncode(String str, int k) {}
         */

        /*
         * Example 44: Decode String Using Caesar Cipher
         * Problem: Write a function that decodes a Caesar cipher-encoded string (shift characters backward by `k` positions).
         * Initial data: "jgnnq", shift: 2
         * Expected output: "hello"
         * public String caesarCipherDecode(String str, int k) {}
         */

        /*
         * Example 45: Remove Consecutive Duplicates
         * Problem: Write a function to remove consecutive duplicate characters from a string.
         * Initial data: "aaabbbccaaa"
         * Expected output: "abca"
         * public String removeConsecutiveDuplicates(String str) {}
         */

        /*
         * Example 46: Find Second Most Frequent Character
         * Problem: Write a function to find the second most frequent character in a string.
         * Initial data: "aabbbc"
         * Expected output: 'b'
         * public Character findSecondMostFrequentChar(String str) {}
         */
        /*
         * Summary of Important Concepts:
         *
         * - Immutability: Java strings are immutable. Any modification results in a new string object.
         * - StringBuilder/StringBuffer: Use these classes for efficient string modifications.
         * - Character Encoding: Specify the encoding explicitly to handle international characters.
         * - Regular Expressions: Use `Pattern` and `Matcher` classes for pattern matching and manipulation.
         * - String Pooling: String literals are pooled. Use `intern()` to reduce memory footprint.
         * - Avoid Excessive Concatenation: Use `StringBuilder` instead of `+` for multiple concatenations.
         * - Null Pointer Exceptions: Check for `null` before string operations.
         * - Off-By-One Errors: Be careful with indexing in methods like `substring`.
         * - Libraries: Utilize third-party libraries like Apache Commons Lang and Guava for string utilities.
         *
         * Practice Exercises:
         */

        /*
         * Exercise 1: Use StringBuilder for efficient concatenation
         * Initial data: ["Java", "is", "awesome"]
         * Expected output: "Java is awesome"
         * public String concatenateWithBuilder(String[] words) {}
         */

        /*
         * Exercise 2: Implement a function to detect null strings
         * Initial data: null
         * Expected output: "String is null"
         * public String detectNull(String str) {}
         */

        /*
         * Exercise 3: Find the first occurrence of a character in a string
         * Initial data: "concatenation", character: 'a'
         * Expected output: 4
         * public int findFirstOccurrence(String str, char ch) {}
         */

        /*
         * Exercise 4: Convert a string to a specified character encoding
         * Initial data: "¡Hola!", target encoding: "UTF-8"
         * Expected output: byte array representing "¡Hola!" in UTF-8
         * public byte[] convertToEncoding(String str, String encoding) {}
         */

        /*
         * Exercise 5: Use regular expressions to find all words in a string
         * Initial data: "Welcome to the Java world!"
         * Expected output: ["Welcome", "to", "the", "Java", "world"]
         * public List<String> findWordsUsingRegex(String str) {}
         */

        /*
         * Exercise 6: Compare string references with `==` and `equals()`
         * Initial data: "Java", "Java", new String("Java")
         * Expected output: `==` returns false for new object, `equals` returns true for all comparisons
         * public void compareStrings(String str1, String str2, String str3) {}
         */

        /*
         * Exercise 7: Use `intern()` to save memory with duplicate string literals
         * Initial data: new String("Hello")
         * Expected output: Reduced memory usage by pooling strings
         * public String useIntern(String str) {}
         */

        /*
         * Exercise 8: Replace all spaces with underscores using `replaceAll`
         * Initial data: "This is a test"
         * Expected output: "This_is_a_test"
         * public String replaceSpaces(String str) {}
         */

        /*
         * Exercise 9: Safely extract a substring
         * Initial data: "safesubstring", start: 4, end: 12
         * Expected output: "substring"
         * public String safeSubstring(String str, int start, int end) {}
         */

        /*
         * Exercise 10: Use third-party libraries for common string operations
         * Initial data: "stringutils", "StringUtils", "Reverse this string"
         * Expected output: Demonstrate Apache Commons Lang or Guava methods
         * public void useStringLibraries(String str) {}
         */
        /*
         * Exercise 11: Convert a string to lowercase and uppercase
         * Initial data: "Java Programming"
         * Expected output (lowercase): "java programming"
         * Expected output (uppercase): "JAVA PROGRAMMING"
         * public void convertToLowerAndUpperCase(String str) {}
         */

        /*
         * Exercise 12: Remove leading and trailing whitespace
         * Initial data: "   Hello, World!   "
         * Expected output: "Hello, World!"
         * public String trimWhitespace(String str) {}
         */

        /*
         * Exercise 13: Split a string into an array using a delimiter
         * Initial data: "apple,banana,cherry", delimiter: ","
         * Expected output: ["apple", "banana", "cherry"]
         * public String[] splitString(String str, String delimiter) {}
         */

        /*
         * Exercise 14: Check if a string starts with a specified prefix
         * Initial data: "Java Programming", prefix: "Java"
         * Expected output: true
         * public boolean startsWithPrefix(String str, String prefix) {}
         */

        /*
         * Exercise 15: Replace all occurrences of a specific character
         * Initial data: "banana", target: 'a', replacement: 'o'
         * Expected output: "bonono"
         * public String replaceAllCharacters(String str, char target, char replacement) {}
         */

        /*
         * Exercise 16: Check if two strings are anagrams
         * Initial data: "listen", "silent"
         * Expected output: true
         * public boolean areAnagrams(String str1, String str2) {}
         */

        /*
         * Exercise 17: Convert a string to a char array and back
         * Initial data: "convert"
         * Expected output: ['c', 'o', 'n', 'v', 'e', 'r', 't'] and then back to "convert"
         * public void convertToCharArrayAndBack(String str) {}
         */

        /*
         * Exercise 18: Find all positions of a specific substring
         * Initial data: "abracadabra", substring: "abra"
         * Expected output: [0, 7]
         * public List<Integer> findAllPositions(String str, String substring) {}
         */

        /*
         * Exercise 19: Compare strings ignoring case sensitivity
         * Initial data: "java", "JAVA"
         * Expected output: true
         * public boolean compareIgnoringCase(String str1, String str2) {}
         */

        /*
         * Exercise 20: Count the number of vowels in a string
         * Initial data: "beautiful"
         * Expected output: 5
         * public int countVowels(String str) {}
         */
    }
}