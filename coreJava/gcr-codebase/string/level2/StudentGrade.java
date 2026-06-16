import java.util.*;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        System.out.println("P\tC\tM\tTotal\t%\tGrade");

        for (int i = 1; i <= n; i++) {
            int p = (int)(Math.random() * 90) + 10;
            int c = (int)(Math.random() * 90) + 10;
            int m = (int)(Math.random() * 90) + 10;

            int total = p + c + m;
            double per = Math.round((total / 3.0) * 100) / 100.0;

            char g;
            if (per >= 80) g = 'A';
            else if (per >= 70) g = 'B';
            else if (per >= 60) g = 'C';
            else if (per >= 50) g = 'D';
            else if (per >= 40) g = 'E';
            else g = 'R';

            System.out.println(p + "\t" + c + "\t" + m + "\t" +
                    total + "\t" + per + "\t" + g);
        }

        sc.close();
    }
}