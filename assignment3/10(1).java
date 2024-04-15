class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkList{
    Node head;
    LinkList(){
        this.head = null;
    }
    LinkList(int data){
        this.head = new Node(data);
    }
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }
}
/**
 * ReverseList
 */
class AddListsNumber {
    public static int toNumber(Node head){
        Node current = head;
        int num = 0;
        while(current != null){
            num = 10 * num + current.data;
            current = current.next; 
        }
        return num;
    }
    public static void main(String[] args) {
        LinkList list1 = new LinkList(); 
        LinkList list2 = new LinkList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
    ////////////////////////
        list2.add(1);
        list2.add(2);
        list2.add(3);
        Node head1=  list1.head;
        Node head2 = list2.head;
        int num1 = toNumber(head1);
        int num2 = toNumber(head2);

        System.out.println(num1 + num2);
    }
}