import java.util.*;

public class UniqueFrequency {
    public static void main(String[] args){
        String s=new Scanner(System.in).nextLine();

        for(int i=0;i<s.length();i++){
            boolean u=true;
            for(int j=0;j<i;j++)
                if(s.charAt(i)==s.charAt(j)) u=false;

            if(u){
                int c=0;
                for(int k=0;k<s.length();k++)
                    if(s.charAt(i)==s.charAt(k)) c++;

                System.out.println(s.charAt(i)+" = "+c);
            }
        }
        new Scanner(System.in).close();
    }
}