package Linked_list;

class LL {
    Node head;
    // to finding the size of node
    private int size;

    LL() {
        this.size = 0;
    }

    // Creating Node
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add -> first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // add -> last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // print
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("NULL");
    }

    // delete -> first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // delete -> last
    public void deleteLast() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    // size
    public int getSize() {
        return size;
    }

    // reverse
    public void reverseIterate() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public class Linked_List {
        public static void main(String[] args) {
            // for creating linked list creating an object of own class
            LL list = new LL();
            list.addFirst("a");
            list.addFirst("is");

            list.printList();

            list.addLast("list");
            list.printList();

            list.addFirst("This");
            list.printList();

            list.deleteFirst();
            list.printList();

            list.deleteLast();
            list.printList();

            System.out.println(list.getSize());
            list.addFirst("This");
            System.out.println(list.getSize());

            list.addLast("1");
            list.addLast("2");
            list.addLast("3");
            list.addLast("4");
            list.printList();
            list.reverseIterate();
            list.printList();

            list.head = list.reverseRecursive(list.head);
            list.printList();
        }
    }
}
