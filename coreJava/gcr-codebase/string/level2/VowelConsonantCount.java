import java.util.*;

public class VowelConsonantCount {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        int v = 0, c = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) v++;
                else c++;
            }
        }

        System.out.println("Vowels = " + v);
        System.out.println("Consonants = " + c);
        new Scanner(System.in).close();
    }
}