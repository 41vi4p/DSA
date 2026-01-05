import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UniqueNames {

    public static List<String> getUniqueNames(List<String> input) {
        // 1. Convert to HashSet to remove duplicates O(N)
        HashSet<String> uniqueSet = new HashSet<>(input);
        
        // 2. Convert back to ArrayList
        return new ArrayList<>(uniqueSet);
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Alice");
        names.add("Charlie");

        System.out.println("Original: " + names);
        System.out.println("Unique: " + getUniqueNames(names));
    }
}
