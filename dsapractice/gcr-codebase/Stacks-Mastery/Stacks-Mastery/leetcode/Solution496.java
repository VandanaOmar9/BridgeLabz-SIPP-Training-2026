import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class Solution496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nextGreater = new HashMap<>();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int value : nums2) {
            while (!stack.isEmpty() && stack.peek() < value) nextGreater.put(stack.pop(), value);
            stack.push(value);
        }
        int[] answer = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) answer[i] = nextGreater.getOrDefault(nums1[i], -1);
        return answer;
    }
}
