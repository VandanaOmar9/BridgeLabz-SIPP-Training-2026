import java.util.*;

public class AttendanceRanking {
    public static int[] topKEmployees(int[] employeeIds, int[] attendance, int k) {
        int n = employeeIds.length;
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) idx[i] = i;

        Arrays.sort(idx, (a, b) -> {
            if (attendance[a] != attendance[b]) return Integer.compare(attendance[b], attendance[a]);
            return Integer.compare(employeeIds[a], employeeIds[b]);
        });

        int[] res = new int[k];
        for (int i = 0; i < k; i++) res[i] = employeeIds[idx[i]];
        return res;
    }

    public static void main(String[] args) {
        int[] ids = {101, 102, 103, 104, 105}, att = {92, 85, 98, 92, 80};
        System.out.println(Arrays.toString(topKEmployees(ids, att, 3)));
    }
}