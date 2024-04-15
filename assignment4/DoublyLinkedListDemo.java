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

    public static void insertAfter(Node prevNode, int data){
        if(prevNode==null){
            return;
        }
        Node new_Node=new Node(data);
        new_Node.next=prevNode.next;
        prevNode.next=new_Node;
        new_Node.prev=prevNode;
        if(new_Node.next!=null)
            new_Node.next.prev=new_Node;
    }

    public static void insertBefore(Node nextNode,int data){
        if(nextNode==null)
            return;
        Node new_Node=new Node(data);
        new_Node.prev=nextNode.prev;
        nextNode.prev=new_Node;
        new_Node.next=nextNode;
        if(nextNode.prev!=null)
            new_Node.prev.next=new_Node;
        else
            head=new_Node;
    }

    public static void delete(Node node){
        if(node==null)
            return;
        if(node.prev==null){
            head=node.next;
        }else{
            node.prev.next=node.next;
        }

        if(node.next!=null){
            node.next.prev=node.prev;
        }
    }

    public static void deleteAtPosition(int pos){
        if(head==null)
            return;
        Node temp=head;
        for (int i = 0; i < pos && temp!=null; i++) {
            temp=temp.next;
        }
        if(temp==null)
            return;
        delete(temp);
    }

    public static void deleteValue(int data){
        if(head==null)
            return;
        Node temp=head;
        while (temp!=null) {
            if(temp.data==data){
                if(temp.prev==null){
                    head=temp.next;
                }else{
                    temp.prev.next=temp.next;
                }
                if(temp.next==null){
                    tail=temp.prev;
                }else{
                    temp.next.prev=temp.prev;
                }
                return;
            }
            temp=temp.next;
        }
    }

    public static void reverse(){
        Node current=head;
        Node temp=null;
        while(current!=null){
            temp=current.prev;
            current.prev=current.next;
            current.next=temp;
            current=current.prev;
        }

        if(temp!=null){
            head=temp.prev;
        }
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

    public static int getSize(){
        if(head==null)
            return 0;
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public static int findLargest(){
        if (head == null) {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }
        
        int max = head.data;
        Node current = head;
        
        while (current != null) {
            if (current.data > max) {
                max = current.data;
            }
            current = current.next;
        }
        
        return max;
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

    public static void insertSorted(int data) {
        Node newNode = new Node(data);
        if (head == null || head.data >= data) {
            addAtHead(data);
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data < data) {
            current = current.next;
        }

        insertAfter(current, data);
    }
    

    public static void main(String[] args) {
        DoublyLinkedListDemo dll=new DoublyLinkedListDemo();
        /*dll.addAtHead(45);
        dll.addAtHead(55);
        dll.addAtHead(87);
        dll.addAtTail(84);
        dll.addAtTail(21);
        dll.insertAfter(head.next, 864);
        dll.insertBefore(head.next, 111);
        dll.delete(head.next);
        dll.deleteAtPosition(3);
        dll.deleteValue(864);
        dll.display();
        dll.reverse();
        dll.display();
        Node mid=dll.findMid();
        System.out.println(mid.data);
        System.out.println(dll.getSize());
        System.out.println(dll.findLargest());*/

        dll.insertSorted(45);
        dll.insertSorted(55);
        dll.insertSorted(87);
        dll.insertSorted(84);
        dll.insertSorted(21);
        dll.display();

       
    }
}