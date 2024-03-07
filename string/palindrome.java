package string;

public class palindrome {
    public static void main(String[] args) {
        String check = "racecar";
        cpalindrome(check);
    }

    private static void cpalindrome(String check) {
        for(int i=0; i<(check.length())/2;i++) {
            if(check.charAt(i)!=check.charAt(check.length()-i-1)) {
                System.out.println("noooo");
                return;
            }
        }
        System.out.println("yes....");
    }
}
