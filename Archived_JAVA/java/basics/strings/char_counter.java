
public class char_counter {
    public static void main(String[] args) {
        int[] freq=new int[26];

        String s="Hello Wolf";
        s=s.toLowerCase();

        for(int i=0;i<s.length();i++)
            if(s.charAt(i)!=' ')
                freq[s.charAt(i)-'a']++;
    
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)!=' ')    
                System.out.println(s.charAt(i)+": "+freq[s.charAt(i)-'a']);
    
    
    }
    

    
}
