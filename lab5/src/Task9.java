import java.util.ArrayList;
import java.util.List;

public class Task9 {
}

abstract class HashFunction<K> {
    protected int size;

    public HashFunction(int size) {
        this.size = size;
    }

    public abstract int hash(K key);
}

interface Contains<K> {
    boolean contains(K value);
    K getKey();
}

class HashTable<K, T extends Contains<K>> {
    private List<T>[] table;
    private HashFunction<K> hashFunction;

    public HashTable(int size, HashFunction<K> hashFunction) {
        this.table = new List[size];
        for (int i = 0; i < size; i++) {
            this.table[i] = new ArrayList<>();
        }
        this.hashFunction = hashFunction;
    }

    public void insert(T item) {
        int index = hashFunction.hash(item.getKey());
        table[index].add(item);
    }

    public boolean search(K key) {
        int index = hashFunction.hash(key);
        for (T item : table[index]) {
            if (item.contains(key)) {
                return true;
            }
        }
        return false;
    }
}
