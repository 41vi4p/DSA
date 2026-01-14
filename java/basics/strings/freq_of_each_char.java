package strings;
import java.util.Scanner;

class freq_of_each_char {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       
        sc.close();
        boolean skip=false;
        for(int i=0;i<str.length();i++){
            if(skip){
                skip=false;
                continue;
            }
            char ch=str.charAt(i);
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==ch){
                    count++;
                    if(count>1)
                        skip=true;
                }

            }
            System.out.println(ch+": "+count);
        }
    }

    
}