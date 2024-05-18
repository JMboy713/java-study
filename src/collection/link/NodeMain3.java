package collection.link;

public class NodeMain3 {
    public static void main(String[] args) {
        Node first = new Node("a");
        first.next = new Node("b");
        first.next.next = new Node("c");

        System.out.println("연결된 노드 출력하기");
        System.out.println(first);
        // 노드 탐색하기
        System.out.println("모든 노드 탐색하기");
        printAll(first);

        // 마지막 노드 조회하기
        Node lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode);

        // 특정 index의 노드 조회하기
        int index = 1;
        Node index2Node = getNode(first, index);
        System.out.println("index2Node = " + index2Node);

        // 데이터 추가하가
        System.out.println("데이터 추가하기");
        addNode(first, "d");
        System.out.println(first);

        // 특정 인덱스에 추가하기
        System.out.println("특정 인덱스에 추가하기");
        addNode2index(first, 2, "e");
        System.out.println(first);


    }

    private static void addNode2index(Node node, int i, String str) {
        Node x = node;
        for (int j = 0; j < i - 1; j++) {
            x = x.next;
        }
        Node newNode = new Node(str);
        newNode.next = x.next;
        x.next = newNode;
    }

    private static void addNode(Node node, String str) {
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(str);
    }

    private static Node getNode(Node node, int index) {

        Node x = node;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    private static Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }


    private static void printAll(Node node) {
        Node x = node;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }
}
