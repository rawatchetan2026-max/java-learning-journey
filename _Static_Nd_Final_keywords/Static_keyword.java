class Test {
    static int x = 10;
    int y = 20;

    void show() {
        // non-static method can access static var.of class
        System.out.println(x + " " + y);
    }

    static void display() {
        // static method can also access static var. of class
        // static method can't access non-static var. of class
        System.out.println(x);
    }
}

public class Static_keyword {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        // static var. belongs to class and instance variable belongs to the obj.
        t1.show();
        t1.x = 30;
        t1.y = 50;
        t2.show();

    }
}