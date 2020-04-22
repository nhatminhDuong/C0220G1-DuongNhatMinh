package bai_tap.b2_trien_khai_cac_phuong_thuc_cua_LinkedList;

public class MyLinkedList<E> {
    private Node head;
    private int size;

    public MyLinkedList(Object data) {
        head = new Node(data);
        size++;
    }

    private class Node {
        private Node nextNode;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    public void add(int index, E element) {
        Node tempNode = head;
        Node holder;

        for (int i = 0; i < index - 1 && tempNode.nextNode != null; i++) {
            tempNode = tempNode.nextNode;
        }
        holder = tempNode.nextNode;
        tempNode.nextNode = new Node(element);
        tempNode.nextNode.nextNode = holder;
        size++;
    }

    public void addFirst(E element) {
        Node tempNode = head;
        head = new Node(element);
        head.nextNode = tempNode;
        size++;
    }

    public void addLast(E element) {
        Node tempNode = head;
        while (tempNode.nextNode != null) {
            tempNode = tempNode.nextNode;
        }
        tempNode.nextNode = new Node(element);
        size++;
    }

    public E remove(int index) {
        int i = 0;
        Node tempNode = head;
        E removedNode;
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of range!");
        } else {
            while (i != index - 1 && tempNode.nextNode != null) {
                tempNode = tempNode.nextNode;
                i++;
            }
            removedNode = (E) tempNode.nextNode;
            tempNode.nextNode = tempNode.nextNode.nextNode;
            size--;
            return removedNode;
        }
    }

    public boolean remove(Object element) {
        boolean isRemoved = false;
        Node tempNode = head;
        for (int i = 0; i < size; i++) {
            if (tempNode.getData() == element) {
                remove(i);
                isRemoved = true;
                break;
            }
            tempNode = tempNode.nextNode;
        }
        return isRemoved;
    }

    public int size() {
        return size;
    }

    public boolean add(E e) {
        addLast(e);
        return true;
    }

    @Override
    public MyLinkedList<E> clone() {
        MyLinkedList<E> clone = new MyLinkedList<E>(head.getData());
        if (head.nextNode != null) {
            Node tempNode = head.nextNode;
            while (tempNode.nextNode != null) {
                clone.add((E) tempNode.getData());
                tempNode = tempNode.nextNode;
            }
            clone.add((E) tempNode.getData());
        }
        return clone;
    }

    public boolean contains(E o) {
        boolean containsO = false;
        Node tempNode = head;
        while (tempNode.nextNode != null) {
            if (tempNode.getData().equals(o)) {
                containsO = true;
                break;
            }
            tempNode = tempNode.nextNode;
        }
        return containsO;
    }

    public int indexOf(E o) {
        int i = 0;
        Node tempNode = head;
        boolean found = tempNode.getData().equals(o);
        while (tempNode.nextNode != null && !found) {
            tempNode = tempNode.nextNode;
            found = tempNode.getData().equals(o);
            i++;
        }
        if (found) return i;
        else return -1;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of range! Cannot get.");
        } else {
            int i = 0;
            Node tempNode = head;
            while (i != index) {
                tempNode = tempNode.nextNode;
                i++;
            }
            return (E) tempNode.getData();
        }
    }

    public E getFirst() {
        return (E) head.getData();
    }

    public E getLast() {
        Node tempNode = head;
        while (tempNode.nextNode != null) {
            tempNode = tempNode.nextNode;
        }
        return (E) tempNode.getData();
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void printList() {
        if (head != null) {
            Node tempNode = head;
            System.out.print("Elements:\t");
            while (tempNode.nextNode != null) {
                System.out.print((tempNode.getData() + "\t"));
                tempNode = tempNode.nextNode;
            }
            System.out.println((tempNode.getData()));
            System.out.println("Size: " + size);
        }
    }
}
