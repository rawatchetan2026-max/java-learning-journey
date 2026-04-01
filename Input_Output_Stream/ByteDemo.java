import java.io.*;

public class ByteDemo {
    public static void main(String[] args) throws Exception {

        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');
        bos.write('e');

        byte b[] = bos.toByteArray();

        ByteArrayInputStream bis = new ByteArrayInputStream(b);

        for (int x : b) {
            System.out.println((char) x);
        }

        int x;

        while ((x = bis.read()) != -1) {
            System.out.println((char) x);
        }
        bos.close();
        bis.close();
    }
}
