import java.util.*;

public class WordLength2D {
    public static void main(String[] args){
        String[] w=new Scanner(System.in).nextLine().split(" ");

        String[][] arr=new String[w.length][2];

        for(int i=0;i<w.length;i++){
            arr[i][0]=w[i];
            arr[i][1]=String.valueOf(w[i].length());
        }

        System.out.println("Word\tLength");
        for(String[] x:arr)
            System.out.println(x[0]+"\t"+Integer.parseInt(x[1]));
        new Scanner(System.in).close();
    }
}