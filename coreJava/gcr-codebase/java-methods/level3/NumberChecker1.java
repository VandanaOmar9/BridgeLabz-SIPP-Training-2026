import java.util.*;

public class NumberChecker1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),t=n,c=0;

        while(t>0){ c++; t/=10; }

        int[] d=new int[c];
        t=n;

        for(int i=c-1;i>=0;i--){
            d[i]=t%10;
            t/=10;
        }

        boolean duck=false;
        int arm=0,max=Integer.MIN_VALUE,smax=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE,smin=Integer.MAX_VALUE;

        for(int x:d){
            if(x==0) duck=true;
            arm+=(int)Math.pow(x,c);

            if(x>max){smax=max;max=x;}
            else if(x>smax&&x!=max)smax=x;

            if(x<min){smin=min;min=x;}
            else if(x<smin&&x!=min)smin=x;
        }

        System.out.println("Duck="+duck);
        System.out.println("Armstrong="+(arm==n));
        System.out.println("Largest="+max);
        System.out.println("2nd Largest="+smax);
        System.out.println("Smallest="+min);
        System.out.println("2nd Smallest="+smin);

        sc.close();
    }
}