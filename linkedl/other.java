package linkedl;

public class other {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

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

    public void printll() {
        if (head == null) {
            System.out.println("sale khali deta hai");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->>");
            temp = temp.next;
        }
        System.out.println("NUll");
    }

    public static void main(String[] args) {
        other ll = new other();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.printll();
        System.out.println(iscycle());
        head.next.next.next.next = head;
        System.out.println(iscycle());
        ll.removecycle();
        System.out.println(iscycle());
    }

    private void removecycle() {
        if (head == null) {
            return;
        }
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        if (cycle == false) {
            return;
        }
        slow = head;
        Node prev = head;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;

    }

    public static boolean iscycle() {
        if (head == null) {
            return false;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
