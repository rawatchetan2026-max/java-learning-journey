import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetDemo {
    public static void main(String[] args) {

        // Creating TreeSet
        TreeSet<Integer> ts = new TreeSet<>();

        // add()
        ts.add(50);
        ts.add(10);
        ts.add(30);
        ts.add(20);
        ts.add(10); // duplicate ignored

        System.out.println("TreeSet: " + ts);

        // remove()
        ts.remove(20);
        System.out.println("After remove(20): " + ts);

        // contains()
        System.out.println("Contains 30? " + ts.contains(30));

        // first() and last()
        System.out.println("First: " + ts.first());
        System.out.println("Last: " + ts.last());

        // higher() and lower()
        System.out.println("Higher than 30: " + ts.higher(30));
        System.out.println("Lower than 30: " + ts.lower(30));

        // ceiling() and floor()
        System.out.println("Ceiling of 25: " + ts.ceiling(25));
        System.out.println("Floor of 25: " + ts.floor(25));

        // size() and isEmpty()
        System.out.println("Size: " + ts.size());
        System.out.println("Is Empty? " + ts.isEmpty());

        // pollFirst() and pollLast()
        System.out.println("Poll First: " + ts.pollFirst());
        System.out.println("Poll Last: " + ts.pollLast());
        System.out.println("After polling: " + ts);

        // iterator()
        System.out.print("Using Iterator: ");
        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        TreeSet<Integer> desc = new TreeSet<>((a, b) -> b - a);
        desc.add(10);
        desc.add(40);
        desc.add(20);

        System.out.println("Descending TreeSet: " + desc);
    }
}