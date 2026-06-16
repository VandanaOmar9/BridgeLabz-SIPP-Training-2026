import java.util.*;

public class SubstringDemo {
    static String sub(String s,int st,int en){
        String r="";
        for(int i=st;i<en;i++) r+=s.charAt(i);
        return r;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int st=sc.nextInt(), en=sc.nextInt();

        System.out.println(sub(s,st,en).equals(s.substring(st,en)));
        sc.close();
    }
}