import java.util.Collections;
import java.util.List;
import java.util.Map;

public class CircularDependencyChecker {
    public boolean hasCircularDependency(Map<Integer, List<Integer>> tasks, int n) {
        int[] state = new int[n]; // 0 = UNVISITED, 1 = VISITING, 2 = VISITED
        for (int v = 0; v < n; v++) {
            if (state[v] == 0) {
                if (dfsCycleCheck(tasks, v, state)) return true;
            }
        }
        return false;
    }

    private boolean dfsCycleCheck(Map<Integer, List<Integer>> tasks, int node, int[] state) {
        state[node] = 1; // VISITING
        for (int dep : tasks.getOrDefault(node, Collections.emptyList())) {
            if (state[dep] == 1) return true;
            if (state[dep] == 0 && dfsCycleCheck(tasks, dep, state)) return true;
        }
        state[node] = 2; // VISITED
        return false;
    }
}