public class ProductPricesSorter {
    public static void sortPrices(int[] prices) {
        int n = prices.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (prices[j] > prices[j + 1]) {
                    int temp = prices[j]; prices[j] = prices[j + 1]; prices[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] prices = {450, 120, 780, 300, 250, 600};
        sortPrices(prices);
        for (int p : prices) System.out.print(p + " ");
    }
}