import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start, int sum, List<Integer> path, List<List<Integer>> result) {
        if (sum == target) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (sum + candidates[i] > target) break;
            if (i > start && candidates[i] == candidates[i - 1]) continue; // Skip duplicate combinations

            path.add(candidates[i]);
            backtrack(candidates, target, i + 1, sum + candidates[i], path, result); // i + 1 for single-use
            path.remove(path.size() - 1);
        }
    }
}