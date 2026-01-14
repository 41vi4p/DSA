#include <iostream>
#include <stack>
#include <string>

// TODO: validParentheses checks if the string has balanced brackets: (), {}, []
// Ex: "{[()]}" -> true, "{[(])}" -> false
bool validParentheses(std::string s) {
    std::stack<char> st;

    for (char c : s) {
        // 1. If open bracket, push to stack
        
        // 2. If close bracket:
        //    a. Check if stack empty (invalid)
        //    b. Check if top of stack matches the current close bracket
        //       (e.g., if c == '}', top must be '{')
        //    c. If match, pop from stack. If not, return false.
    }

    // 3. Return true if stack is empty, false otherwise
    return true; // placeholder
}

int main() {
    std::string test1 = "{[()]}";
    std::string test2 = "{[(])}";
    std::string test3 = "(((";

    std::cout << test1 << " -> " << (validParentheses(test1) ? "Valid" : "Invalid") << std::endl;
    std::cout << test2 << " -> " << (validParentheses(test2) ? "Valid" : "Invalid") << std::endl;
    std::cout << test3 << " -> " << (validParentheses(test3) ? "Valid" : "Invalid") << std::endl;

    return 0;
}
