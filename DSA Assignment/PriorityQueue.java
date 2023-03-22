package assignment.dsa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class PriorityQueue<T> implements Iterable<T> {
    private ArrayList<T> queue;//To store elements
    private Comparator<T> comparator;

    public PriorityQueue(Comparator<T> comparator) {
        this.queue = new ArrayList<T>();
        this.comparator = comparator;
    }

    public PriorityQueue() {
        this(null);
    }

    public void enqueue(T item) {
        queue.add(item);
        if (comparator != null) {
            queue.sort(comparator);
        } else {
            queue.sort(null);
        }
    }

    public T dequeue() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Cannot dequeue from an empty priority queue");
        }
        return queue.remove(0);
    }

    public T peek() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.get(0);
    }

    public boolean contains(T item) {
        return queue.contains(item);
    }

    public int size() {
        return queue.size();
    }

    public T center() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.get(queue.size() / 2);
    }

    public void reverse() {
        int i = 0;
        int j = queue.size() - 1;
        while (i < j) {
            T temp = queue.get(i);
            queue.set(i, queue.get(j));
            queue.set(j, temp);
            i++;
            j--;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return queue.iterator();
    }

    public void traverse() {
        for (T item : queue) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}