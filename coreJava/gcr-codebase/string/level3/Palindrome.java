import java.util.*;

public class Palindrome {
    static boolean check(String s){
        for(int i=0,j=s.length()-1;i<j;i++,j--)
            if(s.charAt(i)!=s.charAt(j)) return false;
        return true;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        System.out.println(check(s));

        sc.close();
    }
}