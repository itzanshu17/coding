public class loops {
    public static void main(String args[]){
        Dear d=new Dear();
        System.out.println(d.color);
        

    }
    
}
class Animal{
    String color;
    Animal(){
        
        System.out.println("animal constructor is called");
    }
}
class Dear extends Animal{
    Dear(){
        super.color="brown";
        System.out.println("dear constructor is called");
    }
}