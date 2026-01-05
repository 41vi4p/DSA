import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

        // 1. Sort by score (ascending)
        Collections.sort(students, (s1, s2) -> s1.score - s2.score);
        System.out.println("By Score: " + students);

        // 2. Sort by score (descending), then name
        Collections.sort(students, (s1, s2) -> {
            if (s1.score != s2.score) {
                return s2.score - s1.score; // Descending score
            }
            return s1.name.compareTo(s2.name); // Ascending name
        });
        
        System.out.println("By Score Desc/Name Asc: " + students);
    }
}
