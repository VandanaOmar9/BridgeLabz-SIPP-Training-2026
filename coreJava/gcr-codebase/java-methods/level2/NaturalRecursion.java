import java.util.*;
public class NaturalRecursion{
    static int sum(int n){
        return n==0?0:n+sum(n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(sum(n));
        System.out.println(n*(n+1)/2);

        sc.close();
    }
}