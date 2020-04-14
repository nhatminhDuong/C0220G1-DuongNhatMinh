package thuc_hanh.b2_trien_khai_lop_Linkedlist_don_gian;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList linkedList = new MyLinkedList(10);
        linkedList.addFirst(11);
        linkedList.addFirst(12);
        linkedList.addFirst(13);

        linkedList.add(4, 9);
        linkedList.add(4, 7);

        linkedList.printList();
        System.out.println(linkedList.get(4));
        System.out.println(linkedList.get(5));
    }
}
