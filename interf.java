interface interf {
    default void m1() {
        System.out.println("interf1");
    }

}

interface interf2 {
    default void m1() {
        System.out.println("interf2");
    }
}

class MainIntr implements interf, interf2 {
    public void m1() {
        // interf.super.m1();
        // interf2.super.m1();
    }

}

class day10 {
    public static void main(String[] args) {
        MainIntr m = new MainIntr();
        m.m1();
    }

}