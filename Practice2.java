public class Practice2 {
    public static void main(String[] args) {
        Object[] data = setData();
        String name = (String) data[0];
        int age = (int) data[1];
        System.out.println(name);
        System.out.println(age);

    }

    static Object[] setData() {
        return new Object[] { "Alfia", 28 };
    }
}
