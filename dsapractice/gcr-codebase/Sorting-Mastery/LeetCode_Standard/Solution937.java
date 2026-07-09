import java.util.Arrays;

public class Solution937 {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (log1, log2) -> {
            int idx1 = log1.indexOf(" ") + 1;
            int idx2 = log2.indexOf(" ") + 1;
            
            boolean isDigit1 = Character.isDigit(log1.charAt(idx1));
            boolean isDigit2 = Character.isDigit(log2.charAt(idx2));

            if (!isDigit1 && !isDigit2) {
                int cmp = log1.substring(idx1).compareTo(log2.substring(idx2));
                if (cmp != 0) return cmp;
                return log1.compareTo(log2); // Tie-breaker by full identifier string
            }
            return isDigit1 ? (isDigit2 ? 0 : 1) : -1;
        });
        return logs;
    }
}