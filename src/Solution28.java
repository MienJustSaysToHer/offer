/**
 * 数组中出现次数超过一半的数字
 *
 * @author 何宇寰
 */
public class Solution28 {
    public int MoreThanHalfNum_Solution(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int res = 0;
        int count = 0;
        for (int anArray : array) {
            if (count == 0) {
                res = anArray;
                count++;
            } else {
                if (anArray == res) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        count = 0;
        for (int anArray : array) {
            if (anArray == res) {
                count++;
            }
        }
        return count * 2 > array.length ? res : 0;
    }
}