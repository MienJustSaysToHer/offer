/**
 * 变态跳台阶
 *
 * @author 何宇寰
 */
public class Solution9 {
    public int JumpFloorII(int target) {
        if (target < 0) {
            return 0;
        }
        if (target == 0 || target == 1) {
            return 1;
        }
        int y = 1;
        for (int i = 2; i <= target; i++) {
            y *= 2;
        }
        return y;
    }
}