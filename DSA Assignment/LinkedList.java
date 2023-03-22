package assignment.dsa;

import java.util.Iterator;

public class LinkedList<T> {
    
    private Node<T> head;
    private int size;
    
    public LinkedList() {
        head = null;
        size = 0;
    }
    
    public void insert(T data) {
        if (head == null) {
            head = new Node<T>(data);
        } else {
            Node<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new Node<T>(data));
        }
        size++;
    }
    
    public void insertAt(int index, T data) throws IndexOutOfBoundsException {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
        }
        if (index == 0) {
            Node<T> newNode = new Node<T>(data);
            newNode.setNext(head);
            head = newNode;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            Node<T> newNode = new Node<T>(data);
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
        size++;
    }
    
    public void delete(T data) {
        if (head == null) {
            return;
        }
        if (head.getData().equals(data)) {
            head = head.getNext();
            size--;
            return;
        }
        Node<T> current = head;
        while (current.getNext() != null) {
            if (current.getNext().getData().equals(data)) {
                current.setNext(current.getNext().getNext());
                size--;
                return;
            }
            current = current.getNext();
        }
    }
    
    public void deleteAt(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
        }
        if (index == 0) {
            head = head.getNext();
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
        }
        size--;
    }
    
    public T center() {
        if (head == null) {
            return null;
        }
        Node<T> slow = head;
        Node<T> fast = head;
        while (fast.getNext() != null && fast.getNext().getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return slow.getData();
    }
    
    public void sort() {
        if (head == null || head.getNext() == null) {
            return;
        }Node<T> current = head;
        while (current.getNext() != null) {
            Node<T> innerCurrent = current.getNext();
            while (innerCurrent != null) {
                if (((Comparable<T>) current.getData()).compareTo(innerCurrent.getData()) > 0) {
                    T temp = current.getData();
                    current.setData(innerCurrent.getData());
                    innerCurrent.setData(temp);
                }
                innerCurrent = innerCurrent.getNext();
            }
            current = current.getNext();
        }
    }
    
    public void reverse() {
        if (head == null || head.getNext() == null) {
            return;
        }
        Node<T> prev = null;
        Node<T> current = head;
        while (current != null) {
            Node<T> next = current.getNext();
            current.setNext(prev);
            prev = current;
           
            current = next;
        }
        head = prev;
    }
    
    public int size() {
        return size;
    }
    
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }
    
    public void traverse() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
    
    private class Node<T> {
        
        private T data;
        private Node<T> next;
        
        public Node(T data) {
            this.data = data;
            next = null;
        }
        
        public T getData() {
            return data;
        }
        
        public void setData(T data) {
            this.data = data;
        }
        
        public Node<T> getNext() {
            return next;
        }
        
        public void setNext(Node<T> next) {
            this.next = next;
        }
        
    }
    
    private class LinkedListIterator implements Iterator<T> {
        
        private Node<T> current;
        
        public LinkedListIterator() {
            current = head;
        }
        
        public boolean hasNext() {
            return current != null;
        }
        
        public T next() {
            T data = current.getData();
            current = current.getNext();
            return data;
        }
        
    }
    				
  }
    
