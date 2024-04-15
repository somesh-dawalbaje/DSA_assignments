class Node {
    int data;
    Node prev;
    Node next;
    
    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;
    
    public DoublyLinkedList() {
        this.head = null;
    }
    
    // Method to insert a new node at the end of the list
    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }
    
    // Method to display the list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    // Method to delete a node by its value
    public void delete(int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                if (temp.prev != null) {
                    temp.prev.next = temp.next;
                } else {
                    head = temp.next;
                }
                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                }
                break;
            }
            temp = temp.next;
        }
    }
}

class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertEnd(1);
        dll.insertEnd(2);
        dll.insertEnd(3);
        dll.insertEnd(4);
        
        System.out.println("Doubly Linked List:");
        dll.display(); // Output: 1 2 3 4
        
        dll.delete(3);
        System.out.println("After deleting 3:");
        dll.display(); // Output: 1 2 4
    }
}
