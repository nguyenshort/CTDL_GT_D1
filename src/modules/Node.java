package modules;

public class Node {
    Node prev;
    TikTok value;
    Node next;

    public Node(TikTok tikTok) {
        this.value = tikTok;
        this.next = null;
    }

    public Node(TikTok tikTok, Node node) {
        this.value = tikTok;
        this.next = node;
    }

    public Node(Node node, TikTok tikTok) {
        this.prev = node;
        this.value = tikTok;
    }

    public Node(Node prev, TikTok tikTok, Node next) {
        this.prev = prev;
        this.value = tikTok;
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void setValue(TikTok value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public TikTok getValue() {
        return value;
    }
}
