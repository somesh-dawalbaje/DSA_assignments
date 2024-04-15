class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class NthFromEndOfLinkedList {

    public ListNode findNthFromEnd(ListNode head, int n) {
        if (head == null || n <= 0) {
            return null; // Invalid input or list is empty
        }

        ListNode slow = head;
        ListNode fast = head;

        // Move the fast pointer 'n' steps ahead
        for (int i = 0; i < n; i++) {
            if (fast == null) {
                return null; // If n is greater than the length of the list
            }
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end of the list
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // At this point, slow points to the nth node from the end
        return slow;
    }

    public static void main(String[] args) {
        NthFromEndOfLinkedList finder = new NthFromEndOfLinkedList();

        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2; // Find the 2nd element from the end

        ListNode nthNode = finder.findNthFromEnd(head, n);
        if (nthNode != null) {
            System.out.println("The " + n + "th element from the end is: " + nthNode.val);
        } else {
            System.out.println("Invalid input or the list is too short.");
        }
    }
}
