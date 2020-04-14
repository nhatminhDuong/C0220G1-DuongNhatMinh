package bai_tap.b1_trien_khai_cac_phuong_thuc_cua_ArrayList;

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

//    public void add(int index, E element) {
//        if (index < 0 || index > elements.length) {
//            throw new IndexOutOfBoundsException("Out of range!");
//        }
//
//    }

}
