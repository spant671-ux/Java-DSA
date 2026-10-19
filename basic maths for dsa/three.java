// three.java — Sum of Digits of an Integer in Java
//
// Problem Statement:
//   Given an integer, compute and return the sum of all its individual digits.
//
// Mathematical Mechanism:
//   - Extract the last digit using modulo 10 (num % 10).
//   - Add this digit to an accumulator variable (sum += digit).
//   - Truncate the last digit using integer division (num /= 10).
//   - Repeat until no digits remain (num == 0).
//
// Complexity:
//   - Time Complexity:  O(log10(num)) — proportional to the number of digits.
//   - Space Complexity: O(1) — constant auxiliary storage.
//
// Trace (num = 53127):
//   sum = 0
//   + 7 -> sum = 7
//   + 2 -> sum = 9
//   + 1 -> sum = 10
//   + 3 -> sum = 13
//   + 5 -> sum = 18 -> returns 18

public class three {

    // Computes the sum of all digits in 'num'
    static int sumOfNums(int num) {
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;        // Extract the last digit
            sum = sum + digit;           // Add digit to running total
            num = num / 10;              // Discard the processed digit
        }

        return sum;
    }

    static void main() {
        System.out.println(sumOfNums(53127)); // Expected output: 18 (5+3+1+2+7)
    }
}
