import java.io.*;

class Producer1 extends Thread {

    OutputStream os;

    public Producer1(OutputStream os) {
        this.os = os;
    }

    public void run() {
        int count = 1;
        while (count <= 300) {
            try {
                os.write(count);
                os.flush();

                System.out.println("Producer  : " + count);
                Thread.sleep(10);
                System.out.flush();

                count++;
            } catch (Exception e) {
            }
        }

    }
}

class Consumer1 extends Thread {

    InputStream is;

    public Consumer1(InputStream is) {
        this.is = is;
    }

    public void run() {
        int x;

        while (true) {
            try {
                x = is.read();
                System.out.println("consumer  : " + x);
                Thread.sleep(10);
                System.out.flush();
            } catch (Exception e) {
            }

        }
    }

}

public class PipeDemo {
    public static void main(String[] args) throws Exception {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        pos.connect(pis);

        Producer1 p = new Producer1(pos);
        Consumer1 c = new Consumer1(pis);

        p.start();
        c.start();
    }
}
