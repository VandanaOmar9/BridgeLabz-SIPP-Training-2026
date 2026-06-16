import java.util.*;

public class IllegalArgumentDemo {
    public static void main(String[] args){
        String s=new Scanner(System.in).next();
        try{
            System.out.println(s.substring(5,2));
        }catch(Exception e){
            System.out.println("Handled");
        }
        new Scanner(System.in).close();
    }
}