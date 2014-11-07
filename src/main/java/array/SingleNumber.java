package array;

import java.util.HashMap;

/**
 * Created by never on 2014/11/7.
 */
public class SingleNumber {
    public int singleNumber(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0; i<A.length; i++) {
            if (map.get(A[i]) == null) {
                map.put(A[i], 0);
            } else {
                map.remove(A[i]);
            }
        }

        return  map.keySet().iterator().next();
    }

    public int singleNumber2(int[] A) {
        int result =0;
        for (int i=0; i<A.length; i++) {
             result = result ^ A[i];
        }

        return  result;
    }
}
