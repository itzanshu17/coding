public class jstr {
    public static String compress(String a){
        String newa="";
        for(int i=0; i<a.length(); i++){
            Integer count=1;
            while(i<a.length()-1 && a.charAt(i)==a.charAt(i+1)){
                count++;
                i++;


            }
            newa+=a.charAt(i);
            if(count>1){
                newa+=count.toString();
            }
        }
        return newa;
    }
    public static void main(String args[]){
        String a="aaabbccddd";
        System.out.println(compress(a));
    }
    
    
}
