package LinkedList.DoublyLinkedList;

public class NodeLinkedList {

    Node head;
    Node tail;

    public void addNodeLast(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void addNodeFirst(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        while (tail == head) {
            tail.next = tail;
            tail = tail.prev;
        }
    }
}
