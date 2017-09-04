import java.util.ArrayList;

/**
 * 顺时针打印矩阵
 *
 * @author 何宇寰
 */
public class Solution19 {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return res;
        }
        int height = matrix.length;
        int width = matrix[0].length;
        int top = 0;
        int bottom = height - 1;
        int left = 0;
        int right = width - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            top++;
            if (top <= bottom) {
                for (int i = top; i <= bottom; i++) {
                    res.add(matrix[i][right]);
                }
            } else {
                break;
            }
            right--;
            if (left <= right) {
                for (int i = right; i >= left; i--) {
                    res.add(matrix[bottom][i]);
                }
            } else {
                break;
            }
            bottom--;
            if (top <= bottom) {
                for (int i = bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
            } else {
                break;
            }
            left++;
        }
        return res;
    }
}