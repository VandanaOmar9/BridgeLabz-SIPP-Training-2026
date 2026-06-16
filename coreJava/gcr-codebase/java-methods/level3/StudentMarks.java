import java.util.*;

public class StudentMarks{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            int p=(int)(Math.random()*90)+10;
            int c=(int)(Math.random()*90)+10;
            int m=(int)(Math.random()*90)+10;

            int total=p+c+m;
            double avg=total/3.0;
            double per=total/300.0*100;

            System.out.println(p+"\t"+c+"\t"+m+"\t"+total+"\t"+avg+"\t"+Math.round(per*100)/100.0);
        }

        sc.close();
    }
}