# CalculatorProject


This project is a simple calculator application built in Java that supports basic arithmetic operations: addition, multiplication, subtraction, and division. It also includes unit tests to verify the functionality of each operation.

## Features

- **Addition**: Sums up any number of integers.
- **Multiplication**: Multiplies any number of integers.
- **Subtraction**: Subtracts a series of numbers from the first number.
- **Division**: Divides the first number by the second (with error handling for division by zero).

## Requirements

- Java 11 or higher
- JUnit 5 for testing

## Setup Instructions

### 1. Clone the repository

```bash
git clone https://github.com/H3RT/calculator-app.git
cd calculator-app
```
### 2. Compile project
```bash 
mvn clean install
```

```gradle
./gradlew build
```

### 3. Run the application
```bash
mvn exec:java -Dexec.mainClass="org.example.CalculatorApp"
```

### 4. Run tests
```bash
mvn test
```

```gradle
./gradlew test
```

### The tests will validate the following functionalities:

- **Addition of numbers**
- **Multiplication of numbers**
- **Subtraction of numbers**
- **Division of numbers (including division by zero)**


