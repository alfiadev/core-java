interface First {
    int x = 777;
}

interface Second {
    int x = 888;
}

public class InterfVar {
    public static void main(String[] args) {
        System.out.println(First.x);
        System.out.println(Second.x);
    }
}
