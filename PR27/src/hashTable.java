import java.util.HashMap;

public class hashTable {
    private final HashMap<Object, Object> hashMap;

    public hashTable() {
        hashMap = new HashMap<>();
    }

    public void HashTableInit(Object[] keys, Object[] values) {
        int size = values.length;
        if (size != keys.length) {
            throw new IllegalArgumentException("Incorrect input");
        }
        for (int i = 0; i < size; i++) {
            HashTabAdd(keys[i], values[i]);
        }
    }

    public void HashTabAdd(Object key, Object value) {
        hashMap.put(key, value);
    }

    public void HashTabRemove(Object key) {
        hashMap.remove(key);
    }

    public Object HashTabLookUp(Object key) {
        return hashMap.get(key);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
