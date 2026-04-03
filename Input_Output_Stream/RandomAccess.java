import java.io.*;

public class RandomAccess {
    public static void main(String[] args) throws Exception {

        RandomAccessFile rf = new RandomAccessFile(
                "C:\\Users\\himmat\\Documents\\Desktop\\Downloads\\Favorites\\Documents\\GitHub\\java-learning-journey\\Input_Output_Stream\\Source_1.txt",
                "rw");
        // Source_1 = "THIS IS THE CONTENT
        // OF THE SOURCE_1 FILE....
        // COPY DATA TO ANOTHER FILE"

        System.out.print((char) rf.read());
        System.out.print(rf.read());
        System.out.print((char) rf.read());
        System.out.print((char) rf.read());
        System.out.print((char) rf.read());
        rf.skipBytes(3);
        System.out.print((char) rf.read());
        rf.seek(3);
        System.out.println((char) rf.read());
        System.out.print(rf.getFilePointer());
        System.out.println();

    }
}
