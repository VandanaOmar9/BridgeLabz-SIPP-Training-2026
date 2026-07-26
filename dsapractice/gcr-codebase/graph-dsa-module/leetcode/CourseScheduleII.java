import java.util.ArrayList;
import java.util.List;

public class CourseScheduleII {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) adj.add(new ArrayList<>());
        for (int[] pre : prerequisites) {
            adj.get(pre[1]).add(pre[0]);
        }

        int[] state = new int[numCourses]; // 0 = UNVISITED, 1 = VISITING, 2 = VISITED
        List<Integer> order = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            if (state[i] == 0 && hasCycle(i, adj, state, order)) {
                return new int[0];
            }
        }

        int[] result = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            result[i] = order.get(numCourses - 1 - i); // Post-order reverse
        }
        return result;
    }

    private boolean hasCycle(int node, List<List<Integer>> adj, int[] state, List<Integer> order) {
        state[node] = 1;
        for (int neighbor : adj.get(node)) {
            if (state[neighbor] == 1) return true;
            if (state[neighbor] == 0 && hasCycle(neighbor, adj, state, order)) return true;
        }
        state[node] = 2;
        order.add(node); // Add on backtrack
        return false;
    }
}