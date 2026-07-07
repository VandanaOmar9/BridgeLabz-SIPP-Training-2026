public class Solution367 {
    public boolean isPerfectSquare(int num) {
        long i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        return num == 0;
    }
}