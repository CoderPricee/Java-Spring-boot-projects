package assignment.dsa;
import java.util.Scanner;
import java.util.Comparator;

public class main {
    
    public static void main(String[] args) {
//        
//        Scanner scanner = new Scanner(System.in);
//        LinkedList<Integer> list = new LinkedList<Integer>();
//        
//        int choice, data, position;
//        boolean loop = true;
//        
//        while (loop) {
//            
//            System.out.println("1. Insert at end");
//            System.out.println("2. Insert at position");
//            System.out.println("3. Delete at position");
//            System.out.println("4. Find center element");
//            System.out.println("5. Sort the elements");
//            System.out.println("6. Reverse the elements");
//            System.out.println("7. Print the elements");
//            System.out.println("8. Exit");
//            
//            System.out.println("Enter your choice:");
//            choice = scanner.nextInt();
//            
//            switch (choice) {
//                
//                case 1:
//                    System.out.println("Enter data:");
//                    data = scanner.nextInt();
//                    list.insert(data);
//                    list.traverse();
//                    break;
//                
//                case 2:
//                    System.out.println("Enter position:");
//                    position = scanner.nextInt();
//                    System.out.println("Enter data:");
//                    data = scanner.nextInt();
//                    list.insertAt(position, data);
//                    list.traverse();
//                    break;
//             
//                
//                case 3:
//                    System.out.println("Enter position:");
//                    position = scanner.nextInt();
//                    list.deleteAt(position);
//                    list.traverse();
//                    break;
//                    
//                case 4:
//                    System.out.println("Center element: " + list.center());
//                    break;
//                    
//                case 5:
//                    list.sort();
//                    list.traverse();
//                    break;
//                    
//                case 6:
//                    list.reverse();
//                    list.traverse();
//                    break;
//                    
//                case 7:
//                    System.out.println("Elements:");
//                    list.traverse();
//                    break;
//                    
//                case 8:
//                    loop = false;
//                    break;
//                    
//                default:
//                    System.out.println("Invalid choice!");
//                    break;
//            }
//            
//        }
//        
//        scanner.close();
//  --------------------------------------------------------------------------------------------------------------------  	
//   	 Stack<Integer> stack = new Stack<Integer>();
//         Scanner scanner = new Scanner(System.in);
//         while (true) {
//             System.out.println("Enter a command: push, pop, peek, contains, size, center, sort, reverse, print, or quit");
//             String command = scanner.next();
//             try {
//                 if (command.equals("push")) {
//                     System.out.println("Enter an integer to push onto the stack:");
//                     int data = scanner.nextInt();
//                     stack.push(data);
//                     System.out.println("Pushed " + data + " onto the stack");
//                     stack.print();
//                 } else if (command.equals("pop")) {
//                     int data = stack.pop();
//                     System.out.println("Popped " + data + " from the stack");
//                     stack.print();
//                 } else if (command.equals("peek")) {
//                     int data = stack.peek();
//                     System.out.println("The top of the stack contains " + data);
//                     stack.print();
//                 } else if (command.equals("contains")) {
//                     System.out.println("Enter an integer to check if it's in the stack:");
//                     int data = scanner.nextInt();
//                     boolean contains = stack.contains(data);
//                     if (contains) {
//                         System.out.println(data + " is in the stack");
//                         stack.print();
//                     } else {
//                         System.out.println(data + " is not in the stack");
//                         stack.print();
//                     }
//                 } else if (command.equals("size")) {
//                     int size = stack.size();
//                     System.out.println("The stack has " + size + " elements");
//                     stack.print();
//                 } else if (command.equals("center")) {
//                     int center = stack.center();
//                     System.out.println("The center of the stack is " + center);
//                 } else if (command.equals("sort")) {
//                     stack.sort();
//                     stack.print();
//                     System.out.println("Sorted the stack");
//                 } else if (command.equals("reverse")) {
//                     stack.reverse();
//                     System.out.println("Reversed the stack");
//                     stack.print();
//                 } else if (command.equals("print")) {
//                     stack.print();
//                 } else if (command.equals("quit")) {
//                     break;
//                 } else {
//                     System.out.println("Invalid command");
//                 }
//             } catch (Exception e) {
//                 System.out.println(e.getMessage());
//             }
//         }
//         scanner.close();
//   ------------------------------------------------------------------------------------------------------------------------
    	
//   
//    	        Queue<Integer> queue = new Queue<>();
//    	        Scanner scanner = new Scanner(System.in);
//
//    	        while (true) {
//    	            System.out.println("Choose an operation:");
//    	            System.out.println("1. Enqueue");
//    	            System.out.println("2. Dequeue");
//    	            System.out.println("3. Peek");
//    	            System.out.println("4. Sort");
//    	            System.out.println("5. Reverse");
//    	            System.out.println("6. Traverse");
//    	            System.out.println("7. Quit");
//
//    	            int choice = scanner.nextInt();
//
//    	            switch (choice) {
//    	                case 1:
//    	                    System.out.println("Enter value to enqueue:");
//    	                    int value = scanner.nextInt();
//    	                    queue.enqueue(value);
//    	                    System.out.println(value + " enqueued.");
//    	                    queue.traverse();
//    	                    break;
//    	                case 2:
//    	                    try {
//    	                        int dequeued = queue.dequeue();
//    	                        queue.traverse();
//    	                        System.out.println(dequeued + " dequeued.");
//    	                    } catch (Exception e) {
//    	                        System.out.println(e.getMessage());
//    	                    }
//    	                    break;
//    	                case 3:
//    	                    try {
//    	                        int peeked = queue.peek();
//    	                        queue.traverse();
//    	                        System.out.println("Peeked: " + peeked);
//    	                    } catch (Exception e) {
//    	                        System.out.println(e.getMessage());
//    	                    }
//    	                    break;
//    	                case 4:
//    	                    queue.sort();
//    	                    System.out.println("Sorted.");
//    	                    queue.traverse();
//    	                    break;
//    	                case 5:
//    	                    queue.reverse();
//    	                    System.out.println("Reversed.");
//    	                    queue.traverse();
//    	                    break;
//    	                case 6:
//    	                    queue.traverse();
//    	                    break;
//    	                case 7:
//    	                    System.exit(0);
//    	                default:
//    	                    System.out.println("Invalid choice.");
//    	            }
//    	        }
//    	    ---------------------------------------------------------------------------------------------------
//    	
//    	PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
//    	Scanner scanner = new Scanner(System.in);
//
//        boolean quit = false;
//        while (!quit) {
//            System.out.println("Enter 1 to add element");
//            System.out.println("Enter 2 to remove element");
//            System.out.println("Enter 3 to view the front element");
//            System.out.println("Enter 4 to check if an element is present");
//            System.out.println("Enter 5 to view the number of elements");
//            System.out.println("Enter 6 to reverse the queue");
//            System.out.println("Enter 7 to view the queue");
//            System.out.println("Enter 8 to quit");
//
//            int choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1:
//                    System.out.println("Enter element to add: ");
//                    int element = scanner.nextInt();
//                    priorityQueue.enqueue(element);
//                    System.out.println("Element " + element + " added");
//                    priorityQueue.traverse();
//                    break;
//                case 2:
//                    if (priorityQueue.size() == 0) {
//                        System.out.println("Queue is empty");
//                    } else {
//                        System.out.println("Removed element: " + priorityQueue.dequeue());
//                        priorityQueue.traverse();
//                    }
//                    break;
//                case 3:
//                    if (priorityQueue.size() == 0) {
//                        System.out.println("Queue is empty");
//                    } else {
//                    	priorityQueue.traverse();
//                        System.out.println("Front element: " + priorityQueue.peek());
//                    }
//                    break;
//                case 4:
//                    System.out.println("Enter element to check: ");
//                    element = scanner.nextInt();
//                    if (priorityQueue.contains(element)) {
//                    	priorityQueue.traverse();
//                        System.out.println("Element " + element + " is present");
//                    } else {
//                    	priorityQueue.traverse();
//                        System.out.println("Element " + element + " is not present");
//                    }
//                    break;
//                case 5:
//                    System.out.println("Number of elements: " + priorityQueue.size());
//                    priorityQueue.traverse();
//                    break;
//                case 6:
//                    priorityQueue.reverse();
//                    System.out.println("Queue reversed");
//                    priorityQueue.traverse();
//                    break;
//                case 7:
//                    System.out.print("Queue: ");
//                    priorityQueue.traverse();
//                    break;
//                case 8:
//                    quit = true;
//                    break;
//                default:
//                    System.out.println("Invalid choice");
//                    break;
//            }
//        }
//
//        scanner.close();
//    	-----------------------------------------------------------------------------
    	
    	HashTable<String, Integer> hashtable = new HashTable<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a command (put, get, remove, containsKey, size, traverse, exit):");
            String command = scanner.nextLine().trim();

            if (command.equals("put")) {
                System.out.println("Enter a key:");
                String key = scanner.nextLine().trim();
                System.out.println("Enter a value:");
                int value = Integer.parseInt(scanner.nextLine().trim());
                hashtable.put(key, value);
                System.out.println("Key-value pair added to the hashtable.");

            } else if (command.equals("get")) {
                System.out.println("Enter a key:");
                String key = scanner.nextLine().trim();
                Integer value = hashtable.get(key);
                if (value == null) {
                    System.out.println("No value found for the key.");
                } else {
                    System.out.println("Value for the key: " + value);
                }

            } else if (command.equals("remove")) {
                System.out.println("Enter a key:");
                String key = scanner.nextLine().trim();
                hashtable.remove(key);
                System.out.println("Key-value pair removed from the hashtable.");
                hashtable.traverse();

            } else if (command.equals("containsKey")) {
                System.out.println("Enter a key:");
                String key = scanner.nextLine().trim();
                boolean contains = hashtable.containsKey(key);
                System.out.println("Hashtable contains the key: " + contains);
                hashtable.traverse();

            } else if (command.equals("size")) {
                System.out.println("Hashtable size: " + hashtable.size());
                hashtable.traverse();

            } else if (command.equals("traverse")) {
                System.out.println("Hashtable content:");
                hashtable.traverse();

            } else if (command.equals("exit")) {
                break;

            } else {
                System.out.println("Invalid command, try again.");
            }
        }

        System.out.println("Exiting program.");
    	
    	
   }
    
}