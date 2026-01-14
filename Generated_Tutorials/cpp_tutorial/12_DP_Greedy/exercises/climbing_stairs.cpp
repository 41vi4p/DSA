#include <iostream>
#include <vector>

// TODO: You are climbing a staircase. It takes 'n' steps to reach the top.
// Each time you can either climb 1 or 2 steps.
// In how many distinct ways can you climb to the top?
// Example: n = 2 -> 2 ways (1+1, 2)
// Example: n = 3 -> 3 ways (1+1+1, 1+2, 2+1)
int climbStairs(int n) {
    // Hint: This is exactly like Fibonacci!
    // ways(n) = ways(n-1) + ways(n-2)
    // Base cases: n=1 -> 1 way, n=2 -> 2 ways
    
    // You can use a vector for tabulation (DP array)
    // std::vector<int> dp(n + 1);
    
    return 0; // Replace
}

int main() {
    int n = 5;
    std::cout << "Ways to climb " << n << " steps: " << climbStairs(n) << std::endl;
    // Expected: 8
    return 0;
}
