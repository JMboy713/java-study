package collection.array;

import java.util.Arrays;

public class MyArrayListV3 {
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elementData;
    private int size = 0;
    public MyArrayListV3() {
        elementData = new Object[DEFAULT_CAPACITY];
    }
    public MyArrayListV3(int capacity) {
        elementData = new Object[capacity];
    }

    public int size() {
        return size;
    }

    public void add(Object e) {
        // 코드 추가
        // size가 넘어가면, 배열의 크기를 늘린다.
        if(size >= elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;
    }

    public void add(int index, Object e) {
        if(size >= elementData.length) {
            grow();
        }
        shifRightFrom(index);
        elementData[index] = e;
        size++;

    }

    private void shifRightFrom(int index) {
        for (int i = size ; i > index; i--) {
            elementData[i ] = elementData[i-1];
        }
    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    public Object get(int index) {
        return elementData[index];
    }

    public Object set(int index,Object element) {
        Object old = elementData[index];
        elementData[index] = element;
        return old;
    }

    public Object remove(int index) {
        Object old = elementData[index];
        shifLeftFrom(index);
        size--;
        return old;
    }

    private void shifLeftFrom(int index) {
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
    }

    public int indexOf(Object obj) {
        for (int i = 0; i < size; i++) {
            if(obj.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }
    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) + "size=" + size + ", capacity=" + elementData.length + "}";

    }
}
