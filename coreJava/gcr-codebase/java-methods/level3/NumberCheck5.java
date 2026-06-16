import java.util.*;
public class NumberCheck5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),s=0;

        for(int i=1;i<n;i++) if(n%i==0) s+=i;

        System.out.println("Perfect="+(s==n));
        System.out.println("Abundant="+(s>n));
        System.out.println("Deficient="+(s<n));

        int t=n,sum=0;
        while(t>0){
            int d=t%10,f=1;
            for(int i=1;i<=d;i++) f*=i;
            sum+=f;
            t/=10;
        }
        System.out.println("Strong="+(sum==n));
        sc.close();
    }
}