package string;
// aaabbcccdd = a3b2c3d2
public class compress {
    public static void main(String[] args) {
        String a = "aaabbcccdd";
        compres(a);
    }
    private static void compres(String a) {
        StringBuilder sb = new StringBuilder("");

        for(int i=0;i<a.length();i++){
            Integer count =1;
            while(i<a.length()-1 &&  a.charAt(i)==a.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(a.charAt(i));
            if(count>1) {
                sb.append(Integer.toString(count));
            }
        }
        System.out.println(sb);
    }
}