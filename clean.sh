#!/bin/bash

# Script to clean all .class files from the current directory and subdirectories

find . -name "*.class" -type f -delete

echo "All .class files have been removed."