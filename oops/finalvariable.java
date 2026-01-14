// Final: final is a keyword that we use for class(PREVENT INHERITANCE),method(PREVENT FROM OVERRIDING) & variable(CONSTANT)
// types of final: 
// 1. final instance variable
// 2. final static variable
// 3. final local variable

import java.util.*;
class ex
{
    final int x=10;// 1. type 1 initialization during declaration
    final int y;// for initialization block
    final int z;// for constructor
    {
        y=20;//1. type 2 we can initialize final variable in initialization block
    }
    ex()
    {
        z=10; // 1. type 3 we cannot reassign value to final variable // we can initialize final variable in constructor only once
    }
    final static int a=30; // 2. initialization during declaration, cannot initialize in constructor
}

// final class: a class declared with final keyword is called final class. we cannot inherit final class
final class test
{
    
}
public class finalvariable extends test{ // error: cannot inherit from final 'test'
   public static void main(String[] args) {
    
   } 
}

// final method: a method declared with final keyword is called final method. we cannot override final method
class test1
{
    final void show()
    {
        System.out.println("final method");
    }
}
class test2 extends test1
{
    void show() // error: cannot override final method
    {
        System.out.println("override final method");
    }
}
