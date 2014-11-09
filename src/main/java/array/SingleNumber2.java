package array;

import java.util.HashMap;

/**
 * Created by never on 2014/11/7.
 */
public class SingleNumber2 {
    public int singleNumber(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0; i<A.length; i++) {
            if (map.get(A[i]) == null) {
                map.put(A[i], 1);
            } else if (map.get(A[i]) == 1) {
                map.remove(A[i]);
                map.put(A[i], 2);
            } else {
                map.remove(A[i]);
            }
        }

        return  map.keySet().iterator().next();
    }
    public int singleNumber2(int[] A) {
        int[] count = new int[32];
        int result=0;

        for (int i=0; i<32; i++) {
            for (int j=0; j<A.length; j++) {
                count[i] += ((A[j]>>i)&1);
                count[i]=count[i]%3; ;
            }
            result |= (count[i]<<i);
        }

        return  result;
    }
    public int singleNumber3(int[] A) {
        int once = 0;
        int twice = 0;


        for (int i = 0; i < A.length; i++) {
            twice |= once & A[i];
            once ^= A[i];
            int not_three = ~(once & twice);
            once = not_three & once;
            twice = not_three & twice;
        }
        return once;
    }
}
