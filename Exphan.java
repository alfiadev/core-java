import java.util.Scanner;

class Demo1 {
    void fun1() {
        try {
            System.out.println("conn4 estbd");
            Scanner s = new Scanner(System.in);
            System.out.println("enter first number");
            int a = s.nextInt();
            System.out.println("enter second number");
            int b = s.nextInt();
            int result = a / b;
            System.out.println(result);
            System.out.println("connection 4 is terminated");

        } catch (ArithmeticException e) {
            System.out.println("exp handled");
        }
    }
}

class Demo2 {
    void fun2() {
        System.out.println("conn3 estbd");
        Demo1 d1 = new Demo1();
        d1.fun1();
        System.out.println("conn3 Terminated");
    }
}

class Demo3 {

    void fun3() {
        System.out.println("conn2 estbd");
        Demo2 d2 = new Demo2();
        d2.fun2();
        System.out.println("conn2 Terminated");
    }

}

class Exphan {
    public static void main(String[] args) {
        System.out.println("conn1 estbd");

        Demo3 d3 = new Demo3();
        d3.fun3();

        System.out.println("conn1 Terminated");
    }

}