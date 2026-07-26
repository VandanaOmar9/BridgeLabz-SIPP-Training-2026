import java.util.ArrayList;
import java.util.List;

public class FeatureFlagCombinations {
    public List<List<String>> generateFlagCombinations(String[] flags) {
        List<List<String>> result = new ArrayList<>();
        backtrack(flags, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String[] flags, int index, List<String> current, List<List<String>> result) {
        if (index == flags.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Option 1: Flag is ON
        current.add(flags[index]);
        backtrack(flags, index + 1, current, result);
        current.remove(current.size() - 1); // un-choose

        // Option 2: Flag is OFF
        backtrack(flags, index + 1, current, result);
    }
}