package other;

/**
 * Created by never on 2014/11/3.
 */
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache2 extends LinkedHashMap<Integer, Integer> {
    private int capacity;

    public LRUCache2(int capacity) {
        super(16, 0.75f, true);
        this.capacity = capacity;
    }
    //��д����get��Ϊnullʱ��Χ-1
    public Integer get(Object key) {
        Integer v = super.get(key);
        if (v != null)
            return v;
        else
            return -1;
    }
    //��д���෽������������������ʱ����ɾ�����ϵ�
    public boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }

    public void set(int key, int value) {
        super.put(key, value);
    }
}