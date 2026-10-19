// two.java — Count Total Digits in an Integer in Java
//
// Problem Statement:
//   Given an integer, calculate and return the total count of digits it contains.
//
// Mathematical Mechanism:
//   - Each division by 10 (num / 10) strips off one digit.
//   - Maintain an integer counter that increments with each division until num is 0.
//   - Alternative mathematical formula: count = (int) Math.log10(num) + 1.
//
// Complexity:
//   - Time Complexity:  O(log10(num)) — number of iterations equals number of digits.
//   - Space Complexity: O(1) — requires only a single counter variable.
//
// Trace (num = 34567):
//   34567 / 10 -> count = 1
//   3456  / 10 -> count = 2
//   345   / 10 -> count = 3
//   34    / 10 -> count = 4
//   3     / 10 -> count = 5, num = 0 -> returns 5

public class two {

    // Returns the total number of digits in 'num'
    static int countNum(int num) {
        int count = 0;

        // Loop runs until all digits are stripped away
        while (num != 0) {
            int digit = num % 10;        // Extract current digit
            count++;                     // Increment digit counter
            num = num / 10;              // Remove current digit
        }

        return count;
    }

    static void main() {
        System.out.println(countNum(34567)); // Expected output: 5
    }
}
