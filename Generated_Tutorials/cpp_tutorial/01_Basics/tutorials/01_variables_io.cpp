#include <iostream>
#include <string>

// This is a comment

int main() {
    // 1. Output
    std::cout << "Welcome to C++ Basics!" << std::endl;

    // 2. Variables
    int age = 20;
    double height = 5.9;
    char grade = 'A';
    std::string name = "User";
    bool isLearning = true;

    // 3. Printing variables
    std::cout << "Name: " << name << "\n";
    std::cout << "Age: " << age << "\n";
    std::cout << "Height: " << height << "\n";
    std::cout << "Grade: " << grade << "\n";
    
    // bool prints as 1 (true) or 0 (false) by default
    std::cout << "Is Learning? " << isLearning << std::endl; 

    // 4. Input
    std::cout << "Enter your favorite number: ";
    int favoriteNumber;
    std::cin >> favoriteNumber;
    std::cout << "You entered: " << favoriteNumber << std::endl;

    return 0;
}
