import java.util.LinkedList;

public class LinkedListdemo {

    public static void main(String[] args) {

        // 1. Creating LinkedList
        LinkedList<String> list = new LinkedList<>();

        // 2. Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        // add at first and last
        list.addFirst("Start");
        list.addLast("End");

        System.out.println("After adding: " + list);

        // 3. Accessing elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));

        // 4. Updating element
        list.set(2, "Orange");
        System.out.println("After update: " + list);

        // 5. Removing elements
        list.remove();
        list.removeLast();
        list.remove("Banana");
        System.out.println("After removal: " + list);

        // 6. Searching
        System.out.println("Contains Apple? " + list.contains("Apple"));
        System.out.println("Index of Apple: " + list.indexOf("Apple"));

        // 7. Size
        System.out.println("Size: " + list.size());

        // 8. Iterating
        System.out.println("Using for-each loop:");
        for (String item : list) {
            System.out.println(item);
        }

        // 9. Using queue methods
        list.offer("Grapes");
        list.poll();
        list.peek();

        System.out.println("After queue ops: " + list);

        // 10. Using stack methods
        list.push("Top");
        list.pop();

        System.out.println("After stack ops: " + list);

        // 11. Clear list
        list.clear();
        System.out.println("After clear: " + list);
    }
}