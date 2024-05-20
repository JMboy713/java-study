package collection.set;

import java.util.Arrays;

public class MyHashSetV0 {
    private int[] elementData = new int[10];
    private int size = 0;

    public boolean add(int e) {
        if(contains(e)) {
            return false;
        }
        elementData[size] = e;
        size++;
        return true;
    }

    public boolean contains(int value) {
        for (int data: elementData) {
            if(data == value) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elementData=" + Arrays.toString(elementData) +
                ", size=" + size +
                '}';
    }
}
