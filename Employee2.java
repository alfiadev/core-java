import java.util.Scanner;
import java.util.TreeSet;

public class Employee2 implements Comparable<Employee2> {
    private int Id;
    private String name;
    private String Dpt;
    private int salary;

    Employee2(int Id, String name, String Dpt, int salary) {
        this.Id = Id;
        this.name = name;
        this.Dpt = Dpt;
        this.salary = salary;

    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getId() {
        return Id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDpt(String Dpt) {
        this.Dpt = Dpt;
    }

    public String getDpt() {
        return Dpt;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public int compareTo(Employee2 e2) {
        Employee2 e1 = this;
        int sal1 = e1.salary;
        int sal2 = e2.salary;

        String name1 = e1.name;
        String name2 = e2.name;
        /*
         * if (sal1 != sal2) {
         * return sal1 - sal2;
         * } else {
         * return name1.compareTo(name2);
         * 
         * }
         * // return sal1 - sal2;
         * /*
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
        Scanner scan = new Scanner(System.in);
        TreeSet<Employee2> employeeList = new TreeSet<Employee2>();

        int x = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < x; i++) {
            String s = scan.next();
            // String s = scan.nextLine();
            String[] st = s.split(";");

            int Id = 1001 + i;
            String name = st[0];
            String Dpt = st[1];
            int salary = Integer.parseInt(st[2]);

            Employee2 emp = new Employee2(Id, name, Dpt, salary);
            employeeList.add(emp);
            // System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getDpt() + "
            // " + emp.getSalary());

        }
        for (Employee2 emp : employeeList) {
            System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getDpt() + " " + emp.getSalary());
        }
    }
}
// jack;Buissness;500000; bob;HR;400000; alex;IT;300000; jill;IT;300000
