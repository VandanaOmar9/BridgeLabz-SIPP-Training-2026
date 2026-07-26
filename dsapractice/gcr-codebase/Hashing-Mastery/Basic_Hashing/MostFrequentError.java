import java.util.HashMap;
import java.util.Map;

public class MostFrequentError {
    public int mostFrequentErrorCode(int[] codes) {
        Map<Integer, Integer> freq = new HashMap<>();
        int bestCode = codes[0], bestCount = 0;
        for (int code : codes) {
            int count = freq.merge(code, 1, Integer::sum);
            if (count > bestCount) {
                bestCount = count;
                bestCode = code;
            }
        }
        return bestCode;
    }
}