public class FraudDetection {
    public int[] findPairSum(int[] transactions, int target) {
        int left = 0, right = transactions.length - 1;
        while (left < right) {
            int sum = transactions[left] + transactions[right];
            if (sum == target) return new int[]{transactions[left], transactions[right]};
            if (sum < target) left++; else right--;
        }
        return new int[]{-1, -1};
    }
}