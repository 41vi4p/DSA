#!/bin/bash

if [ -z "$1" ]; then
  echo "Usage: ./run_with_utils.sh <path_to_java_file>"
  echo "Example: ./run_with_utils.sh 01_Basics/src/VariablesIO.java"
  exit 1
fi

# 1. Get the absolute path where this script lives (project root)
SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )"
TARGET_FILE="$1"

# 2. Check if target file exists
if [ ! -f "$TARGET_FILE" ]; then
    echo "Error: File '$TARGET_FILE' not found!"
    exit 1
fi

# 3. Get target details
TARGET_NAME=$(basename "$TARGET_FILE" .java)
TARGET_DIR=$(dirname "$TARGET_FILE")
ABS_TARGET_DIR="$(cd "$TARGET_DIR"; pwd)"

# 4. Compile Visualizer (if exists) from project root
# We place the Compiled .class in the project root (.) to be easily accessible
cd "$SCRIPT_DIR"

if [ -f "utils/Visualizer.java" ]; then
    # echo "Compiling Visualizer..."
    javac -d . utils/Visualizer.java
fi

# 5. Compile Target File
# Include project root (.) in classpath so it can find 'Visualizer'
# echo "Compiling $TARGET_NAME..."
javac -cp . "$TARGET_FILE"

if [ $? -ne 0 ]; then
    echo "Compilation failed."
    exit 1
fi

# 6. Run
# Classpath = . (for Visualizer) + Target Directory (for the class itself)
echo "Running $TARGET_NAME..."
java -cp ".:$ABS_TARGET_DIR" "$TARGET_NAME"
