import java.util.ArrayDeque;
import java.util.Deque;

public class StockSpanner {
    private final Deque<int[]> decreasingPrices = new ArrayDeque<>();

    public int next(int price) {
        int span = 1;
        while (!decreasingPrices.isEmpty() && decreasingPrices.peek()[0] <= price) span += decreasingPrices.pop()[1];
        decreasingPrices.push(new int[] {price, span});
        return span;
    }
}
