public class coops {
    public static void main(String args[]){
        check abc= new check("anshika");
        System.out.print(abc.name);
    }
    
}
class check{
    String name;
    int roll;
    check(String name){
        this.name=name;
    }
}
