package other;

/**
 * Created by never on 2014/11/3.
 */
public class LRUCache {
    private int max_size;
    private int index;
    private Entry[] entries;

    public LRUCache(int capacity) {
        this.max_size = capacity;
        index = -1;
        entries = new Entry[this.max_size];
    }

    public int get(int key) {
        for (int i=0; i<=index; i++) {
            if (entries[i].key == key) {
                return entries[i].value;
            }
        }
        return -1;
    }

    public void set(int key, int value) {
        int tem = -1;
        for (int i=0; i<=index; i++) {
            if (entries[i].key == key) {
                tem = i;
                break;
            }
        }

        if (tem != -1) {
            entries[tem].value = value;
            entries[tem].time = 0;
        } else {
            Entry entry = new Entry(key, value, 0);
            if (index >= max_size-1) {
                tem = 0;
                for (int i=0; i<=index; i++) {
                    if (entries[i].time > entries[tem].time) {
                        tem = i;
                    }
                }

                entries[tem] = entry;
            } else {
                entries[++index] = entry;
            }
        }

        for (int i=0; i<=index; i++) {
            entries[i].time++;
        }



    }

    class Entry {
        int key;
        int value;
        int time;

        Entry(int key, int value, int time) {
            this.key = key;
            this.value = value;
            this.time = time;
        }
    }
}
