import java.util.*;
public class QuotientRemainder{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt(),d=sc.nextInt();

        System.out.println("Quotient = "+n/d);
        System.out.println("Remainder = "+n%d);

        sc.close();
    }
}