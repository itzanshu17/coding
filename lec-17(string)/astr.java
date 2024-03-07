//package lec-17(string);
import java.util.*;
public class astr {
    public static void main(String args[]){
        char arr[]={'a','b','c'};
        String a="abcd , efg";
        System.out.println(a);
        Scanner sc= new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println(name);
        //count the length of string
        System.out.println(a.length());
        System.out.println(name.length());
        //charcter at some index
        System.out.println(a.charAt(2));
        //print every character in a string
        for(int i=0;i<a.length();i++){
            System.out.println(a.charAt(i));

        }
    }
    
}
