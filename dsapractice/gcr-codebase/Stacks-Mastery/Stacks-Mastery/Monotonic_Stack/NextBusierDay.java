import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NextBusierDay {
    public int[] nextBusierDay(int[] visitors) {
        int[] answer = new int[visitors.length];
        Arrays.fill(answer, -1);
        Deque<Integer> pendingDays = new ArrayDeque<>();
        for (int day = 0; day < visitors.length; day++) {
            while (!pendingDays.isEmpty() && visitors[day] > visitors[pendingDays.peek()]) {
                answer[pendingDays.pop()] = visitors[day];
            }
            pendingDays.push(day);
        }
        return answer;
    }
}
