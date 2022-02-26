package myprograms2;
import java.util.*;

public class LinkedList {
	

      static Node head; // head of list 
  
    /* Linked list Node*/
     class Node { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  
    /* Inserts a new Node at front of the list. */
    public void push(int new_data) 
    { 
        /* 1 & 2: Allocate the Node & 
                  Put in the data*/
        Node new_node = new Node(new_data); 
  
        /* 3. Make next of new Node as head */
        new_node.next = head; 
  
        /* 4. Move the head to point to new Node */
        head = new_node; 
    } 
  
    // Returns true if there is a loop in linked 
    // list else returns false. 
    static boolean detectLoop(Node h) 
    { 
        HashSet<Node> s = new HashSet<Node>(); 
        while (h != null) { 
            // If we have already has this node 
            // in hashmap it means their is a cycle 
            // (Because you we encountering the 
            // node second time). 
            if (s.contains(h)) 
                return true; 
  
            // If we are seeing the node for 
            // the first time, insert it in hash 
            s.add(h); 
  
            h = h.next; 
        } 
  
        return false; 
    } 
  
    /* Driver program to test above function */
    public static void main(String[] args) 
    { 
        LinkedList list = new LinkedList(); 
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.push(6);
        list.push(7);
        list.push(8);
        list.push(9);
        list.push(10);
        list.push(11);
        
        LinkedList.head.next.next.next.next.next.next.next.next.next.next=LinkedList.head;
  
        if (detectLoop(head)) 
            System.out.println("Loop found"); 
        else
            System.out.println("No Loop"); 
    }
}
