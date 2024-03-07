package oops;

public class newc {
    public static void main(String[] args) {
         //Created a object name p1
        Pen p1 = new Pen();
        p1.setclor("blue");
        p1.settip(5);
        p1.color = "green";
        System.out.println(p1.color+" "+p1.tip);

    }
}

class Pen {
    String color;
    int tip;
    

    void setclor(String newcolor) {
        color = newcolor;
    }

     void settip(int newtip) {
        tip = newtip;
     }
}