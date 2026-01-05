import java.util.Collections;
import java.util.PriorityQueue;

public class HeapDemo {
    public static void main(String[] args) {
        // 1. Min Heap (Default)
        System.out.println("=== MIN HEAP ===");
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(10);
        minHeap.add(30);
        minHeap.add(20);
        minHeap.add(5); // Smallest moves to front

        while (!minHeap.isEmpty()) {
            System.out.println("Polled: " + minHeap.poll());
        }

        // 2. Max Heap (Custom Comparator)
        System.out.println("\n=== MAX HEAP ===");
        // Collections.reverseOrder() is a handy comparator for primitives/wrappers
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        maxHeap.add(10);
        maxHeap.add(30); // Largest moves to front
        maxHeap.add(20);
        maxHeap.add(5);

        while (!maxHeap.isEmpty()) {
            System.out.println("Polled: " + maxHeap.poll());
        }
    }
}
