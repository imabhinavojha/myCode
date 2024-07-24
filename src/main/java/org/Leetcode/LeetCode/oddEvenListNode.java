package org.Leetcode.LeetCode;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class oddEvenListNode {
    public static void main(String[] args) {
        oddEvenListNode obj = new oddEvenListNode();

        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        int[] array = { 2, 1, 3, 5, 6, 4, 7 };
        ListNode head = obj.createLinkedListFromArray(array);

        // Call the oddEvenList method and store the returned head of the reordered list
        ListNode reorderedListHead = obj.oddEvenList(head);

        // Print the reordered list
        obj.printList(reorderedListHead);
    }

    // Method to create a linked list from an array
    private ListNode createLinkedListFromArray(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int num : array) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummy.next;
    }

    // Method to print the elements of a linked list
    private void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head; // No need to reorder if the list is empty or contains only one node.
        }

        ListNode oddHead = head; // Head of the odd sublist.
        ListNode evenHead = head.next; // Head of the even sublist.
        ListNode odd = oddHead; // Pointer to traverse the odd sublist.
        ListNode even = evenHead; // Pointer to traverse the even sublist.

        while (even != null && even.next != null) {
            // Link odd nodes.
            odd.next = even.next;
            odd = odd.next;

            // Link even nodes.
            even.next = odd.next;
            even = even.next;
        }

        // Connect the odd sublist with the even sublist.
        odd.next = evenHead;

        return oddHead;

    }

}
