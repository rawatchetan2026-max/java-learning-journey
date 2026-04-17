import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        p.add(30);
        p.add(10);
        p.add(3);
        p.add(20);
        p.add(5);
        p.add(15);
        System.out.println("queue : " + p);
        while (!p.isEmpty()) {
            System.out.println(p.poll());
        }

    }
}
