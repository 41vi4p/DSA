#include <iostream>
#include <vector>

int main() {
    // 1. Creation
    std::vector<int> numbers;

    // 2. Adding elements
    numbers.push_back(10);
    numbers.push_back(20);
    numbers.push_back(30);

    // 3. Accessing
    std::cout << "First element: " << numbers[0] << std::endl;
    std::cout << "Last element: " << numbers[numbers.size() - 1] << std::endl;

    // 4. Modifying
    numbers[1] = 99; // Change 20 to 99

    // 5. Size
    std::cout << "Size: " << numbers.size() << std::endl;

    // 6. Iterating
    std::cout << "Contents: ";
    for (int num : numbers) {
        std::cout << num << " ";
    }
    std::cout << std::endl;

    // 7. Removing last element
    numbers.pop_back();

    return 0;
}
