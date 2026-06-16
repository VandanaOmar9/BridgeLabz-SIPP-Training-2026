import java.util.*;

public class TrimSpaces {
    static String trim(String s) {
        int st = 0, en = s.length() - 1;

        while (st <= en && s.charAt(st) == ' ') st++;
        while (en >= st && s.charAt(en) == ' ') en--;

        String r = "";
        for (int i = st; i <= en; i++) r += s.charAt(i);

        return r;
    }

    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();

        String a = trim(s);
        String b = s.trim();

        System.out.println(a);
        System.out.println(a.equals(b));
        new Scanner(System.in).close();
    }
}