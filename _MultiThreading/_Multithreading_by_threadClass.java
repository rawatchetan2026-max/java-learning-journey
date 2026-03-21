// class Mythread extends Thread {
//     public void run() {
//         int c = 0;
//         for (int i = 0; i < 20; i++) {
//             System.out.println(c++ + " myThread");
//         }
//     }
// }

// class _Multithraeding_by_threadClass {
//     public static void main(String[] args) {
//         Mythread t = new Mythread();
//         t.start();
//         int c = 0;
//         for (int i = 0; i < 20; i++) {
//             System.out.println(c++ + " MainFn");
//         }
//     }
// }
//real life example
class Mythread extends Thread {
    private String task;

    // constructor
    Mythread(String task) {
        this.task = task;
    }

    public void run() {
        System.out.println(task + " is done by " + Thread.currentThread().getName());
    }

}

class _Multithreading_by_threadClass {
    public static void main(String[] args) {
        Mythread t1 = new Mythread("task 1");
        Mythread t2 = new Mythread("task 2");
        Mythread t3 = new Mythread("task 3");
        Mythread t4 = new Mythread("task 4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
