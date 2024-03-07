//substring...
public class bback {
    public static void subset(String str, String ans, int i){
        //base case
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        //recursive
        //if choice is yes
        subset(str,ans+str.charAt(i),i+1);
        //if choice is no
        subset(str, ans,i+1);
    }
    public static void main(String args[]){
        String str="abc";
        subset(str,"",0);
    }
    
}
