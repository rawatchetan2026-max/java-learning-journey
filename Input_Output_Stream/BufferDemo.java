import java.io.*;

public class BufferDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(
                    "C:\\Users\\himmat\\Documents\\Desktop\\Downloads\\Favorites\\Documents\\GitHub\\java-learning-journey\\Input_Output_Stream\\Output.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);

            System.out.println("file : " + fis.markSupported());
            System.out.println("buffer : " + bis.markSupported());

            System.out.print((char) bis.read());
            System.out.print((char) bis.read());
            System.out.print((char) bis.read());

            bis.mark(10);

            System.out.print((char) bis.read());
            System.out.print((char) bis.read());
            System.out.print((char) bis.read());
            System.out.print((char) bis.read());

            bis.reset();

            System.out.print((char) bis.read());
            System.out.print((char) bis.read());
            System.out.println();

            fis.close();
            bis.close();

        } catch (Exception e) {
            System.out.print(e);
        }

    }
}
