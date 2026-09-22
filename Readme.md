# ☕ Java-DSA

A beginner-friendly Java learning repository covering core fundamentals through hands-on code examples. Each topic lives in its own folder with practical, well-commented demonstrations — every source file includes a structured header block summarizing the key concepts before the code.

---

## 📁 Project Structure

```
Java-DSA/
├── first program/
│   └── Main.java                      # Hello World – entry point
├── variables/
│   └── variables.java                 # Variable rules & naming conventions
├── datatypes/
│   └── datatypes.java                 # Primitive data types
├── operators/
│   ├── arithmetic_operators.java      # +, -, *, /, %
│   ├── assignment_operators.java      # +=, -=, *=, /=, %=
│   ├── relational_operators.java      # ==, !=, >, <, >=, <=
│   ├── logical_operators.java         # &&, ||, !
│   ├── unary_operators.java           # ++, -- (prefix & postfix)
│   └── bitwise_operators.java         # &, |, ^, ~, <<, >>
├── taking input/
│   └── takinginput.java               # Reading user input with Scanner
├── conditionals/
│   ├── ifconditional.java             # Basic if statement
│   ├── ifelse.java                    # if-else branching
│   ├── ifelseif.java                  # if-else-if ladder
│   ├── nestedifelse.java              # Nested if-else blocks
│   ├── switchoperator.java            # switch-case statement
│   └── ternary.java                   # Ternary (conditional) operator
├── loops/
│   └── forloop.java                   # for loop, nested loops, break & continue
├── Pattern Printing/
│   ├── Pattern1.java                  # Solid rectangle (square) pattern
│   ├── Pattern2.java                  # Fixed-size rectangle pattern
│   ├── Pattern3.java                  # Right-angled triangle (staircase) pattern
│   ├── Pattern4.java                  # Parallelogram pattern
│   ├── Pattern5.java                  # Inverted right-angled triangle pattern
│   ├── Pattern6.java                  # Pyramid pattern
│   ├── Pattern7.java                  # Inverted pyramid pattern
│   ├── Pattern8.java                  # Hollow rectangle pattern
│   └── Pattern9.java                  # Hollow right-angled triangle pattern
├── array basics/
│   ├── array.java                     # Array declaration, allocation & for-each traversal
│   ├── takingInput.java               # Reading array elements from user via Scanner
│   ├── array2d.java                   # 2D arrays, jagged arrays, max value in matrix
│   └── practiceArrays.java            # Sum, product, max & min value problems
├── string basics/
│   └── string.java                    # String concatenation, length(), charAt()
├── methods/
│   ├── method.java                    # Defining & calling a void method
│   ├── sumMethod.java                 # Method with parameters (printSum)
│   ├── returnType.java                # void vs return-type methods
│   ├── methodOverload.java            # Method overloading (same name, different params)
│   ├── callByValue.java               # Pass-by-value for primitives
│   ├── variableScoping.java           # Local vs class-level variable scope
│   └── practice.java                  # Combined practice — all method concepts
├── NOTES.md                           # Comprehensive study notes & handbook
└── Readme.md
```

---

## 📖 Topics Covered

### 1. Hello World — `first program/Main.java`
The classic first program. Prints `"Hello World!"` to the console and introduces:
- Basic structure of a Java **class**
- The `public static void main(String[] args)` entry point
- Console output with `System.out.println()`

### 2. Variables — `variables/variables.java`
Explores the rules and conventions for declaring variables in Java:
- **Declaration vs. Assignment vs. Initialization** — `int age;` → `age = 10;` → `int totalMarks = 20;`
- **Case Sensitivity** — `weight` and `WEIGHT` are two different variables
- **Valid Starting Characters** — letters, `_`, or `$`
- **Valid Subsequent Characters** — digits, `_`, `$`
- **Reserved Keywords** — `class`, `int`, etc. cannot be used as names
- **Naming Conventions** — `camelCase` for variables, `UPPER_SNAKE_CASE` for constants
- **Constants** — e.g., `Days_In_Year = 365`

### 3. Data Types — `datatypes/datatypes.java`
Covers all 8 primitive data types in Java, grouped by category:

