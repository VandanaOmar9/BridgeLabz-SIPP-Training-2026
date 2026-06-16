import java.util.*;

public class UpperCaseDemo {
    static String upper(String s){
        String r="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='a'&&c<='z') c-=32;
            r+=c;
        }
        return r;
    }

    public static void main(String[] args){
        String s=new Scanner(System.in).nextLine();
        System.out.println(upper(s).equals(s.toUpperCase()));
    }
}