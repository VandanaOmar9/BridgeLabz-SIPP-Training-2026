import java.util.*;
public class NumberCheck{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int[] a=new int[5];

        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();

            if(a[i]<0) System.out.println("Negative");
            else System.out.println(a[i]%2==0?"Even":"Odd");
        }

        System.out.println(
            a[0]>a[4]?"Greater":
            a[0]<a[4]?"Less":"Equal"
        );

        sc.close();
    }
}