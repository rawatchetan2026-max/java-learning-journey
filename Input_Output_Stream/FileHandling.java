import java.io.*;
import java.util.*;

public class FileHandling {
    public static void main(String[] args) throws Exception {

        File f = new File(
                "C:\\Users\\himmat\\Documents\\Desktop\\Downloads\\Favorites\\Documents\\GitHub\\java-learning-journey\\lamdaDemo");
        f.setReadable(true);
        FileInputStream fis = new FileInputStream(f);

        System.out.println(f.getCanonicalPath());

        System.out.println(f.isDirectory());
        // System.out.println(Arrays.toString(f.list()));

        File list[] = f.listFiles();

        for (File x : list) {
            System.out.println("name : " + x.getName() + "   ");
            System.out.print("path : " + x.getPath() + " ");
            System.out.print("parent : " + x.getParent());
        }

    }
}
