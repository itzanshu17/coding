//package lec-24(linked list);
//Add in linked  list

//import java.util.LinkedList;

public class alili {
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
   
    public void addfirst(int data){
        //step 1: create new node..
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
            return ;
        }
        //step 2 newnode next
        newnode.next=head;
        //step3 head=newnode
        head=newnode;
    }
    public void addlast(int data){
        Node newnode=new Node(data);
        if(tail==null){
            head=tail=newnode;
        }
        tail.next=newnode;
        tail=newnode;
    }
    public void print(){
        if(head==null){
            System.out.println("linked list is emnpty.");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        alili l1=new alili();
        l1.print();
        l1.addfirst(1);
        l1.print();
        l1.addfirst(2);
        l1.print();
        l1.addlast(3);
        l1.print();
        l1.addlast(4);
        l1.print();

    }

    
}