| Category        | Types                            | Size          | Example Values                 |
| --------------- | -------------------------------- | ------------- | ------------------------------ |
| Integer         | `byte`, `short`, `int`, `long`   | 1B, 2B, 4B, 8B | `100`, `1000`, `83293`, `100000` |
| Floating Point  | `float`, `double`                | 4B, 8B        | `3.14f`, `3.141592653589793`   |
| Other           | `boolean`, `char`                | —             | `true`, `'A'`                  |

Also demonstrates character arithmetic (`(char)(firstCharacter + 2)` → `'C'`) showing that `char` values are stored as Unicode integers.

### 4. Operators — `operators/`

#### 4a. Arithmetic Operators — `arithmetic_operators.java`
Demonstrates the five basic math operations using a "problems solved" theme:
- Addition (`+`), Subtraction (`-`), Multiplication (`*`), Division (`/`), Modulus (`%`)
- **Key note:** integer division truncates the decimal part (e.g., `25 / 7 = 3`)

#### 4b. Assignment Operators — `assignment_operators.java`
Shows compound assignment shortcuts applied in sequence to a single variable:
- `+=`, `-=`, `*=`, `/=`, `%=`
- Each operation includes a comment tracing the running value (e.g., `100 + 20 = 120`)
- **Shorthand rule:** `a += b` is equivalent to `a = a + b`

#### 4c. Relational Operators — `relational_operators.java`
Compares two values (`currentStreak` vs. `targetStreak`) using all six relational operators:
- `==`, `!=`, `>`, `<`, `>=`, `<=`
- Returns `boolean` (`true`/`false`)
- **Key note:** for objects, use `.equals()` instead of `==`

#### 4d. Logical Operators — `logical_operators.java`
Uses boolean flags (`completedDSA`, `completedCore`) to demonstrate:
- AND (`&&`) — true only if **both** operands are true
- OR (`||`) — true if **at least one** operand is true
- NOT (`!`) — inverts the boolean value
- **Key note:** both `&&` and `||` use short-circuit evaluation

#### 4e. Unary Operators — `unary_operators.java`
Illustrates the difference between prefix and postfix increment/decrement:
- `++x` (prefix — increments first, then returns new value)
- `x++` (postfix — returns current value, then increments)
- Also mentions other unary operators: `+`, `-`, `!`, `~`

#### 4f. Bitwise Operators — `bitwise_operators.java`
Works with binary representations (`6 = 0110`, `3 = 0011`) to demonstrate:
- AND (`&`), OR (`|`), XOR (`^`), NOT (`~`)
- Left Shift (`<<` — multiply by 2ⁿ), Right Shift (`>>` — divide by 2ⁿ)

### 5. Taking Input — `taking input/takinginput.java`
Introduces reading user input from the console:
- Creating a `Scanner` object with `new Scanner(System.in)`
- Reading integer input with `sc.nextInt()`
- Reading large numbers with `BigInteger` and `sc.nextBigInteger()`
- Reading boolean values with `sc.nextBoolean()`
- Importing `java.math.BigInteger` for arbitrarily large integers
- Foundation for interactive programs

### 6. Conditionals — `conditionals/`

#### 6a. If Statement — `ifconditional.java`
Demonstrates the basic `if` conditional:
- Executes a block only when the condition is `true`
- Examples: checking daily practice consistency (`>= 10`) and voting eligibility (`age >= 18`)
- If the condition is `false`, the block is simply skipped

#### 6b. If-Else — `ifelse.java`
Adds an alternate path when the condition is `false`:
- `if` block runs when the condition is met; `else` block runs otherwise
- Example: pass/fail check — prints `"Pass"` if `score >= 50`, otherwise `"Fail"`

#### 6c. If-Else-If Ladder — `ifelseif.java`
Chains multiple conditions to select one of many outcomes:
- Conditions are evaluated top-to-bottom; the first `true` branch executes
- Example: accuracy grading — `>= 90` → Excellent, `>= 75` → Good, `>= 60` → Average, else → Needs Improvement
- Only **one** branch executes, even if multiple conditions could be true

