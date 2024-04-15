class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class StartNodeOfLoopInLinkedList {

    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null; // No cycle if the list is empty or has only one node
        }

        ListNode slow = head;
        ListNode fast = head;

        // Detect cycle using Floyd's Algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) { // Cycle detected
                break;
            }
        }

        // If fast reached the end, there's no cycle
        if (fast == null || fast.next == null) {
            return null;
        }

        // Reset one pointer to the head and move both pointers one step at a time
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // Return the start node of the cycle
        return slow;
    }

    public static void main(String[] args) {
        StartNodeOfLoopInLinkedList finder = new StartNodeOfLoopInLinkedList();

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

        // Find the start node of the cycle
        ListNode startNode = finder.detectCycle(head);
        if (startNode != null) {
            System.out.println("Start node of the cycle: " + startNode.val);
        } else {
            System.out.println("No cycle found in the linked list.");
        }
    }
}
