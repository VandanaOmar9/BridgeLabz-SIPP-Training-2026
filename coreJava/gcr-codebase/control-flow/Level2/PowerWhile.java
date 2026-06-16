import java.util.Scanner;

public class PowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int power = sc.nextInt();

        int result = 1;
        int count = 0;

        while(count < power) {
            result *= num;
            count++;
        }

        System.out.println(result);

        sc.close();
    }
}