
// addlast, addfirst, addmid, print
public class blili {
    public static class Node{
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
    public  void addfirst(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
        head=tail=newnode;
        return ;
        }
        
        head.next=newnode;
        head=newnode;
    }
    public  void addmid(int idx, int data){
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
        //if i=idx-1
        newnode.next=temp.next;
        temp.next=newnode;

    }
    public  void addlast(int data){
        Node newnode=new Node(data);
        size++;
        if(tail==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
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
        blili ab=new blili();
        ab.print();
        ab.addfirst(1);
        ab.print();
        ab.addlast(3);
        ab.print();
        ab.addmid(1, 2);
        ab.print();
        System.out.println(ab.size);

    }
    
}
