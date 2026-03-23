class resource {
    public void display(String str) {
        synchronized (this) {
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i));
            }

        }

    }
}

class My_thread extends Thread {
    resource d;

    public My_thread(resource d) {
        this.d = d;

    }

    public void run() {
        d.display("hello World");

    }
}

class My_thread1 extends Thread {
    resource d;

    public My_thread1(resource d) {
        this.d = d;

    }

    public void run() {
        d.display("Welcome all");
    }
}

public class Sync_Demo {
    public static void main(String[] args) {

        resource d = new resource();
        My_thread t1 = new My_thread(d);
        My_thread1 t2 = new My_thread1(d);
        t1.start();
        t2.start();
    }
}
