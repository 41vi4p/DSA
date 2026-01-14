#include <iostream>
#include <vector>
#include <algorithm>
#include "../../utils/visualizer.h"

// Helper to confirm heap property (Max Heap)
bool isMaxHeap(const std::vector<int>& arr) {
    for (size_t i = 0; i < arr.size(); ++i) {
        size_t left = 2 * i + 1;
        size_t right = 2 * i + 2;
        if (left < arr.size() && arr[i] < arr[left]) return false;
        if (right < arr.size() && arr[i] < arr[right]) return false;
    }
    return true;
}

void pushHeapVisualized(std::vector<int>& heap, int val) {
    Visualizer::clearScreen();
    std::cout << "Pushing " << val << " to heap...\n\n";
    heap.push_back(val);
    Visualizer::drawVector(heap, heap.size()-1, "Initial Push");
    Visualizer::sleep(800);

    // Standard push_heap does the "bubbling up"
    std::push_heap(heap.begin(), heap.end());

    Visualizer::clearScreen();
    std::cout << "Restored Heap Property (Bubbled Up):\n\n";
    Visualizer::drawVector(heap, -1, "Max Heap");
    Visualizer::sleep(800);
}

int main() {
    std::vector<int> heap;

    std::cout << "Building a Max Heap...\n";
    Visualizer::sleep(1000);

    pushHeapVisualized(heap, 10);
    pushHeapVisualized(heap, 30); // Should swap with 10
    pushHeapVisualized(heap, 20);
    pushHeapVisualized(heap, 5);
    pushHeapVisualized(heap, 40); // Should bubble to top

    Visualizer::clearScreen();
    std::cout << "Popping Max Element (" << heap.front() << ")...\n\n";
    
    std::pop_heap(heap.begin(), heap.end()); // Moves max to end
    heap.pop_back(); // Removes it

    Visualizer::drawVector(heap, -1, "After Pop");

    return 0;
}
