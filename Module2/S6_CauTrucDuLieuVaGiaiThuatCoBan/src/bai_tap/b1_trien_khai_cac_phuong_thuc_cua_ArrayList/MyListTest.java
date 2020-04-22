package bai_tap.b1_trien_khai_cac_phuong_thuc_cua_ArrayList;

import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listIntegers = new MyList<Integer>(2);

        listIntegers.add(2);
        listIntegers.add(1);
        listIntegers.add(3);
        listIntegers.add(5);
        listIntegers.add(3);

//        listIntegers.add(4, 10);
        listIntegers.remove(2);
//        System.out.println(listIntegers.size());

//        listIntegers.clone().printList();
//        System.out.println(listIntegers.contains(1));
//        System.out.println(listIntegers.indexOf(3));
//        System.out.println(listIntegers.get(3));
//        listIntegers.clear();

        System.out.println();
        listIntegers.printList();
    }
}
