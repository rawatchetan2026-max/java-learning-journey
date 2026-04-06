import java.io.*;

class Student77 {
    int Id;
    String Department;
    float Marks;

}

class DataRead {
    public void Reading() throws Exception {
        FileInputStream fis = new FileInputStream("My.txt");
        DataInputStream dis = new DataInputStream(fis);

        Student77 s8 = new Student77();

        s8.Id = dis.readInt();
        s8.Department = dis.readUTF();
        s8.Marks = dis.readFloat();

        System.out.println("Id : " + s8.Id + " Department : " + s8.Department + " Marks : " + s8.Marks);

        dis.close();
        fis.close();
    }
}

public class DataStreamDemo {

    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("My.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        Student77 s7 = new Student77();
        s7.Id = 101;
        s7.Department = "cse";
        s7.Marks = 80.5f;

        dos.writeInt(s7.Id);
        dos.writeUTF(s7.Department);
        dos.writeFloat(s7.Marks);

        System.out.println("file Edited");
        dos.close();
        fos.close();

        new DataRead().Reading();
    }
}
