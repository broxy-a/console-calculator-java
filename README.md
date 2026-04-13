# Calculator (Java)
A Java calculator application with both console and GUI versions. This project demonstrates Java input handling, exception management, and JavaFX GUI development.

## Description
This project contains two versions of a calculator written in Java:
- **Console version** — runs in the terminal with text-based input
- **GUI version** — graphical interface built with JavaFX

## Features
Both versions support the following operations:
* ➕ Addition (`+`)
* ➖ Subtraction (`-`)
* ✖️ Multiplication (`×`)
* ➗ Division (`÷`)
* ➕➖ Sign toggle (`+/-`)
* 🔢 Decimal point (`,`)

## How to Use

### Console Version
#### Prerequisites
* Java JDK installed (version 8 or higher)
* A terminal or command prompt

#### Running the App
1. Compile:
```bash
javac src/calculator/Calculator.java
```
2. Run:
```bash
java calculator.Calculator
```

### GUI Version
#### Prerequisites
* Java JDK 17 or higher
* JavaFX SDK 21

#### Running the App
Open the project in IntelliJ IDEA and run `javaFX.Main`

## Changelog

### v2.0.0
- Added JavaFX GUI version with Scene Builder layout
- Added expression display showing current operation
- Added backspace button

### v1.1.2
- Added validation for invalid operator input

### v1.1.1
- Fixed division by zero handling

### v1.1.0
- Refactored input handling

---
Created as a learning project.
