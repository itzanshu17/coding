package string;
public class lowertoupper {
    public static void main(String[] args) {
        String line ="hye there i am ayush";
        touppercase(line);
    }

    private static void touppercase(String line) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(line.charAt(0));
        sb.append(ch);

        for(int i=1;i<line.length();i++) {
            if(line.charAt(i)==' ') {
                sb.append(line.charAt(i));
                i++;
                sb.append(Character.toUpperCase(line.charAt(i)));
            }
            else {
                sb.append(line.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
