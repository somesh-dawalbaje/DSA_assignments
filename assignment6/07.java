class QueueDemo {
	int size =5;
	int Q[]=new int[size];
	int rear, front;
	
	public QueueDemo() {
		front= rear= -1;
	}boolean isEmpty(){
		if(front==-1) 
			return true;
		else
			return false;
	}boolean isfull(){
		if(front==-1 && rear == size-1) 
			return true;
		else
			return false;
	}
	void enqueue(int x) {
		if(isfull()) {
			System.out.println("Queue is full.");
		}else {
			if(front == -1)
				front = 0;
			rear++;
			Q[rear]=x;
			System.out.println(x+" : Inserted ");
		}
	}int dequeue(){
		int x;
		if (isEmpty()){
			System.out.println("Queue is Empty !");
			return -1;
		}else {
			x=Q[front];
			if(front >= rear) {
				front =-1;
				rear  =-1;
			}else {
				front++;
			}System.out.println(x+" : Deleted");
			return x;
		}
	}
	void display() {
		if(isEmpty()) {
			System.out.println("Queue is Empty !");
		}else {
			for(int i =front;i<=rear;i++) {
				System.out.println(Q[i]);
			}
		}
    }

    public static void main(String[] args) {
        QueueDemo q=new QueueDemo();
        q.enqueue(45);
        q.enqueue(55);
        q.enqueue(88);
        q.display();
        q.dequeue();
        q.display();
    }
}
