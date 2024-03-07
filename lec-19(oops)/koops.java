public class koops {
    public static void main(String args[]){
        queen q=new queen();
        q.move();
        rook r=new rook();
        r.move();
    }
    
}
interface chess{
    void move();
}
class queen implements chess{
    public void move(){
        System.out.println("up, down, diagnol, left , right");
    }
}
class rook implements chess{
    public void move(){
        System.out.println("up, down left , right");
    }
}