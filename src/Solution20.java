import java.util.Stack;

/**
 * 包含min函数的栈
 *
 * @author 何宇寰
 */
public class Solution20 {
    private Stack<Integer> data = new Stack<>();
    private Stack<Integer> min = new Stack<>();

    public void push(int node) {
        data.push(node);
        if (min.isEmpty() || node <= min.peek()) {
            min.push(node);
        }
    }

    public void pop() {
        if (data.peek() <= min.peek()) {
            min.pop();
        }
        data.pop();
    }

    public int top() {
        return data.peek();
    }

    public int min() {
        return min.peek();
    }
}