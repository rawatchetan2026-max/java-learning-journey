import java.lang.reflect.*;
import java.util.*;
import javax.sound.sampled.SourceDataLine;

class My {
    public int id;
    private String name;
    protected String address;
    int age;

    public My() {
    }

    public My(int id, String name) {
    }

    public void show(int id) {
    }

}

public class reflection {
    public static void main(String[] args) {
        Class c = My.class;

        System.out.println(c.getName());

        Field field[] = c.getDeclaredFields();
        System.out.println(Arrays.toString(field));

        // Constructor con[] = c.getDeclaredConstructors();
        // System.out.println(Arrays.toString(con));

        Method meth[] = c.getMethods();
        System.out.println(Arrays.toString(meth));

        Parameter params[] = meth[0].getParameters();
        System.out.println(Arrays.toString(params));

    }
}
