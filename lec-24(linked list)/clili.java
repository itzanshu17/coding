//REMOVE LAST AND FIRST....
public class clili {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addfirst(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;

        }
        head.next=newnode;
        head=newnode;

    }
    public void addlast(int data){
        Node newnode=new Node(data);
        size++;
        if(tail==null){
            head=tail=newnode;
            return;

        }
        tail.next=newnode;
        tail=newnode;

    }
    public void addmid(int idx, int data){
        Node newnode=new Node(data);
        size++;
        if(idx==0){
            addfirst(data);
            return;
        }
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            idx++;

        }
        newnode.next=temp.next;
        temp.next=newnode;

    }
    public int removefirst(){
        if(size==0){
            System.out.println("empty");
        }
        else if(head==null){
            int val=head.data;
            head=tail=null;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;

    }
    public int removelast(){
        if(size==0){
            System.out.println("empty");
            return Integer.MIN_VALUE;
        }
        else if(tail==null){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;

        }
        //prev:i=size-2;
            Node prev=head;
            for(int i=0; i<size-2; i++){
                prev=prev.next;
            }
            int val=prev.next.data;
            prev.next=null;
            tail=prev;
            size--;
            return val;

    }
    public void print(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
        System.out.println();

    }
    public static void main(String args[]){
        clili abc=new clili();
        abc.addfirst(1);
        abc.addlast(2);
        abc.addmid(1,5);
        abc.print();
        abc.removefirst();
        abc.print();
        abc.removelast();
        abc.print();
        System.out.println(abc.size);



    }

    
}
