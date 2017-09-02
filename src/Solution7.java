/**
 * 斐波那契数列
 *
 * @author 何宇寰
 */
public class Solution7 {
    public int Fibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return Fibonacci(n - 2) + Fibonacci(n - 1);
    }
}