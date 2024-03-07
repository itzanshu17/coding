
//copy constructor...
import java.util.*;
public class doops {
    public static void main(String args[]){
        Student s1=new Student();
        s1.name="anshika";
        s1.age=34;
        s1.password="bsa";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=67;

        Student s2=new Student(s1);
        s2.password="sbhvjb";
        s1.marks[1]=44;
        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }


    }
    
}
class Student{
    //Student();
    String name;
    int age;
    String password;
    int marks[];
    Student(Student s1){
        marks=new int [3];
        this.name=s1.name;
        this.age=s1.age;
        this.marks= s1.marks;
    }
    Student(){
        marks=new int[3];
        this.name=name;
        this.age=age;
        this.marks=marks;
    }
}
