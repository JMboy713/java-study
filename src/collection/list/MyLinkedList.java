package collection.list;

public class MyLinkedList<E> implements MyList<E>{
    private Node<E> first;
    private int size = 0;

    @Override
    public void add(E e) {
        Node<E> newNode = new Node(e);
        if (first == null) {
            first = newNode;
        } else {
            Node<E> lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }


    private Node<E> getLastNode() {
        Node<E> x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }
    @Override
    public void add(int index, E e) {
        Node<E> newNode = new Node(e);
        if(index == 0) {// 맨 앞에 추가
            newNode.next = first;
            first = newNode;
            size++;
            return;
        }
        Node<E> x = getNode(index - 1);
        newNode.next = x.next;
        x.next = newNode;
        size++;
    }
    @Override

    public E set(int index,E element) {
        Node<E> x = getNode(index);
        E old = x.item;
        x.item = element;
        return old;
    }
    @Override
    public E remove(int index) {
        Node<E> removeNode = getNode(index);
        E removedItem = removeNode.item;
        if(index == 0) {
            Node<E> x = first;
            first = x.next;
            size--;
            return x.item;
        }else{
            Node<E> prev = getNode(index - 1);
            prev.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removedItem;
    }
    @Override
    public E get(int index) {
        Node<E> x = getNode(index);
        return x.item;
    }

    private Node<E> getNode(int index) {
        Node<E> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }
    @Override

    public int indexOf(E e) {
        int index = 0;
        for(Node<E> x = first; x != null; x = x.next) {
            if(x.item.equals(e)) {
                return index;
            }
            index++;
        }
        return index;
    }
    @Override

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

    private static class Node<E> {
        E item;
        Node next;

        public Node(E item) {
            this.item = item;
        }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<E> x = this;
            sb.append("[");
            while (x != null) {
                sb.append(x.item);
                x = x.next;
                if (x != null) {
                    sb.append("->");
                }

            }
            sb.append("]");
            return sb.toString();
        }


    }

}
