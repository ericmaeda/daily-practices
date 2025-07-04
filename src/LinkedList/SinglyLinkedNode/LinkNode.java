package LinkedList.SinglyLinkedNode;

public class LinkNode {

    // It's a doubly linked list

    int value;
    LinkNode next;
    LinkNode prev;

    public LinkNode(int value, LinkNode next, LinkNode prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    public int getValue() {
        return this.value;
    }

    public LinkNode getNextNode() {
        return this.next;
    }

    public LinkNode getPrevNode() {
        return this.prev;
    }
}
