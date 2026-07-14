import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Solution503 {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        Arrays.fill(answer, -1);
        Deque<Integer> unresolved = new ArrayDeque<>();
        for (int i = 0; i < 2 * n; i++) {
            int index = i % n;
            while (!unresolved.isEmpty() && nums[unresolved.peek()] < nums[index]) answer[unresolved.pop()] = nums[index];
            if (i < n) unresolved.push(index);
        }
        return answer;
    }
}
