// four.java — Reverse an Integer in Java
//
// Problem Statement:
//   Given an integer, return a new integer formed by reversing its digits.
//
// Mathematical Mechanism:
//   - To build the reversed number in base 10:
//       revNum = (revNum * 10) + digit;
//   - Multiplying revNum by 10 shifts all existing digits one place to the left,
//     creating a 0 in the units place to receive the new digit.
//   - Then divide num by 10 to move to the next digit.
//
// Complexity:
//   - Time Complexity:  O(log10(num)) — runs once per digit.
//   - Space Complexity: O(1) — constant auxiliary space.
//
// Trace (num = 98901):
//   Digit = 1 -> revNum = 0 * 10 + 1 = 1
//   Digit = 0 -> revNum = 1 * 10 + 0 = 10
//   Digit = 9 -> revNum = 10 * 10 + 9 = 109
//   Digit = 8 -> revNum = 109 * 10 + 8 = 1098
//   Digit = 9 -> revNum = 1098 * 10 + 9 = 10989 -> returns 10989

public class four {

    // Reverses the digits of 'num' and returns the reversed integer
    static int reverseNum(int num) {
        int revNum = 0;

        while (num != 0) {
            int digit = num % 10;                   // Extract last digit
            revNum = revNum * 10 + digit;           // Shift left and append digit
            num = num / 10;                         // Discard last digit
        }

        return revNum;
    }

    static void main() {
        System.out.println(reverseNum(98901)); // Expected output: 10989
    }
}
