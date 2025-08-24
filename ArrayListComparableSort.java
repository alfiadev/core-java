import java.util.ArrayList;
import java.util.Collections;

public class ArrayListComparableSort {

    public static void main(String[] args) {
        //comparable for Default sorting
     ArrayList<Student> lst = new <Student>ArrayList();
    
    lst.add(new Student(55,"ALice"));
    lst.add(new Student(30,"Grace"));
    lst.add(new Student(40,"lisk"));
    lst.add(new Student(20,"fairy"));

       

      Collections.sort(lst);

        for(Student s:lst){
           System.out.println(s);
        }



    }
}
class Student implements Comparable<Student> {
    int marks;
    String name;

    Student(int marks,String name){
       this.marks=marks;
       this.name=name;
       
    }
   
    public int compareTo(Student m2){
        Student m1= this;
        int marks1=m1.marks;
        int marks2=m2.marks;

        return marks1-marks2;
    }

     public String toString() {
        return "Student{name='" + name + "', marks=" + marks + "}";
    }
}

    


