public class InsertionSortArray {
    public static int[] insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i], j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j]; j--;
            }
            nums[j + 1] = key;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] sorted = insertionSort(new int[]{12, 11, 13, 5, 6});
        for (int n : sorted) System.out.print(n + " ");
    }
}