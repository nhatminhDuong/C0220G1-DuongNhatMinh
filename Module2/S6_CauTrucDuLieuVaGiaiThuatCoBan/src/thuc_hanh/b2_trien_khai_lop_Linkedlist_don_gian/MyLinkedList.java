package thuc_hanh.b2_trien_khai_lop_Linkedlist_don_gian;

public class MyLinkedList {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, Object data) {
        Node tempNode = head;
        Node holder;

        for (int i = 0; i < index - 1 && tempNode.next != null; i++) {
            tempNode = tempNode.next;
        }
        holder = tempNode.next;
        tempNode.next = new Node(data); // tempNode.next là node mới cần chèn
        tempNode.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node tempNode = head;
        head = new Node(data);
        head.next = tempNode;
        numNodes++;
    }

    public Node get(int index) {
        Node tempNode = head;
        for (int i = 0; i < index; i++) {
            tempNode = tempNode.next;
        }
        return tempNode;
    }

    public void printList() {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.println(tempNode.data);
            tempNode = tempNode.next;
        }
    }
}
