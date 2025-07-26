class snippt {
    int age;
    String name;

    snippt(int a, String n) {
        age = a;
        name = n;
    }
}

class test111 extends snippt {
    int rollno;
    int sal;

    test111(int rollno, int sal, int age, String name) {
        super(age, name);
        this.rollno = rollno;
        this.sal = sal;
    }

    public static void main(String[] args) {
        test111 t = new test111(1, 5000000, 55, "jhumi cat");
        System.out.println(t.age + " " + t.name + " " + t.rollno + " " + t.sal);

    }
}
