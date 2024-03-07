public class nrec {
    public static void binary(int n, String str, int lastplace ){
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }
        binary(n-1,str+"0",0);
        if(lastplace==0){
            binary(n-1, str+"1",1);

        }
    }
    public static void main(String args[]){
        binary(5,"",0);
    }
    
}
