import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {

        TreeMap<Integer, String> tm = new TreeMap<>();

        tm.put(1, "a");
        tm.put(2, "b");
        tm.put(3, "c");

        System.out.println(tm.get(2));

        System.out.println(tm);

    }
}
