public class Solution912 {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
    private void mergeSort(int[] arr, int l, int r) {
        if (l >= r) return;
        int m = l + (r - l) / 2;
        mergeSort(arr, l, m); mergeSort(arr, m + 1, r);
        merge(arr, l, m, r);
    }
    private void merge(int[] arr, int l, int m, int r) {
        int[] t = new int[r - l + 1];
        int i = l, j = m + 1, k = 0;
        while (i <= m && j <= r) t[k++] = (arr[i] <= arr[j]) ? arr[i++] : arr[j++];
        while (i <= m) t[k++] = arr[i++];
        while (j <= r) t[k++] = arr[j++];
        System.arraycopy(t, 0, arr, l, t.length);
    }
}