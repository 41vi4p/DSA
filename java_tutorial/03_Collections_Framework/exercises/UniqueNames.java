import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UniqueNames {

    // TODO: Given a list of names with duplicates, return a list with only unique names
    public static List<String> getUniqueNames(List<String> input) {
        // Hint: A HashSet automatically removes duplicates
        // HashSet<String> uniqueSet = new HashSet<>(input);
        // return new ArrayList<>(uniqueSet);
        
        return null; // Replace
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Alice"); // Duplicate
        names.add("Charlie");

        System.out.println("Original: " + names);
        System.out.println("Unique: " + getUniqueNames(names));
    }
}
