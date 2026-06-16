import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double phy = sc.nextDouble();
        double chem = sc.nextDouble();
        double math = sc.nextDouble();

        double percentage = (phy + chem + math) / 3;

        if(percentage >= 80)
            System.out.println("Grade A");
        else if(percentage >= 70)
            System.out.println("Grade B");
        else if(percentage >= 60)
            System.out.println("Grade C");
        else if(percentage >= 50)
            System.out.println("Grade D");
        else if(percentage >= 40)
            System.out.println("Grade E");
        else
            System.out.println("Grade R");

        System.out.println("Percentage = " + percentage);

        sc.close();
    }
}