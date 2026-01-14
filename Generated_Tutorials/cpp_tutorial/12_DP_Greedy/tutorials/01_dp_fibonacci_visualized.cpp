#include <iostream>
#include <vector>
#include "../../utils/visualizer.h"

// MEMOIZATION: Store results in a cache
long long cache[100]; // Simple fixed-size cache

long long fibMemo(int n, int depth = 0) {
    if (n <= 1) return n;

    // Check Cache
    if (cache[n] != -1) {
        Visualizer::clearScreen();
        std::cout << "Calculating Fib(" << n << ")...\n";
        std::cout << "-> CACHE HIT! Found value: " << cache[n] << "\n";
        Visualizer::sleep(400); // Shorter sleep for hits
        return cache[n];
    }

    Visualizer::clearScreen();
    std::cout << "Calculating Fib(" << n << ")...\n";
    std::cout << "-> Computing... (Calling Fib(" << n-1 << ") + Fib(" << n-2 << "))\n";
    Visualizer::sleep(600);

    cache[n] = fibMemo(n - 1, depth + 1) + fibMemo(n - 2, depth + 1);
    return cache[n];
}

int main() {
    // Initialize cache with -1
    std::fill_n(cache, 100, -1);

    int n = 10;
    std::cout << "Starting DP Visualization for Fibonacci(" << n << ")\n";
    Visualizer::sleep(1000);

    long long result = fibMemo(n);

    Visualizer::clearScreen();
    std::cout << "Result: " << result << std::endl;
    std::cout << "Notice how we didn't re-calculate the same values multiple times!" << std::endl;

    return 0;
}
