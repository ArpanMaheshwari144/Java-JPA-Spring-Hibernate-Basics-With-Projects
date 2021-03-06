package myprograms;
import java.io.*;
import java.util.*;

public class DeleteANode {

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

	   
	    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
	    if (position == 0){ return head.next; }
	    head.next = deleteNode(head.next, position-1);
	    return head;
	}

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	    	BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

	        SinglyLinkedList llist = new SinglyLinkedList();

	        int llistCount = scanner.nextInt();

	        for (int i = 0; i < llistCount; i++) {
	            int llistItem = scanner.nextInt();

	            llist.insertNode(llistItem);
	        }

	        int position = scanner.nextInt();

	        SinglyLinkedListNode llist1 = deleteNode(llist.head, position);

	        printSinglyLinkedList(llist1, " ", bufferedWriter);
	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
	    }
}
