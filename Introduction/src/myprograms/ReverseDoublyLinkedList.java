package myprograms;
import java.util.*;
import java.io.*;

public class ReverseDoublyLinkedList {
	
	  static class DoublyLinkedListNode {
	        public int data;
	        public DoublyLinkedListNode next;
	        public DoublyLinkedListNode prev;

	        public DoublyLinkedListNode(int nodeData) {
	            this.data = nodeData;
	            this.next = null;
	            this.prev = null;
	        }
	    }
	    static class DoublyLinkedList {
	        public DoublyLinkedListNode head;
	        public DoublyLinkedListNode tail;

	        public DoublyLinkedList() {
	            this.head = null;
	            this.tail = null;
	        }
	        public void insertNode(int nodeData) {
	            DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

	            if (this.head == null) {
	                this.head = node;
	            } else {
	                this.tail.next = node;
	                node.prev = this.tail;
	            }
	            this.tail = node;
	        }
	    }
	    public static void printDoublyLinkedList(DoublyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
	        while (node != null) {
	            bufferedWriter.write(String.valueOf(node.data));

	            node = node.next;

	            if (node != null) {
	                bufferedWriter.write(sep);
	            }
	        }
	    }
	    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
	         DoublyLinkedListNode temp = head;
	         DoublyLinkedListNode newHead = head;
	         while (temp != null) {
	            DoublyLinkedListNode prev = temp.prev;
	            temp.prev = temp.next;
	            temp.next = prev;
	            newHead = temp;
	            temp = temp.prev;
	            }
	        return newHead;
	    }
	    static Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	    	BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
	    	System.out.println("Enter number of testcases!!");
	        int t = scanner.nextInt();
	        for (int tItr = 0; tItr < t; tItr++) {
	            DoublyLinkedList llist = new DoublyLinkedList();

	            int llistCount = scanner.nextInt();

	            for (int i = 0; i < llistCount; i++) {
	                int llistItem = scanner.nextInt();
	                llist.insertNode(llistItem);
	            }
	            DoublyLinkedListNode llist1 = reverse(llist.head);
	            printDoublyLinkedList(llist1, " ", bufferedWriter);
	            bufferedWriter.newLine();
	        }
	        bufferedWriter.close();
	        scanner.close();
	    }
}
