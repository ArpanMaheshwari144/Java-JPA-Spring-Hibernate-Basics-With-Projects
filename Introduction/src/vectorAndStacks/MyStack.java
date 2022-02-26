package vectorAndStacks;

import linkedlists.MyLinkedList;

public class MyStack<E> {
	
	private MyLinkedList<E> l1=new MyLinkedList<>();
	void push(E e) {
		l1.add(e);
	}
	E pop() throws Exception{
		if(l1.isEmpty()) {
			throw new Exception("Popping from empty stack is not possible");
		}
		return l1.removeLast();
	}
	E peek() throws Exception {
		if(l1.isEmpty()) {
			throw new Exception("Peeking from empty stack is not possible");
		}
		return l1.getLast();	
	}
}
