import modules.LinkList;
import modules.Node;
import modules.TikTok;

public class Main {

    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.unshift(new TikTok(1, "Nguyên1", 30, 600));
        linkList.unshift(new TikTok(2, "Nguyên2", 31, 610));
        System.out.println("=======");
        linkList.display();
        System.out.println("=======");
        linkList.unshift(new TikTok(3, "Nguyên3", 31, 610));
        linkList.display();
        System.out.println("=======");
        linkList.push(new TikTok(4, "Nguyên4", 34, 640));
        linkList.display();
        Node search = linkList.search(linkList.getHead(), "Nguyên1");
        System.out.println("=======");
        System.out.println(search.getValue().toString());
    }
}
