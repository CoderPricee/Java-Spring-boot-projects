package assignment.dsa;

import java.util.Iterator;
import java.util.Comparator;

public class main {

	public static void main(String[]args) throws Exception {
//		LinkedList<String> list = new LinkedList<String>();
//		        
//		        // Insert elements
//		        list.insert("apple");
//		        list.insert("banana");
//		        list.insert("orange");
//		        list.insert("grape");
//		        list.insert("kiwi");
//		        
//		        // Insert at position
//		        list.insertAt(3, "pear");
//		        
//		        // Print out elements
//		        System.out.println("Elements in the list:");
//		        list.traverse();
//		        
//		        // Delete element
//		        list.delete("banana");
//		        
//		        // Delete at position
//		        list.deleteAt(4);
//		        
//		        // Print out elements
//		        System.out.println("Elements in the list after deletions:");
//		        list.traverse();
//		        
//		        // Print out size of list
//		        System.out.println("Size of the list: " + list.size());
//		        
//		        // Print out center element
//		        System.out.println("Center element: " + list.center());
//		        
//		        // Reverse the list
//		        list.reverse();
//		        System.out.println("Elements in the list after reversal:");
//		        list.traverse();
//		        
//		        // Sort the list
//		        list.sort();
//		        System.out.println("Elements in the list after sorting:");
//		        list.traverse();
//		        
//		        // Iterate over the list using an iterator
//		        System.out.println("Elements in the list using an iterator:");
//		        Iterator<String> iterator = list.iterator();
//		        while (iterator.hasNext()) {
//		            System.out.print(iterator.next() + " ");
//		        }
//		        System.out.println();
//		Stack<String> stack = new Stack<String>();
//
//        // Push some elements onto the stack
//        stack.push("apple");
//        stack.push("banana");
//        stack.push("cherry");
//        stack.push("date");
//        stack.push("elderberry");
//
//        // Print the elements of the stack
//        System.out.print("Stack: ");
//        stack.print();
//
//        // Pop an element from the stack
//        String poppedElement = stack.pop();
//        System.out.println("Popped element: " + poppedElement);
//
//        // Peek at the top element of the stack
//        String topElement = stack.peek();
//        System.out.println("Top element: " + topElement);
//
//        // Check if the stack contains a specific element
//        boolean containsElement = stack.contains("banana");
//        System.out.println("Contains 'banana'? " + containsElement);
//
//        // Get the size of the stack
//        int stackSize = stack.size();
//        System.out.println("Stack size: " + stackSize);
//
//        // Get the center element of the stack
//        String centerElement = stack.center();
//        System.out.println("Center element: " + centerElement);
//
//        // Sort the stack
//        stack.sort();
//        System.out.print("Sorted stack: ");
//        stack.print();
//
//        // Reverse the stack
//        stack.reverse();
//        System.out.print("Reversed stack: ");
//        stack.print();
//
//        // Use an iterator to traverse the stack
//        System.out.print("Stack using iterator: ");
//        for (String element : stack) {System.out.print(element + " ");
//        }
//        System.out.println();
		

        // create a new queue
//        Queue<Integer> queue = new Queue<>();
//
//        // add some elements to the queue
//        queue.enqueue(3);
//        queue.enqueue(1);
//        queue.enqueue(4);
//        queue.enqueue(1);
//        queue.enqueue(5);
//
//        // print the queue using the traverse() method
//        queue.traverse(); // prints "3 1 4 1 5"
//
//        // sort the queue using the sort() method
//        queue.sort();
//
//        // print the sorted queue
//        queue.traverse(); // prints "1 1 3 4 5"
//
//        // reverse the queue using the reverse() method
//        queue.reverse();
//
//        // print the reversed queue
//        queue.traverse(); // prints "5 4 3 1 1"
//
//        // print the size of the queue using the size() method
//        System.out.println("Size of queue: " + queue.size()); // prints "Size of queue: 5"
//
//        // check if the queue contains a specific element using the contains() method
//        System.out.println("Queue contains 4: " + queue.contains(4)); // prints "Queue contains 4: true"
//
//        // get the element at the center of the queue using the center() method
//        System.out.println("Element at center of queue: " + queue.center()); // prints "Element at center of queue: 3
//		
		// Create a priority queue of strings sorted in descending order
//        PriorityQueue<String> pq = new PriorityQueue<String>(new Comparator<String>() {
//            public int compare(String s1, String s2) {
//                return s2.compareTo(s1);
//            }
//        });
//        
//        // Enqueue some strings
//        pq.enqueue("cat");
//        pq.enqueue("dog");
//        pq.enqueue("bird");
//        pq.enqueue("elephant");
//        pq.enqueue("zebra");
//        
//        // Print the contents of the priority queue
//        pq.traverse();
//        
//        // Dequeue and print the strings
//        while (pq.size() > 0) {
//            System.out.println(pq.dequeue());
//        }
		
		// Create a new hash table with a capacity of 8
        HashTable<String, Integer> table = new HashTable<>(8);
        
        
        table.put("apple", 1);
        table.put("banana", 2);
        table.put("cherry", 3);
        table.put("date", 4);
        table.put("elderberry", 5);
        
        // Print the size of the hash table
        System.out.println("Size: " + table.size()); // Output: Size: 5
        
        // Check if the hash table contains a key
        System.out.println("Contains key 'banana': " + table.containsKey("banana")); // Output: Contains key 'banana': true
        
        // Get the value for a key
        System.out.println("Value for key 'date': " + table.get("date")); // Output: Value for key 'date': 4
        
        // Remove a key-value pair from the hash table
        table.remove("cherry");
        
        // Print the remaining keys and values in the hash table
        System.out.println("Keys and values:");
        table.traverse();
        /*
        Output:
        Keys and values:
        banana: 2
        date: 4
        elderberry: 5
        apple: 1
        */
        
        // Iterate over the keys in the hash table
        System.out.println("Keys:");
        for (String key : table.keys()) {
            System.out.println(key);
        }
        /*
        Output:
        banana
        date
        elderberry
        apple
        */
		

		    }

}
