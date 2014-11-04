package other;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by never on 2014/11/3.
 */
public class LRUCacheTest {
    @Test
    public void test() {
        LRUCache cache = new LRUCache(3);
        cache.set(1,2);
        cache.set(2,4);
        assertEquals(4, cache.get(2));
        cache.set(2,6);
        assertEquals(6, cache.get(2));
        cache.set(3,6);
        cache.set(4,8);
        assertEquals(8, cache.get(4));
        assertEquals(-1, cache.get(1));
    }
}
