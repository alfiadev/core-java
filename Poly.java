class Poly {
    void fly() {
        System.out.println("im flying");
    }
}

class chil33 {
    void fly() {
        System.out.println("heyy");
    }
}

class plane extends chil33,Poly
{

    void fly() {
        System.out.println("plane is flying ");
    }

    // void callParent() {
    // super.fly();
    // }
}

class Main333 {
    public static void main(String[] args) {
        plane p = new plane();
        p.fly();
        p.callParent();
        Poly t = new Poly();
        plane p1;
        p1 = t;
    }

}
