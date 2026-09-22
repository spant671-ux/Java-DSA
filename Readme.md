# ☕ Java-DSA

Welcome to my Java & DSA learning repository! This repo documents my journey mastering Java from the ground up, covering core fundamentals through hands-on code examples, structured study notes, and practical problem-solving.

---

## 📚 Table of Contents
- [📖 Study Notes & Handbook](#-study-notes--handbook)
- [📂 Topics Directory](#-topics-directory)
- [🚀 Getting Started](#-getting-started)
- [🛠️ Tech Stack & Tools](#️-tech-stack--tools)
- [📝 Progress Tracker](#-progress-tracker)

---

## 📖 Study Notes & Handbook

All conceptual explanations, syntax references, key rules, and quick-reference tables are documented in:
👉 **[NOTES.md](./NOTES.md)**

### Topics Covered:
1. **Hello World & Java Basics** – Class structure, `main` method, `System.out.println()`, and how Java compiles & runs.
2. **Variables** – Declaration, assignment, initialization, naming rules & conventions (`camelCase`, `UPPER_SNAKE_CASE`).
3. **Data Types** – All 8 primitive types (`byte` → `double`, `boolean`, `char`), sizes, ranges, and char arithmetic.
4. **Operators** – Arithmetic, assignment, relational, logical, unary (prefix vs. postfix), and bitwise operators.
5. **Taking Input** – `Scanner` class, reading all data types, `BigInteger`, and the `nextLine()` gotcha.
6. **Conditionals** – `if`, `if-else`, `if-else-if` ladder, nested conditions, `switch`, and ternary operator.
7. **Loops** – `for` loop, step increments, nested loops, `for-each`, `break` & `continue`.
8. **Pattern Printing** – 9 patterns using nested loops: solid/hollow rectangles, triangles, pyramids, parallelogram.
9. **Arrays** – 1D & 2D arrays, jagged arrays, traversal, user input, and common problems (sum, product, min, max).
10. **Strings** – `String` object basics, concatenation, `.length()` vs `.length`, `.charAt()`, immutability.
11. **Methods / Functions** – `void` & return-type methods, parameters, overloading, call by value, variable scoping.

---

## 📂 Topics Directory

| # | Folder | Files | Description | Key Learnings |
|---|---|---|---|---|
| 01 | [`firstProgram`](./firstProgram) | `Main.java` | Classic Hello World — entry point | Class structure, `public static void main`, `println` |
| 02 | [`variables`](./variables) | `variables.java` | Variable rules & naming | Declaration vs. assignment vs. initialization, `camelCase` |
| 03 | [`datatypes`](./datatypes) | `datatypes.java` | All 8 primitive data types | `int`, `float`, `double`, `char`, `boolean`, char arithmetic |
| 04 | [`operators`](./operators) | 6 files | Complete operator coverage | Arithmetic, assignment, relational, logical, unary, bitwise |
| 05 | [`takingInput`](./takingInput) | `takinginput.java` | Reading user input | `Scanner`, `nextInt()`, `nextBigInteger()`, `nextBoolean()` |
| 06 | [`conditionals`](./conditionals) | 6 files | All conditional constructs | `if`, `if-else`, `if-else-if`, nested, `switch`, ternary |
| 07 | [`loops`](./loops) | `forloop.java` | Loop constructs | `for`, nested loops, step increments, `break`, `continue` |
| 08 | [`patternPrinting`](./patternPrinting) | 9 files | Pattern programs using nested loops | Rectangles, triangles, pyramids, hollow patterns |
| 09 | [`array basics`](./array%20basics) | 4 files | 1D & 2D array fundamentals | Declaration, input, traversal, jagged arrays, min/max/sum |
| 10 | [`string basics`](./string%20basics) | `string.java` | String basics | Concatenation, `.length()`, `.charAt()`, immutability |
| 11 | [`methods`](./methods) | 7 files | Methods & functions | `void`, return types, overloading, call by value, scoping |

---

## 🚀 Getting Started

Make sure you have **Java JDK** installed. Compile files into the `out` folder and run from there:

```bash
# Compile & run any file
javac -d out "folder name/FileName.java"
java -cp out FileName
```

### Quick Examples:
```bash
# Hello World
javac -d out "firstProgram/Main.java"
java -cp out Main

# Operators
javac -d out "operators/arithmetic_operators.java"
java -cp out arithmetic_operators

# Arrays
javac -d out "array basics/takingInput.java"
java -cp out takingInput

# Methods
javac -d out "methods/practice.java"
java -cp out practice
```

---

## 🛠️ Tech Stack & Tools
- **Language:** [Java](https://www.java.com/) (JDK 17+)
- **IDE:** [IntelliJ IDEA](https://www.jetbrains.com/idea/) / VS Code
- **Build:** `javac` (command-line compilation)
- **Version Control:** Git & GitHub

---

## 📝 Progress Tracker

- [x] Hello World
- [x] Variables
- [x] Data Types
- [x] Operators (Arithmetic, Assignment, Relational, Logical, Unary, Bitwise)
- [x] Taking Input (Scanner)
- [x] Conditionals (if, if-else, if-else-if, nested if-else, switch, ternary)
- [x] Loops (for, nested loops, break, continue)
- [x] Pattern Printing (9 patterns — solid, hollow, triangles, pyramids)
- [x] Arrays (1D, 2D, jagged arrays, input, traversal, sum, product, min, max)
- [x] Strings (concatenation, length, charAt)
- [x] Methods / Functions (void, parameters, return types, overloading, call by value, scoping)
- [ ] Object-Oriented Programming (Classes, Objects, Inheritance, Polymorphism)

---

## 🤝 Contributing

This is a personal learning repository. Feel free to fork it and use it for your own Java & DSA journey!

---

*Happy Coding & Learning! 🚀*
