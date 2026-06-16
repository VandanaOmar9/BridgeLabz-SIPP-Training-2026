import java.util.Scanner;

public class GreatestFactorFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int factor = 1;

        for(int i = num - 1; i >= 1; i--) {
            if(num % i == 0) {
                factor = i;
                break;
            }
        }

        System.out.println("Greatest Factor = " + factor);
        sc.close();
    }
}