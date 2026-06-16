import java.util.*;
public class Friends{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String[] n={"Amar","Akbar","Anthony"};
        int[] age=new int[3];
        double[] h=new double[3];

        for(int i=0;i<3;i++){
            age[i]=sc.nextInt();
            h[i]=sc.nextDouble();
        }

        int y=0,t=0;

        for(int i=1;i<3;i++){
            if(age[i]<age[y]) y=i;
            if(h[i]>h[t]) t=i;
        }

        System.out.println("Youngest="+n[y]);
        System.out.println("Tallest="+n[t]);

        sc.close();
    }
}