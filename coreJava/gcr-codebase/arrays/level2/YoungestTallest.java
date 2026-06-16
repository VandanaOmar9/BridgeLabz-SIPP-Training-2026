import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Age of " + names[i] + ": ");
            age[i] = sc.nextInt();

            System.out.print("Height of " + names[i] + ": ");
            height[i] = sc.nextDouble();
        }

        int young = 0, tall = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < age[young]) young = i;
            if (height[i] > height[tall]) tall = i;
        }

        System.out.println("Youngest: " + names[young]);
        System.out.println("Tallest: " + names[tall]);
        sc.close();
    }
}
