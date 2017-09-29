import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 把数组排成最小的数
 *
 * @author 何宇寰
 */
public class Solution32 {
    public String PrintMinNumber(int[] numbers) {
        List<Integer> list = new ArrayList<>(numbers.length);
        for (int i : numbers) {
            list.add(i);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer str1, Integer str2) {
                String s1 = str1 + "" + str2;
                String s2 = str2 + "" + str1;
                return s1.compareTo(s2);
            }
        });
        StringBuilder res = new StringBuilder();
        for (Integer i : list) {
            res.append(i);
        }
        return res.toString();
    }
}