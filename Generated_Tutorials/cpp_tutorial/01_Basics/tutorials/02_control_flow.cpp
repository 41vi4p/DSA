#include <iostream>

int main() {
    int number;
    std::cout << "Enter a positive integer: ";
    std::cin >> number;

    // 1. If-Else
    if (number > 0) {
        std::cout << "The number is positive." << std::endl;
    } else if (number < 0) {
        std::cout << "The number is negative." << std::endl;
    } else {
        std::cout << "The number is zero." << std::endl;
    }

    // 2. While Loop
    std::cout << "\nCounting down from " << number << ":\n";
    int count = number;
    while (count > 0) {
        std::cout << count << " ";
        count--;
    }
    std::cout << "Blastoff!\n";

    // 3. For Loop (Standard)
    std::cout << "\nPrinting even numbers up to " << number << ":\n";
    for (int i = 0; i <= number; i++) {
        if (i % 2 == 0) {
            std::cout << i << " ";
        }
    }
    std::cout << std::endl;

    return 0;
}
