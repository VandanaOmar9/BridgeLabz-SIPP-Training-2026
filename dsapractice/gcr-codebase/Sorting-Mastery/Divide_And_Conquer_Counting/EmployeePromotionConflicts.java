public class EmployeePromotionConflicts {
    // Condition: i < j and scores[i] < scores[j]
    public static int countConflicts(int[] arr, int l, int r) {
        int count = 0;
        if (l < r) {
            int m = l + (r - l) / 2;
            count += countConflicts(arr, l, m);
            count += countConflicts(arr, m + 1, r);
            count += mergeAndCount(arr, l, m, r);
        }
        return count;
    }

    private static int mergeAndCount(int[] arr, int l, int m, int r) {
        int[] temp = new int[r - l + 1];
        int i = l, j = m + 1, k = 0, conflicts = 0;

        while (i <= m && j <= r) {
            if (arr[i] < arr[j]) {
                conflicts += (r - j + 1); // arr[i] is smaller than all remaining elements in right sub-array
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= m) temp[k++] = arr[i++];
        while (j <= r) temp[k++] = arr[j++];
        System.arraycopy(temp, 0, arr, l, temp.length);
        return conflicts;
    }

    public static void main(String[] args) {
        int[] scores = {70, 95, 80, 100};
        System.out.println("Promotion Conflicts: " + countConflicts(scores, 0, scores.length - 1));
    }
}