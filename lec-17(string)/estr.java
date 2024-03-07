//string comparision
public class estr {
    public static void main(String args[]){
        String a="black";
        String b="black";
        String c= new String("black");
        if(a==b){
            System.out.println("strngs are equal");
        }
        else {
            System.out.println("strngs are not  equal");
        }
        //a==c it will return false cz of new keyword, when new keywork is initialized it means new string is created.
        //if new keyword is not used then a and b will be stored at same place 
        if(a==c){
            System.out.println("strngs are equal");
        }
        else{
            System.out.println("strngs are not equal");
        }



        //for this we use a function .equals...
        if(a.equals(b)){
            System.out.println("strngs are equal");
        }
        else{
            System.out.println("nor equal");
        }
    }
    
}
