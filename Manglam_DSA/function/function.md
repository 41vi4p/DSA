==============================================================
DAY -1

1. function with no argument and no return
2. function with no argument and return
3. function with argument and no return
4. function with argument and return

==============================================================
##FUNCTION

add()
empty brackets: no arguments
void: no return type
int float string boolean: return type

=========================================================================================
DAY-2

Class : class is keyword which is used to create userdefined datatype with the help of predefined datatype, class is a blueprint or template which is used to create objects.

==============================================================================
class Student
{
    int roll;
    String name;
    float per;
}
Student s1= new Student();

Student: class name (Datatype)
s1: reference variable(stores the adress to another block in memory)
new: keyword to create new objects
Student(); : constructor

==============================================================================
Pointer : Pointer is a variable which stores the address of another variable
* : value
& : address

int a=10,*p,**q;
p=&a;
printf("%d",&p);
printf("%d",*p);

always read from right to left
&+variable then read it at a time
Ex-
1. &*f*&*e
2. B&*&F*&E

pointer always points similar types of data

=========================================================
Constructor:
Constructor is nothing but a function
it is a special type of function 
it is a special type of member function
1. its name is same as class name
2. No need to create 

constructor is automatically gets called when object is created

===================================================================
Static: Keyword

static variable - throughout the program single copy exist (example in function.md)
static method - throughout the program single copy exist
1 object : 1 copy
1000 object : 1 copy
no object: 1 copy

static means copy should be created even if object doesnot got created

public class Ex
{
    int a;
    static int b;
    public static void main(String[] args)
    {
        System.out.println(b);
        System.out.println(Ex.b);
    }
}

Output: 
0
00
0
by default value of static variable(b), class member(a) is 0.

member variable: a,b
member method: main

==================================================================
Day- 3

Array: collection of similar type of elements

int x[]= new int[5];
x: reference variable that stores the pointer(address) to the array block of length 5(0,1,2,3,4 indexes)
we cannot give size to reference variable
x[index]=value;
x.length=5;

=>length is a variable here, but in string it was a function

====valid declaration======
int x[]={1,2,3,4,5};
int []y;
int a[]=new int[5];
int []b= new int[5];
int x[]=new int[]{1,2,3};

========2D array============
int x[][]=new int[5][3];

array of 5 indexes which stores the address of 


==========================================
Constructor

constructor is a function: Ex()
It is a memeber function : inside class
It is a special type of member function:
    1. name of constructor is same as class
    2. not return type(not even void)
    3. explicitly called when object is created(no need to call constructor)
    4. we can't make constructor static, final,abstract
    5. can be define in any public,private,protected,default 

constructor are of two type - default constructor, parametersired constructor


Ex()
{
    System.out.println("Hii");
}
Ex(int a)
{
    System.out.println("HELLO");
}

this points data in the same class
super call the data in parent class

there is no destructor in java, it has automatic garbage collector which frees the unused memory after some time
java used to have Finalize() method which is now depreciated which was used for:
    for closing file
    closing db connections
    closing network resources

=======================================================================
4 Pillars of java
1. Inheritance - single(1 parent class & 1 child class), multilevel(grandparent--> parent--> child), multiple(java doesnt support this beacause of naming ambiguity so we use interphasis(it contains abstract methods) if we want multiple inheritance), herarchical(1 parent & 2 child), hybrid(combination of single , multilevel and herarchical inheritance)
2. Abstraction
3. Polymorphism - compile time,runtime
4. Encapsulation - Wrapping of a data

===============================================================================================
Day 4:

Compiletime:
    method overloading -same name methods with different parameters (In a class both the method having exactly same name, different argument called method overloading)
Runtime:
    method overiding - same name methoods with same parameters- (child class overides the method of parent class)- (both the classs having parent cchild relationship and having exactly same name and same argument called method overriding)

