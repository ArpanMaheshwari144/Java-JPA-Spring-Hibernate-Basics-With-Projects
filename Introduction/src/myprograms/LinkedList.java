package myprograms;

import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}
public class LinkedList {
	
	public static  Node insert(Node head,int data) {
        Node node=new Node(data);
        node.data=data;
        node.next=null;
        
        if(head==null) {
            head=node;
        } else {
            Node n=head;
            while(n.next!=null) {
                n=n.next;
            }
            n.next=node;
        }
        return head;
    }
	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data +" ");
            start = start.next;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        System.out.println("Enter number of elements you want to enter!!");
        int N = sc.nextInt();
        System.out.println("Enter elements!!");
        while(N-->0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
