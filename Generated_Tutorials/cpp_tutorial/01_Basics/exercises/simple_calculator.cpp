#include <iostream>

// TODO: Create a function called 'add' that takes two doubles and returns their sum
// double add(double a, double b) { ... }

// TODO: Create a function called 'subtract' that takes two doubles and returns the difference

// TODO: Create a function called 'multiply' that takes two doubles and returns the product

// TODO: Create a function called 'divide' that takes two doubles and returns the quotient
//       Handle division by zero (print an error and return 0)

int main() {
    double num1, num2;
    char operation;

    std::cout << "Simple Calculator\n";
    std::cout << "Enter first number: ";
    std::cin >> num1;

    std::cout << "Enter operator (+, -, *, /): ";
    std::cin >> operation;

    std::cout << "Enter second number: ";
    std::cin >> num2;

    double result = 0;

    // TODO: Use a switch statement or if-else blocks to call the appropriate function based on 'operation'
    // if (operation == '+') {
    //     result = add(num1, num2);
    // } ...

    std::cout << "Result: " << result << std::endl;

    return 0;
}
