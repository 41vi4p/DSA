import java.util.PriorityQueue;

public class KthLargest {

    // TODO: Find the K-th largest element in an array
    public static int findKthLargest(int[] nums, int k) {
        // Hint: Use a Min-Heap of size k.
        // If heap size > k, poll() the smallest element.
        // The remaining head will be the k-th largest.
        
        // PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        return 0; // Replace
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println(k + "nd Largest: " + findKthLargest(nums, k));
        // Expected: 5
    }
}
