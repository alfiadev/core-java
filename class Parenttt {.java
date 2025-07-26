class Parenttt {
    int age;
    String name;

    Parenttt() {
        System.out.println("Parent no-arg");
    }

    Parenttt(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

class Child extends Parenttt {
    int marks;
    int rollno;

    Child(int a, String name, int m, int rollno) {
        super(a, name);
        marks = m;
        this.rollno = rollno;
        /*
         * Because age is not a local variable or parameter in the Child constructor. So
         * Java would say: “What is age? I don’t know it.”
         * 
         */
        /*
         * You must pass actual variables available in the current constructor's scope.
         */

    }
    // System.out.println("Child parameter: " + age + " " + name + " " + marks + " "
    // + rollno);

    // this(9, "hello");

    // System.out.println("Child parameter222: " + a);
    void disp() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(marks);
        System.out.println(rollno);

    }

    Child(int a, String s) {

        // System.out.println("Child parameter: " + a + " " + s);
    }
}

class Prac11 {
    public static void main(String[] args) {
        Child c = new Child(10, "chinna", 100, 11);

    }
}
