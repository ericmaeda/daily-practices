package LinkedList.SinglyLinkedNode;

public class NodeLinkedList {

    Node head;

    public void addNode(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + "-> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
