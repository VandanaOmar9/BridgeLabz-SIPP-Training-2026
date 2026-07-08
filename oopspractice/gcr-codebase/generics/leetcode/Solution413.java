public class Solution413 {
    public int numberOfArithmeticSlices(int[] nums) {
        int count = 0, current = 0;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                current++;
                count += current;
            } else {
                current = 0;
            }
        }
        return count;
    }
}