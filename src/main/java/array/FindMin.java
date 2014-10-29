package array;

/**
 * Created by fuxie on 2014/10/27  15:38.
 */
public class FindMin {
    public int findMin(int[] num) {
        return findMin(num, 0, num.length-1);
    }

    private int findMin(int[] num, int start, int end) {
        if (start > end)
            return 0;
        if (start == end) {
            return num[start];
        }

        if (end - start <= 1) {
            return Math.min(num[start], num[end]);
        }

        int mid = (start + end)/2;

        if (num[mid] > num[start]) {
            return findMin(num, mid+1, end);
        } else {
            return findMin(num, start, mid);
        }
    }
    public int findMin2(int[] num) {
        if (num.length <= 0) {
            return 0;
        }
        int min = num[0];
        for (int i=1; i<num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }

        return min;
    }
}
