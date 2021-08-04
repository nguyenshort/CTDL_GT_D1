import modules.Animal;
import modules.LinkList;
import modules.Node;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkList list = new LinkList();
        // Thêm vào đầu
        list.unshift(new Animal(1, "Chó", 10, 20));
        list.unshift(new Animal(2, "Mèo", 11, 22));
        list.unshift(new Animal(3, "Chuột", 13, 23));

        // show nodes
        list.display();
        // xoá phần tử đầu
        list.shift();
        System.out.println("=================");
        //show nodes
        list.display();

        System.out.println("=================");
        // reverse link list và gán vào Link List Mới
        LinkList test = new LinkList(list.reverse());
        test.display();
    }
}
