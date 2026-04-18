import java.util.*;

class Student {
    int marks;
    String name;

    Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }
}

class MyComparator implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return b.marks - a.marks;// max heap by comparator
    }
}

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();// min heap PQ eg.
        p.add(30);
        p.add(10);
        p.add(3);
        p.add(20);
        p.add(5);
        p.add(15);
        System.out.println("queue : " + p);

        // top ele
        System.out.println("peek : " + p.peek());
        while (!p.isEmpty()) {
            System.out.println(p.poll());
        }
        PriorityQueue<Student> pq = new PriorityQueue<>((a, b) -> b.marks - a.marks); // max heap PQ eg.

        pq.add(new Student(85, "x"));
        pq.add(new Student(75, "z"));
        pq.add(new Student(95, "y"));
        pq.add(new Student(95, "K"));

        while (!pq.isEmpty()) {
            Student s = pq.poll();
            System.out.println(s.name + "   " + s.marks);
        }
    }
}
