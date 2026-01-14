#include <iostream>
#include <vector>
#include <deque>
#include "../../utils/visualizer.h"

// Visualization helpers are abstracted here for brevity
void drawStack(const std::vector<int>& stack) {
    std::cout << "Stack Visualization (Top is Right):\n";
    Visualizer::drawVector(stack, -1, "STACK");
}

void drawQueue(const std::deque<int>& queue) {
    std::cout << "Queue Visualization (Front is Left):\n";
    std::cout << "QUEUE: [ ";
    for(int x : queue) std::cout << x << " ";
    std::cout << "]\n";
}

int main() {
    // --- STACK DEMO ---
    Visualizer::clearScreen();
    std::cout << "=== STACK DEMO (LIFO) ===\n";
    Visualizer::sleep(1000);

    std::vector<int> stack;
    
    // Push
    for (int i = 1; i <= 3; ++i) {
        stack.push_back(i * 10);
        Visualizer::clearScreen();
        std::cout << "Pushing " << i * 10 << "...\n\n";
        drawStack(stack);
        Visualizer::sleep(800);
    }

    // Pop
    while (!stack.empty()) {
        Visualizer::clearScreen();
        std::cout << "Popping from stack...\n\n";
        drawStack(stack);
        Visualizer::sleep(800);
        stack.pop_back();
    }
    
    Visualizer::clearScreen();
    std::cout << "Stack Empty!\n";
    drawStack(stack);
    Visualizer::sleep(1000);


    // --- QUEUE DEMO ---
    Visualizer::clearScreen();
    std::cout << "=== QUEUE DEMO (FIFO) ===\n";
    Visualizer::sleep(1000);

    std::deque<int> queue;

    // Enqueue
    for (int i = 1; i <= 3; ++i) {
        queue.push_back(i * 10);
        Visualizer::clearScreen();
        std::cout << "Enqueuing " << i * 10 << "...\n\n";
        drawQueue(queue);
        Visualizer::sleep(800);
    }

    // Dequeue
    while (!queue.empty()) {
        Visualizer::clearScreen();
        std::cout << "Dequeuing from front...\n\n";
        drawQueue(queue);
        Visualizer::sleep(800);
        queue.pop_front();
    }

    Visualizer::clearScreen();
    std::cout << "Queue Empty!\n";
    drawQueue(queue);

    return 0;
}
