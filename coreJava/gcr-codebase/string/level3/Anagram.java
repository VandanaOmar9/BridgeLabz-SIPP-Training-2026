import java.util.*;

public class Anagram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String a=sc.nextLine();
        String b=sc.nextLine();

        int[] f=new int[256];

        for(char c:a.toCharArray()) f[c]++;
        for(char c:b.toCharArray()) f[c]--;

        boolean ok=a.length()==b.length();

        for(int x:f)
            if(x!=0) ok=false;

        System.out.println(ok);

        sc.close();
    }
}