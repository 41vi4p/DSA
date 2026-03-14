
import java.util.Scanner;

//teacher pass name and age and salary to teacher class
//
public class test_inherit {
    class person {
        String name;
        int age;

        person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }
    class student extends person{
        float m1,m2,m3;
        float percentage;
        float total_marks=m1+m2+m3;
        float average=(total_marks/3);
        student(String name,int age,float m1,float m2,float m3){
            super(name,age);
            this.m1=m1;
            this.m2=m2;
            this.m3=m3;
            this.percentage=average*100;
        }
        void displayS(){
            super.display();
            System.out.println("Total Marks: "+total_marks);
            System.out.println("Percent%: "+percentage);

    }
    class teacher extends person{
        int salary;
        teacher(String name,int age,int salary){
            super(name,age);
            this.salary=salary;
        }
        void displayT(){
            super.display();
            System.out.println("Salary: "+salary);
    }
}
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter name:");
       String name=sc.nextLine();
       System.out.println("Enter age:");
       int age=sc.nextInt();
       System.out.println("Enter salary:");
       int salary=sc.nextInt();
       sc.close();
        teacher t=new teacher(name,age,salary);
        t.displayT();
    }
}}
