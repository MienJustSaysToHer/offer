import java.util.ArrayList;
import java.util.TreeSet;

/**
 * 字符串的排列
 *
 * @author 何宇寰
 */
public class Solution27 {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        if (str == null || str.length() == 0) {
            return res;
        }
        TreeSet<String> set = new TreeSet<>();
        helper(set, str.toCharArray(), 0);
        res.addAll(set);
        return res;
    }

    void helper(TreeSet<String> set, char[] array, int k) {
        if (k == array.length) {
            set.add(new String(array));
            return;
        }
        for (int i = k; i < array.length; i++) {
            swap(array, k, i);
            helper(set, array, k + 1);
            swap(array, k, i);
        }
    }

    private void swap(char[] array, int k, int i) {
        if (array[k] != array[i]) {
            char temp = array[k];
            array[k] = array[i];
            array[i] = temp;
        }
    }
}