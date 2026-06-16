import java.util.*;

public class NumberChecker2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),t=n,sum=0,sq=0;
        int[] f=new int[10];

        while(t>0){
            int d=t%10;
            sum+=d;
            sq+=d*d;
            f[d]++;
            t/=10;
        }

        System.out.println("Sum="+sum);
        System.out.println("SumSq="+sq);
        System.out.println("Harshad="+(n%sum==0));

        for(int i=0;i<10;i++)
            if(f[i]>0)
                System.out.println(i+" = "+f[i]);

        sc.close();
    }
}