package modules;

import java.util.Objects;

public class LinkList {
    Node _head, _tail;

    public Node getHead() {
        return this._head;
    }


    public boolean isEmpty() {
        return this._head == null;
    }


    public void unshift(TikTok tiktok) {
        if (this.isEmpty()) {
           this._head = this._tail = new Node(tiktok);
           return;
        }
        this._head = new Node(tiktok, this._head);
        this._head.next.setPrev(this._head);
    }

    public void push(TikTok tiktok) {
        if (this.isEmpty()) {
            this._head = this._tail = new Node(tiktok, this._head);
            return;
        }
        Node newNode = new Node(tiktok);
        this._tail.setNext(newNode);
        newNode.setPrev(this._tail);
        this._tail = newNode;
    }

    /**
     * Search bằng đệ quy
     * @param star Điểm bắt đầu của link list
     * @param name giá trị tên cần search
     * @return Node
     */
    public Node search(Node star, String name) {
        if (star != null && !Objects.equals(star.value.getName(), name)) {
            return search(star.next, name);
        }
        return star;
    }

    /**
     * Khi xoá phần tử đầu...head sẽ chuyển về phần tử thứ 2
     * Nên phải check xem có phần tử thứ 2 hay không
     */
    public boolean shift() {
        if (this.isEmpty()) {
            return false;
        }
        this._head = this._head.next;
        return true;
    }

    public void reverse() {
        if (this.isEmpty() || this._head == null) {
            System.out.println("Linklist is empty");
        }
        Node node = this._tail;
        while (node != null) {
            System.out.println(node.getValue().toString());
            node = node.prev;
        }
    }

    public void display() {
        Node poit = this._head;
        while (poit != null) {
            System.out.println(poit.getValue().toString());
            poit = poit.next;
        }
    }
}
