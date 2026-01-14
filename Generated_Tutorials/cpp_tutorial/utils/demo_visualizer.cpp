#include <iostream>
#include <vector>
#include "../utils/visualizer.h" // Include our new tool

int main() {
    std::cout << "Starting Animation Demo..." << std::endl;
    Visualizer::sleep(1000);

    std::vector<int> numbers = {10, 20, 30, 40, 50};

    // Animate moving through the array
    for (size_t i = 0; i < numbers.size(); ++i) {
        Visualizer::clearScreen();
        std::cout << "Iterating through the array...\n\n";
        
        Visualizer::drawVector(numbers, i, "Current State");
        
        std::cout << "\nChecking index " << i << " value: " << numbers[i] << std::endl;
        
        Visualizer::sleep(800); // Wait 0.8 seconds
    }

    Visualizer::clearScreen();
    std::cout << "Animation Complete!" << std::endl;

    return 0;
}
