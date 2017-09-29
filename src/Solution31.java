/**
 * 整数中1出现的次数
 *
 * @author 何宇寰
 */
public class Solution31 {
    public int NumberOf1Between1AndN_Solution(int n) {
        int res = 0;
        int p = 1;
        while (n / p != 0) {
            int before = n / (p * 10);
            int current = n / p % 10;
            int after = n % p;
            if (current == 0) {
                res += before * p;
            } else if (current == 1) {
                res += before * p + after + 1;
            } else {
                res += (before + 1) * p;
            }
            p *= 10;
        }
        return res;
    }
}