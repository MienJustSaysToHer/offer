public class Solution35 {
    public int InversePairs(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int[] copyArray = new int[array.length];
        System.arraycopy(array, 0, copyArray, 0, array.length);
        return helper(array, copyArray, 0, array.length - 1);
    }

    static int helper(int[] array, int[] copyArray, int start, int end) {
        int count = 0;
        if (start >= end) {
            return 0;
        }
        int mid = (start + end) >> 1;
        count += helper(array, copyArray, start, mid) % 1000000007;
        count += helper(array, copyArray, mid + 1, end) % 1000000007;
        int i = mid;
        int j = end;
        int k = end;
        while (i >= start && j >= mid + 1) {
            if (array[i] > array[j]) {
                count += j - mid;
                if (count >= 1000000007) {
                    count %= 1000000007;
                }
                copyArray[k--] = array[i--];
            } else {
                copyArray[k--] = array[j--];
            }
        }
        for (; i >= start; ) {
            copyArray[k--] = array[i--];
        }
        for (; j >= mid + 1; ) {
            copyArray[k--] = array[j--];
        }
        for (i = start; i <= end; i++) {
            array[i] = copyArray[i];
        }
        return count;
    }
}