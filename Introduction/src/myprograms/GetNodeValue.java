package myprograms;
import java.io.*;
import java.util.*;

public class GetNodeValue {
	
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
	    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
	          SinglyLinkedListNode pointer = head;        
	          int pointerPosition = 0;

	           while (head.next != null){
	            head = head.next;
	            if (pointerPosition < positionFromTail){
	                pointerPosition++;
	            }else {
	                pointer = pointer.next;
	            }
	        }
	        return pointer.data;
	    }
	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	    	BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
	    	System.out.println("Enter number of testcases!!");
	        int tests = scanner.nextInt();
	      
	        for (int testsItr = 0; testsItr < tests; testsItr++) {
	            SinglyLinkedList llist = new SinglyLinkedList();

	            int llistCount = scanner.nextInt();

	            for (int i = 0; i < llistCount; i++) {
	                int llistItem = scanner.nextInt();
	                llist.insertNode(llistItem);
	            }
	            System.out.print("Enter position to get a node value:");
	            int position = scanner.nextInt();
	            int result = getNode(llist.head, position);

	            bufferedWriter.write(String.valueOf(result));
	            bufferedWriter.newLine();
	        }
	        bufferedWriter.close();
	        scanner.close();
	    }
}
