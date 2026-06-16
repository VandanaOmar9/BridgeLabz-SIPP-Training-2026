import java.util.*;
public class CheckNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n>0?1:n<0?-1:0);
        sc.close();
    }
}