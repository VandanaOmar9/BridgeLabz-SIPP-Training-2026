import java.util.*;

public class FirstNonRepeating {
    public static void main(String[] args){
        String s=new Scanner(System.in).nextLine();
        int[] f=new int[256];

        for(int i=0;i<s.length();i++)
            f[s.charAt(i)]++;

        for(int i=0;i<s.length();i++)
            if(f[s.charAt(i)]==1){
                System.out.println(s.charAt(i));
                break;
            }
        new Scanner(System.in).close();
    }
}