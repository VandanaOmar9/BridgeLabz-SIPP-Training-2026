import java.util.Scanner;

public class BMI2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Weight: ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Height(m): ");
            personData[i][1] = sc.nextDouble();

            double bmi = personData[i][0] /
                    (personData[i][1] * personData[i][1]);

            personData[i][2] = bmi;

            if (bmi <= 18.4) status[i] = "Underweight";
            else if (bmi <= 24.9) status[i] = "Normal";
            else if (bmi <= 39.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.println(personData[i][0] + " "
                    + personData[i][1] + " "
                    + personData[i][2] + " "
                    + status[i]);
        }
        sc.close();
    }
}