#ifndef VISUALIZER_H
#define VISUALIZER_H

#include <iostream>
#include <thread>
#include <chrono>
#include <vector>
#include <string>

// Namespace to keep things organized
namespace Visualizer {

    // Clear the console screen
    inline void clearScreen() {
        #ifdef _WIN32
            system("cls");
        #else
            system("clear");
        #endif
    }

    // Pause execution for milliseconds
    inline void sleep(int milliseconds) {
        std::this_thread::sleep_for(std::chrono::milliseconds(milliseconds));
    }

    // Print a separator line
    inline void printLine(int length = 40) {
        for (int i = 0; i < length; ++i) std::cout << "-";
        std::cout << std::endl;
    }

    // Visualize a vector (Array)
    template <typename T>
    void drawVector(const std::vector<T>& vec, int highlightIndex = -1, std::string label = "Vector") {
        std::cout << label << ": [ ";
        for (size_t i = 0; i < vec.size(); ++i) {
            if (static_cast<int>(i) == highlightIndex) {
                 std::cout << "[" << vec[i] << "] "; // Highlight with brackets
            } else {
                std::cout << vec[i] << " ";
            }
        }
        std::cout << "]" << std::endl;
    }
}

#endif // VISUALIZER_H
