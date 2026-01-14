import java.util.ArrayDeque;
import java.util.Deque;

public class StackQueueDemo {
    
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) throws InterruptedException {
        // 1. Stack (LIFO)
        Deque<String> stack = new ArrayDeque<>();
        
        System.out.println("=== STACK (Push/Pop) ===");
        stack.push("Plate 1");
        System.out.println("Pushed Plate 1: " + stack);
        
        stack.push("Plate 2");
        System.out.println("Pushed Plate 2: " + stack);
        
        stack.push("Plate 3");
        System.out.println("Pushed Plate 3: " + stack);
        
        System.out.println("\nPopping...");
        while(!stack.isEmpty()) {
            Thread.sleep(800);
            System.out.println("Popped: " + stack.pop());
            System.out.println("Remaining: " + stack);
        }


        // 2. Queue (FIFO)
        Deque<String> queue = new ArrayDeque<>();
        
        System.out.println("\n=== QUEUE (Offer/Poll) ===");
        queue.offer("Person A");
        System.out.println("Person A joins line: " + queue);
        
        queue.offer("Person B");
        System.out.println("Person B joins line: " + queue);
        
        System.out.println("\nServing (Polling)...");
        while(!queue.isEmpty()) {
            Thread.sleep(800);
            System.out.println("Served: " + queue.poll());
            System.out.println("Line: " + queue);
        }
    }
}