#### 6d. Nested If-Else — `nestedifelse.java`
Places `if-else` blocks inside other `if-else` blocks for multi-level decisions:
- Outer condition gates access to inner conditions
- Example: checks `hasSubscription` first, then evaluates `solvedProblems >= 200` to unlock an advanced sheet or suggest more practice
- Useful when decisions depend on a hierarchy of criteria

#### 6e. Switch Statement — `switchoperator.java`
Selects one block of code to execute from many constant-value options:
- Compares a single variable against multiple `case` values
- `break` exits the switch block — without it, execution "falls through" to the next case
- `default` is optional and acts as a catch-all (like `else`)
- Works with: `int`, `char`, `String`, `byte`, `short`, and enums
- **Does NOT** work with: `float`, `double`, `long`, or `boolean`
- Example: maps a user-entered day number (1–7) to its weekday name

#### 6f. Ternary Operator — `ternary.java`
A one-line shorthand for simple `if-else` assignments:
- Syntax: `variable = (condition) ? valueIfTrue : valueIfFalse;`
- Best used for simple assignments — prefer `if-else` for complex logic
- Example: sets `status` to `"Active"` if `streakDays >= 30`, otherwise `"Inactive"`

### 7. Loops — `loops/forloop.java`
Demonstrates the `for` loop with several variations:
- Basic counting loop and step increments (`i += 2`)
- Nested loops for grid printing and index tracking
- `break` — exits the loop entirely when a condition is met
- `continue` — skips the current iteration and moves to the next

### 8. Pattern Printing — `Pattern Printing/`

#### 8a. Solid Rectangle — `Pattern1.java`
Prints an 8×8 grid of stars using nested loops:
- Outer loop controls rows, inner loop prints `n` stars per row
- Demonstrates the simplest nested-loop pattern

#### 8b. Fixed-Size Rectangle — `Pattern2.java`
Prints a 3×5 rectangle (3 rows, 5 columns):
- Row count and column count are independent values
- Shows how to decouple row/column limits in nested loops

#### 8c. Right-Angled Triangle — `Pattern3.java`
Prints a staircase triangle where each row adds one more star:
- Inner loop runs from 1 to `i`, so stars increase per row
- Key insight: using the outer loop variable as the inner loop's limit

#### 8d. Parallelogram — `Pattern4.java`
Prints a parallelogram (slanted shape) using leading spaces and stars:
- First inner loop prints `(n - i)` spaces to create the slant
- Second inner loop prints `n` stars in every row
- Decreasing spaces + fixed stars creates the parallelogram effect

#### 8e. Inverted Right-Angled Triangle — `Pattern5.java`
Prints an inverted staircase where stars decrease each row:
- Inner loop runs from 1 to `(n - row + 1)`
- Shows how to count backwards or reduce elements per row

#### 8f. Pyramid — `Pattern6.java`
Prints a centered pyramid using spaces and stars:
- First inner loop prints decreasing spaces `(n - row)`
- Second inner loop prints odd number of stars `(2 * row - 1)`
- Combines spaces and math formula for centered shapes

#### 8g. Inverted Pyramid — `Pattern7.java`
Prints an upside-down centered pyramid:
- First inner loop prints increasing spaces `(row - 1)`
- Second inner loop prints decreasing odd number of stars `(2 * n - 2 * row + 1)`
- The inverse logic of the standard pyramid pattern

#### 8h. Hollow Rectangle — `Pattern8.java`
Prints a 4×6 rectangle outline (hollow inside):
- Uses `if-else` inside nested loops to check boundaries
- Prints stars only on the first/last row or first/last column
- Prints spaces for the hollow interior

#### 8i. Hollow Right-Angled Triangle — `Pattern9.java`
Prints a hollow staircase triangle:
- Uses `if-else` inside nested loops to check boundaries
- First and last rows print solid stars
- Middle rows print stars at the first and last positions with spaces inside

### 9. Arrays — `array basics/`

#### 9a. Array Basics — `array.java`
Covers the fundamentals of 1D arrays:
- **Declaration**: `int arr[];` — reserves a reference variable
- **Allocation**: `arr = new int[5];` — allocates memory for 5 integers
- **Initialization**: `int brr[] = {10, 20, 30};` — declare + fill in one step
- **Traversal**: both standard `for` loop and `for-each` loop

