import java.util.*;

public class StringIndexDemo {
    public static void main(String[] args){
        String s=new Scanner(System.in).next();
        try{
            System.out.println(s.charAt(s.length()));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Handled");
        }
        new Scanner(System.in).close();
    }
}