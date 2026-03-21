class MyTask implements Runnable {
    public void run() {
        try {
            System.out.println("Running: " + Thread.currentThread().getName());
            // sleep and yeild method
            Thread.sleep(1000);

            Thread.yield();

            System.out.println(Thread.currentThread().getName() + " finished work");

        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted");
        }
    }
}

public class _Thread_Constructors_nd_Some_Methods {
    public static void main(String[] args) throws Exception {

        MyTask task = new MyTask();
        Thread t1 = new Thread(task, "Chetan's Thread-1");
        Thread t2 = new Thread(task, "chetan's Thread-2");

        // set & get Priority() , isalive(),interupt(),set & get name() method
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();

        System.out.println("Chetan's Thread-1 is alive? " + t1.isAlive());

        System.out.println("Chetan's Thread-1 completed, now main continues...");
        t2.interrupt();
        System.out.println("Current thread: " + Thread.currentThread().getName());
        t2.setName("Rawat ji-Thread-2");
        System.out.println("New name of Chetan's Thread-1 : " + t2.getName());

        System.out.println("t1 priority: " + t1.getPriority());
        System.out.println("t2 priority: " + t2.getPriority());
    }
}
