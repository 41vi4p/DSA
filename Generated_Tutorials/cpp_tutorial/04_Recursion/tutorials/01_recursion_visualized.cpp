#include <iostream>
#include <string>
#include "../../utils/visualizer.h"

// Recursive function with visualization
int factorial(int n, int depth = 0) {
    // Indent based on recursion depth for visual effect
    std::string indent(depth * 4, ' ');

    Visualizer::clearScreen();
    std::cout << "Recursion Visualization: Calculating Factorial(" << n << ")\n";
    Visualizer::printLine();
    
    std::cout << indent << "-> Calling factorial(" << n << ")\n";
    if (n > 1) {
        std::cout << indent << "   Waiting for result of factorial(" << n - 1 << ")...\n";
    }
    
    Visualizer::sleep(800);

    // BASE CASE
    if (n <= 1) {
        std::cout << indent << "-> Base Case Reached! Return 1.\n";
        Visualizer::sleep(800);
        return 1;
    }

    // RECURSIVE STEP
    int result = n * factorial(n - 1, depth + 1);

    // AFTER RETURN (The "unwinding" phase)
    Visualizer::clearScreen();
    std::cout << "Recursion Visualization: Unwinding...\n";
    Visualizer::printLine();
    std::cout << indent << "<- factorial(" << n << ") returning " << result << " (" << n << " * " << result/n << ")\n";
    Visualizer::sleep(800);

    return result;
}

int main() {
    int num = 5;
    std::cout << "Calculating " << num << "! with visualizer...\n";
    Visualizer::sleep(1000);

    int finalResult = factorial(num);

    Visualizer::clearScreen();
    std::cout << "\nFinal Result: " << num << "! = " << finalResult << std::endl;

    return 0;
}
