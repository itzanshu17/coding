public class istr {
    public static String strb(String a){
    StringBuilder sb= new StringBuilder("");
    char ch=Character.toUpperCase(a.charAt(0));
    sb.append(ch);
    for(int i=1; i<a.length(); i++){
        if(a.charAt(i)==' ' && i<a.length()-1){
            sb.append(a.charAt(i));
            i++;
            sb.append(Character.toUpperCase(a.charAt(i)));
        }
        else{
            sb.append(a.charAt(i));
        }
    }
    return sb.toString();
}
    public static void main(String args[]){
    String a="lana del ray is godess of sadness";
    System.out.println(strb(a));
    }
    
}
