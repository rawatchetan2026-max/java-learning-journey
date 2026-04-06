import java.io.*;

class Student1 implements Serializable {
    private int Roll_NO;
    public String College_Name;
    private float avg;
    private String Branch;
    public static int data = 10;
    public transient int password;

    Student1() {
    }

    public Student1(int r, String n, String b, float a) {
        Roll_NO = r;
        College_Name = n;
        avg = a;
        Branch = b;
        data = 500;
        password = 123456;

    }

    public String toString() {
        return "\nStudent Details\n" +
                "\nRoll " + Roll_NO +
                "\nName " + College_Name +
                "\nAverage " + avg +
                "\nDept " + Branch +
                "\nData " + data +
                "\nTransient Password : " + password + "\n";
    }

}

public class Serializationdemo {
    public static void Read() throws Exception {
        FileInputStream fis = new FileInputStream("Source_3.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student1 s1 = (Student1) ois.readObject();
        Student1 s = (Student1) ois.readObject();

        System.out.println(s1);

        System.out.println(s);

        ois.close();
        fis.close();
    }

    public static void main(String[] args) throws Exception {

        FileOutputStream fos = new FileOutputStream("Source_3.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Student1 s = new Student1(10, "John", "CSE", 89.9f);
        Student1 s1 = new Student1(11, "emily", "AI", 90.9f);

        oos.writeObject(s);
        oos.writeObject(s1);

        oos.close();
        fos.close();

        Read();
    }
}
