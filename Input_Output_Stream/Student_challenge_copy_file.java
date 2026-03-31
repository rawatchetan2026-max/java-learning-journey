import java.io.*;
import java.util.Arrays;

public class Student_challenge_copy_file {
    public static void main(String[] args) {
        try {
            FileInputStream file_1 = new FileInputStream("Source_1.txt"); // read mode
            FileOutputStream file_2 = new FileOutputStream("Source_2.txt"); // write mode

            byte[] b = new byte[file_1.available()];
            file_1.read(b);
            String str = new String(b);

            file_2.write(str.toLowerCase().getBytes());

            file_1.close();
            file_2.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
