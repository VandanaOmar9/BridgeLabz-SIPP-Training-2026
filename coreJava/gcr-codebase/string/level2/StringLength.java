import java.util.*;

public class StringLength {
    static int len(String s){
        int c=0;
        try{
            while(true){ s.charAt(c); c++; }
        }catch(Exception e){}
        return c;
    }

    public static void main(String[] args){
        String s=new Scanner(System.in).next();
        System.out.println("Custom = "+len(s));
        System.out.println("Built-in = "+s.length());
        new Scanner(System.in).close();
    }
}