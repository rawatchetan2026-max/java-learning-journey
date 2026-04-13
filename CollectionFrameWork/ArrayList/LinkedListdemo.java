import java.util.*;

public class LinkedListdemo {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>();

        LL.addFirst(10);
        LL.add(20);
        LL.add(30);
        LL.add(40);
        LL.add(50);
        LL.addLast(60);
        System.out.println(LL.get(3));
        System.out.println(LL);
    }
}
