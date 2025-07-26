//import javax.management.RuntimeErrorException;

public class Practice {
    void fun() {
        System.out.println("heyyy");
    }
}

class Demo00 extends Practice {
    void fun() {
        System.out.println("heyyy222");
    }

    void fun2() {
        System.out.println("hiiiiiiiii");
    }
}

class MainP {
    public static void main(String[] args) {
        Practice p = new Practice();
        p.fun();
        Demo00 d = new Demo00();
        d.fun();
        d.fun2();

        Practice p2 = new Demo00();
        p2.fun();

        ++ //

        Demo00 d3 = (Demo00) pr;
        pr.fun();
        ((Demo00) (pr)).fun2(); // Downcasting
        // RuntimeErrorException
        // pr.fun2(); // This will not work because fun2() is not defined in Practice
        // class
        // pr.fun2(); // This will not work because fun2() is not defined in Practice
        // class
    }
}
