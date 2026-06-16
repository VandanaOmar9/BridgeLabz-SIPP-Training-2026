import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Is the first number the smallest? " + (a < b && a < c));
        System.out.println("Is the second number the smallest? " + (b < a && b < c));
        System.out.println("Is the third number the smallest? " + (c < a && c < b));
        sc.close();
    }
}