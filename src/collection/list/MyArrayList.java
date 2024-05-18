package collection.list;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E>{
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elementData;
    private int size = 0;
    public MyArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
    }
    public MyArrayList(int capacity) {
        elementData = new Object[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E e) {
        // 코드 추가
        // size가 넘어가면, 배열의 크기를 늘린다.
        if(size >= elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;
    }

    @Override
    public void add(int index, E e) {
        if(size >= elementData.length) {
            grow();
        }
        shiftrightfrom(index);
        elementData[index] = e;
        size++;

    }

    private void shiftrightfrom(int index) {
        for (int i = size ; i > index; i--) {
            elementData[i ] = elementData[i-1];
        }
    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    @SuppressWarnings("unchecked")// 경고를 무시
    @Override
    public E get(int index) {
        return (E) elementData[index];
    }// 캐스팅

    @Override
    public E set(int index,E element) {
        E old = get(index);
        elementData[index] = element;
        return old;
    }

    @Override
    public E remove(int index) {
        E old = get(index);
        shiftLeftFrom(index);
        size--;
        elementData[size] = null;
        return old;
    }
    private void shiftLeftFrom(int index) {
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
    }

    @Override
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
