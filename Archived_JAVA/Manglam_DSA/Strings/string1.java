import java.util.*;
class string1
{
    public static void main(String[] args) {
        StringBuffer br= new StringBuffer();
        System.out.println(br.capacity());
                
        br.append("students..");
        System.out.println(br);
        br.reverse();
        System.out.println(br);

        br.insert(3, "student");
        System.out.println(br);
        
        br.delete(4, 9);
        System.out.println(br);
        
        StringBuffer b=new StringBuffer("hello");
        System.out.println(b.hashCode());

        b.append("hii");
        System.out.println(b.hashCode());          
    }
            
}