class LinkedList {
   
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    
    Node head;

    // Constructor
    LinkedList() {
        head = null;
    }

    
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    
    public Node findMiddleElement() {
        if (head == null) {
            return null; 
        }

        Node slow = head;
        Node fast = head;

       
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; 
    }

   
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

       
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

       
        System.out.print("LinkedList: ");
        list.display();

        
        Node middle = list.findMiddleElement();
        if (middle != null) {
            System.out.println("Middle Element: " + middle.data);
        } else {
            System.out.println("The list is empty.");
        }
    }
}
