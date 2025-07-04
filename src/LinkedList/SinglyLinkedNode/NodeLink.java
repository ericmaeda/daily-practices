package LinkedList.SinglyLinkedNode;

public class NodeLink {

    int value;
    NodeLink next;

    public NodeLink(int value, NodeLink next) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return this.value;
    }

    public NodeLink getNextNode() {
        return this.next;
    }
 }
