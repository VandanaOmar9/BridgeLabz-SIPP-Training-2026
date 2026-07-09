import java.util.Arrays;

public class MergeCustomerRecords {
    public static int[] mergeBranches(int[] branchA, int[] branchB) {
        int n = branchA.length, m = branchB.length;
        int[] result = new int[n + m];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            result[k++] = (branchA[i] <= branchB[j]) ? branchA[i++] : branchB[j++];
        }
        while (i < n) result[k++] = branchA[i++];
        while (j < m) result[k++] = branchB[j++];
        
        return result;
    }

    public static void main(String[] args) {
        int[] branchA = {1, 4, 8};
        int[] branchB = {2, 5, 7};
        System.out.println(Arrays.toString(mergeBranches(branchA, branchB)));
    }
}