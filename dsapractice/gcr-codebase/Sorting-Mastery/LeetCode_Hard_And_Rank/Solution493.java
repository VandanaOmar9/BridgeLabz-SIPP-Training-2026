public class Solution493 {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    private int mergeSort(int[] arr, int l, int r) {
        if (l >= r) return 0;
        int m = l + (r - l) / 2;
        int count = mergeSort(arr, l, m) + mergeSort(arr, m + 1, r);
        
        // Count reverse conditions: arr[i] > 2 * arr[j] before the destructive sort process execution
        int j = m + 1;
        for (int i = l; i <= m; i++) {
            while (j <= r && arr[i] > 2.0 * arr[j]) {
                j++;
            }
            count += (j - (m + 1));
        }
        
        merge(arr, l, m, r);
        return count;
    }

    private void merge(int[] arr, int l, int m, int r) {
        int[] temp = new int[r - l + 1];
        int i = l, j = m + 1, k = 0;
        while (i <= m && j <= r) {
            temp[k++] = (arr[i] <= arr[j]) ? arr[i++] : arr[j++];
        }
        while (i <= m) temp[k++] = arr[i++];
        while (j <= r) temp[k++] = arr[j++];
        System.arraycopy(temp, 0, arr, l, temp.length);
    }
}