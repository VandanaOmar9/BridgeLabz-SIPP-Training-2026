public class SortAnArray {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            siftDown(nums, i, n);
        }
        for (int end = n - 1; end > 0; end--) {
            int tmp = nums[0];
            nums[0] = nums[end];
            nums[end] = tmp;
            siftDown(nums, 0, end);
        }
        return nums;
    }

    private void siftDown(int[] arr, int i, int size) {
        int largest = i;
        int left = 2 * i + 1, right = 2 * i + 2;

        if (left < size && arr[left] > arr[largest]) largest = left;
        if (right < size && arr[right] > arr[largest]) largest = right;

        if (largest != i) {
            int tmp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = tmp;
            siftDown(arr, largest, size);
        }
    }
}