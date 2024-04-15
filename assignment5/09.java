class LinkedListDemo{
    static class Node{
        Node next;
        int data;
        
        Node(int data){
            this.data=data;
            next=null;
        }
    }

    private static Node head;

    LinkedListDemo(){
        head=null;
    }

    public static void insertAtHead(int data){
        Node new_node=new Node(data);
        if(head==null)
            head=new_node;
        else{
            new_node.next=head;
            head=new_node;
        }
    }

    public static void insertAtEnd(int data){
        Node new_node=new Node(data);
        if(head==null)
            head=new_node;
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new_node;
        }
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
   
    public static void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println();
    }

    
   
    public static void main(String[] args) {
        LinkedListDemo ll=new LinkedListDemo();
        ll.insertAtEnd(12);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        

        ll.display();

        ll.bubbleSort();
        ll.display();

        
    }
}