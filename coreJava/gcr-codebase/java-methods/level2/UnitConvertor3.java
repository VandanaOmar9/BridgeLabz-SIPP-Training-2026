import java.util.*;
public class UnitConvertor3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();

        System.out.println((n-32)*5/9);
        System.out.println((n*9/5)+32);
        System.out.println(n*0.453592);
        System.out.println(n*2.20462);
        System.out.println(n*3.78541);
        System.out.println(n*0.264172);

        sc.close();
    }
}