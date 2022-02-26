package stack;

import java.util.Scanner;

public class Stack {
	
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int stack[]=new int[n];
	int top=0;
	public void push(int data) {
		if(top==n) {
			System.out.println("Hey! Motherfucker Stack is full!!");
		} else {
		stack[top]=data;
		top++;
		}
	}
	public int pop() {
		int data = 0;
		if(isEmpty()) {
			System.out.println("Hey! Motherfucker Stack is empty!!");
		} else {
		top--;
		data=stack[top];
		stack[top]=0;
		}
		return data;
	}
	public int peek() {
		int data;
		data=stack[top-1];
		return data;
	}
	public int size() {
		return top;
	}
	public boolean isEmpty() {
		return top<=0;
	}
	public void show() {
		for(int n:stack) {
			System.out.print(n+" ");
		}
		System.out.println();
	}

}
