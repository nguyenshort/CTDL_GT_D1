package modules;

public class Node {
    Animal value;
    Node next;

    public Node(Animal value, Node next) {
        this.value = value;
        this.next = next;
    }

    public Node(Animal value) {
        this.value = value;
        this.next = null;
    }

    public Animal getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }
}
