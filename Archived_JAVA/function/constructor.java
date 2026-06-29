class Student
{
    int roll;
    String name;
    String clg;
    static String college;
}

public class constructor {
    constructor()
    {
        System.out.println("Constructor is here");
    }
    public static void main(String[] args) {
        constructor C1= new constructor();
        Student s1= new Student();
        Student.college= "crce";
        s1.roll=1;
        s1.name="manglam";
        s1.clg="frcrce";
        System.out.println(s1.roll+ "\n"+ s1.name+ "\n" +s1.clg+"\n"+Student.college+"\n" + s1.college);
    }
}
