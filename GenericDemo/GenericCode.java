package GenericDemo;

import java.util.Arrays;

public class GenericCode<T> {
    // T d[] = new T[] // comile time error as comiler doesn't know about T
    T data[] = (T[]) new Object[3]; // array of Object type cast as genric

    public static void main(String[] args) {
        // Object obj[] = new Object[3];
        // obj[0] = "hi";
        // obj[1] = "hi";
        // obj[2] = new Integer(10);
        // System.out.println(Arrays.toString(obj));

        GenericCode<String> gc = new GenericCode<>();

        gc.data[0] = "hi";
        gc.data[1] = "bye";
        // gc.data[2] = 10; //can't be inserted to the array coz now the comiler knows::
        // T belongs to String

    }
}