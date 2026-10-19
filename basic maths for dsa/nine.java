// nine.java — Armstrong Number (Narcissistic Number) Check in Java
//
// Problem Statement:
//   Determine if a given integer is an Armstrong number (for 3-digit numbers).
//   A 3-digit number is an Armstrong number if the sum of the cubes of its digits
//   equals the number itself:
//     d1^3 + d2^3 + d3^3 == num
//
// Common 3-digit Armstrong Numbers:
//   - 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153  (true)
//   - 370 = 3^3 + 7^3 + 0^3 = 27 + 343 + 0 = 370  (true)
//   - 371 = 3^3 + 7^3 + 1^3 = 27 + 343 + 1 = 371  (true)
//   - 407 = 4^3 + 0^3 + 7^3 = 64 + 0 + 343 = 407  (true)
//
// Complexity:
//   - Time Complexity:  O(log10(num)) — processes each digit once.
//   - Space Complexity: O(1) — constant auxiliary space.
//
// Trace (num = 153):
//   Digit 3 -> cube = 27,  sum = 27
//   Digit 5 -> cube = 125, sum = 152
//   Digit 1 -> cube = 1,   sum = 153
//   sum == originalNum (153 == 153) -> returns true

public class nine {

    // Checks whether 'num' is an Armstrong number (sum of cubed digits == num)
    static boolean isArmstrong(int num) {
        int sum = 0;
        int originalNum = num;

        while (num != 0) {
            int digit = num % 10;                    // Extract last digit
            int cubeOfDigit = digit * digit * digit; // Compute digit^3
            sum = sum + cubeOfDigit;                 // Accumulate sum of cubes
            num = num / 10;                          // Discard last digit
        }

        // Return true if the accumulated sum equals the original number
        if (sum == originalNum) {
            return true;
        } else {
            return false;
        }
    }

    static void main() {
        System.out.println(isArmstrong(153)); // Expected output: true
    }
}
