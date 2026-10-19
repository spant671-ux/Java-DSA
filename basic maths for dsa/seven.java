// seven.java — Greatest Common Divisor (GCD / HCF) via Euclidean Algorithm in Java
//
// Problem Statement:
//   Given two integers 'a' and 'b', find their Greatest Common Divisor (GCD),
//   also known as the Highest Common Factor (HCF).
//
// Euclidean Algorithm Principle:
//   - gcd(a, b) = gcd(b, a % b)
//   - The GCD of two numbers divides their difference and their remainder.
//   - Repeatedly replace 'a' with 'b' and 'b' with 'a % b' until 'b' becomes 0.
//   - When b == 0, the current value of 'a' is the GCD.
//
// Complexity:
//   - Time Complexity:  O(log(min(a, b))) — logarithmic by Lamé's Theorem.
//   - Space Complexity: O(1) — iterative approach uses constant space.
//
// Trace (a = 18, b = 12):
//   Step 1: remainder = 18 % 12 = 6, a = 12, b = 6
//   Step 2: remainder = 12 % 6 = 0,  a = 6,  b = 0
//   b is 0 -> terminates, GCD = a = 6

public class seven {

    // Computes the GCD of 'a' and 'b' using the iterative Euclidean algorithm
    static int getGCD(int a, int b) {
        // gcd(a, b) = gcd(b, a % b)
        while (b != 0) {
            int oldValueOfb = b;
            b = a % b;                   // Next divisor is remainder
            a = oldValueOfb;             // Next dividend is previous divisor
        }

        // When b reaches 0, 'a' holds the greatest common divisor
        int ans = a;
        return ans;
    }

    static void main() {
        System.out.println(getGCD(18, 12)); // Expected output: 6
    }
}
