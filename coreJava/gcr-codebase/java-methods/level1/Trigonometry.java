import java.util.*;
public class Trigonometry{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        double a=Math.toRadians(sc.nextDouble());

        System.out.println("Sin = "+Math.sin(a));
        System.out.println("Cos = "+Math.cos(a));
        System.out.println("Tan = "+Math.tan(a));

        sc.close();
    }
}