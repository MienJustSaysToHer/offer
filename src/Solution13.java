/**
 * 调整数组顺序使奇数位于偶数前面
 *
 * @author 何宇寰
 */
public class Solution13 {
    public void reOrderArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if ((array[j] & 1) == 0 && (array[j + 1] & 1) == 1) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}