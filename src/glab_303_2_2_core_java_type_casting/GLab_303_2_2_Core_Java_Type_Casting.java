package glab_303_2_2_core_java_type_casting;

public class GLab_303_2_2_Core_Java_Type_Casting {
    public static void main(String[] args) {
        // Exercise 1: Cast an int to a byte. Initial value: 128
        // Expected output: -128

        // Exercise 2: Cast a float to an int. Initial value: 9.99
        // Expected output: 9

        // Exercise 3: Cast an int to a double. Initial value: 100
        // Expected output: 100.0

        // Exercise 4: Cast a double to a short. Initial value: 192.9
        // Expected output: 192

        // Exercise 5: Implicitly cast an int to long. Initial value: 50
        // Expected output: 50

        // Exercise 6: Explicitly cast a long to int. Initial value: 100000L
        // Expected output: 100000

        // Exercise 7: Cast a char to an int. Initial value: 'A'
        // Expected output: 65

        // Exercise 8: Cast an int to a char. Initial value: 97
        // Expected output: 'a'

        // Exercise 9: Cast a double to a float. Initial value: 123456.789
        // Expected output: 123456.79

        // Exercise 10: Cast a long to a byte. Initial value: 255
        // Expected output: -1

        // Exercise 11: Cast an int to a float. Initial value: 44
        // Expected output: 44.0

        // Exercise 12: Cast a byte to a double. Initial value: 12
        // Expected output: 12.0

        // Exercise 13: Cast a float to a double. Initial value: 88.35f
        // Expected output: 88.35

        // Exercise 14: Cast a boolean to a string (using String.valueOf method). Initial value: true
        // Expected output: "true"

        // Exercise 15: Cast an int to a string (using String.valueOf method). Initial value: 500
        // Expected output: "500"

        // Exercise 16: Implicit cast from short to int. Initial value: 32767
        // Expected output: 32767

        // Exercise 17: Explicitly cast an int to a byte. Initial value: 1000
        // Expected output: -24

        // Exercise 18: Cast a string to an int (using Integer.parseInt method). Initial value: "123"
        // Expected output: 123

        // Exercise 19: Cast an integer (boxed type) to an int. Initial value: new Integer(123)
        // Expected output: 123

        // Exercise 20: Cast a string to a double (using Double.parseDouble method). Initial value: "3.14159"
        // Expected output: 3.14159

        // Exercise 21: Cast a long to a float. Initial value: 123456789L
        // Expected output: 1.2345679E8

        // Exercise 22: Cast a double to an int. Initial value: 9876.54321
        // Expected output: 9876

        // Exercise 23: Cast a short to a double. Initial value: 120
        // Expected output: 120.0

        // Exercise 24: Cast a boolean to an integer-like string (using String.valueOf). Initial value: false
        // Expected output: "false"

        // Exercise 25: Cast a char to a short. Initial value: 'G'
        // Expected output: 71

        // Exercise 26: Cast a long to a double. Initial value: 2147483648L
        // Expected output: 2.147483648E9

        // Exercise 27: Cast a string to a float (using Float.parseFloat method). Initial value: "12.34"
        // Expected output: 12.34

        // Exercise 28: Cast an array of integers to an array of objects. Initial value: {1, 2, 3}
        // Expected output: Objects representing [1, 2, 3]

        // Exercise 29: Cast a numeric string to a long (using Long.parseLong method). Initial value: "789123"
        // Expected output: 789123

        // Exercise 30: Cast a boxed Float object to a primitive float. Initial value: new Float(42.42f)
        // Expected output: 42.42

        // Exercise 31: Cast an int to a long explicitly. Initial value: 42
        // Expected output: 42

        // Exercise 32: Cast a boxed Integer object to an Integer-like string (using toString method). Initial value: new Integer(500)
        // Expected output: "500"

        // Exercise 33: Cast a double to a long. Initial value: 999.99
        // Expected output: 999

        // Exercise 34: Cast a float to a string (using String.valueOf method). Initial value: 3.14f
        // Expected output: "3.14"

        // Exercise 35: Cast a numeric string to an int with error handling. Initial value: "XYZ" (invalid input)
        // Expected output: "Error parsing number"

        // Summary of Java Type Casting:
        // 1. Primitive vs. Reference Casting:
        //    - Primitive Casting: Converts between numeric types (e.g., int to double).
        //    - Reference Casting: Converts between object types in an inheritance hierarchy.
        // 2. Widening vs. Narrowing:
        //    - Widening: Automatic, safe conversion from smaller to larger type (e.g., int to long).
        //    - Narrowing: Requires explicit cast, from larger to smaller type (e.g., double to int), may lose data.
        // 3. Type Safety:
        //    - Important to prevent ClassCastException when casting incompatible types.
        // 4. Instanceof Operator:
        //    - Checks if an object is an instance of a specific class before casting to avoid errors.

        // Exercise 36: Cast an int to a short. Initial value: 32768
        // Expected output: -32768 (Overflow occurs)

        // Exercise 37: Cast a float to a byte. Initial value: 127.9f
        // Expected output: 127

        // Exercise 38: Cast an Object reference holding a String object to String type (safe cast)
        // Expected output: "Hello, World!"

        // Exercise 39: Cast an Object reference to an incompatible type (Integer to String)
        // Expected output: "ClassCastException"

        // Exercise 40: Use `instanceof` to check before casting (Integer object)
        // Expected output: "Integer detected: 42"

        // Exercise 41: Upcast a subclass object to its superclass type
        // Expected output: "Animal sound"

        // Exercise 42: Downcast a superclass object to a subclass type
        // Expected output: "Cat sound"

        // Exercise 43: Cast an Integer to double (using auto-unboxing and widening conversion)
        // Expected output: 3.0

        // Exercise 44: Use `instanceof` to confirm and safely cast an array of Animal references to a specific subclass type
        // Expected output: Prints details of only Dog objects

        // Exercise 45: Combine widening and narrowing conversions (int -> double -> short)
        // Expected output: Truncated to a short value after conversion to double
    }
}