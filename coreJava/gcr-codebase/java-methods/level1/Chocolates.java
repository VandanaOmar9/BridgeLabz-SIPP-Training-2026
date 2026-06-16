import java.util.*;
public class Chocolates{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int c=sc.nextInt(),n=sc.nextInt();

        System.out.println("Each = "+c/n);
        System.out.println("Remaining = "+c%n);

        sc.close();
    }
}