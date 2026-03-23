class MYthread_1 extends Thread {
    private Counter counter;

    public MYthread_1(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increament();
        }
    }
}

class Counter {
    int count = 0;

    void increament() {
        synchronized (this) {

            count++;
        }
    }

    public int getCount() {
        return count;
    }
}

public class Synchronized_keyword {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MYthread_1 t1 = new MYthread_1(counter);
        MYthread_1 t2 = new MYthread_1(counter);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {

        }
        System.out.println(counter.getCount());

    }
}
