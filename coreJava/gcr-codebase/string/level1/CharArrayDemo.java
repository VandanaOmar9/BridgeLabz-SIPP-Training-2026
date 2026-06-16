
import java.util.*;

public class CharArrayDemo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        char[] a=new char[s.length()];
        for(int i=0;i<s.length();i++) a[i]=s.charAt(i);

        System.out.println(Arrays.equals(a,s.toCharArray()));
        sc.close();
    }
}