#### 9b. Array Input — `takingInput.java`
Reading array elements from user input with `Scanner`:
- Uses `arr.length` to dynamically control loop bounds
- Prompts user for each index value
- Demonstrates input + output flow for arrays

#### 9c. 2D Arrays — `array2d.java`
Introduces multi-dimensional arrays:
- Declaration and initialization of 2D arrays
- Nested loop traversal using `arr.length` (rows) and `arr[i].length` (columns)
- Jagged arrays — rows with different column counts
- Finding maximum value in a 2D array

#### 9d. Array Practice — `practiceArrays.java`
Common algorithmic problems on arrays:
- Finding the **sum** of all elements
- Finding the **product** of all elements
- Finding the **maximum** value
- Finding the **minimum** value

### 10. Strings — `string basics/string.java`
Introduces Java's `String` class:
- **Concatenation** using `+` operator
- **Length** with `.length()` method (note: method, not field like arrays)
- **Character access** with `.charAt(index)` (no bracket indexing like `str[0]`)
- Strings are **objects**, not primitives — and they are **immutable**

### 11. Methods / Functions — `methods/`

#### 11a. Basic Method — `method.java`
Defining and calling a simple `void` method:
- `static void printTableOf2()` — prints multiplication table of 2
- Methods are called by name from `main`

#### 11b. Method with Parameters — `sumMethod.java`
Passing arguments to methods:
- `static void printSum(int a, int b)` — accepts two integers and prints their sum
- Parameters act as local variables inside the method

#### 11c. Return Types — `returnType.java`
Difference between `void` and return-type methods:
- `void` methods perform actions but return nothing
- `int`, `double`, `boolean`, etc. methods compute and return a value
- Caller captures the result: `int result = add(5, 10);`

#### 11d. Method Overloading — `methodOverload.java`
Multiple methods sharing the same name but different parameter lists:
- `add(int, int)` and `add(int, int, int)` — Java picks the correct one based on arguments
- Also works with different parameter types (`display(int)` vs `display(String)`)

#### 11e. Call by Value — `callByValue.java`
Java passes primitives by value — a copy is made:
- Changes inside the method do **not** affect the original variable
- Demonstrates with `num = 5` → passed to `solve()` → modified inside → original remains `5`

#### 11f. Variable Scoping — `variableScoping.java`
Visibility and lifetime of variables:
- **Class-level (static)** variables are accessible anywhere in the class
- **Local** variables shadow class-level variables within their scope
- The innermost scope always takes precedence

#### 11g. Combined Practice — `practice.java`
Comprehensive file combining all method concepts:
- `void` methods, parameterized methods, return types
- Boolean-returning methods (`isEven`)
- Math utility methods (`calculatePercentage`, `getMaximum`)
- Method overloading with different types
- Call by value demonstration

---

## 🧠 Key Concepts Quick Reference

