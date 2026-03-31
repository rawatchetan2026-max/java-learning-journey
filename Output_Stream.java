import java.io.*;

public class Output_Stream {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream(
                    "Output.txt");

            String str = "learning Java Prorgamming \n";
            fos.write(str.getBytes());
            String str1 = "learning java programming day 8";
            fos.write(str1.getBytes(), 9, str1.length() - 9);
            fos.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}