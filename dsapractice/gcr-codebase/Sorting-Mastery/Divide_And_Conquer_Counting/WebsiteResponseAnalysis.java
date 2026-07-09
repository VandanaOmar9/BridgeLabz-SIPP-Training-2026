public class WebsiteResponseAnalysis {
    // Classic Inversion Count: i < j and time[i] > time[j]
    public static int countViolations(int[] arr, int l, int r) {
        int count = 0;
        if (l < r) {
            int m = l + (r - l) / 2;
            count += countViolations(arr, l, m);
            count += countViolations(arr, m + 1, r);
            count += mergeAndCount(arr, l, m, r);
        }
        return count;
    }

    private static int mergeAndCount(int[] arr, int l, int m, int r) {
        int[] temp = new int[r - l + 1];
        int i = l, j = m + 1, k = 0, inversions = 0;

        while (i <= m && j <= r) {
            if (arr[i] > arr[j]) {
                inversions += (m - i + 1); // arr[i] and all subsequent left-sub-elements violate order
                temp[k++] = arr[j++];
            } else {
                temp[k++] = arr[i++];
            }
        }
        while (i <= m) temp[k++] = arr[i++];
        while (j <= r) temp[k++] = arr[j++];
        System.arraycopy(temp, 0, arr, l, temp.length);
        return inversions;
    }

    public static void main(String[] args) {
        int[] responseTimes = {300, 250, 270, 100};
        System.out.println("Performance Violations: " + countViolations(responseTimes, 0, responseTimes.length - 1));
    }
}