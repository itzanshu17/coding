public class goops {
    public static void main(String args[]){
        Birds abc=new Birds();
        abc.eat();

    }
    
}
 class Animals{
    
    String breathe;
    void eat(){
        System.out.print("eat");
    }
    
}
 class Birds extends Animals{
    String fly;
    
}
 class Fish extends Animals{
    String swim;

}
class Mammals extends Animals{
    String walk;
}