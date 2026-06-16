import java.util.*;
public class Factors{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),sum=0,prod=1,sq=0;

        for(int i=1;i<=n;i++)
            if(n%i==0){
                System.out.print(i+" ");
                sum+=i;
                prod*=i;
                sq+=i*i;
            }

        System.out.println("\nSum="+sum);
        System.out.println("Product="+prod);
        System.out.println("SumSq="+sq);
        sc.close();
    }
}