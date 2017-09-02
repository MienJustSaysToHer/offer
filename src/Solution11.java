/**
 * 二进制中1的个数
 *
 * @author 何宇寰
 */
public class Solution11 {
    public int NumberOf1(int n) {
        int res = 0;
        while (n != 0) {
            n = n & (n - 1);
            res++;
        }
        return res;
    }
}