public class joops {
    public static void main(String args[]){
        cock c=new cock();
        c.walk();
        c.eat();

        Mustang abc = new Mustang();
        // constructor is called hierachically

    }
    
}
abstract class Animal{
    Animal(){
        System.out.println("anima constructor called");
    }
    void eat(){
        System.out.println("eat shit");
    }
    abstract void walk();
} 
class deer extends Animal{
    deer(){
        System.out.println("deer constructor called");
    }
    void walk(){
        System.out.println("walk on 4legs");
    }
}
class Mustang extends deer{
    Mustang(){
        System.out.print("mustang constructor called");
    }
}
class cock extends Animal{
    void walk(){
        System.out.println(" walks on 2 leg");
    }
    }

