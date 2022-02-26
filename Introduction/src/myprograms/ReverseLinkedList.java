package myprograms;
import java.util.*;

public class ReverseLinkedList {

	    static class SinglyLinkedListNode {
	        public int data;
	        public SinglyLinkedListNode next;

	        public SinglyLinkedListNode(int nodeData) {
	            this.data = nodeData;
	            this.next = null;
	        }
	    }

	    static class SinglyLinkedList {
	        public SinglyLinkedListNode head;
	        public SinglyLinkedListNode tail;

	        public SinglyLinkedList() {
	            this.head = null;
	            this.tail = null;
	        }

	        public void insertNode(int nodeData) {
	            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

	            if (this.head == null) {
	                this.head = node;
	            } else {
	                this.tail.next = node;
	            }

	            this.tail = node;
	        }
	    }

	    public static void printSinglyLinkedList(SinglyLinkedListNode node) {
	        while (node != null) {
	            System.out.print(node.data);

	            node = node.next;
	        }
	    }
	    static void reversePrint(SinglyLinkedListNode head) {
	        
	if (head != null) {
	   reversePrint(head.next);
	   System.out.println(head.data); 
	       }
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int tests = scanner.nextInt();

	        for (int testsItr = 0; testsItr < tests; testsItr++) {
	            SinglyLinkedList llist = new SinglyLinkedList();

	            int llistCount = scanner.nextInt();

	            for (int i = 0; i < llistCount; i++) {
	                int llistItem = scanner.nextInt();

	                llist.insertNode(llistItem);
	            }

	            reversePrint(llist.head);
	        }

	        scanner.close();
	    }
}
