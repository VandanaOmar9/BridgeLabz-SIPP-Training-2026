import java.util.*;
public class StudentVoteChecker{
    static boolean vote(int a){
        return a>=18;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<10;i++)
            System.out.println(vote(sc.nextInt()));

        sc.close();
    }
}