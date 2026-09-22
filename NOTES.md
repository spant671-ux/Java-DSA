# ☕ Java Study Notes & Handbook

A neat, structured companion covering core concepts, internal mechanisms, and practical lessons from the code examples.

---

## 📌 Table of Contents
1. [Hello World & Java Basics](#1-hello-world--java-basics)
2. [Variables](#2-variables)
3. [Data Types](#3-data-types)
4. [Operators](#4-operators)
5. [Taking Input](#5-taking-input)
6. [Conditionals](#6-conditionals)
7. [Loops](#7-loops)
8. [Pattern Printing](#8-pattern-printing)
9. [Arrays](#9-arrays)
10. [Strings](#10-strings)
11. [Methods / Functions](#11-methods--functions)

---

## 1. Hello World & Java Basics

Every Java program begins with a **class** and a **main method**. The JVM looks for the `main` method as the entry point.

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

### Key Concepts:
- **`public`** — Access modifier, makes the class/method accessible from anywhere
- **`static`** — Allows calling the method without creating an object of the class
- **`void`** — Indicates the method returns nothing
- **`String[] args`** — Command-line arguments passed to the program
- **`System.out.println()`** — Prints text to the console with a newline; use `System.out.print()` for no newline

### How Java Runs:

```
Source Code (.java)
       │
       ▼  (javac — Java Compiler)
Bytecode (.class)
       │
       ▼  (JVM — Java Virtual Machine)
Machine Code (Executed by OS)
```

Java is **platform-independent** because bytecode runs on any machine that has a JVM installed — "Write Once, Run Anywhere."

---

## 2. Variables

A variable is a named container that stores data in memory.

### Three Stages:
```java
int age;              // 1. Declaration — reserves memory
age = 10;             // 2. Assignment — stores a value
int totalMarks = 20;  // 3. Initialization — declaration + assignment in one step
```

### Naming Rules:
| Rule | Valid | Invalid |
|---|---|---|
| Must start with letter, `_`, or `$` | `_count`, `$price`, `name` | `1stPlace`, `@value` |
| Can contain digits after first char | `score1`, `player2` | `2fast` |
| Case sensitive | `weight` ≠ `WEIGHT` | — |
| No reserved keywords | `myClass` | `class`, `int`, `void` |

### Naming Conventions:
- **Variables** → `camelCase` (e.g., `totalMarks`, `firstName`)
- **Constants** → `UPPER_SNAKE_CASE` (e.g., `DAYS_IN_YEAR = 365`)
- **Classes** → `PascalCase` (e.g., `MyClass`, `StudentRecord`)

---

## 3. Data Types

Java has **8 primitive data types**, grouped into 3 categories:

| Category | Type | Size | Default Value | Range / Example |
|---|---|---|---|---|
| **Integer** | `byte` | 1 byte | `0` | −128 to 127 |
| | `short` | 2 bytes | `0` | −32,768 to 32,767 |
| | `int` | 4 bytes | `0` | −2.1B to 2.1B |
| | `long` | 8 bytes | `0L` | Very large integers (`100000L`) |
| **Floating** | `float` | 4 bytes | `0.0f` | ~7 decimal digits (`3.14f`) |
| | `double` | 8 bytes | `0.0d` | ~15 decimal digits (`3.141592653589793`) |
| **Other** | `boolean` | 1 bit | `false` | `true` or `false` |
| | `char` | 2 bytes | `'\u0000'` | Single character (`'A'`) |

### Key Notes:
- **Float literals** require the `f` suffix: `3.14f` (without it, Java treats it as `double`)
- **Long literals** require the `L` suffix: `100000L`
- **char arithmetic**: Characters are stored as Unicode integers → `'A' + 2 = 67` → cast with `(char)` to get `'C'`
- **Primitive vs. Reference**: Primitives store actual values; reference types (String, arrays, objects) store memory addresses

---

## 4. Operators

### 4a. Arithmetic Operators
```java
int a = 25, b = 7;
a + b   // 32  (Addition)
a - b   // 18  (Subtraction)
a * b   // 175 (Multiplication)
a / b   // 3   (Division — integer division truncates decimal!)
a % b   // 4   (Modulus — remainder)
```

> **Key Note**: `25 / 7 = 3` (not `3.57`) because both operands are `int`. To get decimal result, make at least one operand a `double`: `25.0 / 7 = 3.571...`

### 4b. Assignment Operators
Shorthand for modifying a variable in place:
```java
int x = 100;
x += 20;   // x = 100 + 20 = 120
x -= 10;   // x = 120 - 10 = 110
x *= 2;    // x = 110 * 2  = 220
x /= 4;    // x = 220 / 4  = 55
x %= 10;   // x = 55 % 10  = 5
```

### 4c. Relational (Comparison) Operators
Return `boolean` — used in conditions:
```java
a == b   // Equal to
a != b   // Not equal to
a > b    // Greater than
a < b    // Less than
a >= b   // Greater than or equal to
a <= b   // Less than or equal to
```

> **Key Note**: Use `==` for primitives, `.equals()` for comparing object content (Strings, etc.)

### 4d. Logical Operators
Combine boolean expressions:
```java
&&   // AND — true only if BOTH are true
||   // OR  — true if AT LEAST ONE is true
!    // NOT — inverts the boolean value
```

> **Short-Circuit Evaluation**: `false && expr` → `expr` is never evaluated. `true || expr` → `expr` is never evaluated.

### 4e. Unary Operators
```java
++x   // Prefix  — increments FIRST, then returns new value
x++   // Postfix — returns current value, then increments
--x   // Prefix decrement
x--   // Postfix decrement
```

### 4f. Bitwise Operators
Operate on individual bits of integers:
```java
6 & 3    // AND:  0110 & 0011 = 0010 = 2
6 | 3    // OR:   0110 | 0011 = 0111 = 7
6 ^ 3    // XOR:  0110 ^ 0011 = 0101 = 5
~6       // NOT:  ~0110 = -(6+1) = -7
6 << 2   // Left Shift:  6 × 2² = 24
6 >> 1   // Right Shift: 6 ÷ 2¹ = 3
```

---

## 5. Taking Input

Java reads user input using the `Scanner` class from `java.util`:

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);

int age = sc.nextInt();             // Read integer
double gpa = sc.nextDouble();       // Read double
String name = sc.next();            // Read single word
String line = sc.nextLine();        // Read entire line
boolean flag = sc.nextBoolean();    // Read boolean
```

### Scanner Methods Quick Reference:

| Method | Reads |
|---|---|
| `sc.nextInt()` | `int` |
| `sc.nextLong()` | `long` |
| `sc.nextFloat()` | `float` |
| `sc.nextDouble()` | `double` |
| `sc.nextBoolean()` | `boolean` (`true`/`false`) |
| `sc.next()` | Single word (stops at whitespace) |
| `sc.nextLine()` | Entire line (including spaces) |
| `sc.nextBigInteger()` | Arbitrarily large integer (requires `java.math.BigInteger`) |

> **Gotcha**: After using `nextInt()`, calling `nextLine()` reads the leftover `\n`. Add an extra `sc.nextLine()` to consume it.

---

## 6. Conditionals

### 6a. `if` Statement
Executes a block only when the condition is `true`:
```java
if (age >= 18) {
    System.out.println("Eligible to vote");
}
```

### 6b. `if-else`
Provides an alternate path:
```java
if (score >= 50) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```

### 6c. `if-else-if` Ladder
Chains multiple conditions — first `true` branch executes:
```java
if (accuracy >= 90)      System.out.println("Excellent");
else if (accuracy >= 75) System.out.println("Good");
else if (accuracy >= 60) System.out.println("Average");
else                     System.out.println("Needs Improvement");
```

### 6d. Nested `if-else`
Multi-level decision hierarchy:
```java
if (hasSubscription) {
    if (solvedProblems >= 200) {
        System.out.println("Unlock advanced sheet");
    } else {
        System.out.println("Keep practicing");
    }
}
```

### 6e. `switch` Statement
Matches a value against multiple constants:
```java
switch (day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    // ...
    default: System.out.println("Invalid");
}
```

| Works With | Doesn't Work With |
|---|---|
| `int`, `char`, `String`, `byte`, `short`, enums | `float`, `double`, `long`, `boolean` |

> **Without `break`**: Execution "falls through" to the next case!

### 6f. Ternary Operator
One-line shorthand for simple `if-else`:
```java
String status = (streakDays >= 30) ? "Active" : "Inactive";
```

---

## 7. Loops

### `for` Loop
Fixed-count repetition with initialization, condition, and update:
```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```

### Step Increments:
```java
for (int i = 0; i < 20; i += 2) {  // Prints even numbers: 0, 2, 4, ...
    System.out.println(i);
}
```

### Nested Loops:
```java
for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

### `break` & `continue`:
```java
break;      // Exits the loop entirely
continue;   // Skips the current iteration, moves to next
```

### `for-each` (Enhanced For Loop):
```java
int[] arr = {10, 20, 30};
for (int val : arr) {
    System.out.println(val);   // No index needed
}
```

> **When to use**: `for-each` is cleaner when you don't need the index. Use a regular `for` loop when you need index access or want to modify elements.

---

## 8. Pattern Printing

Patterns use nested loops where the **outer loop** controls rows and the **inner loop** controls what's printed per row.

### Key Formulas:

| Pattern | Stars per Row | Spaces per Row |
|---|---|---|
| Solid Rectangle | `n` (fixed) | — |
| Right Triangle | `i` (increasing) | — |
| Inverted Triangle | `n - row + 1` (decreasing) | — |
| Parallelogram | `n` (fixed) | `n - i` (decreasing) |
| Pyramid | `2 * row - 1` (odd numbers) | `n - row` (decreasing) |
| Inverted Pyramid | `2*n - 2*row + 1` | `row - 1` (increasing) |
| Hollow Rectangle | Stars on borders only | `if` boundary check |
| Hollow Triangle | Stars on first/last position | `if` boundary check |

### Example — Pyramid:
```java
for (int row = 1; row <= n; row++) {
    // Print spaces
    for (int s = 1; s <= n - row; s++) System.out.print(" ");
    // Print stars
    for (int star = 1; star <= 2 * row - 1; star++) System.out.print("*");
    System.out.println();
}
```

---

## 9. Arrays

An **array** is a fixed-size, ordered collection of elements of the same data type stored in contiguous memory.

### Declaration, Allocation & Initialization:
```java
// Step-by-step
int arr[];              // 1. Declaration
arr = new int[5];       // 2. Allocation (5 slots, all initialized to 0)

// One-liner with values
int brr[] = {10, 20, 30};
```

### Accessing Elements:
```java
brr[0]          // → 10 (first element)
brr[2]          // → 30 (third element)
brr.length      // → 3  (total number of elements)
```

> **IndexOutOfBoundsException**: Accessing `brr[3]` on an array of length 3 throws a runtime error. Valid indices: `0` to `length - 1`.

### Traversal — Two Approaches:
```java
// 1. Standard for loop (when you need the index)
for (int i = 0; i <= n - 1; i++) {
    System.out.println(arr[i]);
}

// 2. For-each loop (when you just need the value)
for (int val : arr) {
    System.out.println(val);
}
```

### Taking Array Input from User:
```java
Scanner sc = new Scanner(System.in);
int arr[] = new int[5];
int n = arr.length;

for (int i = 0; i <= n - 1; i++) {
    System.out.println("Provide value for index: " + i);
    arr[i] = sc.nextInt();
}
```

### Common Array Operations:

**Sum of Elements:**
```java
int sum = 0;
for (int i = 0; i < n; i++) {
    sum = sum + arr[i];
}
```

**Product of Elements:**
```java
int product = 1;
for (int i = 0; i < n; i++) {
    product = product * arr[i];
}
```

**Finding Maximum Value:**
```java
int maxValue = arr[0];
for (int i = 0; i < n; i++) {
    if (arr[i] > maxValue) {
        maxValue = arr[i];
    }
}
```

**Finding Minimum Value:**
```java
int minValue = arr[0];
for (int i = 0; i < n; i++) {
    if (arr[i] < minValue) {
        minValue = arr[i];
    }
}
```

### 2D Arrays (Matrices):
```java
// Declaration + Initialization
int[][] arr = {
    {1, 2, 3},
    {21, 20, 19}
};

// Accessing: arr[row][col]
arr[0][2]    // → 3
arr[1][0]    // → 21

// Dynamic Allocation
int[][] matrix = new int[3][4];    // 3 rows, 4 columns
```

### 2D Array Traversal:
```java
for (int i = 0; i < arr.length; i++) {            // rows
    for (int j = 0; j < arr[i].length; j++) {      // columns of current row
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
}
```

### Jagged Arrays (Rows with Different Lengths):
Java allows each row to have a different number of columns:
```java
int[][] brr = {
    {1, 2},
    {2, 3, 4, 5},
    {3, 4, 5, 6, 7, 8},
    {4}
};
// brr[0].length → 2, brr[1].length → 4, brr[2].length → 6
```

### Key Array Facts:

| Property | Detail |
|---|---|
| Size | Fixed at creation — cannot grow or shrink |
| Default values | `int` → `0`, `boolean` → `false`, `String` → `null` |
| Index range | `0` to `length - 1` |
| Length property | `arr.length` (no parentheses — it's a field, not a method) |
| Memory | Contiguous allocation, stored on heap |

---

## 10. Strings

A `String` in Java is an **object** (not a primitive) that represents a sequence of characters. Strings are **immutable** — once created, their content cannot be changed.

```java
String firstName = "sans";
String secondName = "hello";
```

### Common String Operations:

```java
// Concatenation
firstName + " " + secondName    // → "sans hello"

// Length (note: method with parentheses, unlike array's .length)
firstName.length()              // → 4

// Access character at index
firstName.charAt(2)             // → 'n'
```

### Key Difference from Arrays:
```java
// ❌ WRONG — Strings don't support bracket indexing
firstName[0]           // Compilation error!

// ✅ CORRECT — Use charAt()
firstName.charAt(0)    // → 's'
```

### String vs. Array Length:

| | Syntax | Type |
|---|---|---|
| **Array** | `arr.length` | Field (no parentheses) |
| **String** | `str.length()` | Method (with parentheses) |

---

## 11. Methods / Functions

A **method** is a reusable block of code that performs a specific task. Methods promote **DRY (Don't Repeat Yourself)** and make code modular.

### Method Anatomy:
```java
static returnType methodName(parameters) {
    // body
    return value;  // only if returnType is not void
}
```

### Types of Methods:

**1. `void` Methods — No Return Value:**
```java
static void printTableOf2() {
    for (int i = 1; i <= 10; i++) {
        System.out.println("-> " + (2 * i));
    }
}
```

**2. Methods with Parameters:**
```java
static void printSum(int a, int b) {
    System.out.println("sum: " + (a + b));
}
```

**3. Methods with Return Values:**
```java
static int add(int p, int q) {
    int sum = p + q;
    return sum;     // Returns the computed value to the caller
}

// Usage:
int result = add(5, 10);   // result = 15
```

**4. Methods Returning Boolean:**
```java
static boolean isEven(int number) {
    return number % 2 == 0;
}
```

### Method Overloading
Multiple methods with the **same name** but **different parameter lists** (different number or types of parameters):

```java
static int add(int p, int q) {         // 2 parameters
    return p + q;
}

static int add(int p, int q, int r) {  // 3 parameters
    return p + q + r;
}

// Java picks the right method based on arguments:
add(1, 2)       // → calls first version → 3
add(3, 5, 6)    // → calls second version → 14
```

Overloading also works with **different parameter types**:
```java
static void display(int number) {
    System.out.println("Number: " + number);
}

static void display(String text) {
    System.out.println("Text: " + text);
}

display(2);         // → "Number: 2"
display("hello");   // → "Text: hello"
```

### Call by Value
Java is **strictly pass-by-value** for primitives. When you pass a variable to a method, it passes a **copy** of the value — the original variable is never modified:

```java
static void solve(int num) {
    num = num * 10;                     // Modifies the LOCAL copy
    System.out.println("inside solve: " + num);   // → 50
}

static void main() {
    int num = 5;
    System.out.println("inside main: " + num);    // → 5
    solve(num);
    System.out.println("inside main: " + num);    // → 5 (UNCHANGED!)
}
```

> **Key Takeaway**: For primitives, the original value is never affected by changes inside the method. The method works on its own independent copy.

### Variable Scoping
Variables are only accessible within the block (`{}`) where they are declared:

```java
static int value = 1;   // Class-level (static) — accessible everywhere in the class

static void printMultiples() {
    int value = 20;      // Local variable — shadows the class-level variable
    // Inside this method, 'value' is 20
}

static void main() {
    System.out.println(value);   // → 1 (uses class-level variable)
}
```

| Scope | Accessible Where | Lifetime |
|---|---|---|
| **Class-level (static)** | Anywhere in the class | Entire program |
| **Method-level (local)** | Only inside the method | Until method returns |
| **Block-level** (`for`, `if`) | Only inside the block | Until block ends |

---

## 🧠 Key Concepts Quick Reference

| Concept | Example | Notes |
|---|---|---|
| Print to console | `System.out.println("Hi")` | `println` adds newline, `print` doesn't |
| Declare a variable | `int age;` | Must assign before use |
| Initialize a variable | `int age = 25;` | Declaration + assignment in one step |
| Integer division | `25 / 7` → `3` | Decimal part is truncated |
| Float literal | `3.14f` | Must use `f` suffix for float |
| Char arithmetic | `'A' + 2` → `67` | Cast with `(char)` to get `'C'` |
| Short-circuit eval | `false && expr` | `expr` is never evaluated |
| Prefix vs. postfix | `++x` vs. `x++` | Increment timing differs |
| Bitwise NOT | `~6` → `-7` | Equals `-(x+1)` for positive integers |
| Read input | `sc.nextInt()` | Requires `Scanner` import |
| BigInteger input | `sc.nextBigInteger()` | Requires `java.math.BigInteger` import |
| Boolean input | `sc.nextBoolean()` | Reads `true` or `false` from console |
| Array declaration | `int[] arr = new int[5]` | Fixed size, zero-initialized |
| Array length | `arr.length` | Field — no parentheses |
| String length | `str.length()` | Method — with parentheses |
| String charAt | `str.charAt(0)` | No bracket indexing for Strings |
| 2D array access | `arr[row][col]` | Row-major order |
| Method definition | `static int add(int a, int b)` | `static` allows calling without object |
| Method overloading | Same name, different params | Resolved at compile time |
| Call by value | Primitives pass a copy | Original variable is never modified |
| Variable scoping | Local shadows class-level | Innermost scope wins |
