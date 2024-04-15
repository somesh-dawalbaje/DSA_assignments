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

    public static void insertAfter(Node prevNode, int data){
        if(prevNode==null)
            return;
        Node new_Node=new Node(data);
        new_Node.next=prevNode.next;
        prevNode.next=new_Node;
    }

    public static void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println();
    }

    public static void delete(int data){
        Node temp=head;
        Node prev=null;
        if(temp!=null && temp.data==data){
            head=temp.next;
            return;
        }

        while(temp!=null && temp.data!=data){
            prev=temp;
            temp=temp.next;
        }

        if(temp==null)
            return;

        prev.next=temp.next;
    }

    public static void deleteAtPositin(int pos){
        if(head==null)
            return;
        Node temp=head;
        if(pos==0){
            head=temp.next;
            return;
        }

        for (int i = 0; i < pos-1 && temp!=null; i++) {
            temp=temp.next;
        }

        if(temp==null || temp.next==null)
            return;
        
        Node next=temp.next.next;
        temp.next=next;
    }

    public static void reverse(){
        Node prev=null;
        Node current=head;
        Node next=null;

        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }

        head=prev;
    }

    public static Node findMid(){
        if(head==null)
            return null;
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }
    public static void main(String[] args) {
        LinkedListDemo ll=new LinkedListDemo();
        ll.insertAtHead(12);
        ll.insertAtHead(20);
        ll.insertAtHead(30);
        ll.insertAtEnd(122);
        ll.insertAfter(head.next, 11);
        ll.delete(11);
        ll.deleteAtPositin(1);

        ll.display();
        ll.reverse();
        ll.display();
        Node mid=ll.findMid();
        System.out.println(mid.data);
    }
}