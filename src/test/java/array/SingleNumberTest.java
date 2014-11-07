package array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by never on 2014/11/7.
 */
public class SingleNumberTest {
    @Test
    public void test() {
        SingleNumber singleNumber = new SingleNumber();
        int[] array = {1, 2, 3, 4, 5, 4, 5, 1, 2};
        assertEquals(3, singleNumber.singleNumber2(array));
    }
}
