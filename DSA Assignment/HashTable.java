package assignment.dsa;

import java.util.LinkedList;

public class HashTable<K, V> {

    private static final int DEFAULT_CAPACITY = 16;

    private LinkedList<Entry<K, V>>[] table;
    private int size;

    public HashTable() {
        this(DEFAULT_CAPACITY);
    }

    public HashTable(int capacity) {
        table = new LinkedList[capacity];
        size = 0;
    }
//insert a key-value-pair 
    public void put(K key, V value) {
        int index = hash(key);
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }
        for (Entry<K, V> entry : table[index]) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }
        table[index].add(new Entry<>(key, value));
        size++;
    }

    public void remove(K key) {
        int index = hash(key);
        if (table[index] == null) {
            return;
        }
        for (Entry<K, V> entry : table[index]) {
            if (entry.getKey().equals(key)) {
                table[index].remove(entry);
                size--;
                return;
            }
        }
    }

    public boolean containsKey(K key) {
        int index = hash(key);
        if (table[index] == null) {
            return false;
        }
        for (Entry<K, V> entry : table[index]) {
            if (entry.getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    public V get(K key) {
        int index = hash(key);
        if (table[index] == null) {
            return null;
        }
        for (Entry<K, V> entry : table[index]) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public int size() {
        return size;
    }

    public Iterable<K> keys() {
        LinkedList<K> keys = new LinkedList<>();
        for (LinkedList<Entry<K, V>> bucket : table) {
            if (bucket == null) {
                continue;
            }
            for (Entry<K, V> entry : bucket) {
                keys.add(entry.getKey());
            }
        }
        return keys;
    }
    
    public void traverse() {
        for (LinkedList<Entry<K, V>> bucket : table) {
            if (bucket == null) {
                continue;
            }
            for (Entry<K, V> entry : bucket) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
//cal hashcode 
    private int hash(K key) {
        return Math.abs(key.hashCode() % table.length);
    }

    private static class Entry<K, V> {

        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}
