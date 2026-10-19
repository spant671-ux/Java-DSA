// one.java — Extract and Print Digits of a Number in Java
//
// Problem Statement:
//   Given an integer, extract and print each of its digits from right to left
//   (least significant digit to most significant digit).
//
// Mathematical Mechanism:
//   - Modulo 10 (num % 10): Extracts the last digit (e.g., 53127 % 10 = 7).
//   - Division by 10 (num / 10): Discards the last digit (e.g., 53127 / 10 = 5312).
//   - Repeat until num becomes 0.
//
// Complexity:
//   - Time Complexity:  O(log10(num)) — loop runs equal to the number of digits.
//   - Space Complexity: O(1) — constant extra space.
//
// Trace (num = 53127):
//   Iteration 1: digit = 7, remaining num = 5312
//   Iteration 2: digit = 2, remaining num = 531
//   Iteration 3: digit = 1, remaining num = 53
//   Iteration 4: digit = 3, remaining num = 5
//   Iteration 5: digit = 5, remaining num = 0 (loop terminates)

public class one {

    // Extracts and prints each digit of 'num' starting from the unit place
    static void printDigits(int num) {
        // While there are digits left to process
        while (num != 0) {
            int digit = num % 10;        // Extract the last (rightmost) digit
            System.out.println(digit);   // Print the current digit
            num = num / 10;              // Discard the last digit (integer truncation)
        }
    }

    static void main() {
        int num = 53127;
        printDigits(num);
    }
}
