import java.util.*;

public class CharacterType {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();

        System.out.println("Char\tType");

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            if (ch >= 'a' && ch <= 'z')
                System.out.println(s.charAt(i) + "\t" +
                        ("aeiou".indexOf(ch) != -1 ? "Vowel" : "Consonant"));
            else
                System.out.println(s.charAt(i) + "\tNot Letter");
        }
        new Scanner(System.in).close();
    }
}