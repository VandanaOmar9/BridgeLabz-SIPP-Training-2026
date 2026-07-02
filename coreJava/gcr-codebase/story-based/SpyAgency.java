import java.util.Arrays;

public class SpyAgency {
    public static void main(String[] args) {

        String msg = "madam";
        System.out.println("Reverse: " + new StringBuilder(msg).reverse());
        System.out.println("Palindrome: " + msg.equals(new StringBuilder(msg).reverse().toString()));

        int v = 0, c = 0;
        for (char ch : msg.toCharArray())
            if ("aeiouAEIOU".indexOf(ch) != -1) v++;
            else c++;
        System.out.println("Vowels=" + v + " Consonants=" + c);

        String a = "listen", b = "silent";
        char[] x = a.toCharArray(), y = b.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        System.out.println("Anagram: " + Arrays.equals(x, y));

        String log = "swiss";
        for (char ch : log.toCharArray())
            if (log.indexOf(ch) == log.lastIndexOf(ch)) {
                System.out.println("First Non-Repeating: " + ch);
                break;
            }
    }
}