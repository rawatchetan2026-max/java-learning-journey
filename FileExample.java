import java.io.*;

public class FileExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream(
                    "Output.txt");

            String str = "learning Java Prorgamming";
            fos.write(str.getBytes());
            fos.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}