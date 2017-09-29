/**
 * 连续子数组的最大和
 *
 * @author 何宇寰
 */
public class Solution30 {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = Integer.MIN_VALUE + 5000;
        int temp = Integer.MIN_VALUE + 5000;
        for (int i : array) {
            temp = i > (i + temp) ? i : i + temp;
            max = Math.max(max, temp);
        }
        return max;
    }
}