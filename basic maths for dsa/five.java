// five.java — Check if a Number is a Palindrome in Java
//
// Problem Statement:
//   Determine whether an integer is a palindrome. A number is a palindrome if it
//   reads the same backward as forward (e.g., 1221 -> 1221).
//
// Mathematical Mechanism:
//   1. Store a copy of the input as originalNum.
//   2. Reverse originalNum using the base-10 digit reversal formula:
//        revNum = (revNum * 10) + (num % 10).
//   3. Compare originalNum == revNum:
//        - If equal -> Palindrome (true).
//        - If not equal -> Not Palindrome (false).
//
// Complexity:
//   - Time Complexity:  O(log10(num)) — digit extraction takes logarithmic time.
//   - Space Complexity: O(1) — constant extra space.
//
// Trace (num = 1221):
//   originalNum = 1221
//   reverseNum  = 1221
//   1221 == 1221 -> true ("Is Palindrome")

public class five {

    // Helper method: reverses the digits of 'num'
    static int reverseNum(int num) {
        int revNum = 0;
        while (num != 0) {
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num = num / 10;
        }
        return revNum;
    }

    // Checks whether 'num' is equal to its reversed version
    static boolean isPalindrome(int num) {
        int originalNum = num;
        int reverseNum = reverseNum(num);

        if (originalNum == reverseNum) {
            System.out.println("Is Palindrome");
            return true;
        } else {
            System.out.println("Not Palindrome");
            return false;
        }
    }

    static void main() {
        int num = 1221;
        isPalindrome(num); // Expected: "Is Palindrome" -> true
    }
}
