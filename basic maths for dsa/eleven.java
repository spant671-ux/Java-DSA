// eleven.java — Print All Prime Numbers from 2 to N in Java
//
// Problem Statement:
//   Given a positive integer 'n', find and print all prime numbers in the range [2, n].
//
// Approach:
//   - Outer loop iterates through every candidate number from 2 up to n.
//   - Helper method isPrimeOrNot(num) validates each number in O(sqrt(num)) time.
//   - If the candidate is prime, print it to the console.
//
// Complexity:
//   - Time Complexity:  O(N * sqrt(N)) using trial division for each number up to N.
//     (Note: For very large N, the Sieve of Eratosthenes achieves O(N log log N)).
//   - Space Complexity: O(1) — no extra memory structures used.
//
// Output for N = 20:
//   2, 3, 5, 7, 11, 13, 17, 19

public class eleven {

    // Helper method: determines if 'num' is prime in O(sqrt(num)) time
    static boolean isPrimeOrNot(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;            // Divisible by i — not prime
            }
        }

        return true;                     // Prime number
    }

    // Prints all prime numbers between 2 and n (inclusive)
    static void printAllPrimes(int n) {
        for (int num = 2; num <= n; num++) {
            boolean isPrime = isPrimeOrNot(num);
            if (isPrime) {
                System.out.println(num); // Print prime number
            }
        }
    }

    static void main() {
        printAllPrimes(100);             // Prints all prime numbers up to 100
    }
}
