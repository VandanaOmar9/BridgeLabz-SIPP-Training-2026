import java.util.*;

public class DeckCards {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String[] s={"H","D","C","S"};
        String[] r={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

        String[] deck=new String[52];
        int k=0;

        for(String suit:s)
            for(String rank:r)
                deck[k++]=rank+"-"+suit;

        for(int i=0;i<52;i++){
            int j=i+(int)(Math.random()*(52-i));
            String t=deck[i];
            deck[i]=deck[j];
            deck[j]=t;
        }

        int p=sc.nextInt(); // players
        int n=sc.nextInt(); // cards/player

        k=0;
        for(int i=1;i<=p;i++){
            System.out.println("Player "+i);
            for(int j=0;j<n;j++)
                System.out.print(deck[k++]+" ");
            System.out.println();
        }

        sc.close();
    }
}