package LinkedList.SinglyLinkedNode;

public class MainProgram {

    public static void main(String[] args) {

        NodeLinkedList n1 = new NodeLinkedList();

        n1.addNode(10);
        n1.addNode(20);
        n1.addNode(30);
        n1.addNode(20);
        n1.addNode(10);

        n1.printList();
    }
}
