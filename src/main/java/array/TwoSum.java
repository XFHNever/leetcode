package array;

import java.util.HashMap;

/**
 * Created by fuxie on 2014/10/27  15:18.
 */
public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[numbers.length];
        int length = 0;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i=0; i<numbers.length; i++) {
            if (map.get(numbers[i]) != null) {
                result[length++] = map.get(numbers[i])+1;
                result[length++] = i+1;
            } else {
                map.put(target - numbers[i], i);
            }
        }

        return result;
    }
}
