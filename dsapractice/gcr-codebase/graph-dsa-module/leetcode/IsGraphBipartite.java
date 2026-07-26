public class IsGraphBipartite {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] colors = new int[n]; // 0 = uncolored, 1 & -1 = colors

        for (int i = 0; i < n; i++) {
            if (colors[i] == 0) {
                if (!validColoring(i, 1, graph, colors)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean validColoring(int node, int color, int[][] graph, int[] colors) {
        colors[node] = color;
        for (int neighbor : graph[node]) {
            if (colors[neighbor] == color) return false;
            if (colors[neighbor] == 0 && !validColoring(neighbor, -color, graph, colors)) {
                return false;
            }
        }
        return true;
    }
}