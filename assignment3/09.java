class Solution {
   
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    
    public ListNode reverseList(ListNode head) {
        ListNode current = head; 
        ListNode prev = null; 
        ListNode next = null; 

        while (current != null) {
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        }

        return prev; 
    }

    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        solution.printList(head);

        ListNode reversedHead = solution.reverseList(head);

        System.out.println("Reversed Linked List:");
        solution.printList(reversedHead);
    }
}
