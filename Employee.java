import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Employee implements Comparable<Employee> {
  private String name;
  private int age;
  private int salary;
  private String Dpt;
  private int Id;

  Employee(String name, int age, int salary, String Dpt, int Id) {
    this.name = name;
    this.age = age;
    this.salary = salary;
    this.Dpt = Dpt;
    this.Id = Id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public int getSalray() {
    return salary;
  }

  public void setDpt(String Dpt) {
    this.Dpt = Dpt;
  }

  public String getDpt() {
    return Dpt;
  }

  public void setID(int Id) {
    this.Id = Id;
  }

  public int getId() {
    return Id;
  }

  public int compareTo(Employee e2) {
    Employee e1 = this;
    int sal1 = e1.salary;
    int sal2 = e2.salary;

    String name1 = e1.name;
    String name2 = e2.name;

    /*
     * if (sal1 == sal2) {
     * return 0;
     * } else if (sal1 < sal2) {
     * return -1;
     * } else {
     * return 1;
     * }
     */

    if (sal1 != sal2) {
      return sal1 - sal2;
    } else if (name1.compareTo(name2) != 0) {
      return name1.compareTo(name2);
    } else {
      return e1.Id - e2.Id;
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    TreeSet<Employee> employeeList = new TreeSet<Employee>();

    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {

      String st = sc.next(); // first st stores the input from user in one line String st = sc.next();
      // user enters: John;25;40000;IT
      // st = "John;25;40000;IT"
      String[] s = st.split(";");// And after splitting, those input values are stored in a String array whose
                                 // reference is s

      // Now:
      // s[0] = "John"
      // s[1] = "25"
      // s[2] = "40000"
      // s[3] = "IT"
      String name = s[0];
      int age = Integer.parseInt(s[1]);
      int salary = Integer.parseInt(s[2]);
      String Dpt = s[3];
      int Id = 1001 + i;

      Employee emp = new Employee(name, age, salary, Dpt, Id);
      employeeList.add(emp);

      System.out
          .println(emp.getName() + " " + emp.getAge() + " " + emp.getSalray() + " " + emp.getDpt() + " " + emp.getId());
    }
    for (Employee e : employeeList) {
      System.out.println(e.getName() + " " + e.getAge() + " " + e.getSalray() + " " + e.getDpt() + " " + e.getId());
    }

  }

}

class MyCompare1 implements Comparator<Employee> {
  public int compare(Employee e1, Employee e2) {
    String name1 = e1.getName();
    String name2 = e2.getName();

    if (name1.compareTo(name2) != 0) {
      return name1.compareTo(name2);
    } else {
      return e1.getId() - e2.getId();
    }
  }
}

class MyCompare2 implements Comparator<Employee> {
  public int compare(Employee e1, Employee e2) {

    String name1 = e1.getName();
    String name2 = e2.getName();

    int l1 = name1.length();
    int l2 = name2.length();

    if (l1 != l2) {
      return l1 - l2;
    } else {
      return name1.compareTo(name2);
    }
  }
}
// alex;19;300000;IT
// bob;22;400000;HR
// Alfia;29;50000000000;Buissness
