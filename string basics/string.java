// string.java — String Fundamentals, Common Methods & Practice Questions
//
// A String in Java is an object that represents an immutable sequence of characters.
// Strings are reference types stored in the String Constant Pool inside the Heap.
//
// Key Concepts:
//   - Immutability: Once created, String objects cannot be changed in place.
//                   Any modification returns a brand new String object.
//   - Zero-based Indexing: Access characters via .charAt(index), NOT arr[index].
//   - Value Equality: Use .equals() or .equalsIgnoreCase() to compare text content.
//                     Do NOT use '==' (which only checks memory reference identity).
//   - Method Length: Use .length() with parentheses (unlike array.length field).
//
// Common String Methods Cheat Sheet:
//   .length()               → Total number of characters
//   .charAt(i)              → Character at index 'i' (0-based)
//   .substring(start, end)  → Substring from [start, end)
//   .contains(seq)          → true if sequence exists within string
//   .startsWith(prefix)     → true if string begins with prefix
//   .endsWith(suffix)       → true if string ends with suffix
//   .equals(other)          → Case-sensitive value comparison
//   .equalsIgnoreCase(o)    → Case-insensitive value comparison
//   .toUpperCase()          → Converts all characters to uppercase
//   .toLowerCase()          → Converts all characters to lowercase
//   .trim()                 → Strips leading & trailing whitespace
//   .isEmpty()              → true if length == 0
//   .isBlank()              → true if empty or contains only whitespace
//   .replace(old, new)      → Replaces matching characters/substrings
//   .split(delimiter)       → Splits string into String[] array
//   .toCharArray()          → Converts string into a new char[] array
//   String.valueOf(x)       → Converts primitive/object to its String form

import java.util.Scanner;

public class string {

    // ═══════════════════════════════════════════════════════════════════
    //                            MAIN METHOD
    // ═══════════════════════════════════════════════════════════════════

