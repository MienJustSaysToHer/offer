import java.util.*;

public class Main {
/** 请完成下面这个函数，实现题目要求的功能 **/
    /**
     * 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^
     **/
    static int pick(int[] peaches) {
        int max = 0;
        int[] maxs = new int[peaches.length];
        for (int i = peaches.length - 1; i >= 0; i--) {
            int count = 0;
            for (int j = i + 1; j < peaches.length; j++) {
                if (peaches[j] >= peaches[i] && maxs[j] > count) {
                    count = maxs[j];
                }
            }
            count++;
            if (count > max) {
                max = count;
            }
            maxs[i] = count;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int trees = Integer.parseInt(in.nextLine().trim());
        int[] peaches = new int[trees];
        for (int i = 0; i < peaches.length; i++) {
            peaches[i] = Integer.parseInt(in.nextLine().trim());
        }
        System.out.println(pick(peaches));
    }
}