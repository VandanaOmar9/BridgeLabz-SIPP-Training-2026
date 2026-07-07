// Mocking the parent class API provided by LeetCode
class VersionControl {
    boolean isBadVersion(int version) { return true; } 
}

public class Solution278 extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) end = mid;
            else start = mid + 1;
        }
        return start;
    }
}