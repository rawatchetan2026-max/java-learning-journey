import java.io.*;

public class Student_challenge_StoreNdRetrieve {
    public static void main(String[] args) throws Exception {

        float list[] = { 1.2f, 3.45f, 6.78f, 9.01f, 2.34f };

        FileOutputStream fos = new FileOutputStream("Stu_challenge.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeInt(list.length);
        for (float f : list) {
            dos.writeFloat(f);
        }
        dos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("Stu_Challenge.txt");
        DataInputStream dis = new DataInputStream(fis);

        int length = dis.readInt();

        for (int i = 0; i < length; i++) {
            System.out.println(dis.readFloat());
        }
        dis.close();
        fis.close();

    }
}
