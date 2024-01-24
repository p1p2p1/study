
public class ArrayQueue	implements Queue {
	private int front;
	private int rear;
	private int queueSize;
	private char itemArray[];
	
	public ArrayQueue(int queueSize) {
		front = -1;
		rear = -1;
		this.queueSize = queueSize;
		itemArray = new char[this.queueSize];
	}
	
	@Override
	public boolean isEmpty() {
		return (front == rear);
	}
	
	public boolean isFull() {
		return (rear == this.queueSize-1);
	}

	@Override
	public void enQueue(char item) {
		if(isFull()) {
			System.out.println("Inserting fail! Array Queue is Full");
		}
		else {
			itemArray[++rear] = item;
			System.out.println("Inserted item : " + item);
		}
		
	}


	@Override
	public char deQueue() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Array Queue is Empty");
			return 0;
		}
		else {
			return itemArray[++front];
		}
	}

	@Override
	public void delete() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Array Queue is Empty");
		}
		else {
			++front;
		}
		
	}

	@Override
	public char peek() {
		if(isEmpty()) {
			System.out.println("Peeking fail! Array Queue is Empty");
			return 0;
		}
		else {
			return itemArray[front+1];
		}
	}
	
	public void printQueue() {
		if(isEmpty()) {
			System.out.printf("Array Queue is Empty %n %n");
		}
		else {
			System.out.printf("Array Queue >>");
			for(int i = front+1 ; i <= rear; i++) {
				System.out.printf("%c ", itemArray[i]);
			}
			System.out.println();
			System.out.println();
		}
	}
}
