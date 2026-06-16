import java.util.*;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] ch = {"Rock", "Paper", "Scissors"};

        int n = sc.nextInt(), user = 0, comp = 0;

        for (int i = 0; i < n; i++) {
            int u = sc.nextInt(); // 0-Rock 1-Paper 2-Scissors
            int c = (int) (Math.random() * 3);

            if ((u == 0 && c == 2) ||
                (u == 1 && c == 0) ||
                (u == 2 && c == 1))
                user++;
            else if (u != c)
                comp++;

            System.out.println(ch[u] + " vs " + ch[c]);
        }

        System.out.println("\nUser Wins = " + user);
        System.out.println("Computer Wins = " + comp);

        System.out.printf("User %% = %.2f\n", user * 100.0 / n);
        System.out.printf("Computer %% = %.2f\n", comp * 100.0 / n);
        sc.close();
    }
}