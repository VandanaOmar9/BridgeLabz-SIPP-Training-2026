import java.util.*;
public class Collinear{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int x1=sc.nextInt(),y1=sc.nextInt();
        int x2=sc.nextInt(),y2=sc.nextInt();
        int x3=sc.nextInt(),y3=sc.nextInt();

        int area=x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2);

        System.out.println(area==0?"Collinear":"Not Collinear");

        sc.close();
    }
}