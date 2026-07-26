import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CircuitLoopDetector {
    public boolean hasWiringLoop(Map<Integer, List<Integer>> circuit, int n) {
        Set<Integer> visited = new HashSet<>();
        for (int v = 0; v < n; v++) {
            if (!visited.contains(v)) {
                if (dfsCycleCheck(circuit, v, -1, visited)) return true;
            }
        }
        return false;
    }

    private boolean dfsCycleCheck(Map<Integer, List<Integer>> circuit, int node, int parent, Set<Integer> visited) {
        visited.add(node);
        for (int neighbor : circuit.getOrDefault(node, Collections.emptyList())) {
            if (!visited.contains(neighbor)) {
                if (dfsCycleCheck(circuit, neighbor, node, visited)) return true;
            } else if (neighbor != parent) {
                return true;
            }
        }
        return false;
    }
}