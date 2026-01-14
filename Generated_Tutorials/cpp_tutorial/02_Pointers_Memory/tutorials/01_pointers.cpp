#include <iostream>

int main() {
    int number = 42;
    
    // & operator gets the address
    std::cout << "Value of number: " << number << std::endl;
    std::cout << "Address of number: " << &number << std::endl;

    // * declared in type means "pointer to"
    int* ptr = &number; 

    std::cout << "Value of ptr (address): " << ptr << std::endl;

    // * operator on variable means "dereference" (get value at address)
    std::cout << "Value pointed to by ptr: " << *ptr << std::endl;

    // Modifying via pointer
    *ptr = 100;
    std::cout << "New value of number: " << number << std::endl;

    // Null pointer
    int* nullPtr = nullptr;
    // std::cout << *nullPtr; // CRASH! Never dereference nullptr.

    return 0;
}
