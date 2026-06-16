import java.util.*;
public class UnitConvertor1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();

        System.out.println("Km->Miles="+n*0.621371);
        System.out.println("Miles->Km="+n*1.60934);
        System.out.println("Meters->Feet="+n*3.28084);
        System.out.println("Feet->Meters="+n*0.3048);

        sc.close();
    }
}