package array;

/**
 * Created by fuxie on 2014/10/27  12:19.
 */
public class MaxPSubArray {
    public int maxProduct(int[] A) {
        if (A == null || A.length <= 0) {
            return 0;
        }

        if (A.length == 1) {
            return A[0];
        }

        int result;
        int[] min = new int[A.length];
        int[] max = new int[A.length];
        min[0] = max[0] = A[0];
        result = max[0];

        for (int i=1; i<A.length; i++) {
            min[i] = Math.min(A[i], Math.min(min[i-1]*A[i], max[i-1]*A[i]));
            max[i] = Math.max(A[i], Math.max(min[i-1]*A[i], max[i-1]*A[i]));
            result = Math.max(result, max[i]);
        }

        return result;
    }

}
