package myprograms;
import java.io.*;
import java.util.*;

public class ReverseLinkedList1 {

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
	    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
	        while (node != null) {
	            bufferedWriter.write(String.valueOf(node.data));

	            node = node.next;

	            if (node != null) {
	                bufferedWriter.write(sep);
	            }
	        }
	    }
	    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {

	          if (head == null || head.next == null) {
	        return head;
	    }
	    SinglyLinkedListNode newHead = reverse(head.next); // reverse all but first
	    head.next.next = head; // make original second point at first
	    head.next = null; // make original first point at nothing
	    return newHead;
	    }
	     static  Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	    	BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
	        int tests = scanner.nextInt();
	        for (int testsItr = 0; testsItr < tests; testsItr++) {
	            SinglyLinkedList llist = new SinglyLinkedList();

	            int llistCount = scanner.nextInt();
	         
	            for (int i = 0; i < llistCount; i++) {
	                int llistItem = scanner.nextInt();
	         
	                llist.insertNode(llistItem);
	            }
	            SinglyLinkedListNode llist1 = reverse(llist.head);

	            printSinglyLinkedList(llist1, " ", bufferedWriter);
	            bufferedWriter.newLine();
	        }
	        bufferedWriter.close();

	        scanner.close();
	    }
}
