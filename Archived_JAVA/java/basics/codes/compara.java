import java.util.*;

public class compara {
    static class Student {
        int age;
        String name;

        public Student(int age, String name){
            this.age = age;
            this.name = name;
        }
        @Override
        public String toString(){
            return "Student [age=" + age + ", name=" + name + "]";
        }
    }

    public static void main(String[] args) {
        Comparator<Student> com=(i,j)->Integer.compare(i.age, j.age);

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21,"hello "));
        studs.add(new Student(19,"world"));
        studs.add(new Student(25,"java"));
        
        Collections.sort(studs, com);
        System.out.println(studs);
    }
}
