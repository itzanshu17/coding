public class foops {
     public static void main(String args[]){
        // Fish abc= new Fish();
        // abc.breathe();
        Dogs oreo=new Dogs();
        oreo.legs=4;
        System.out.print(oreo.legs);
        
    }
    static class Animal{
        String name;
        void eats(){
            System.out.print("animals eat");
        }
        void breathe(){
            System.out.print("animal breathes");
        }
    }
    static class Fish extends Animal{
        String fings;
        void swim(){
            System.out.println("fish can swin under water");
        }
    }
static class Mammals extends Animal{
    int legs;
}
static class Dogs extends Mammals{
    String breed;
}
   
    
}
