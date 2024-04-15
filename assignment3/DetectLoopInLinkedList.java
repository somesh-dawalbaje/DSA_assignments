class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class DetectLoopInLinkedList {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; // No cycle if the list is empty or has only one node
        }

        ListNode slow = head;
        ListNode fast = head.next;

        // Move slow and fast pointers until they meet or fast reaches the end
        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true; // Cycle detected
            }
            slow = slow.next; // Move slow pointer by one step
            fast = fast.next.next; // Move fast pointer by two steps
        }

        return false; // No cycle found
    }

    public static void main(String[] args) {
        DetectLoopInLinkedList detector = new DetectLoopInLinkedList();

        // Create a linked list with a cycle: 1 -> 2 -> 3 -> 4 -> 5 -> 2
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node2; // This creates the cycle

        // Check if the linked list has a cycle
        boolean hasCycle = detector.hasCycle(head);
        System.out.println("Does the linked list have a cycle? " + hasCycle);
    }
}
