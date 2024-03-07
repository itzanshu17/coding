// package prac-oops;
//MEATHOD OVERLOADING......
public class pa {
    public static void main(String args[]){
    Calculator cal=new Calculator();
    System.out.println(cal.sum(1,2));
    System.out.println(cal.sum((float)2.3,(float)4.5));
    System.out.println(cal.sum(3,4,5));
}
    
}
class Calculator{
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
