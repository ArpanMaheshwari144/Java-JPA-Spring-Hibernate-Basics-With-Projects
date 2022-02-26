// floyd's cycle finding algorithms
package myprograms3;

public class LinkedList {
	
	 Node head; // head of list 
	  
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
	  
	    int detectLoop() 
	    { 
	        Node slow_p = head, fast_p = head; 
	        while (slow_p != null && fast_p != null && fast_p.next != null) { 
	            slow_p = slow_p.next; 
	            fast_p = fast_p.next.next; 
	            if (slow_p == fast_p) { 
	                System.out.println("Found loop"); 
	                return 1; 
	            } 
	        } 
	        return 0; 
	    } 
	  
	    /* Driver program to test above functions */
	    public static void main(String args[]) 
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
	  
	        /*Create loop for testing */
	        list.head.next.next.next.next.next.next.next.next.next.next = list.head; 
	  
	        list.detectLoop(); 
	    }
}
