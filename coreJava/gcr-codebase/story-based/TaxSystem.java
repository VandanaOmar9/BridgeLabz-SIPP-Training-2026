public class TaxSystem {
    public static void main(String[] args) {

        double[] income = {8000, 12000, 25000, 60000, 45000,
                           9000, 70000, 30000, 15000, 55000};

        double totalTax = 0;

        for (double i : income) {
            double tax;

            if (i < 10000)
                tax = i * 0.05;
            else if (i <= 50000)
                tax = i * 0.15;
            else
                tax = i * 0.30;

            System.out.println("Income: " + i + " Tax: " + tax);
            totalTax += tax;
        }

        System.out.println("Total Tax = " + totalTax);
    }
}