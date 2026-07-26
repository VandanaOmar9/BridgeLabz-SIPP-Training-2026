import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(k, n, 1, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int k, int target, int start, int sum, List<Integer> path, List<List<Integer>> result) {
        if (path.size() == k) {
            if (sum == target) result.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i <= 9; i++) {
            if (sum + i > target) break;
            path.add(i);
            backtrack(k, target, i + 1, sum + i, path, result);
            path.remove(path.size() - 1);
        }
    }
}