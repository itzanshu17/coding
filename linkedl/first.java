package linkedl;

public class first {
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

    public void addfirst(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;

        return;
    }

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

    public void addmiddel(int index, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        if (index == 0) {
            addfirst(data);
            return;
        }
        size++;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void removefirst() {
        if (size == 0) {
            System.out.println("empty");
        }
        if (size == 1) {
            head = tail = null;
            size = 0;
        }
        head = head.next;
        size--;
    }

    public void removelast() {
        if (size == 0) {
            System.out.println("empty");
        }
        if (size == 1) {
            head = tail = null;
            size = 0;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        prev.next = null;
        tail = prev;
        size--;
    }

    public int itrsearch(int key) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data == key) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public void reversel() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static Node mid() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static boolean cpalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        Node middel = mid();
        Node prev = null;
        Node curr = middel;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        while (right != null) {
            if (right.data == left.data) {
                right = right.next;
                left = left.next;
            } else {
                return false;
            }
        }
        return true;
    }

    public void removenfromlast(int k) {
        if (k == size) {
            head = head.next;
            return;
        }
        int n = size - k;
        Node temp = head;
        for (int i = 0; i < n - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public Node mergesort(Node head) {
        if (head == null) {
            return head;
        }
        Node mid = mid();
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergesort(head);
        Node newRight = mergesort(rightHead);
        return merge(newLeft, newRight);
    }

    public Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else if (head2.data <= head1.data) {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
            while (head1 != null) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            while (head2 != null) {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }

        }
        return mergedLL.next;
    }

    public static void main(String[] args) {
        first ll = new first();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addmiddel(2, 5);
        System.out.println(size);
        // ll.removefirst();
        // ll.removelast();
        // System.out.println("your index for the key is : " + ll.itrsearch(5));
        // ll.reversel();
        // ll.printll();
        // ll.removenfromlast(3);
        // ll.printll();
        // ll.addlast(4);
        ll.addlast(3);
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(6);
        ll.addlast(8);
        ll.addlast(5);
        // boolean a = cpalindrome();
        // System.out.println(a);
        ll.printll();
    }
}
