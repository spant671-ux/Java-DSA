// ten.java — Perfect Number Check (O(sqrt(N)) Divisor Search) in Java
//
// Problem Statement:
//   Determine if a positive integer 'num' is a Perfect Number.
//   A Perfect Number is a positive integer that is equal to the sum of its
//   positive proper divisors (divisors excluding the number itself).
//
// Mathematical Optimization (O(sqrt(N))):
//   - Divisors occur in complementary pairs: if 'i' divides 'num', then 'num / i' is also a divisor.
//   - 1 is always a proper divisor for num > 1, so initialize sum = 1.
//   - Test 'i' from 2 up to sqrt(num) (i * i <= num):
//       - If num % i == 0:
//           sum += i
//           if (i != num / i) sum += num / i  (prevents double-counting square roots)
//   - Compare sum == num.
//
// Examples of Perfect Numbers:
//   - 6  -> proper divisors: 1, 2, 3       -> 1 + 2 + 3 = 6
//   - 28 -> proper divisors: 1, 2, 4, 7, 14 -> 1 + 2 + 4 + 7 + 14 = 28
//
// Complexity:
//   - Time Complexity:  O(sqrt(num)) — only iterates up to sqrt(num).
//   - Space Complexity: O(1) — constant auxiliary space.

public class ten {

    // Checks if 'num' equals the sum of its proper positive divisors
    static boolean checkPerfectNumber(int num) {
        // Corner case: numbers <= 1 have no proper divisors that sum to the number
        if (num <= 1) {
            return false;
        }

        int sum = 1; // 1 is always a proper divisor for any number > 1

        // Loop up to sqrt(num) to find complementary factor pairs
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                int firstFactor = i;
                int secondFactor = num / i;

                sum = sum + firstFactor;

                // Avoid adding the same factor twice if num is a perfect square (e.g., 6*6=36)
                if (firstFactor != secondFactor) {
                    sum = sum + secondFactor;
                }
            }
        }

        return sum == num;
    }

    static void main() {
        System.out.println(checkPerfectNumber(28)); // Expected output: true (1+2+4+7+14=28)
    }
}
