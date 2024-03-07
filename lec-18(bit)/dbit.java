public class dbit {
    public static int getbit(int n, int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }


    }
    public static int setint(int n, int i){
        int bitmask=1<<i;
        return n|bitmask;
    }
    public static int clearint(int n,int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }
    public static int update(int n, int i, int newbit){
        n= clearint(n,i);
        int bitmask=newbit<<i;
        return n|bitmask;

    }
    public static int lastbit(int n, int i){
        int bitmask=(~0)<<i;
        return n&bitmask;
    }
    public static int clearfrmjtoi(int n, int i, int j){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n&bitmask;

    }
    public static void main(String args[]){
        int i=3;
        System.out.println(getbit(10,i));
        System.out.println(setint(10,1));
        System.out.println(clearint(10,1));
        System.out.println(update(10,2,1));
        System.out.println(lastbit(15,2));
        System.out.println(clearfrmjtoi(10, 2, 4));
    }
    
}
