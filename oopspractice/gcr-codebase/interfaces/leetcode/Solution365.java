public class Solution365 {
    public boolean canMeasureWater(int x, int y, int target) {
        if (x + y < target) return false;
        return target % gcd(x, y) == 0;
    }
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}