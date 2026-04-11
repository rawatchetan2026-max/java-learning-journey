package CollectionFrameWork;

import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(60);
        al1.add(70);

        ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(20, 30, 40, 50));

        al1.addAll(1, al2);
        al1.add(5, 70);
        System.out.println(al1);
        System.out.println(al1.indexOf(70));
        System.out.println(al1.lastIndexOf(70));
        System.out.println(al2);
        System.out.println(al1.size());

        // Iterator<Integer> it = al1.Iterator();
        // // by while
        // while (it.hasNext()) {
        // System.out.println(it.next());
        // }
        // by for loop
        for (Iterator<Integer> i = al1.iterator(); i.hasNext();) {
            System.out.println(i.next());
        }
        // lambda exp.
        al1.forEach(n -> System.out.println(n));

        // method ref.
        al1.forEach(System.out::println);
    }
}