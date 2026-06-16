import java.util.*;
public class SmallestLargest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();

        System.out.println("Smallest = "+Math.min(a,Math.min(b,c)));
        System.out.println("Largest = "+Math.max(a,Math.max(b,c)));

        sc.close();
    }
}