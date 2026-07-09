public class BubbleSortSwapCount {
    public static int getSwapCount(int[] nums) {
        int count = 0, n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j]; nums[j] = nums[j + 1]; nums[j + 1] = temp;
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(getSwapCount(new int[]{4, 3, 2, 1}));
    }
}