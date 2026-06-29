public class vowel_hider {
    private static boolean isVowel(char ch)
    {    return "aeiouAEIOU".indexOf(ch)!=-1;}
    public static void main(String[] args) {
        String s="Hello World";
        StringBuilder res=new StringBuilder();
        
        for(char c:s.toCharArray()){
            if(isVowel(c))
                res.append("*");
            else    
                res.append(c);
        }
        System.out.println(res.toString());
    }
}
