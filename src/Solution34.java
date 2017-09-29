import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;

public class Solution34 {
    public int FirstNotRepeatingChar(String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        char[] arr = str.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : arr) {
            map.put(c, map.get(c) == null ? 1 : map.get(c) + 1);
        }
        TreeSet<Integer> set = new TreeSet<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                set.add(str.indexOf(entry.getKey()));
            }
        }
        return set.first();
    }
}