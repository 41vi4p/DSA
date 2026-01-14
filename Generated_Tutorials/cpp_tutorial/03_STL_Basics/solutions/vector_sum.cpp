#include <iostream>
#include <vector>

int sumVector(const std::vector<int>& vec) {
    int total = 0;
    for (int num : vec) {
        total += num;
    }
    return total;
}

int main() {
    std::vector<int> myNums = {5, 10, 15, 20};

    std::cout << "Sum: " << sumVector(myNums) << std::endl;

    return 0;
}
