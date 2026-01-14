import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionsDemo {
    public static void main(String[] args) {
        // 1. ArrayList
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        System.out.println("ArrayList: " + nums);

        // 2. HashSet (Unordered, Unique)
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // Duplicate ignored
        System.out.println("HashSet: " + fruits);

        // 3. HashMap (Key -> Value)
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        
        System.out.println("Bob is " + ages.get("Bob"));
        
        if (ages.containsKey("Alice")) {
            System.out.println("Alice is present.");
        }
    }
}
