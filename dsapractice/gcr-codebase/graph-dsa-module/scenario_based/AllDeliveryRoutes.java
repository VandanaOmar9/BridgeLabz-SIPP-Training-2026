import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AllDeliveryRoutes {
    public List<List<Integer>> findAllRoutes(Map<Integer, List<Integer>> roads, int warehouse, int store) {
        List<List<Integer>> allRoutes = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        
        allRoutesDFS(roads, warehouse, store, path, visited, allRoutes);
        return allRoutes;
    }

    private void allRoutesDFS(Map<Integer, List<Integer>> roads, int current, int target,
                             List<Integer> path, Set<Integer> visited, List<List<Integer>> allRoutes) {
        path.add(current);
        visited.add(current);

        if (current == target) {
            allRoutes.add(new ArrayList<>(path));
        } else {
            for (int next : roads.getOrDefault(current, Collections.emptyList())) {
                if (!visited.contains(next)) {
                    allRoutesDFS(roads, next, target, path, visited, allRoutes);
                }
            }
        }

        path.remove(path.size() - 1); // backtrack
        visited.remove(current);     // backtrack
    }
}