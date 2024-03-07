//swap two no. without using 3rd element....
public class gbit {
    public static void main(String args[]){
        int x=3;
        int y=4;
        //swap without third elemen
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("x is: "+x+" y is : "+y);
    }
    
}
