import java.util.ArrayList;
import java.util.List;

public class PathInGraph {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination) return true;

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        boolean[] visited = new boolean[n];
        return dfs(source, destination, adj, visited);
    }

    private boolean dfs(int curr, int target, List<List<Integer>> adj, boolean[] visited) {
        if (curr == target) return true;
        visited[curr] = true;

        for (int neighbor : adj.get(curr)) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, target, adj, visited)) return true;
            }
        }
        return false;
    }
}