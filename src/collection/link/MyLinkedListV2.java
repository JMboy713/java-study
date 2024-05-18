package collection.link;

public class MyLinkedListV2 {
    private Node first;
    private int size = 0;

    public void add(Object e) {
        Node newNode = new Node(e);
        if (first == null) {
            first = newNode;
        } else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node getLastNode() {
        Node x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }
    public void add(int index, Object e) {
        Node newNode = new Node(e);
        if(index == 0) {// 맨 앞에 추가
            newNode.next = first;
            first = newNode;
            size++;
            return;
        }
        Node x = getNode(index - 1);
        newNode.next = x.next;
        x.next = newNode;
        size++;
    }

    public Object set(int index,Object element) {
        Node x = getNode(index);
        Object old = x.item;
        x.item = element;
        return old;
    }
    public Object remove(int index) {
        Node removeNode = getNode(index);
        Object removedItem = removeNode.item;
        if(index == 0) {
            Node x = first;
            first = x.next;
            size--;
            return x.item;
        }else{
            Node prev = getNode(index - 1);
            prev.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removedItem;
    }
    public Object get(int index) {
        Node x = getNode(index);
        return x.item;
    }

    private Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public int indexOf(Object e) {
        int index = 0;
        for(Node x = first; x != null; x = x.next) {
            if(x.item.equals(e)) {
                return index;
            }
            index++;
        }
        return index;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
