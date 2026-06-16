import java.util.*;

public class SplitCompare {
    public static void main(String[] args){
        String s=new Scanner(System.in).nextLine();

        String[] a=s.split(" ");
        String[] b=s.split(" ");

        System.out.println(Arrays.equals(a,b));
        new Scanner(System.in).close();
    }
}