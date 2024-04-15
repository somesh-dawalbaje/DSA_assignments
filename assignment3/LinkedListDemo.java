public class LinkedListDemo {
    private static class Node{
        int data;
        Node next_Node;
        Node prev_Node;

        public Node(int data){
            this.data=data;
            next_Node=null;
            prev_Node=null;
        }
    }

    static Node head;
    private Node tail;

    public void addFirst(int data){
        Node new_Node=new Node(data);
        if(head==null){
            tail=new_Node;
            head=new_Node;
        }else{
            new_Node.next_Node=head;
            head = new_Node;
        }
    }

    public void addLast(int data){
        Node new_Node=new Node(data);
        if(tail==null){
            head=new_Node;
            tail=new_Node;
        }else{
            tail.next_Node=new_Node;
            new_Node.prev_Node=tail;
            tail=new_Node;
        }
    }
    public void insertAfter(int prevData, int data){
        Node temp = head;
        while (temp != null && temp.data != prevData) {
            temp = temp.next_Node;
        }
        if(temp==null){
            return;
        }
        Node new_Node=new Node(data);
        new_Node.next_Node=temp.next_Node;
        temp.next_Node=new_Node;
        
    }

    public static void removeFirst() {
        if (head == null) {
            return;
        }
        head = head.next_Node;
    }


    public void print(){
        Node current_Node=head;
        while(current_Node!=null){
            System.out.print(current_Node.data+" ");
            current_Node=current_Node.next_Node;
        }
        System.out.println();
    }
}

class programer{
    public static void main(String[] args) {
        LinkedListDemo lld=new LinkedListDemo();
        lld.addFirst(45);
        lld.addFirst(88);
        lld.print();
        lld.addLast(55);
        lld.addLast(220);
        lld.print();
        lld.insertAfter(88, 65);
        lld.print();
        lld.removeFirst();
        lld.print();
    }
}
