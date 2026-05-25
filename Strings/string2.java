import java.util.*;

class string2
{
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("hello");
        System.out.println(sb.hashCode());
        sb.append("student");
        System.out.println(sb);
//        sb.reverse();
//        System.out.println(sb.hashCode());
//        sb.replace(0, 3, "@@");
//        System.out.println(sb);
                
        sb.deleteCharAt(0);
        System.out.println(sb.hashCode());
        System.out.println(sb);
                
    }
}