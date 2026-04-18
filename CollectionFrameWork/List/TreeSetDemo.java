import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet(Arrays.asList(10, 20, 30, 40, 70, 40, 100));
        ts.add(10);
        System.out.println(ts.ceiling(101));
        System.out.println(ts);

    }
}
