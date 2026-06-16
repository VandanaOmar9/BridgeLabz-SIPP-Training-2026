import java.util.*;

public class LowerCaseDemo {
    static String lower(String s){
        String r="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='A'&&c<='Z') c+=32;
            r+=c;
        }
        return r;
    }

    public static void main(String[] args){
        String s=new Scanner(System.in).nextLine();
        System.out.println(lower(s).equals(s.toLowerCase()));
    }
}