package queue1;

public class Queue {
	int[] queue=new int[5];
	int size;
	int front;
	int rear;
	public void enQueue(int data) {
		if(!isFull()) {
		queue[rear]=data;
		rear=(rear+1)%5;
		size=size+1;
	} else {
		System.out.println("Queue is Full MotherFucker!!");
	  }
	}
	public int deQueue() {
		int data=queue[front];
		if(!isEmpty()) {
		front=(front+1)%5;
		size=size-1;
		} else {
			System.out.println("Queue is Empty MotherFucker!!");
		}
		return data;
	}
	public void show() {
		System.out.print("Elements are : ");
		for(int i=0;i<size;i++) {
			System.out.print(queue[(front+i)%5]+" ");
		}
	}
	public int getSize() {
		return size;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public boolean isFull() {
		return size==5;
	}

}