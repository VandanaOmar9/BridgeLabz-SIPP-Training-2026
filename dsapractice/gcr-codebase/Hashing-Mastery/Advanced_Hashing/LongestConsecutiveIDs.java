import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveIDs {
    public int longestConsecutiveRun(int[] ids) {
        Set<Integer> idSet = new HashSet<>();
        for (int id : ids) idSet.add(id);

        int longest = 0;
        for (int id : idSet) {
            if (!idSet.contains(id - 1)) {
                int length = 1;
                int current = id;
                while (idSet.contains(current + 1)) {
                    current++;
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}