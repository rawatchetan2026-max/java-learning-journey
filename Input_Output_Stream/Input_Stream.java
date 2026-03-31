import java.io.*;

public class Input_Stream {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("Output.txt");
            FileReader fr = new FileReader("Output.txt");

            byte[] b = new byte[fis.available()];
            fis.read(b);
            String str = new String(b);
            System.out.println(str);
            int x;
            while ((x = fr.read()) != -1) {
                System.out.print((char) x);
            }
            fis.close();
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
