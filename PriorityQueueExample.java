import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pt = new PriorityQueue<Integer>();
        pt.offer(40);
        pt.offer(60);
        pt.offer(20);
        pt.offer(30);
        pt.offer(10);

        System.out.println(pt);
        System.out.println(pt.remove());
        System.out.println(pt);
        System.out.println(pt.remove());
        System.out.println(pt);
        System.out.println(pt.remove());
        System.out.println(pt);
        System.out.println(pt.remove());
        System.out.println(pt);
        System.out.println(pt.poll());
        System.out.println(pt);
        System.out.println(pt.remove());
        System.out.println(pt);

    }
}
