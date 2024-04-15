class DequeDemo {
    int capacity;
    int[] deque;
    int front, rear;

    public DequeDemo(int capacity) {
        this.capacity = capacity;
        deque = new int[capacity];
        front = -1;
        rear = 0;
    }

    boolean isEmpty() {
        return front == -1;
    }

    boolean isFull() {
        return (front == 0 && rear == capacity - 1) || front == rear + 1;
    }

    void insertFront(int key) {
        if (isFull()) {
            System.out.println("Deque is full");
            return;
        }

        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (front == 0) {
            front = capacity - 1;
        } else {
            front = front - 1;
        }
        deque[front] = key;
        System.out.println(key + " inserted at front");
    }

    void insertRear(int key) {
        if (isFull()) {
            System.out.println("Deque is full");
            return;
        }

        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (rear == capacity - 1) {
            rear = 0;
        } else {
            rear = rear + 1;
        }
        deque[rear] = key;
        System.out.println(key + " inserted at rear");
    }

    void deleteFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }

        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == capacity - 1) {
            front = 0;
        } else {
            front = front + 1;
        }
        System.out.println("Front element deleted");
    }

    void deleteRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }

        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (rear == 0) {
            rear = capacity - 1;
        } else {
            rear = rear - 1;
        }
        System.out.println("Rear element deleted");
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }

        int i = front;
        while (true) {
            System.out.print(deque[i] + " ");
            if (i == rear) break;
            i = (i + 1) % capacity;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DequeDemo dq = new DequeDemo(5);
        dq.insertRear(10);
        dq.insertRear(20);
        dq.insertFront(5);
        dq.insertFront(15);
        dq.display();

        dq.deleteRear();
        dq.deleteFront();
        dq.display();
    }
}
