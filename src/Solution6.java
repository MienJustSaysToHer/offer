/**
 * 旋转数组的最小数字
 *
 * @author 何宇寰
 */
public class Solution6 {
    public int minNumberInRotateArray(int[] array) {
        return helper(array, 0, array.length - 1);
    }

    int helper(int[] array, int l, int h) {
        if (h - l == 1) {
            return array[h];
        }
        int m = l + (h - l) / 2;
        if (array[l] == array[m] && array[m] == array[h]) {
            return find(array, l, h);
        }
        if (array[m] > array[l] || array[m] > array[h]) {
            return helper(array, m, h);
        }
        return helper(array, l, m);
    }

    int find(int[] array, int l, int h) {
        for (int i = l; i < h; i++) {
            if (array[i] > array[i + 1]) {
                return array[i + 1];
            }
        }
        return array[l];
    }
}