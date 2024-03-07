//palindrome
public class cstr {
    public static boolean palin(String a){
        for(int i=0; i<a.length()/2; i++){
            int n=a.length();
            if (a.charAt(i) !=a.charAt(n-1-i)){
                return false;
            }
            
            }
            return true;
        }
    
    public static void main(String args[]){
        String a="anssna";
        System.out.println(palin(a));
        
    }
}
    

