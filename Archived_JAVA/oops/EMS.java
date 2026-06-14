import java.util.*;
class Employee
{
    String name;
    int empid;
    int salary;

    Employee(String name,int empid,int salary)
    {
        this.name=name;
        this.empid=empid;
        this.salary=salary;
    }
    void display()
    {
        System.out.println("Employee Name= "+ name);
        System.out.println("Employee Id= "+ empid);
        System.out.println("Salary= "+ salary);
    }
}
class Manager extends Employee
{
    String dept;
    int bonus;
    int totalsalary;
    Manager(String name, int employeeId, int salary, String dept, int bonus) {
        super(name, employeeId, salary);
        this.dept = dept;
        this.bonus = bonus;
    }
    void caltotalsal()
    {
        totalsalary=salary+bonus;
    }
    @Override
    void display()
    {
        super.display();
        System.out.println("Department: " + dept);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalsalary);
    }
}
public class EMS {
    public static void main(String[] args) {
        Manager m1 = new Manager("Manglam", 1000, 30000, "IT", 5000);
        m1.caltotalsal();
        m1.display();
    }
}
