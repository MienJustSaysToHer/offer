import java.util.ArrayList;
import java.util.TreeSet;

/**
 * 数组中出现次数超过一半的数字
 *
 * @author 何宇寰
 */
public class Solution29 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if (k <= 0 || k > input.length) {
            return res;
        }
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : input) {
            if (set.size() == k) {
                if (i < set.last()) {
                    set.pollLast();
                    set.add(i);
                }
            } else {
                set.add(i);
            }
        }
        res.addAll(set);
        return res;
    }
}