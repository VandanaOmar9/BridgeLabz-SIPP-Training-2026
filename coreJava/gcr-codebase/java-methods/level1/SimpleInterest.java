import java.util.*;
public class SimpleInterest{
    static double si(double p,double r,double t){
        return p*r*t/100;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double p=sc.nextDouble(),r=sc.nextDouble(),t=sc.nextDouble();
        System.out.println("SI = "+si(p,r,t));
        sc.close();
    }
}