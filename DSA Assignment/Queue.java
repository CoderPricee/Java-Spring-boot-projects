package assignment.dsa;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Queue<T extends Comparable<T>> implements Iterable<T> {
    private Node<T> first;  // beginning of queue
    private Node<T> last;   // end of queue
    private int size;       // number of elements on queue

    private static class Node<T> {
        private T item;
        private Node<T> next;
    }

    public Queue() {
        first = null;
        last = null;
        size = 0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return size;
    }

    public void enqueue(T item) {
        Node<T> oldLast = last;
        last = new Node<T>();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue underflow");
        }
        T item = first.item;
        first = first.next;
        size--;
        if (isEmpty()) {
            last = null;
        }
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue underflow");
        }
        return first.item;
    }

    public boolean contains(T item) {
        Node<T> current = first;
        while (current != null) {
            if (current.item.equals(item)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public T center() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue underflow");
        }
        int mid = size / 2;
        Node<T> current = first;
        for (int i = 0; i < mid; i++) {
            current = current.next;
        }
        return current.item;
    }

    public void sort() {
        Node<T> current = first;
        while (current != null) {
            Node<T> next = current.next;
            while (next != null) {
                if (current.item.compareTo(next.item) > 0) {
                    T temp = current.item;
                    current.item = next.item;
                    next.item = temp;
                }
                next = next.next;
            }
            current = current.next;
        }
    }

    public void reverse() {
        Node<T> prev = null;
        Node<T> current = first;
        while (current != null) {
            Node<T> next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        last = first;
        first = prev;
    }

    public Iterator<T> iterator() {
        return new ListIterator<T>(first);
    }
//made it private as an ineer class to accesss the node class to access private fields
    private class ListIterator<T> implements Iterator<T> {
        private Node<T> current;

        public ListIterator(Node<T> first) {
            current = first;
        }

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No next item");
            }
            T item = current.item;
            current = current.next;
            return item;
        }
    }

       public void traverse() {
        Node<T> current = first;
        while (current != null) {
            System.out.print(current.item + " ");
            current = current.next;
        }
        System.out.println();
    }
}