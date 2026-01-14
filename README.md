# DSA (Data Structures and Algorithms)

This repository contains a collection of Data Structures and Algorithms (DSA) implementations and tutorials in C++ and Java. It serves as a learning resource for understanding fundamental concepts in programming and problem-solving.

## Repository Structure

### Basics
- **basics/**: Contains basic C++ programs for foundational concepts.
  - Includes programs like `program_1_to_10.cpp`, `program_11_to_20.cpp`, and pattern printing examples.
  - **archive/**: Archived basic programs.

- **java/basics/**: Basic Java programs.
  - Includes examples like `armstrong.java` (checking Armstrong numbers), `evenodd.java`, and subdirectories for arrays and strings.

### Tutorials
- **Generated_Tutorials/cpp_tutorial/**: Comprehensive C++ tutorials covering DSA topics.
  - **01_Basics/**: Variables, I/O, control flow.
  - **02_Pointers_Memory/**: Pointers and memory management.
  - **03_STL_Basics/**: Standard Template Library basics.
  - **04_Recursion/**: Recursive algorithms.
  - **05_Searching_Sorting/**: Searching and sorting algorithms.
  - **06_LinkedLists/**: Linked list implementations.
  - **07_Stacks_Queues/**: Stack and queue data structures.
  - **08_Trees/**: Tree data structures and traversals.
  - **09_Hashing/**: Hashing techniques.
  - **10_Heaps/**: Heap data structures.
  - **11_Graphs/**: Graph algorithms.
  - **12_DP_Greedy/**: Dynamic programming and greedy algorithms.
  - **utils/**: Utility functions and visualizers.
  - For more details, see [C++ Tutorials README](./Generated_Tutorials/cpp_tutorial/README.md)

- **Generated_Tutorials/java_tutorial/**: Java tutorials mirroring the C++ structure.
  - Covers similar topics with Java-specific implementations.
  - Includes a `run_with_utils.sh` script for running with utilities.
  - **utils/**: Java utility classes, including a visualizer.
  - For more details, see [Java Tutorials README](./Generated_Tutorials/java_tutorial/README.md)

### Utilities
- **clean.sh**: A bash script to remove all `.class` files generated during Java compilation from the repository and subdirectories.

## Getting Started

### Prerequisites
- **C++**: A C++ compiler (e.g., g++).
- **Java**: JDK installed (e.g., OpenJDK).

### Running the Code
- **C++**: Compile with `g++ filename.cpp -o output` and run `./output`.
- **Java**: Compile with `javac filename.java` and run `java classname`.
- Use `./clean.sh` to clean up compiled `.class` files.

### Tutorials
Navigate to the respective tutorial directories (e.g., `Generated_Tutorials/cpp_tutorial/01_Basics/`) and follow the README files in each section for exercises and solutions.

## Contributing
Feel free to contribute by adding new problems, improving implementations, or fixing bugs. Please ensure code is well-commented and follows the existing structure.

## License
This repository is licensed under the MIT License. See [LICENSE](LICENSE) for details.
