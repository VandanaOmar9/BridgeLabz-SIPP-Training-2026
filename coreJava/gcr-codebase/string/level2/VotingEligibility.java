import java.util.*;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Age\tCan Vote");

        for (int i = 0; i < 10; i++) {
            int age = sc.nextInt();
            System.out.println(age + "\t" + (age >= 18));
        }
        sc.close();
    }
}