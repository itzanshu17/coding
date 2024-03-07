package string;

public class short_path {
    public static void main(String[] args) {
        String path="NS";
        s_path(path);
    }

    private static void s_path(String path) {
        int n=0;
        int w=0;
        int e=0;
        int s=0;
        for(int i=0;i<path.length();i++) {
            if(path.charAt(i)=='N') {
                n++;
            }
            else if(path.charAt(i)=='S') {
                s++;
            }
            else if(path.charAt(i)=='W') {
                w++;
            }
            else {
                e++;
            }
        }
        int a=n-s;
        int b=e-w;
        double d =Math.sqrt((a*a)+(b*b));
        System.out.println(d);
    }
}
