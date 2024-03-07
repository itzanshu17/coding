public class hoops {
    public static void main(String args[]){
        calculator calc=new calculator();
       System.out.println( calc.sum((float)2.5,(float)5.6));
       System.out.println( calc.sum(2,6));
       System.out.println( calc.sum(2,3,6));

    }
    static class calculator{
        int sum(int a, int b){
            return a+b;
        }
        float sum(float a, float b){
            return a+b;
        }
        int sum(int a, int b, int c){
            return a+b+c;
        }
    }
    
}
