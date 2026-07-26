import java.util.*;
public class SessionDuplicate {
    public boolean hasDuplicateToken(String[] tokens) {
        Set<String> seen = new HashSet<>();
        for (String t : tokens) if (!seen.add(t)) return true;
        return false;
    }
}