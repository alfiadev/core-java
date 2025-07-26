import java.util.ArrayList;

public class ArrayList1 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();

    list.add(10);
    list.add(20);
    list.add(30);
    list.add(50);
    list.add(null);
    list.add(30); // list.add(new String("hii"));
    System.out.println(list);
    // for (int i = 0; i < list.size(); i++) {
    // System.out.println(list.get(i));
    // }
    // System.out.println(list.isEmpty());
    System.out.println(list.indexOf(50));
    System.out.println(list.get(2));
    // System.out.println(list.contains(9));
    System.out.println(list.set(1, 8));
    System.out.println(list.lastIndexOf(30));
    System.out.println((list.size()));

    // System.out.println(list.remove(0));
    // System.out.println(list);

    ArrayList<Integer> list2 = new ArrayList<Integer>();

    list2.add(10);
    list2.add(70);
    list2.add(30);
    list2.add(50);
    list2.add(null);
    list2.add(60);
    // list2.addAll(list);
    // list2.removeAll(list);

    System.out.println(list2);
  }
}