    static void main() {

        // ─────────────────────────────────────────────────────────────
        // PART 1: STRING FUNDAMENTALS & IMMUTABILITY
        // ─────────────────────────────────────────────────────────────
        System.out.println("=== PART 1: FUNDAMENTALS & IMMUTABILITY ===");

        // Concatenation with '+' operator
        String firstName = "sans";
        String secondName = "hello";
        System.out.println("Concatenation: " + firstName + " " + secondName);

        // Accessing length and individual characters
        System.out.println("Length of firstName: " + firstName.length()); // 4
        System.out.println("Character at index 2: " + firstName.charAt(2)); // 'n'

        // Strings vs Arrays indexing:
        // firstName[0]           // ❌ COMPILE ERROR: Strings do not support bracket indexing
        // firstName.charAt(0)    // ✅ CORRECT way to access character at index 0

        // Demonstrating Immutability:
        String name = "Rana";
        // name[0] = 'B';         // ❌ COMPILE ERROR: Strings are immutable, cannot modify chars in place
        name = "Bana";            // ✅ CORRECT: 'name' now points to a new String object "Bana"
        System.out.println("Reassigned name: " + name);


        // ─────────────────────────────────────────────────────────────
        // PART 2: STRING EQUALITY (== vs .equals vs .equalsIgnoreCase)
        // ─────────────────────────────────────────────────────────────
        System.out.println("\n=== PART 2: STRING EQUALITY ===");

        String name1 = "sans";
        String name2 = "sans";
        String name3 = "SANS";

        // .equals() checks if the actual text content is identical (case-sensitive)
        if (name1.equals(name2)) {
            System.out.println("name1 and name2 are equal (case-sensitive)");
        } else {
            System.out.println("Not equal");
        }

        // .equalsIgnoreCase() ignores uppercase vs lowercase differences
        System.out.println("equals (sans vs SANS): " + name1.equals(name3));                 // false
        System.out.println("equalsIgnoreCase (sans vs SANS): " + name1.equalsIgnoreCase(name3)); // true


        // ─────────────────────────────────────────────────────────────
        // PART 3: INSPECTION, CASE CONVERSION & WHITESPACE
        // ─────────────────────────────────────────────────────────────
        System.out.println("\n=== PART 3: CASE, TRIM & EMPTY CHECKS ===");

        // Case conversion
        String lowercaseName = "sans";
        String uppercaseName = "SANS";
        System.out.println("To Uppercase: " + lowercaseName.toUpperCase()); // "SANS"
        System.out.println("To Lowercase: " + uppercaseName.toLowerCase()); // "sans"

        // Trimming whitespace
        String paddedName = " sans   ";
        System.out.println("Length before trim: " + paddedName.length());    // 8
        paddedName = paddedName.trim();                                      // Removes leading & trailing spaces
        System.out.println("Length after trim: " + paddedName.length());     // 4 ("sans")

        // Difference between isEmpty() and isBlank():
        // empty -> length == 0
        // blank -> empty OR contains only whitespace characters
        String emptyStr = "";
        String blankStr = "    ";
        System.out.println("emptyStr length: " + emptyStr.length());         // 0
        System.out.println("emptyStr isEmpty(): " + emptyStr.isEmpty());     // true
        System.out.println("emptyStr isBlank(): " + emptyStr.isBlank());     // true
        System.out.println("blankStr isEmpty(): " + blankStr.isEmpty());     // false (length is 4!)
        System.out.println("blankStr isBlank(): " + blankStr.isBlank());     // true  (only spaces)


        // ─────────────────────────────────────────────────────────────
        // PART 4: SEARCHING, SUBSTRINGS & TYPE CONVERSION
        // ─────────────────────────────────────────────────────────────
        System.out.println("\n=== PART 4: SEARCHING & CONVERSION ===");

        String sentence = "My name is Sans";

        // .substring(beginIndex, endIndex) -> extracts characters from [beginIndex, endIndex - 1]
        System.out.println("Substring (3 to 7): " + sentence.substring(3, 7)); // "name"

        // .contains() -> checks if substring is present
        System.out.println("Contains 'Sans': " + sentence.contains("Sans"));   // true
        System.out.println("Contains 'love': " + sentence.contains("love"));   // false

        // .startsWith() and .endsWith()
        String greeting = "hello Sans bye";
        System.out.println("Starts with 'hello': " + greeting.startsWith("hello")); // true
        System.out.println("Ends with 'Sans': " + greeting.endsWith("Sans"));       // false (ends with 'bye')

        // Converting primitive numbers to String with String.valueOf()
        int num = 5123;
        String strNum = String.valueOf(num);
        System.out.println("Arithmetic addition (num + 1): " + (num + 1));     // 5124 (math addition)
        System.out.println("String concatenation (strNum + 1): " + (strNum + 1)); // "51231" (string append)


        // ─────────────────────────────────────────────────────────────
        // PART 5: ARRAY CONVERSIONS, SPLITTING & REPLACEMENT
        // ─────────────────────────────────────────────────────────────
        System.out.println("\n=== PART 5: ARRAYS, SPLIT & REPLACE ===");

        // .toCharArray() -> converts string into an array of characters
        String person = "Sans";
        char[] charArray = person.toCharArray();
        for (char ch : charArray) {
            System.out.println("Value of char: " + ch);
        }

        // .split() -> divides a string into an array based on a delimiter
        String csvData = "My,name,is,Sans";
        String[] words = csvData.split(",");
        System.out.println("Split words:");
        for (String word : words) {
            System.out.println("  " + word);
        }

        // .replace() -> replaces old char/string with new char/string
        String originalText = "sans";
        String replacedText = originalText.replace("s", "r");
        System.out.println("After replace ('s' with 'r'): " + replacedText); // "ranr"


        // ─────────────────────────────────────────────────────────────
        // PART 6: TAKING STRING INPUT WITH SCANNER
        // ─────────────────────────────────────────────────────────────
        // Reading Strings from console:
        //   - sc.next()     → reads until the first whitespace (reads a single word)
        //   - sc.nextLine() → reads the entire line until Enter is pressed
        //
        // (Uncomment the block below to test interactive console input):
        /*
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a full sentence (nextLine): ");
        String fullLine = sc.nextLine();
        System.out.println("Value of nextLine: " + fullLine);

        System.out.print("Enter a single word (next): ");
        String singleWord = sc.next();
        System.out.println("Value of next: " + singleWord);

        sc.close();
        */


        // ─────────────────────────────────────────────────────────────
        // PART 7: TESTING THE 5 PRACTICE QUESTIONS
        // ─────────────────────────────────────────────────────────────
        System.out.println("\n=== PART 7: PRACTICE QUESTIONS ===");

        // Question 1: Print characters
        System.out.println("\n--- Q1: Print Characters of 'Hello' ---");
        printString("Hello");

        // Question 2: Get length without using .length()
        System.out.println("\n--- Q2: Length of 'World' without .length() ---");
        System.out.println("Length: " + getLengthofString("World")); // Expected: 5

        // Question 3: Count vowels
        System.out.println("\n--- Q3: Vowel Count in 'Hello' ---");
        System.out.println("Vowels: " + getVowelsCount("Hello"));    // Expected: 2 ('e', 'o')

        // Question 4: Reverse string
        System.out.println("\n--- Q4: Reverse of 'where' ---");
        System.out.println("Reversed: " + reverseString("where"));   // Expected: "erehw"

        // Question 5: Palindrome check
        System.out.println("\n--- Q5: Palindrome Check ---");
        System.out.println("'racecar' is palindrome? " + isPalindrome("racecar")); // true
        System.out.println("'hello' is palindrome? " + isPalindrome("hello"));     // false
    }


