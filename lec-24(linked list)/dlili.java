public class dlili {
    public  class Node{
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
    public void addfirst( int data){
        Node newnode=new Node( data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;;
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
        if(idx==0){
            addfirst(data);
            return;
        }
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;

        }
        newnode.next=temp.next;
        temp.next=newnode;


    }
    public void print(){
        if(head==null){
            System.out.print("empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;

        }
        System.out.println();
    }
    public int itrsearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public static void main(String args[]){
      dlili ad=new dlili();
        ad.addfirst(6);
        //add.print();
        ad.addfirst(2);
        //add.print();
        ad.addlast(3);
        //add.print();
        ad.addlast(4);
        ad.addmid(1,8);
        ad.print();
        System.out.print(ad.itrsearch(6)); 

    }



    
}
