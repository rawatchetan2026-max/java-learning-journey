import java.util.*;

public class ArrayDequedemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);

        dq.offerFirst(5);

        dq.forEach((x) -> System.out.println(x));
        dq.pollFirst();
        dq.pollLast();
        System.out.println("value at first : " + dq.peekFirst());
        System.out.println("value at last : " + dq.peekLast());

        System.out.println(dq);

    }
}
