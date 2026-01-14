#include <iostream>
#include <unordered_map>
#include <string>

int main() {
    // Key: Student Name (string), Value: Grade (int)
    std::unordered_map<std::string, int> grades;

    // 1. Insertion
    grades["Alice"] = 90;
    grades["Bob"] = 85;
    grades["Charlie"] = 92;

    std::cout << "Alice's Grade: " << grades["Alice"] << std::endl;

    // 2. Checking if key exists
    std::string student = "Dave";
    if (grades.find(student) == grades.end()) {
        std::cout << student << " is not in the class." << std::endl;
    }

    // 3. Iteration
    std::cout << "\nClass Register:\n";
    for (const auto& pair : grades) {
        std::cout << pair.first << ": " << pair.second << std::endl;
    }

    return 0;
}
