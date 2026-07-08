import java.util.*;

public class Solution386 {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();
        int curr = 1;
        for (int i = 0; i < n; i++) {
            res.add(curr);
            if (curr * 10 <= n) curr *= 10;
            else {
                while (curr % 10 == 9 || curr >= n) curr /= 10;
                curr++;
            }
        }
        return res;
    }
}