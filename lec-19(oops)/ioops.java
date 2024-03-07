
//..METHOD OVERRIDING...
public class ioops {
    public static void main(String args[]){
        Deer d=new Deer();
        d.eat();

    }
    
}
class Animal{
    void eat(){
        System.out.print("eat anything");

    }
}
class Deer extends Animal{
    void eat(){
        System.out.print("eat grass");
    }

}
