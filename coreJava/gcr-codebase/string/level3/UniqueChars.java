import java.util.*;

public class UniqueChars {
    public static void main(String[] args){
        String s=new Scanner(System.in).nextLine();

        for(int i=0;i<s.length();i++){
            boolean u=true;
            for(int j=0;j<i;j++)
                if(s.charAt(i)==s.charAt(j)) u=false;

            if(u) System.out.print(s.charAt(i)+" ");
        }
        new Scanner(System.in).close();
    }
}