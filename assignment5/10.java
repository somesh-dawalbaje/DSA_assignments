class DoublyLinkedListDemo{
    static class Node{
        Node next;
        Node prev;
        int data;

        Node(int data){
            this.data=data;
            prev=null;
            next=null;
        }
    }

    private static Node head;
    private static Node tail;

    public static void addAtHead(int data){
        Node new_Node=new Node(data);
        if(head==null)
            head=new_Node;
        else{
            new_Node.next=head;
            head.prev=new_Node;
            head=new_Node;
        }
    }

    public static void addAtTail(int data){
        Node new_Node=new Node(data);
        if(head==null)
            head=new_Node;
        else{
            Node temp=head;
            while (temp.next!=null) {
                temp=temp.next;
            }

            temp.next=new_Node;
            new_Node.prev=temp;
        }
    }

    public static void display(){
        Node temp=head;
        while (temp!=null) {
            System.out.println(temp.data);
            temp.prev=temp;
            temp=temp.next;
        }
        System.out.println();
    }

    public static void bubbleSort() {
        if (head == null || head.next == null) {
            return;
        }
        boolean swapped;
        Node current;
        Node last = null;

        do {
            swapped = false;
            current = head;

            while (current.next != last) {
                if (current.data > current.next.data) {
                    // Swap the nodes
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
            last = current;
        } while (swapped);
    }

    // Function to print the doubly linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DoublyLinkedListDemo dll=new DoublyLinkedListDemo();
        dll.addAtHead(45);
        dll.addAtHead(55);
        dll.addAtHead(87);
        dll.addAtTail(84);
        dll.addAtTail(21);
       
        dll.display();

        dll.bubbleSort();
        dll.display();
        
    }
}