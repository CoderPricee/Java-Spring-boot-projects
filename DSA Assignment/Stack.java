package assignment.dsa;

import java.util.Iterator;

public class Stack<T extends Comparable<T>> implements Iterable<T> {
    private class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node top;
    private int size;

    public void push(T data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public T pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public T peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return top.data;
    }

    public boolean contains(T data) {
        Node currentNode = top;
        while (currentNode != null) {
            if (currentNode.data.equals(data)) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public T center() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        int centerIndex = (size - 1) / 2;
        Node currentNode = top;
        for (int i = 0; i < centerIndex; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }
//quicksort
    public void sort() {
        if (size <= 1) {
            return;
        }
        Stack<T> left = new Stack<T>();
        Stack<T> right = new Stack<T>();
        T pivot = top.data;
        Node currentNode = top.next;
        while (currentNode != null) {
            if (currentNode.data.compareTo(pivot) < 0) {
                left.push(currentNode.data);
            } else {
                right.push(currentNode.data);
            }
            currentNode = currentNode.next;
        }
        right.sort();
        left.sort();
        while (!left.isEmpty()) {
            try {
				right.push(left.pop());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.err.println("Error while sorting stack");
			}
        }
        right.push(pivot);
        top = right.top;
    }

    public void reverse() {
        if (size <= 1) {
            return;
        }
        Node currentNode = top.next;
        top.next = null;
        while (currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.next = top;
            top = currentNode;
            currentNode = nextNode;
        }
    }

    public void print() {
        Node currentNode = top;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public Iterator<T> iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<T> {
        private Node currentNode = top;

        public boolean hasNext() {
            return currentNode != null;
        }

        public T next() {
            T data = currentNode.data;
            currentNode = currentNode.next;
            return data;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
    
}