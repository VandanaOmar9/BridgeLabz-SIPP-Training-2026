import java.util.*;
public class RandomStats{
    public static void main(String[] args){

        int min=9999,max=1000,sum=0;

        for(int i=0;i<5;i++){
            int n=(int)(Math.random()*9000)+1000;

            System.out.println(n);

            sum+=n;
            min=Math.min(min,n);
            max=Math.max(max,n);
        }

        System.out.println("Avg="+sum/5.0);
        System.out.println("Min="+min);
        System.out.println("Max="+max);
        
    }
}