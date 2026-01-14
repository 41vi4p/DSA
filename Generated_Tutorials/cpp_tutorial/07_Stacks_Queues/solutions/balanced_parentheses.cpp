#include <iostream>
#include <stack>
#include <string>

bool validParentheses(std::string s) {
    std::stack<char> st;

    for (char c : s) {
        if (c == '(' || c == '{' || c == '[') {
            st.push(c);
        } else {
            if (st.empty()) return false;
            char top = st.top();
            if ((c == ')' && top == '(') ||
                (c == '}' && top == '{') ||
                (c == ']' && top == '[')) {
                st.pop();
            } else {
                return false;
            }
        }
    }

    return st.empty();
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
