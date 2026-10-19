// six.java — Prime Number Check (Optimized to O(sqrt(N))) in Java
//
// Problem Statement:
//   Given a positive integer 'num', determine if it is a prime number.
//   A prime number is a natural number greater than 1 with no positive divisors
//   other than 1 and itself.
//
// Mathematical Optimization (Why O(sqrt(N))?):
//   - Divisors always appear in complementary pairs (a, b) such that a * b = num.
//   - If both a and b were strictly greater than sqrt(num), their product a * b
//     would exceed num, which is impossible.
//   - Thus, if 'num' has any non-trivial factor, at least one factor MUST be <= sqrt(num).
//   - Instead of checking all numbers up to num (O(N)), we only test i where i * i <= num.
//
// Complexity:
//   - Time Complexity:  O(sqrt(num)) — drastically fewer iterations than O(N).
//   - Space Complexity: O(1) — constant auxiliary space.
//
// Trace (num = 11):
//   i = 2: 2*2 = 4 <= 11, 11 % 2 != 0
//   i = 3: 3*3 = 9 <= 11, 11 % 3 != 0
//   i = 4: 4*4 = 16 > 11 (loop ends)
//   No divisor found -> returns true (11 is prime)

public class six {

    // Determines if 'num' is a prime number in O(sqrt(N)) time
    static boolean isPrimeOrNot(int num) {
        // Corner case: numbers <= 1 are not prime
        if (num <= 1) {
            return false;
        }

        // Only check divisors up to sqrt(num) using i * i <= num
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;            // Factor found — composite number
            }
        }

        return true;                     // No factors found — prime number
    }

    static void main() {
        int num = 11;
        System.out.println(isPrimeOrNot(num)); // Expected: true
    }
}
