package bai_tap.b2_trien_khai_cac_phuong_thuc_cua_LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<Integer>(1);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(3);
        linkedList.add(3);

//        linkedList.remove(2);
        linkedList.add(3, 6);
//        linkedList.addFirst(10);
//        linkedList.remove((Object) 5);
//        linkedList.clone().printList();
//        System.out.println(linkedList.contains(4));
//        System.out.println(linkedList.indexOf(5));
//        System.out.println(linkedList.get(7));
//        linkedList.clear();

        System.out.println();
        linkedList.printList();
    }
}
