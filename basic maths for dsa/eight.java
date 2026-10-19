// eight.java — Least Common Multiple (LCM) via GCD in Java
//
// Problem Statement:
//   Given two positive integers 'a' and 'b', compute their Least Common Multiple (LCM).
//   The LCM is the smallest positive integer that is divisible by both 'a' and 'b'.
//
// Mathematical Relation:
//   - Fundamental relation between GCD and LCM:
//       a * b = gcd(a, b) * lcm(a, b)
//   - Rearranging the equation yields:
//       lcm(a, b) = (a * b) / gcd(a, b)
//   - To prevent integer overflow for large numbers, compute as: (a / gcd) * b.
//
// Complexity:
//   - Time Complexity:  O(log(min(a, b))) — dominated by the GCD computation.
//   - Space Complexity: O(1) — constant auxiliary space.
//
// Trace (a = 18, b = 12):
//   1. getGCD(18, 12) -> 6
//   2. prod = 18 * 12 = 216
//   3. lcm  = 216 / 6 = 36

public class eight {

    // Helper method: computes GCD using Euclidean algorithm
    static int getGCD(int a, int b) {
        while (b != 0) {
            int oldValueOfb = b;
            b = a % b;
            a = oldValueOfb;
        }
        return a;
    }

    // Computes LCM using the formula: LCM = (a * b) / GCD(a, b)
    static int getLCM(int a, int b) {
        int gcd = getGCD(a, b);
        int prod = a * b;
        int lcm = prod / gcd;            // LCM formula
        return lcm;
    }

    static void main() {
        System.out.println(getLCM(18, 12)); // Expected output: 36
    }
}
