package thuc_hanh.b1_trien_khai_lop_List_don_gian;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listIntegers = new MyList<Integer>();

        listIntegers.add(1);
        listIntegers.add(2);
        listIntegers.add(3);
        listIntegers.add(3);
        listIntegers.add(4);

        System.out.println("element 4: " + listIntegers.get(4));
        System.out.println("element 1: " + listIntegers.get(1));
        System.out.println("element 2: " + listIntegers.get(2));

//        listIntegers.get(6);
//        System.out.println("element 6: " + listIntegers.get(6));
//        System.out.println("element -1: " + listIntegers.get(-1));

    }
}
