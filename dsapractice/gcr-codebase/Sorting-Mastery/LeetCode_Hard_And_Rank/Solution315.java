public class Solution315 {
    public int[] countSmaller(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) indices[i] = i;
        mergeSort(nums, indices, res, 0, n - 1);
        return res;
    }

    private void mergeSort(int[] nums, Integer[] indices, int[] res, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        mergeSort(nums, indices, res, left, mid);
        mergeSort(nums, indices, res, mid + 1, right);
        merge(nums, indices, res, left, mid, right);
    }

    private void merge(int[] nums, Integer[] indices, int[] res, int left, int mid, int right) {
        Integer[] temp = new Integer[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            if (nums[indices[i]] <= nums[indices[j]]) {
                temp[k++] = indices[j++];
            } else {
                res[indices[i]] += right - j + 1;
                temp[k++] = indices[i++];
            }
        }
        while (i <= mid) temp[k++] = indices[i++];
        while (j <= right) temp[k++] = indices[j++];
        System.arraycopy(temp, 0, indices, left, temp.length);
    }
}