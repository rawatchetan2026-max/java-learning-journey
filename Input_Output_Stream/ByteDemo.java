import java.io.*;
import java.io.IOException;

public class ByteDemo {
    public static void main(String[] args) {
        try {
            byte[] b = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };

            ByteArrayInputStream bis = new ByteArrayInputStream(b);
            int x;
            while ((x = bis.read()) != -1) {
                // reading one byte at a time
                System.out.print((char) x + "\t");
            }
            // bis.reset();

            // // return byte arr at one go
            // String str = new String(bis.readAllBytes());
            // System.out.println(str);

            bis.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}