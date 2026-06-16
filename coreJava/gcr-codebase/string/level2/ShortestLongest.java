import java.util.*;

public class ShortestLongest {
    public static void main(String[] args){
        String[] w=new Scanner(System.in).nextLine().split(" ");

        String min=w[0],max=w[0];

        for(String s:w){
            if(s.length()<min.length()) min=s;
            if(s.length()>max.length()) max=s;
        }

        System.out.println("Shortest = "+min);
        System.out.println("Longest = "+max);
        new Scanner(System.in).close();
    }
}