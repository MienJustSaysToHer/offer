/**
 * 丑数
 *
 * @author 何宇寰
 */
public class Solution33 {
    public int GetUglyNumber_Solution(int index) {
        if (index < 7) {
            return index;
        }
        int t2 = 0;
        int t3 = 0;
        int t5 = 0;
        int[] arr = new int[index];
        arr[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = Math.min(arr[t2] * 2, Math.min(arr[t3] * 3, arr[t5] * 5));
            if (arr[i] == arr[t2] * 2) {
                t2++;
            }
            if (arr[i] == arr[t3] * 3) {
                t3++;
            }
            if (arr[i] == arr[t5] * 5) {
                t5++;
            }
        }
        return arr[index - 1];
    }
}