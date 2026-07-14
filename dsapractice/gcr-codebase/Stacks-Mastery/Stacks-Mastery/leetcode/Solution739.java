import java.util.ArrayDeque;
import java.util.Deque;

public class Solution739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] daysToWait = new int[temperatures.length];
        Deque<Integer> unresolved = new ArrayDeque<>();
        for (int day = 0; day < temperatures.length; day++) {
            while (!unresolved.isEmpty() && temperatures[day] > temperatures[unresolved.peek()]) {
                int previousDay = unresolved.pop();
                daysToWait[previousDay] = day - previousDay;
            }
            unresolved.push(day);
        }
        return daysToWait;
    }
}
