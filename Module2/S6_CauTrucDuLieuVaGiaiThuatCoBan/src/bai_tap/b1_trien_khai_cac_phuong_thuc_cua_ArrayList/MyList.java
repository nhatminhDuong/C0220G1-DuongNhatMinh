package bai_tap.b1_trien_khai_cac_phuong_thuc_cua_ArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index is out of range! Cannot add.");
        } else {
            if (index == elements.length) {
                ensureCapacity();
            }
            for (int i = size - 1; i >= index; i--) {
                elements[i + 1] = elements[i];
            }
            elements[index] = element;
            size++;
        }
    }

    public E remove(int index) {
        E removedElement = (E) elements[index];
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of range! Cannot remove.");
        } else {
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            elements[--size] = null;
        }
        return removedElement;
    }

    public int size() {
        return size;
    }

    @Override
    public MyList<E> clone() {
        MyList<E> temp = new MyList<E>();
        temp.elements = Arrays.copyOf(elements, size);
        temp.size = size;
        return temp;
    }

    public boolean contains(E o) {
        boolean containsO = false;
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                containsO = true;
                break;
            }
        }
        return containsO;
    }

    public int indexOf(E o) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public boolean add(E o) {
        if (size >= elements.length) {
            ensureCapacity();
        }
        elements[size++] = o;
        return true;
    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E get(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index is out of range! Cannot get element " + i + ".");
        }
        return (E) elements[i];
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public void printList() {
        int i = 0;
        System.out.print("Elements:\t");
        while (i < size) {
            System.out.print(elements[i] + "\t");
            i++;
        }
        System.out.println();
        System.out.println("Size: " + size);
        System.out.println("Capacity: " + elements.length);
    }
}
