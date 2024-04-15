class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

class MergeSortedLinkedLists {

    public ListNode merge(ListNode l1, ListNode l2) {
        // Create a dummy node to start the merged list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Iterate over both lists
        while (l1 != null && l2 != null) {
            // Compare the values of nodes in both lists
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // Append remaining nodes from either list
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }

        // Return the merged list, starting from the next node of dummy
        return dummy.next;
    }

    // Utility function to print the linked list
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeSortedLinkedLists merger = new MergeSortedLinkedLists();

        // Create the first sorted linked list: 1 -> 3 -> 5
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

        // Create the second sorted linked list: 2 -> 4 -> 6
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);

        // Merge the two sorted linked lists
        ListNode merged = merger.merge(l1, l2);

        // Print the merged sorted linked list
        merger.printList(merged);
    }
}
