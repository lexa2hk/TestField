package Task3;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueChecker {
    public static boolean isUnique(HashMap<String,String> first) {
        HashSet<String> values = new HashSet<>();
        for(String key : first.keySet()) {
            if(values.contains(first.get(key))) {
                return false;
            }
            values.add(first.get(key));
        }
        return true;
    }
}