| Concept                    | Example                          | Notes                                    |
| -------------------------- | -------------------------------- | ---------------------------------------- |
| Print to console           | `System.out.println("Hi")`       | `println` adds newline, `print` doesn't  |
| Declare a variable         | `int age;`                       | Must assign before use                   |
| Initialize a variable      | `int age = 25;`                  | Declaration + assignment in one step     |
| Integer division           | `25 / 7` → `3`                   | Decimal part is truncated                |
| Float literal              | `3.14f`                          | Must use `f` suffix for float            |
| Char arithmetic            | `'A' + 2` → `67`                | Cast with `(char)` to get `'C'`          |
| Short-circuit evaluation   | `false && expr`                  | `expr` is never evaluated                |
| Prefix vs. postfix         | `++x` vs. `x++`                  | Increment timing differs                 |
| Bitwise NOT                | `~6` → `-7`                      | Equals `-(x+1)` for positive integers    |
| Read input                 | `sc.nextInt()`                   | Requires `Scanner` import                |
| BigInteger input           | `sc.nextBigInteger()`            | Requires `java.math.BigInteger` import   |
| Boolean input              | `sc.nextBoolean()`               | Reads `true` or `false` from console     |
| Array declaration          | `int[] arr = new int[5]`         | Fixed size, zero-initialized             |
| Array length               | `arr.length`                     | Field — no parentheses                   |
| String length              | `str.length()`                   | Method — with parentheses                |
| String charAt              | `str.charAt(0)`                  | No bracket indexing for Strings          |
| 2D array access            | `arr[row][col]`                  | Row-major order                          |
| Method definition          | `static int add(int a, int b)`   | `static` allows calling without object   |
| Method overloading         | Same name, different params      | Resolved at compile time                 |
| Call by value              | Primitives pass a copy           | Original variable is never modified      |
| Variable scoping           | Local shadows class-level        | Innermost scope wins                     |
| If statement               | `if (x >= 10) { ... }`          | Block runs only when condition is true   |
| If-else                    | `if (x) { ... } else { ... }`   | Provides an alternate path               |
| If-else-if ladder          | `if ... else if ... else`        | First true branch executes               |
| Nested if-else             | `if { if { } else { } }`        | Multi-level decision hierarchy           |
| Switch statement           | `switch (x) { case 1: ... }`    | Matches one value from many constants    |
| Ternary operator           | `(cond) ? a : b`                 | Inline if-else for simple assignments    |
| for loop                   | `for (int i=0; i<n; i++)`       | Fixed-count repetition                   |
| for-each loop              | `for (int val : arr)`            | Cleaner when index not needed            |
| break                      | `if (x==5) break;`              | Exits loop entirely                      |
| continue                   | `if (x==5) continue;`           | Skips current iteration                  |
| Solid rectangle pattern    | Nested loop, both run to `n`    | Rows × Columns grid of stars             |
| Triangle pattern           | Inner loop limit = `i`          | Stars increase per row                   |
| Parallelogram pattern      | Leading spaces + stars           | `(n-i)` spaces then `n` stars            |
| Inverted triangle pattern  | Loop limit = `n - row + 1`       | Stars decrease per row                   |
| Pyramid pattern            | Spaces then `(2*row-1)` stars    | Centered odd-numbered stars              |
| Hollow rectangle pattern   | `if` boundary check              | Stars on borders, spaces inside          |
| Hollow triangle pattern    | `if` boundary check with spaces  | Stars on borders, spaces inside          |

---

## 🚀 How to Run

Make sure you have **Java JDK** installed. To keep your project clean, you can compile the files into the `out` folder and run them from there. Run these commands from the root of the project:

```bash
# Example: Run the Hello World program
javac -d out "first program/Main.java"
java -cp out Main

# Example: Run an operator file
javac -d out "operators/arithmetic_operators.java"
java -cp out arithmetic_operators

# Example: Run the input program
javac -d out "taking input/takinginput.java"
java -cp out takinginput

# Example: Run a conditional file
javac -d out "conditionals/ifelseif.java"
java -cp out ifelseif

# Example: Run a pattern printing file
javac -d out "Pattern Printing/Pattern1.java"
java -cp out Pattern1

# Example: Run an array file
javac -d out "array basics/takingInput.java"
java -cp out takingInput

# Example: Run a methods file
javac -d out "methods/practice.java"
java -cp out practice
```

---

## 📝 Progress Tracker

- [x] Hello World
- [x] Variables
- [x] Data Types
- [x] Operators (Arithmetic, Assignment, Relational, Logical, Unary, Bitwise)
- [x] Taking Input (Scanner)
- [x] Conditionals (if, if-else, if-else-if, nested if-else, switch, ternary)
- [x] Loops (for, nested loops, break, continue)
- [x] Pattern Printing (solid rectangle, fixed rectangle, triangle, parallelogram, inverted triangle, pyramid, inverted pyramid, hollow rectangle, hollow triangle)
- [x] Arrays (1D, 2D, jagged arrays, input, traversal, sum, product, min, max)
- [x] Strings (concatenation, length, charAt)
- [x] Methods / Functions (void, parameters, return types, overloading, call by value, scoping)
- [ ] Object-Oriented Programming (Classes, Objects, Inheritance, Polymorphism)

---

## 🤝 Contributing

This is a personal learning repository. Feel free to fork it and use it for your own Java learning journey!

---

## 📄 License

This project is open source and available for educational purposes.
