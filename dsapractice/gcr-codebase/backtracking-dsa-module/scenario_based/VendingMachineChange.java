import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VendingMachineChange {
    public List<List<Integer>> makeChange(int[] coins, int target) {
        Arrays.sort(coins);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(coins, target, 0, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] coins, int target, int start, int sum, List<Integer> path, List<List<Integer>> result) {
        if (sum == target) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < coins.length; i++) {
            if (sum + coins[i] > target) break; // Prune branch because array is sorted
            path.add(coins[i]);
            backtrack(coins, target, i, sum + coins[i], path, result); // i, not i+1 for reuse
            path.remove(path.size() - 1);
        }
    }
}