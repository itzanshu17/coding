
public class aoops {
    public static void main(String args[]){
        Pen p1=new Pen();
        p1.setcolor("pink");
        p1.settip(32);
        System.out.println(p1.color);
        System.out.println(p1.tip);

    }
    
}
class Pen{
    String color;
    int tip;
    void setcolor(String newcolor){
    color=newcolor;
    }

    void settip(int newtip){
    tip=newtip;
    }
}
