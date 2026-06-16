import java.util.*;
public class FactorsTask{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),sum=0,max=1;
        long p=1,cube=1;

        for(int i=1;i<=n;i++)
            if(n%i==0){
                max=i;
                sum+=i;
                p*=i;
                cube*=i*i*i;
            }

        System.out.println(max+" "+sum+" "+p+" "+cube);
        sc.close();
    }
}