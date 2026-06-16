import java.util.*;
public class LeapYear{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();

        System.out.println((y>=1582&&(y%400==0||y%4==0&&y%100!=0))
                ?"Leap Year":"Not Leap Year");

        sc.close();
    }
}