    // ═══════════════════════════════════════════════════════════════════
    //                     STRING PRACTICE QUESTIONS
    // ═══════════════════════════════════════════════════════════════════

    // ─── Question 1: Print Each Character of a String ────────────────
    // Problem: Traverse a given string and print every character on a new line.
    // Approach: Loop from index 0 to str.length() - 1 using .charAt(i).
    static void printString(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }

    // ─── Question 2: Find Length of String Without Using .length() ────
    // Problem: Find the length of a string without calling str.length().
    // Approach: Convert the string into a character array via .toCharArray(),
    //          then access the array's .length field property.
    static int getLengthofString(String str) {
        char[] arr = str.toCharArray();
        int len = arr.length;
        return len;
    }

    // ─── Question 3: Count Vowels in a String ─────────────────────────
    // Problem: Count how many vowels ('a', 'e', 'i', 'o', 'u') are in a string.
    // Approach: Iterate character-by-character; check if each character
    //          matches any of the 5 lowercase vowels, and increment counter.
    static int getVowelsCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    // ─── Question 4: Reverse a String ────────────────────────────────
    // Problem: Given a string, return its reversed version.
    // Approach: Iterate backwards from index (n - 1) down to 0,
    //          building and accumulating characters into a new string.
    static String reverseString(String str) {
        String reverse = "";
        int n = str.length();
        for (int i = n - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }
        return reverse;
    }

    // ─── Question 5: Check if a String is a Palindrome ───────────────
    // Problem: Check if a string reads identically forwards and backwards.
    // Approach: Reverse the string using reverseString() and compare each
    //          character at index i. If any character differs, return false.
    static boolean isPalindrome(String str) {
        String original = str;
        String reverse = reverseString(original);

        // Compare original and reversed character by character
        for (int i = 0; i < original.length(); i++) {
            char ch1 = original.charAt(i);
            char ch2 = reverse.charAt(i);
            if (ch1 != ch2) {
                return false;  // Mismatch found — not a palindrome
            }
        }
        return true;  // All characters matched — is a palindrome
    }
}
