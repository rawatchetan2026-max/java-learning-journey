
import java.io.*; //importing java input output to the program

class Student { // created a class having members : roll , Name , Dept of diff. data types
    int roll;
    String Name;
    String Dept;
}

class MyRead {
    public void read() throws Exception {
        // instead of using try-catch blocks which makes code lengthy
        // so, we used throws keyword for all type of the Exceptions

        FileInputStream fis = new FileInputStream("My.txt"); // File input stream is use to read the file in bytes...
                                                             // also it cannot read Strings
        BufferedReader br = new BufferedReader(new InputStreamReader(fis)); // Buffered reader to read the file in one
                                                                            // go in Character form also buffered reader
                                                                            // is having a method called readLine() here
                                                                            // the obj of InputStreamReader is acting as
                                                                            // a bridge which convert character to bytes

        Student s = new Student(); // empty obj of Student class

        // giving the values to the members of the Student class from the My.txt

        s.roll = Integer.parseInt(br.readLine());// typecast
        s.Name = br.readLine();
        s.Dept = br.readLine();

        System.out.println("rollno : " + s.roll + " Name : " + s.Name + " Department : " + s.Dept);

        br.close();
    }
}

public class PrintStreamDemo {

    public static void main(String[] args) throws Exception {
        FileOutputStream fo = new FileOutputStream("My.txt"); // It is used to write the file if file not present then
                                                              // it creates and then edit it
        PrintStream ps = new PrintStream(fo); // used to write on txt file (belongs to byte stream class)

        Student s = new Student();
        s.roll = 10;
        s.Name = "Chetan Rawat";
        s.Dept = "CSE";

        ps.println(s.roll);
        ps.println(s.Name);
        ps.println(s.Dept);

        ps.close();// file closing to prevent data leak
        fo.close();

        new MyRead().read();

    }

}
