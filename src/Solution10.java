/**
 * 矩形覆盖
 *
 * @author 何宇寰
 */
public class Solution10 {
    public int RectCover(int target) {
        if (target <= 0) {
            return 0;
        }
        if (target == 1) {
            return 1;
        }
        int x = 1;
        int y = 1;
        for (int i = 2; i <= target; i++) {
            int temp = x + y;
            x = y;
            y = temp;
        }
        return y;
    }
}