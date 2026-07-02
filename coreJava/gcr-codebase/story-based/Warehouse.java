public class Warehouse {
    public static void main(String[] args) {
        int[] stock = {10, 20, 30, 20, 40};
        int max = stock[0], min = stock[0], sum = 0;

        for (int x : stock) {
            max = Math.max(max, x);
            min = Math.min(min, x);
            sum += x;
        }

        System.out.println("Max=" + max + " Min=" + min + " Total=" + sum);

        for (int i = 0; i < stock.length; i++)
            for (int j = i + 1; j < stock.length; j++)
                if (stock[i] == stock[j])
                    System.out.println("Duplicate=" + stock[i]);

        int k = 2;
        for (int i = stock.length - k; i < stock.length; i++)
            System.out.print(stock[i] + " ");
        for (int i = 0; i < stock.length - k; i++)
            System.out.print(stock[i] + " ");

        int[][] shelf = {{1, 2}, {3, 4}};
        System.out.println("\nTranspose:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(shelf[j][i] + " ");
            System.out.println();
        }
    }
}