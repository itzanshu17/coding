package linkedl;

public class DoubleLL {

    // structure of node
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add first
    public void addfirst(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }

    // remove first
    public void removefirst() {
        if (head == null) {
            return;
        }
        size--;
        if (size == 1) {
            head = tail = null;
            return;
        }
        head.next.prev = null;
        head = head.next;
    }

    // remove last
    // public void removelast() {
    //     if (head == null) {
    //         return;
    //     }
    //     size--;
    //     if (size == 1) {
    //         head = tail = null;
    //         return;
    //     }
    //     tail.prev.next = null;
    //     tail = tail.prev;
    // }

    // add last
    public void addlast(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    // print
    public void print() {
        Node temp = head;
        System.out.print("null <-> ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addfirst(1);
        dll.addfirst(2);
        dll.addfirst(3);
        System.out.println(size);
        dll.print();
        dll.removefirst();
        dll.print();
        dll.addlast(5);
        dll.print();
        // dll.removelast();
        // dll.print();
    }
}
