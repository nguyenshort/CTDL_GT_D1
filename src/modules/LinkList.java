package modules;

import java.util.Objects;

public class LinkList {
    Node _head;

    public LinkList() {
        this._head = null;
    }
    public LinkList(Node _head) {
        this._head = _head;
    }

    public void clear() {
        this._head = null;
    }

    public boolean isEmpty() {
        return this._head == null;
    }

    /**
     * Khi thêm node mới vào đầu phần tử đầu sẽ trở thành phần tử thứ 2
     * Phần tử vừa thêm vào sẽ trở thành head và chứa next tới phần tử trước đó
     */
    public void unshift(Animal animal) {
        this._head = new Node(animal, this._head);
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

    public Node reverse() {
        if (this.isEmpty() || this._head == null) {
            return this._head;
        }
        Node temp = null;
        temp = this._reverse(this._head, temp);
        return temp;
    }

    /**
     * Đảo ngược Link List ở đây là tạo 1 Node trống
     * Sử dụng đệ quy để duyệt toàn bộ link list
     * Sau đó push vào node đã tạo ở trên
     */
    private Node _reverse(Node star, Node temp) {
        if (star != null) {
            temp = new Node(star.getValue(), temp);
            return this._reverse(star.next, temp);
        }
        return temp;
    }

    public void display() {
        Node poit = this._head;
        while (poit.next != null) {
            System.out.println(poit.getValue().toString());
            poit = poit.next;
        }
        System.out.println(poit.getValue().toString());
    }
}
