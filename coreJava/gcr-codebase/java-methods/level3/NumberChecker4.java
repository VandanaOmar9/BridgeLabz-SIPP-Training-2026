import java.util.*;

public class NumberChecker4 {
    static boolean prime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++)
            if(n%i==0) return false;
        return true;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int sq=n*n,sum=0,t=sq;
        while(t>0){ sum+=t%10; t/=10; }

        int s=0,p=1,x=n;
        while(x>0){
            int d=x%10;
            s+=d;
            p*=d;
            x/=10;
        }

        System.out.println("Prime="+prime(n));
        System.out.println("Neon="+(sum==n));
        System.out.println("Spy="+(s==p));
        System.out.println("Automorphic="+String.valueOf(sq).endsWith(String.valueOf(n)));
        System.out.println("Buzz="+(n%7==0||n%10==7));

        sc.close();
    }
}