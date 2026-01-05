import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class SortingDemo {
    public static void main(String[] args) {
        // 1. Sorting Primitives
        int[] numbers = {5, 2, 9, 1, 6};
        System.out.println("Original Array: " + Arrays.toString(numbers));
        
        Arrays.sort(numbers);
        System.out.println("Sorted Array:   " + Arrays.toString(numbers));

        // 2. Binary Search (Requires sorted array)
        int index = Arrays.binarySearch(numbers, 9);
        System.out.println("Found 9 at index: " + index);

        // 3. Sorting Collections
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Cherry");
        
        System.out.println("\nUnsorted List: " + fruits);
        Collections.sort(fruits);
        System.out.println("Sorted List:   " + fruits);
        
        // 4. Reverse Order
        Collections.sort(fruits, Collections.reverseOrder());
        System.out.println("Reverse List:  " + fruits);
    }
}
