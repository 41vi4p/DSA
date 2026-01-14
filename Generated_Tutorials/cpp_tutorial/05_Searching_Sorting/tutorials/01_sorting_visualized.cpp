#include <iostream>
#include <vector>
#include <algorithm> // for std::swap
#include "../../utils/visualizer.h"

void bubbleSortVisualized(std::vector<int>& arr) {
    int n = arr.size();
    for (int i = 0; i < n - 1; ++i) {
        for (int j = 0; j < n - i - 1; ++j) {
            
            // VISUALIZATION START
            Visualizer::clearScreen();
            std::cout << "Bubble Sort Step:\nComparing index " << j << " (" << arr[j] << ") and " << j+1 << " (" << arr[j+1] << ")\n\n";
            Visualizer::drawVector(arr, j, "Array State");
            Visualizer::sleep(500); 
            // VISUALIZATION END

            if (arr[j] > arr[j + 1]) {
                std::swap(arr[j], arr[j + 1]);
                
                // VISUALIZATION START (Swap)
                Visualizer::clearScreen();
                std::cout << "Bubble Sort Step:\nSWAPPED " << arr[j+1] << " and " << arr[j] << "!\n\n";
                Visualizer::drawVector(arr, j+1, "Array State");
                Visualizer::sleep(500);
                // VISUALIZATION END
            }
        }
    }
}

int main() {
    std::vector<int> numbers = {64, 34, 25, 12, 22, 11, 90};
    
    std::cout << "Start Bubble Sort Visualization in 2 seconds...\n";
    Visualizer::sleep(2000);

    bubbleSortVisualized(numbers);

    Visualizer::clearScreen();
    std::cout << "Sorting Complete!\n";
    Visualizer::drawVector(numbers, -1, "Sorted Array");

    return 0;
}
