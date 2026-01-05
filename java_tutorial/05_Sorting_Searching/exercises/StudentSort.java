import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator; // Import Comparator interface
import java.util.List;

class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + ": " + score;
    }
}

public class StudentSort {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 92));
        students.add(new Student("Charlie", 85));
        students.add(new Student("Dave", 70));

        System.out.println("Original: " + students);

        // TODO: Sort by score (ascending) using a Lambda or anonymous Comparator
        // Collections.sort(students, ...);
        
        System.out.println("By Score: " + students);

        // TODO: Sort by score (descending). If scores are equal, sort by Name (alphabetical)
        // Hint: Use Comparator.comparing(...).thenComparing(...) or standard if-else logic inside compare()
        
        // System.out.println("By Score Desc/Name Asc: " + students);
    }
}
