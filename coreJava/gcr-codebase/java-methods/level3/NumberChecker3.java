import java.util.*;

public class NumberChecker3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),t=n,rev=0;
        boolean duck=false;

        while(t>0){
            int d=t%10;
            if(d==0) duck=true;
            rev=rev*10+d;
            t/=10;
        }

        System.out.println("Palindrome="+(rev==n));
        System.out.println("Duck="+duck);

        sc.close();
    }
}