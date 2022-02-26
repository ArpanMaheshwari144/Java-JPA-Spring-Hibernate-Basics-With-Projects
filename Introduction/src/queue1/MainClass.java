package queue1;

public class MainClass {

	public static void main(String[] args) {
		
		Queue q=new Queue();
		q.enQueue(5);
		q.enQueue(6);
		System.out.println("Empty = "+q.isEmpty());
		System.out.println("Full = "+q.isFull());
		System.out.println("The size of the queue is: " +q.getSize());
		q.show();

	}

}
