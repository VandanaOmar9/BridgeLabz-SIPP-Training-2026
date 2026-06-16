import java.util.*;

public class FootballHeight {
    public static void main(String[] args) {
        int[] h = new int[11];
        int sum = 0, min = 250, max = 150;

        for(int i=0;i<11;i++){
            h[i] = (int)(Math.random()*101)+150;
            sum += h[i];
            min = Math.min(min,h[i]);
            max = Math.max(max,h[i]);
        }

        System.out.println("Mean = "+sum/11.0);
        System.out.println("Shortest = "+min);
        System.out.println("Tallest = "+max);
        
    }
}