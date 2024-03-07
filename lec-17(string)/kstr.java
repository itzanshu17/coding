import java.util.Arrays;

public class kstr {
    public static void main(String args[]){
        String str1="hello";
        String str2="ellhw";
        //convert in lowercase
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        // chk length
        if(str1.length()==str2.length()){
            char[] stra=str1.toCharArray();
            char[] strb=str2.toCharArray();
            Arrays.sort(stra);
            Arrays.sort(strb);
            boolean result= Arrays.equals(stra,strb);
                if(result==true){
                    System.out.println("analog");
                }
                else{

                }
            
        }
        else{
            System.out.println("length differ");
        }
    }
}
