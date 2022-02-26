package myprograms;
import java.util.*;
import java.io.*;

public class InsertingANodeIntoASortedDoublyLinkedList {
	
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
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
         DoublyLinkedListNode n = new DoublyLinkedListNode(data);
         n.data = data;
            if (head == null) {
                return n;
            }
            else if (data <= head.data) {
                n.next = head;
                head.prev = n;
                return n;
            }
            else {
                DoublyLinkedListNode rest = sortedInsert(head.next, data);
                head.next = rest;
                rest.prev = head;
                return head;
            }
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
            int data = scanner.nextInt();
            DoublyLinkedListNode llist1 = sortedInsert(llist.head, data);
            printDoublyLinkedList(llist1, " ", bufferedWriter);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        scanner.close();
    }
}
