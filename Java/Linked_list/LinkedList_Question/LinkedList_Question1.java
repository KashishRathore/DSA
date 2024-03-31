package Linked_list.LinkedList_Question;

// Q -> Find and Delete the nth Node from the end of Linked List   

public class LinkedList_Question1 {

    class ListNode {
        String data;
        ListNode next;

        ListNode(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }

        // Finding the size of list
        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            size++;
        }

        if (n == size) {
            return head.next;
        }

        // Finding the previous node
        int idxToSearch = size - n;
        ListNode prev = head;
        int i = 0;
        while (i < idxToSearch) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;

        return head;
    }
}
