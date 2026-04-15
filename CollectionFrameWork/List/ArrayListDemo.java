import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(60);
        al1.add(70);

        ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(20, 30, 40, 50));
        al1.addAll(al2);
        System.out.println("list inside a another list : " + al1);

        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        list.add(1, "Orange");

        System.out.println("After adding: " + list);

        System.out.println("Element at index 2: " + list.get(2));

        list.set(2, "Grapes");
        System.out.println("After update: " + list);

        // 5. Removing elements
        list.remove(1);
        list.remove("Mango");

        System.out.println("After removal: " + list);

        // 6. Searching
        System.out.println("Contains Apple? " + list.contains("Apple"));
        System.out.println("Index of Apple: " + list.indexOf("Apple"));

        // 7. Size
        System.out.println("Size: " + list.size());

        // 8. Iterating
        for (String item : list) {
            System.out.println(item);
        }

        // 9. Sorting
        Collections.sort(list);
        System.out.println("After sorting: " + list);

        // 10. Reverse
        Collections.reverse(list);
        System.out.println("After reverse: " + list);

        // 11. Copying list
        ArrayList<String> newList = new ArrayList<>(list);
        System.out.println("Copied list: " + newList);

        // 12. Checking empty
        System.out.println("Is empty? " + list.isEmpty());

        // 13. Clearing list
        list.clear();
        System.out.println("After clear: " + list);
    }
}