import java.util.*;
class person
{
    String name;
    int age;
    person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    void displayP()
    {
        System.out.println("Name is "+name);
        System.out.println("Age is "+ age);
    }
}
class Student extends person
{
    int m1,m2,m3,total;
    float percentage;
    // total=m1+m2+m3;
    // percentage=(float)(total/3);
    Student(String name,int age,int m1,int m2,int m3)
    {
        super(name,age);
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        this.total=m1+m2+m3;
        this.percentage=(float)(total/3);
    }
    void displayS()
    {
        displayP();
        System.out.println("Total marks"+total);
        System.out.println("Percentage is "+percentage);
    }
}
    

class Teacher extends person
{
    int sal;
    Teacher(String name,int age,int sal)
    {
        super(name,age);
        this.sal=sal;
    }
    void displayT()
    {
        displayP();
        System.out.println("Salary is"+sal);
    }
}
public class q1 {
    public static void main(String[] args) {
        Student s1= new Student("manglam",20,90,80,70);
        s1.displayS();
        Teacher t1=new Teacher("Mr. Jaiswal",45,20000);
        t1.displayT();
    }
}
