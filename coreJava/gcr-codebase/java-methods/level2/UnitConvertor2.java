import java.util.*;
public class UnitConvertor2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();

        System.out.println(n*3);
        System.out.println(n*0.333333);
        System.out.println(n*39.3701);
        System.out.println(n*0.0254);
        System.out.println(n*2.54);

        sc.close();
    }
}