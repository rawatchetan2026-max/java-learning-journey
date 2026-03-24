class Container {
    int val;
    boolean flag = true;

    synchronized public void set(int v) {
        while (flag != true)
            try {
                wait();
            } catch (Exception e) {
            }
        val = v;
        flag = false;
        notify();
    }

    synchronized public int get() {

        int x = 0;
        while (flag != false)
            try {
                wait();
            } catch (Exception e) {
            }
        x = val;
        flag = true;
        notify();
        return x;
    }
}

class Producer extends Thread {
    Container cont;

    public Producer(Container c) {
        cont = c;
    }

    public void run() {
        int count = 1;
        while (true) {
            cont.set(count);
            System.out.println("Producer : " + count);
            count++;
        }
    }
}

class Consumer extends Thread {
    Container cont;

    public Consumer(Container c) {
        cont = c;
    }

    public void run() {
        int value;
        while (true) {
            value = cont.get();
            System.out.println("Consumer : " + value);
        }
    }
}

public class _Inter_Thread_communication {
    public static void main(String[] args) {
        Container cont = new Container();
        Producer p = new Producer(cont);
        Consumer c = new Consumer(cont);
        p.start();
        c.start();

    }

}
