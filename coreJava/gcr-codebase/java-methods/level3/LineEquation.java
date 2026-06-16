import java.util.*;

public class LineEquation{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        double x1=sc.nextDouble(),y1=sc.nextDouble();
        double x2=sc.nextDouble(),y2=sc.nextDouble();

        double d=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        double m=(y2-y1)/(x2-x1);
        double b=y1-m*x1;

        System.out.println("Distance="+d);
        System.out.println("y="+m+"x+"+b);

        sc.close();
    }
}