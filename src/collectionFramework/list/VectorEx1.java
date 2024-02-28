package collectionFramework.list;

import java.util.Vector;

public class VectorEx1 {
    public static void main(String[] args) {
        Vector v = new Vector(5);
        v.add("1");
        v.add("2");
        v.add("3");
        print(v);

        v.trimToSize();// trimToSize()는 capacity를 size에 맞게 줄여준다.가비지컬렉터에 의해 메모리에서 제거됨.
        System.out.println("=== After trimToSize ===");
        print(v);

        v.ensureCapacity(6);// capa가 6보다 작으면 6으로 늘려준다., 기존의 인스턴스를 사용하는 것이 아니라 새로운 인스턴스를 만든 후에 복붙을 하는 것!
        System.out.println("=== After ensureCapacity ===");
        print(v);

        v.setSize(7);// size를 7로 늘려준다. 늘어난 부분은 null로 채워진다.기존 인스턴스를 늘려주는 것이다.
        System.out.println("=== After setSize ===");
        print(v);

        v.clear();// 모든 요소 삭제.
        System.out.println("=== After clear ===");
        print(v);
    }

    public static void print(Vector vector) {
        System.out.println(vector);
        System.out.println("size: " + vector.size());
        System.out.println("capacity: " + vector.capacity());
        System.out.println();
    }
}
