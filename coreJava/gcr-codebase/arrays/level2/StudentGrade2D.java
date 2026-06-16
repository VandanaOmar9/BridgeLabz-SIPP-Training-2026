import java.util.Scanner;

public class StudentGrade2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[][] marks = new double[n][3];

        for (int i = 0; i < n; i++) {
            System.out.print("Physics: ");
            marks[i][0] = sc.nextDouble();

            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextDouble();

            System.out.print("Maths: ");
            marks[i][2] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            double per = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

            char grade;

            if (per >= 80) grade = 'A';
            else if (per >= 70) grade = 'B';
            else if (per >= 60) grade = 'C';
            else if (per >= 50) grade = 'D';
            else if (per >= 40) grade = 'E';
            else grade = 'R';

            System.out.println("Percentage = " + per +
                    " Grade = " + grade);
        }
        sc.close();
    }
}