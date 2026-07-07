public class Solution306 {
    public boolean isAdditiveNumber(String num) {
        int n = num.length();
        for (int i = 1; i <= n / 2; ++i) {
            if (num.charAt(0) == '0' && i > 1) return false;
            for (int j = 1; Math.max(i, j) <= n - i - j; ++j) {
                if (num.charAt(i) == '0' && j > 1) break;
                if (isValid(i, j, num)) return true;
            }
        }
        return false;
    }
    private boolean isValid(int i, int j, String num) {
        String n1 = num.substring(0, i), n2 = num.substring(i, i + j);
        for (int k = i + j; k < num.length(); k += n2.length()) {
            n2 = add(n1, n1 = n2);
            if (!num.startsWith(n2, k)) return false;
        }
        return true;
    }
    private String add(String n1, String n2) {
        StringBuilder sb = new StringBuilder();
        int i = n1.length() - 1, j = n2.length() - 1, carry = 0;
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry + (i >= 0 ? n1.charAt(i--) - '0' : 0) + (j >= 0 ? n2.charAt(j--) - '0' : 0);
            sb.append(sum % 10);
            carry = sum / 10;
        }
        return sb.reverse().toString();
    }
}